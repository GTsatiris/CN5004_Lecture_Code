package com.sizeofthis.FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IOHandler {
	
	//Console typing using streams and readers
	public static String handleConsoleInput()
	{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader =  new BufferedReader(input);
		
		//System.out.println("To ntosei onoma:");
		String typedText;
		
		try {
			typedText = reader.readLine();
			//System.out.println("Entose " + typedText + ". Pots genen ato!");
		} catch (IOException e) {
			e.printStackTrace();
			typedText = "-";
		}
		
		return typedText;
	}
	
	public static ArrayList<Client> readClientsFromFile(String filePath)
	{
		ArrayList<Client> clientList = new ArrayList<Client>();
		
		try (
				FileReader clientFile = new FileReader(filePath);
				BufferedReader clientReader = new BufferedReader(clientFile);
			)
		{
			String name = clientReader.readLine();
			
			while((name != null) && (!name.equals("")))
			{
				String address = clientReader.readLine();
				String income = clientReader.readLine();

				Client newClient = new Client(name, address, income);
				clientList.add(newClient);
				
				name = clientReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Cannot find client file!");
		} catch (IOException e) {
			System.out.println("ERROR: There was a problem reading from file!");
		}
		
		return clientList;
	}
	
	public static void storeClientsInFile(ArrayList<Client> clientList, String filePath)
	{
		try (
				FileWriter clientFile = new FileWriter(filePath);
				PrintWriter clientWriter = new PrintWriter(clientFile);
			)
		{
			for(Client cl : clientList)
			{
				clientWriter.println(cl.getName());
				clientWriter.println(cl.getAddress());
				clientWriter.println(cl.getMonthly_income());
			}
		} catch (IOException e) {
			System.out.println("ERROR: There was a problem writing to file!");
		}
	}

}
