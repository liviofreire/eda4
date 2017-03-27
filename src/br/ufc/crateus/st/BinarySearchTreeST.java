package br.ufc.crateus.st;

public class BinarySearchTreeST<K extends Comparable<K>, V> implements ST<K, V> {
	
	private Node root; 
	
	private class Node extends STEntry<K, V> {
		
		Node  left, right;
		
		public Node(K key, V value) {
			super(key, value);
		}
	}
	
	private Node getNode(K key) {
		Node r = root;
		while (r != null) {
			if (key.compareTo(r.key) < 0) r = r.left;
			else if (key.compareTo(r.key) > 0) r = r.right;
			else return r;
		}
		
		return null;
	}

	@Override
	public V get(K key) {
		Node node = getNode(key);
		return (node != null)? node.value : null;
	}

	@Override
	public void put(K key, V value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<K> keys() {
		// TODO Auto-generated method stub
		return null;
	}

}
