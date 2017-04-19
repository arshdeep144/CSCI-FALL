import java.util.*;

public class TicTacToeTreeNode{
	public static TicTacToeTreeNode parent;
	public static List<TicTacToeTreeNode> children;
	public static String value;
	public static TicTacToeTreeNode start;

	public TicTacToeTreeNode(String data){
		start.setValue(data);
		start.setChildren(new ArrayList<TicTacToeTreeNode>());
	}

	public static void main(String[] args){
		String board = "x ox xo o";
		TicTacToeTreeNode root = createNode(board, "x");
		printTree(root);
	}
	
	public static String makeMove(String old, int pos, String player){
		String before = old.substring(0,pos);
		String after = old.substring(pos+1);
		return before + player + after;
	}
	
	public static TicTacToeTreeNode createNode(String board, String player){
		String nextPlayer;
		int pos;
		if (player == "x"){
			nextPlayer = "o";
		}
		else{
			nextPlayer = "x";
		}
		pos = board.indexOf(' ');
		TicTacToeTreeNode childNode = new TicTacToeTreeNode(board);
		while(pos != -1){
			childNode.setParent(start);
			childNode.setValue(board);
			board = makeMove(board, pos, player);
			childNode = createNode(board,nextPlayer);
			children.add(childNode);
			pos = board.indexOf(' ');
		}

		return childNode;
	}
	
	public static void printTree(TicTacToeTreeNode root){
		System.out.println(root.getValue());
		for(TicTacToeTreeNode child:children){
			System.out.println("Haro");
			printTree(child);		
		}
	}

	public static void setValue(String v){
		value = v;
	}
	public static String getValue(){
		return value;
	}
	public static void setParent(TicTacToeTreeNode p){
		parent = p;
	}
	public static TicTacToeTreeNode getParent(){
		return parent;
	}
	public static void setChildren(List<TicTacToeTreeNode> c){
		children = c;
	}
	public static List<TicTacToeTreeNode> getChildren(){
		return children;
	}
}