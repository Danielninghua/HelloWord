package org.daniel.test;

public class Test
{

    public static void main(String[] args)
    {
        StringBuilder msg = new StringBuilder();
        
        msg.append("a").append(",").append("b").append(",").append("c").append(",");
        System.out.println(msg.toString());
        
        msg.deleteCharAt(msg.length() -1);
        System.out.println(msg.toString());
        
        try
        {
            throw new IllegalArgumentException("IllegalArgumentException for example");
        }
        catch(Exception e)
        {            
            System.out.println(e.getMessage());
        }

    }

}
