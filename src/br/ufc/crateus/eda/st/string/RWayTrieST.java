package br.ufc.crateus.eda.st.string;

public class RWayTrieST<V> implements StringST<V> {
	private static final int R = 256;
	private Node root = new Node();
	
	private static class Node {
		Object value;
		Node[] next = new Node[R];
	}

	@Override
	public V get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void put(String key, V value) {
		root = put(root, key, value, 0);
	}
	
	private Node put(Node r, String key, V value, int i) {
		if (r == null) r = new Node();
		if (i == key.length()) {
			r.value = value;
			return r;
		}
		char ch = key.charAt(i);
		r.next[ch] = put(r.next[ch], key, value, i + 1);
		return r;
	}

	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(String key) {
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
	public Iterable<String> keys() {
		// TODO Auto-generated method stub
		return null;
	}

}
