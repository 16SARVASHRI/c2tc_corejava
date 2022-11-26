package com.capgemini.java.generic;

import java.util.LinkedList;
import java.util.List;

class Result1<T>{
	
	private T myvariable;

	public Result1(T myvariable) {
		this.myvariable = myvariable;
	}

	public T getMyvariable() {
		return myvariable;
	}

	@Override
	public String toString() {
		return "Result1 [myvariable=" + myvariable + "]";
	}
	
}

public class GenericEx {

	public static void main(String[] args) {
		List<Result1<Object>> r=new LinkedList<>();
		r.add(new Result1<Object>("Hii"));
		r.add(new Result1<Object>("Girls"));
		r.add(2,new Result1<Object>("Good Morning"));
		r.add(new Result1<Object>(12));
		r.add(new Result1<Object>(67.09f));
		r.add(new Result1<Object>('T'));
	
		System.out.println(r);
		
	}

}
