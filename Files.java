import java.io.*;
public class FileCopy
{
public static void main(String[] args) 
{
String source = "source.txt";
String destination = "Destination.txt";
try 
{
FileInputStream fin = new FileInputStream(source);
FileOutputStream fos = new FileOutputStream(destination);
int data;
while ((data = fin.read()) != -1) 
{
fos.write(data);
}
fin.close();
fos.close();
System.out.println("File copied Successfully!!!");
} 
catch (FileNotFoundException e) 
{
System.out.println("Error File Not Found!!!");
}
catch (IOException e)
{
System.out.println("Error while copying File");
}
}
}


