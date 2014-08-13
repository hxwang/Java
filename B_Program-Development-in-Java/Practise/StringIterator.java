/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MyString implements Iterable<String>
{
	private String str;
	
	public MyString(String str){
		this.str = str;
	}
	
	public Iterator<String> iterator(){
		return new MyIterator(this.str);
	}
	
	private static class MyIterator implements Iterator<String>{
		private String str;
		private int pos;
		
		public MyIterator(String str){
			this.str = str;
			this.pos = -1;
		}
		
		public boolean hasNext(){
			return this.pos < str.length()-1;
		}
		
		public String next() throws NoSuchElementException{
			if(this.pos>=str.length()) throw new NoSuchElementException("next");
			char c = str.charAt(this.pos+1);
			this.pos++;
			return Character.toString(c);
		}
		
		public void remove(){
			
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		MyString m = new MyString("bat");
		String res = "";
		for(String i:m)
			res = i+res;
		System.out.println(res);
	}
}