package com.kbstar.frame;

import java.util.List;

//public interface DAO {
	//public void insert(UserDTO user) throw Exception;
//UserDAO말고도 사용할 수 있도록 하기위헤 제네릭 사용
public interface DAO<K,V> {
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception;
	public List<V> select() throws Exception;
	//DB 조회, 수정, 삭제 등 기능 정의
}
