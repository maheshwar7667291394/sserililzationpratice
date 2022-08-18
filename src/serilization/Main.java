package serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("D://abnv.txt");
		
		A a1=new A();
		
		FileOutputStream fo=new FileOutputStream(file);
		ObjectOutputStream oss=new ObjectOutputStream(fo);
		oss.writeObject(a1);
		oss.close();
		System.out.println("a1 object is serelized");
		
		FileInputStream fi=new FileInputStream(file);
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		Object obj=oi.readObject();
		A a2=(A)obj;
		int[] ar=a2.i;
		 for(int i=0;i<ar.length;i++) {
			 System.out.println(ar[i]);
		 }
		
	}

}
