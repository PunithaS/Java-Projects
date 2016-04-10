package com.bss.serilization;

@SuppressWarnings("serial")
public class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public int  SSN;
   public int number;
   
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
      System.out.println("just printing more lines... ");
   }
}