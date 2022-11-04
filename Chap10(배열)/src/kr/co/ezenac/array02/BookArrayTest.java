package kr.co.ezenac.array02;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		
		book[0] = new Book("혼자 공부하는 컴퓨터 구조+운영체제", "강민철");
		book[1] = new Book("혼자 공부하는 컴퓨터 구조+운영체제2", "강민철2");
		book[2] = new Book("혼자 공부하는 컴퓨터 구조+운영체제3", "강민철3");
		book[3] = new Book("혼자 공부하는 컴퓨터 구조+운영체제4", "강민철4");
		book[4] = new Book("혼자 공부하는 컴퓨터 구조+운영체제5", "강민철5");
		
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i].toString());
			book[i].showInfo();
		}
	}
}
