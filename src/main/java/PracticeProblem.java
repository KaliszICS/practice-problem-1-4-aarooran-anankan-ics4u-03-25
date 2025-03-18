import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class PracticeProblem {
	public static void main(String args[]) {

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter("file");
			fileWriter.write("Jacob Park 17 123456789\n");
			fileWriter.write("Eric Lan 17 987654321\n");
			fileWriter.write("Tiffany Chiu 17 123654789");
		}
		catch (IOException e) {}
		finally {
			try {
				if (fileWriter != null) {
					fileWriter.close();
				}
			}
			catch (IOException e) {}
		}

		System.out.print(getAge(2, "file"));
	}

	public static String getName(int Line, String file) {
		
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(file));

			String line = "";
				for(int i=1;i<=Line;i++) {
					line = inputStream.readLine();
					if (line == null) {
						return ""; 
					}
				}
			
			String[] nameArr = line.split(" ");
			String name = nameArr[0] + " " + nameArr[1];
			return name;
		}

		catch (IOException e) {return "";}
		
		finally {
		 	try {
				if (inputStream != null) {
		 			inputStream.close();
		 		}
		 	}
		 	catch (IOException e) {}
		 }
	}

	public static int getAge(int Line, String file) {
		
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(file));

			String line = "";
				for(int i=1;i<=Line;i++) {
					line = inputStream.readLine();
					if (line == null) {
						return -1; 
					}
				}
			
			if (line != "") {
				String[] ageArr = line.split(" ");
				int age = Integer.parseInt(ageArr[2]);
				return age;
			}
			else {return -1;}
		}

		catch (IOException e) {return -1;}
		
		finally {
		 	try {
				if (inputStream != null) {
		 			inputStream.close();
		 		}
		 	}
		 	catch (IOException e) {}
		 }
	}

	public static int getNumber(int Line, String file) {
		
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(file));

			String line = "";
				for(int i=1;i<=Line;i++) {
					line = inputStream.readLine();
					if (line == null) {
						return -1; 
					}
				}
			
			String[] numArr = line.split(" ");
			int num = Integer.parseInt(numArr[3]);
			return num;
		}

		catch (IOException e) {return -1;}
		
		finally {
		 	try {
				if (inputStream != null) {
		 			inputStream.close();
		 		}
		 	}
		 	catch (IOException e) {}
		 }
	}

	public static void fileAppend(String output, String filename) {
		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(filename, true));
			bw.write(output);
		}
		
		catch(IOException e) {}
		
		finally {
			try {
				if (bw != null) {
					bw.close();
				}
			}
			catch (IOException e) {}
		}
	}
}
