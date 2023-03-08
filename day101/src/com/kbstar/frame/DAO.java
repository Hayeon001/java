package com.kbstar.frame;

import java.util.List;

public interface DAO<K,V> {  //1.제네릭설정
	//DB 정보 입력 삭제 수정 조회
	
	//CRUD (Create, Read, Update, Delete)
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception; 
	//하나가져와
	public V select(K k) throws Exception; //k값 하나에 대한 v 하나 가져와
	// 전체가져와
	public List<V> select() throws Exception; //list 다 가져와

}
