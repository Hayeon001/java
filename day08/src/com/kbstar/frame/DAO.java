package com.kbstar.frame;

//public interface DAO {
	//public void insert(Object obj);   
	//obj에 user id 넣을 수 있음. obj.getId 안됨. getId는 obj에 선언안되어 있음.
	//제네릭 <key, value>

public interface DAO<K,V> {
	String IP = "127.0.0.1";
	//타입 변수명
	//(public static final) String IP = "127.0.0.1"; 앞에 생략된 상태
	//ip는 상수. 정해진 값.
	public void insert(V v);
	public void delete(K k);
	public abstract void update(V v);

	default void connect() {
		System.out.println(IP+"에 접속하였습니다.");
	}
	default void close() {
		System.out.println(IP+"에 접속을 해제하였습니다.");
	}
	
}
