import java.io.*;
import java.util.*;

public class mainMenu
	{
		ArrayList <Student> roster = new ArrayList <Student>();
		public static void main(String[] args) throws IOException
			{
			addStudents();
			}
		private static void addStudents()
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				while(file.hasNextLine())
					{
						String line = file.nextLine();
						String [] catcher = line.split(" ");
					}
			}

	}
