package com.example.project;

public class TreeUser {
	public static <T> int countLeaves(BT<T> bt) {
		if (bt.empty())
			return 0;
		
		bt.find(Relative.Root);
		
		return LeafCounter(bt);
	}

	private static int LeafCounter(BT Tree) {
		if (Tree.isLeaf())
			return 1;
		int leafCount = 0;

		if (Tree.find(Relative.LeftChild)) {
			leafCount += LeafCounter(Tree);
			Tree.find(Relative.Parent);
		}
		if (Tree.find(Relative.RightChild)) {
			leafCount += LeafCounter(Tree);
			Tree.find(Relative.Parent);
		}

		return leafCount;
	}
	
	
}