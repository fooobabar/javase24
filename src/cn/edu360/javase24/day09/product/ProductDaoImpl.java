package cn.edu360.javase24.day09.product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void addProduct(String p) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("product.txt", true),"utf-8"));
	    bw.write(p);
	    bw.write("\r\n");
	    bw.close();
	}

	@Override
	public ArrayList<Product> getAllProducts() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("product.txt"),"utf-8"));
		
		ArrayList<Product> pList=new ArrayList<>();
		
		String readLine = null; 
		while( (readLine=br.readLine()) != null ){
			String[] split = readLine.split(",");
			Product p = new Product(split[0], split[1], Float.parseFloat(split[2]));
			pList.add(p);
		}
		
		return pList;		
	}

}
