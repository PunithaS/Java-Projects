package com.bss.serilization;

import java.io.*;
public class DeSerializer
{
	/**
	 * The first translator to consume codepoints from the input is the
	 * 'winner'. Execution stops with the number of consumed codepoints being
	 * returned. Translate a set of codepoints, represented by an int index into
	 * a CharSequence, into another set of codepoints. The number of codepoints
	 * consumed must be returned, and the only IOExceptions thrown must be from
	 * interacting with the Writer so that the top level API may reliable ignore
	 * StringWriter IOExceptions.
	 * 
	 * @param input
	 *            CharSequence that is being translated
	 * @param index
	 *            int representing the current point of translation
	 * @param out
	 *            Writer to translate the text to
	 * @return int count of codepoints consumed
	 * @throws IOException
	 */
	public int translate(CharSequence input,
            int index,
            Writer out)
     throws IOException {
		return 0;
	}
   public static void main(String [] args)
   {
      Employee e = null;
      try
      {
         FileInputStream fileIn =
                          new FileInputStream("employee.thomas");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
        // return;
      }
      catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
      e.mailCheck();
    }
}