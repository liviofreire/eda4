package br.ufc.crateus.eda.st;

public class BinarySearchST<K extends Comparable<K>, V> implements OrderedST<K, V> {
	
	@SuppressWarnings("unchecked")
	private STEntry<K, V>[] pairs = (STEntry<K, V>[]) new Object[100];
	private int count = 0;
	
	@Override
	public int rank(K key) {
		int lo = 0;
		int hi = count - 1;
		
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			STEntry<K, V> e = pairs[mid];
			
			if (key.compareTo(e.key) < 0) hi = mid - 1;
			if (key.compareTo(e.key) > 0) lo = mid + 1;
			else return mid;
		}
		return lo;
	}

	@Override
	public V get(K key) {
		int pos = rank(key);
		return  (key.equals(pairs[pos].key))? pairs[pos].value : null;
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

	@Override
	public K min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K floor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K ceiling(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K select(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size(K lo, K hi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<K> keys(K lo, K hi) {
		// TODO Auto-generated method stub
		return null;
	}
}
