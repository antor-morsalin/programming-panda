import java.util.Scanner;
import java.io.*;


public class Compile 
{
    public static double [] numVal = new double[500];
    public static String [] numVar = new String[500];
    public static String [] tVal = new String[500];
    public static String [] tVar = new String[500];
    public static String [] allVar = new String[1000];
    public static int ni = 0 ;
    public static int ti = 0 ;
    public static int ai = 0 ;
    Scanner s ;

   
    public Compile(long count , String pth) 
    {
        
        try
        {
            File file = new File(pth);
            s = new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("UwU");
        }

    
        tVar[0] = "sp" ;
        tVal[0] = " " ;
        allVar[0] = "sp" ;
        ai++;
        ti++;
        
        numVar[0] = "it";
        allVar[1] = "it";
        ai++;
        ni++;

        for(int i = 1 ; i<1000 ; i++)
        {
            if(i<500)
            {
                numVar[i] = "-0.0";
                if(i != 0)
                {
                    tVar[i] = "-0.0";
                }
            }
            if(i>1)
            {
                allVar[i] = "-0.0";
            }
            
        }
        
        while(count > 0  && s.hasNextLine())
        {
           String command = s.next();
           if(command.toLowerCase().equals("print")) // print command
           {
               char sc = s.next().charAt(0);
               if(sc == ':')
               {
                   printText();
               }
           }

           else if(command.toLowerCase().equals("number"))
           {
               number();
           }

           else if(command.toLowerCase().equals("line"))
           {
               line();
           }
           else if(command.toLowerCase().equals("input"))
           {
                String type = s.next();
                if(type.toLowerCase().equals("line"))
                {
                    inputLine();
                }
                else if(type.toLowerCase().equals("number"))
                {
                    inputNumber();
                }
                else 
                {
                    System.out.println(type + " is not a valid data type");
                }
           }
           else if(command.toLowerCase().equals("value"))
           {
                value();
           }
           else if(command.toLowerCase().equals("print<<"))
           {
                printVar();
           }
           else if(command.toLowerCase().equals("if"))
           {
                ifStatement();
           }
           else if(command.toLowerCase().equals("for"))
           {
                forStatement();
           }



           count--;
        } 

    }




    // Method to print a normal string
    public void printText()
    {
        String ibody = s.nextLine();
        String body = new String();
        for(int i = 1 ; i<ibody.length() ; i++)
        {
            body += ibody.charAt(i);
        }
        System.out.println(body);
        StartCoding.console.append(body + "\n");
        
    }


    // Mehtod to initiate number variable
    public void number()
    {
        int c = 1 ;
        String nv = s.next();
        for(int i = 0 ; i<1000 ; i++)
        {
            if(allVar[i].equals("-0.0"))
            {
                break;
            }
            else if(allVar[i].equals(nv))
            {
                c = 0 ;
                System.out.println("variable '" + nv + "' has been used once already");
                StartCoding.console.append("variable '" + nv + "' has been used once already"+ "\n");
               
                break;
            }
        }
        if(c==1)
        {
        char sc = s.next().charAt(0);
        if(sc == '=' || sc == ':')
        {
            String x = s.next();
            int k = 1 ;
            if(x.charAt(0) == ('0'))
            {
                k = 0 ;
            }
            int pc = 0 ;
            for(int i = 0 ; i<x.length() ; i++)
            {
                
                if((int)x.charAt(i) < 43 || (int)x.charAt(i)>57)
                {
                    k = 0 ; break;
                }
                if((int)x.charAt(i) == 47 || (int)x.charAt(i) == 44)
                {
                    k = 0 ; break;
                }
                if((int)x.charAt(i) == 46)
                {
                    pc++;
                }
                if(pc > 1)
                {
                    k = 0 ; break;
                }
                if(((int)x.charAt(i) == 43 || (int)x.charAt(i) == 45) && i != 0)
                {
                    k = 0 ; break;
                }
                
            }
            if(k==0)
            {
                System.out.println("please input a valid number");
                StartCoding.console.append("please input a valid number"+ "\n");
                
            }
            else
            {
                double value = Double.parseDouble(x);
                numVal[ni] = value ;
                numVar [ni] = nv ;
                allVar [ai] = nv ;
                ai++;
                ni++;
            }
        }
        else
        {
            System.out.println("add '=' or ':' after '"+ nv+"' variable ");
            StartCoding.console.append("add '=' or ':' after '"+ nv+"' variable "+ "\n");
            
        }
        }
        
    }



    // Method to initiate String variable
    public void line()
    {
       
        String lv = s.next();
        int c = 1 ;
        for(int i = 0 ; i<1000 ; i++)
        {
            if(allVar[i].equals("-0.0"))
            {
                break;
            }
            else if(allVar[i].equals(lv))
            {
                c = 0 ;
                System.out.println("variable '" + lv + "' has been used once already");
                StartCoding.console.append("variable '" + lv + "' has been used once already"+ "\n");
                
                break;
            }
        }
        if(c == 1)
        {
            char sc = s.next().charAt(0);
            if(sc == '=' || sc == ':')
            {
                String y = s.nextLine();
                String x = "";
                for(int i = 1 ; i<y.length() ; i++)
                {
                    x += y.charAt(i);
                }
                tVal[ti] = x ;
                tVar[ti] = lv ;
                allVar[ai] = lv ;
                ti++;
                ai++;
            }
            else
            {
                System.out.println("add '=' or ':' after '"+lv+"' variable");
                StartCoding.console.append("add '=' or ':' after '"+lv+"' variable"+ "\n");
                
            }
        }
    }



    public void inputLine()
    {
       String lv = s.next();
       int c = 1 ;
       for(int i = 0 ; i<1000 ; i++)
       {
           if(allVar[i].equals("-0.0"))
           {
               break;
           }
           else if(allVar[i].equals(lv))
           {
               c = 0 ;
               System.out.println("variable '" + lv + "' has been used once already");
               StartCoding.console.append("variable '" + lv + "' has been used once already"+ "\n");
               break;
           }
       }
       if(c==1)
       {
       String fLine = s.next();
       String sLine = s.nextLine();
       String body = fLine + sLine;
       tVar[ti] = lv ;
       allVar[ai] = lv ;
       tVal[ti] = body ;
       ti++; ai++;

       }
    }



    public void inputNumber()
    {
        String nv = s.next();

        int c = 1 ;
        for(int i = 0 ; i<1000 ; i++)
        {
            if(allVar[i].equals("-0.0"))
            {
                break;
            }
            else if(allVar[i].equals(nv))
            {
                c = 0 ;
                System.out.println("variable '" + nv + " has been used once already");
                StartCoding.console.append("variable '" + nv + " has been used once already"+ "\n");
                break;
            }
        }
        if(c == 1)
        {
            String fLine = s.next();
            String sLine = s.nextLine();
            String x = fLine + sLine;
            
            int k = 1 ;
            if(x.charAt(0) == ('0'))
            {
                k = 0 ;
            }
            int pc = 0 ;
            for(int i = 0 ; i<x.length() ; i++)
            {
                
                if((int)x.charAt(i) < 43 || (int)x.charAt(i)>57)
                {
                    k = 0 ; break;
                }
                if((int)x.charAt(i) == 47 || (int)x.charAt(i) == 44)
                {
                    k = 0 ; break;
                }
                if((int)x.charAt(i) == 46)
                {
                    pc++;
                }
                if(pc > 1)
                {
                    k = 0 ; break;
                }
                if(((int)x.charAt(i) == 43 || (int)x.charAt(i) == 45) && i != 0)
                {
                    k = 0 ; break;
                }
                
            }
            if(k==0)
            {
                System.out.println("please input a valid number");
                StartCoding.console.append("please input a valid number"+ "\n");
            }
            else
            {
                double value = Double.parseDouble(x);
               
                numVal[ni] = value ;
                numVar [ni] = nv ;
                allVar [ai] = nv ;
                ai++;
                ni++;

            }


        }
    }


    // method to caculate an equation
    public void value()
    {
        String vv = s.next();
        int c = 1 ;
        for(int i = 0 ; i<1000 ; i++)
        {
            if(allVar[i].equals("-0.0"))
            {
                break;
            }
            else if(allVar[i].equals(vv))
            {
                c = 0 ;
                System.out.println("variable '" + vv + "' has been used once already");
                StartCoding.console.append("variable '" + vv + "' has been used once already"+ "\n");
                
                break;
            }
        }
        if(c==1)
        {
            char sc = s.next().charAt(0);
            if(sc == '=' || sc == ':')
            {
                String y = s.nextLine();
                String equation = "";
                for(int i = 1 ; i<y.length() ; i++)
                {
                    equation += y.charAt(i);
                }
                double res = EquationEvaluator.evaluateEquation(equation);
                numVal[ni] = res ;
                numVar[ni] = vv ;
                allVar[ai] = vv ;
                ni++;
                ai++;
               
            }
            else
            {
                System.out.println("add '=' or ':' after '"+vv+" variable");
                StartCoding.console.append("add '=' or ':' after '"+vv+" variable"+ "\n");
               
            }
        }

    }

    // Mehtod to print variable with text
    public void printVar()
    {
        String x = " " ;
       while(true)
       {
            x = s.next();
            if(x.equals(">>"))
            {
                System.out.print("\n");
                StartCoding.console.append("\n");
               
                break;
            }
            else if(x.equals("<"))
            {
                String variable = s.next();
                int IND = 0 ;
                int indicator = 0 ;
                for(int k = 0 ; k<500 ; k++)
                {
                    if(numVar[k].equals(variable))
                    {
                        IND = k ;
                        indicator = 1 ;
                        break ;
                    }
                    if(tVar[k].equals(variable))
                    {
                        IND = k ;
                        indicator = 2 ;
                        break ;
                    }
                }
                if(indicator == 1)
                {
                    String z = String.valueOf(numVal[IND]) ;
                    System.out.print(z);
                    StartCoding.console.append(z);
                }
                else if(indicator == 2)
                {
                    System.out.print(tVal[IND]);
                    StartCoding.console.append(tVal[IND]);
                }
                else 
                {
                    System.out.println("Unrecognized Variable");
                    StartCoding.console.append("Unrecognized Variable" + "\n");
                    
                    break ;
                }
                String ED = s.next();
                if(! ED.equals(">"))
                {
                    System.out.println("You have to add > after the variable");
                    StartCoding.console.append("You have to add > after the variable" + "\n");
                    
                }
            }
            else 
            {
                System.out.print(x + " ");
                StartCoding.console.append(x + " ");
                
            }
       }
    }

    public void ifStatement()   // If statement
    {
        String v1, op, v2 ;
        v1 = s.next();
        op = s.next();
        v2 = s.next();

        int IND1 = 0 ;
        int IND2 = 0 ;
        int indicator1 = 0 ;
        int indicator2 = 0 ;
        for(int k = 0 ; k<500 ; k++)
        {
            if(numVar[k].equals(v1))
            {
                IND1 = k ;
                indicator1 = 1 ;
            }
            if(numVar[k].equals(v2))
            {
                IND2 = k ;
                indicator2 = 1 ;
            }
        }
        if(indicator1 == 1 && indicator2 == 1)
        {
            double val1 = numVal[IND1];
            double val2 = numVal[IND2];
            int ex = 1 ;
            if(op.equals("="))
            {
                if(val1 != val2)
                {
                    ex = 0 ;
                }
            }
            if(op.equals("~"))
            {
                if(val1 == val2)
                {
                    ex = 0 ;
                }
            }
            if(op.equals(">"))
            {
                if(val1 < val2)
                {
                    ex = 0 ;
                }
            }
            if(op.equals("<"))
            {
                if(val1 > val2)
                {
                    ex = 0 ;
                }
            }
            if(ex == 0)
            {
                while(true)
                {
                    String codeText = s.nextLine();
                    if(codeText.equals(">>"))
                    {
                        break ;
                    }
                }
            }
        }
        else 
        {
            System.out.println("Invalid Variable");
            StartCoding.console.append("Invalid Variable" + "\n");
            
        }


    }

    public void forStatement()
    {
       int i1, i2 ;
       i1 = s.nextInt();
       String op = s.next();
       i2 = s.nextInt();

       try
       {
            File forFile = new File("E:/Programming Panda/File Code/For.txt");
            FileWriter writer = new FileWriter(forFile);
             while(true)
             {
                String fLine = s.nextLine();
                if(fLine.equals(">>"))
                {
                    break;
                }
                writer.write(fLine);
             }
             writer.close();
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        numVal[0] = i1 ;
        for(int i = i1 ; i<=i2 ; i++)
        {
            new Compile(100000, "E:/Programming Panda/File Code/For.txt");
            numVal[0]++;
        }
    }
	
	
}


