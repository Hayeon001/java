package com.kbstar.frame;

//public interface DAO {
	//public void insert(Object obj);   
	//obj에 user id 넣을 수 있음. obj.getId 안됨. getId는 obj에 선언안되어 있음.
	//제네릭 <key, value>

public interface DAO<K,V> {
	public void insert(V v);
	public void delete(K k);
	public void update(V v);

}
