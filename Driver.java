/*Honor Pledge: I pledge that I have neither given
nor received any help on this assignment**/


import java.io.*;
import java.util.*;



public class Driver 
{
	public static void main(String [] args)
	{
		//Variable Declarations
		int x;
		String line;
		String choice;
		Scanner sc = new Scanner(System.in);
		
		//Creates an instance of the Student Class
		Student student = new Student();
		
		//Declares a Tokenizer 
		StringTokenizer st;
		
		//Creates an instance of a stack with size 10
		Stack<Student> stack = new Stack<Student>(10);
		
		
		//Resets the screen to look neater
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		while(true)
		{
			//This inner loop is for the main menu input and will reset if an invalid entry is given
			while(true)
			{	
				//Main menu display
				System.out.print("\n1. Load students from file\n2. Print stack\n3. Exit Program"
						+ "\nEnter selection: ");
				choice = sc.nextLine();
			
				//Logic for loading the students from the file to the stack
				if(choice.equals("1"))
				{
					try
					{
						//Opens an input stream from our file, and a reader and buffered reader
						InputStream in = new FileInputStream("students.txt");
						
						InputStreamReader reader = new InputStreamReader(in);
						
						BufferedReader buffreader = new BufferedReader(reader);
						
						
						//Skips the first line of the text file
						line = buffreader.readLine();
						line = buffreader.readLine();
						
						while(line != null)
						{
							//Sets st to a tokenizer that separates the line by commas
							st = new StringTokenizer(line, ",");
							
							//Creates a new instance of student
							student = new Student();
							
							//Populates student using the tokens one by one
							student.setfirstname(st.nextToken());
							student.setlastname(st.nextToken());
							student.setaddressline1(st.nextToken());
							
							//This will make sure the tokens still line up if there's no address 2
							if(st.countTokens()==6)
							{
								student.setaddressline2(st.nextToken());
							}
							//Fills with space if no line 2 for the printout later
							else
							{
								student.setaddressline2("");
							}
							
							student.setaddresscity(st.nextToken());
							student.setaddressstate(st.nextToken());
							student.setaddresszip(st.nextToken());
							student.setid(st.nextToken());
							student.setgpa(st.nextToken());
							
							//Puts the student on the stack and sets line to the next line 
							stack.push(student);
							line = buffreader.readLine();
							
						}
						
						//Closes the stream
						buffreader.close();
						
						//Resets the screen to look neater
						System.out.print("\033[H\033[2J");
						System.out.flush();
						System.out.println("Loaded!\n");
					}
					catch(IOException ex)
					{
						System.err.println(ex);
					}
				}
				
				//Logic for choice 2 - Print Stack
				else if(choice.equals("2"))
				{
					//Resets the screen to look neater
					System.out.print("\033[H\033[2J");
					System.out.flush();
					
					//Prints each student until stack is empty
					while(true)
					{
						//breaks when stack is empty
						if(stack.isEmpty())
						{
							break;
						}
						
						//Creates a new instance of student
						student = new Student();
						
						student=stack.pop();
						
						//Display for the student's info
						//The Tesla screen must be expand to accommodate the size of display 
						System.out.format("ID: %6s ", student.getid());
						System.out.format("   Name: %-16s", student.getfirstname() + " " + student.getlastname());
						System.out.format("   Address: %-51s" , student.getaddress().getline1() + 
								" " + student.getaddress().getline2() + " " + student.getaddress().getcity() + ", " 
								+ student.getaddress().getstate() + " " + student.getaddress().getzip());
						System.out.print("   GPA: " + student.getgpa());
						System.out.print("\n");
					}
				}
				
				//Logic for choice 3
				else if(choice.equals("3"))
				{
					//Resets screen to look neater 
					System.out.print("\033[H\033[2J");
					System.out.flush();
					
				    System.out.println("\n\nGood Bye!\n\n");
				    sc.close();
				    System.exit(0);
				}
				else
				{
					//Resets the screen to look neater
					System.out.print("\033[H\033[2J");
					System.out.flush();
					System.out.println("Invalid entry, please try again:\n");
					continue;
				}
				
			}
			
		}
		
	}
}
