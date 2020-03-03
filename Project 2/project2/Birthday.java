package project2;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Birthday {

	private String name;
	private Scanner scan;
	private Toy toy;
	private double total;
	
	public Birthday() {
		this.scan = new Scanner(System.in);
		this.toy = new Toy();
		this.name = "";
		this.total = 0;
	}
	
	
	public void getToyType() {
		String toyType;
		
		toyType = JOptionPane.showInputDialog("Please choose a toy : Plushie, Blocks or Book");
		//Type of toy invalid response

		while(!toyType.equals("plushie") && !toyType.equals("blocks") && !toyType.equals("book"))
		{
			JOptionPane.showMessageDialog(null, "You have entered an invald response. Please try again.");
			toyType = JOptionPane.showInputDialog("Please choose a toy : Plushie, Blocks or Book");
		}
		this.toy.setToy(toyType);
		this.toy.setCost(toyType);
	}
	
	public void getChildName() {
		//Child's Name
		String name = JOptionPane.showInputDialog("Please enter the name of child");
		this.name = name;
	}
	
	public void getChildAge() {
		//Child's Age
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old is this child?"));
		toy.setAge(age);
	}
	
	public void greeting() {
		//Welcome Message
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company");
	}
	
	public String getResponse(String prompt) {
		String response;
		do {
			response = JOptionPane.showInputDialog(prompt + " Yes/No");
		} while(!response.equals("Yes") && !response.equals("No"));
		return response;
	}
	
	public void balloonPrompt() {
		String response = getResponse("Would you like to add a balloon?");
		this.toy.addBalloon(response);
	}
	
	public void cardPrompt() {
		String response = getResponse("Would you like to add a card?");
		this.toy.addCard(response);
	}
	
	public int generateOrderNumber() {
		return (int)(Math.random() * 89999) + 10000;
	}
	
	
	public void processChildToy() {
		do {
			this.getChildName();
			this.getChildAge();
			this.getToyType();
			if (this.toy.ageOK()) {
				// break if toy is already good.
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Toy is not age appropriate");;
				String response = this.getResponse("Would you like to cancel the gift?");
				if (response.equals("No")) {
					break;
				}
			}
		} while(true);
		balloonPrompt();
		cardPrompt();
		this.total += this.toy.getCost();
		System.out.println("Name: "+ this.name);
		System.out.println("Age: "+ this.toy.getAge());
		System.out.println("Total cost: $" + this.toy.getCost());
		
	}
	
	public void run() {
		this.greeting();
		do {
			this.processChildToy();
			String response = this.getResponse("Would like to add another gift?");
			if (response.equals("No")) {
				break;
			}
		} while(true);
		System.out.println("Total amount: $" + this.total);
		System.out.println("Order number: " + this.generateOrderNumber());
		System.out.println("Programmer: Sabila Bernard");
	}
		

	public static void main(String[] args) {
			Birthday bday = new Birthday();
			bday.run();
		}
	}
