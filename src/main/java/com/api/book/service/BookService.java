package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.api.book.entities.Book;

@Service
public class BookService {
	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(1,"Java Fullstack","Sushil"));
		list.add(new Book(2,"Core Java","Samadhan"));
		list.add(new Book(3,"Advanced Java","Mayuri"));
		list.add(new Book(4,"Database","Vaibhav"));
		list.add(new Book(5,"Angular","Sachit"));
}
	// get all book
	public List<Book> getAllBooks(){
		return list;
	}
	
	// get single book by id
	public Book getBookById(int id) {
		Book book = null;
		book=list.stream().filter(i->(i.getId()==id)).findFirst().get();
		return book;
	
}
    // Adding the book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	
	// Delete the book
	public void deleteBook(int bid){
		list=list.stream().filter(book -> book.getId()!=bid).collect(Collectors.toList());
	
	

}}
