package com.odev2;

public class HybridArray {

	private static int hybridArray[];
	private static final int firstValueIndex = 0;

	public HybridArray() {
		hybridArray = new int[5];
	}

	// GETTING FROM ARRAy

	public int get(int index) {
		return hybridArray[index];
	}

	// DELETING FROM ARRAY

	public void removeAt(int index) {
		hybridArray[index] = 0;
	}

	public void removeLast() {
		int lastValueIndex = hybridArray.length - 1;
		hybridArray[lastValueIndex] = 0;
	}

	public void removeFirst() {
		hybridArray[firstValueIndex] = 0;
	}

	// ADDING TO ARRAY

	public void addFirst(int n) {

		hybridArray[firstValueIndex] = n;
	}

	public void insert(int n, int index) {
		hybridArray[index] = n;
	}

	public void addLast(int n) {
		int lastValueIndex = hybridArray.length - 1;
		hybridArray[lastValueIndex] = n;
	}

	// SIZE

	public int size() {
		return hybridArray.length;
	}

	// PRINT

	public void println() {
		for (int i : hybridArray) {
			System.out.println(i);
		}
	}

	// CLEAR

	public void clear() {
		for (int i = 0; i < hybridArray.length; i++) {
			hybridArray[i] = 0;
		}
	}

}
