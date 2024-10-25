package com.example.project;

public class TreeUser {
	public static <T> int countLeaves(BT<T> bt) {
		if (bt.isLeaf()) {
			return 1;
		}

		int Count = 0;
		if (bt.find(Relative.LeftChild)) {
			Count += countLeaves(bt);
			bt.find(Relative.Parent);
		}

		if (bt.find(Relative.RightChild)) {
			Count += countLeaves(bt);
			bt.find(Relative.Parent);
		}

		return Count;
	}
}