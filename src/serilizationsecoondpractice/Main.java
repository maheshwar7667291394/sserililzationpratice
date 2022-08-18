package serilizationsecoondpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		B b=new B();
		 File file=new File("D://mkumar123.txt");
		  FileOutputStream fi=new FileOutputStream(file);
		  ObjectOutputStream os=new ObjectOutputStream(fi);
		  os.writeObject(b);
		  os.close();
		  
		  FileInputStream fie=new FileInputStream(file);
		  ObjectInputStream oi=new ObjectInputStream(fie);
		  Object obj=oi.readObject();
		  B b1=(B)obj;
		 int[] b2=b1.arr;
		 for(int item:b2) {
			 System.out.println(item);
		 }
		  
		 
		
	}

}
