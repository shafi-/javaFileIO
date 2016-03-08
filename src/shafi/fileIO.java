/**
 * 
 */
package shafi;

import java.io.File;

/**
 * @author shafi
 *
 */
public class fileIO {
	
	File inputfile;
	File outputfile;
	
	public boolean setInputFileName(File name)
	{
		inputfile = name;
		return true;
	}
	
	public boolean setOutFileName(File name)
	{
		outputfile = name;
		return true;
	}

	
	public int getNextInt()
	{
		int retInt=0;
		return retInt;
	}
	
	public String getNextString()
	{
		String string="";
		return string;
	}
	
	public char getNextChar()
	{
		char ch= (Character) null ;
		return ch;
	}
	
	public String getNextLine()
	{
		String line = "";
		return line;
	}
	
}
