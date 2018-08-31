package com.gmail.carbit3333333;

public class Cat {
	private String name;
	private int age;
	private String color;
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Cat name=" + name + ", age=" + age + ", color=" + color + "";
	}
	


}
