package com.sizeofthis.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFileIOTest {

	public static void main(String[] args) {
		
		ArrayList<Client> myClients = IOHandler.readClientsFromFile("clients.txt");
		
		/*
		 * for(int i = 0; i < myClients.size(); i++) { System.out.println("Client " +
		 * i); System.out.println("- Name: " + myClients.get(i).getName());
		 * System.out.println("- Address: " + myClients.get(i).getAddress());
		 * System.out.println("- Monthly Income: " +
		 * myClients.get(i).getMonthly_income());
		 * System.out.println("------------------"); }
		 */
		
		int i = 1;
		for(Client cl : myClients)
		{
			System.out.println("Client " + i);
			System.out.println("- Name: " + cl.getName());
			System.out.println("- Address: " + cl.getAddress());
			System.out.println("- Monthly Income: " + cl.getMonthly_income());
			System.out.println("------------------");
			i++;
		}
		
		//TODO DO THINGS WITH LIST OF CLIENTS!!
		
		IOHandler.storeClientsInFile(myClients, "clients.txt");
	}

}
