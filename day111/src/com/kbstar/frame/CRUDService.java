package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.AccountDTO;

public interface CRUDService<K,V> {

	public void register(V v) throws Exception;
	public void remove(AccountDTO obj2) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
	void remove(String k) throws Exception;

}