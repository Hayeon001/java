package board;


public class Service<Public> {

	DAO dao;
	
	public Service() {
		dao = new DAO();
	}
	public void register(String str) {//등록   r
		//Security or Log
		dao.insert(str);
	}
	public void remove(int num) { //삭제  d
		dao.delete(num);
	}
	public void modify(int num, String str) { //수정  u
		dao.update(num, str);
	}
	public String get(int num) { //해당 글을 가져와라
		return dao.select(num); 
	}
}
