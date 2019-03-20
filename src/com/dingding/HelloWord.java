package com.dingding;

public class HelloWord {
    private String name;
    private int age;
   
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void Hello(){
    	System.out.println("hello:"+name+"\n"+"age:"+age);
    }

	public HelloWord() {
		super();
	}

	public HelloWord(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
