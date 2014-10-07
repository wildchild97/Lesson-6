import TerminalIO.*;

public class MakeEmployee {

    public static void main(String[] args) 
    {
        KeyboardReader r= new KeyboardReader();
       
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;
        String prompt;
        
        emp=new Employee();
        
        while(true)
        {
           //get name and break if its blank 
           System.out.println("\nEnter Employee data");
           name=r.readLine(" Name (or <enter> to quit): ");
           if(!(emp.setName(name))) break;

           //get type until valid
           while (true)
           {
                prompt= "Type("+ emp.getTypeRules()+"): ";
                type=r.readInt(prompt);
                if (emp.setType(type)) break;
           }
           
           //get hourly rate until valid
           while (true)
           {
               prompt= " Hourly rate("+ emp.getRateRules()+"): ";
               rate=r.readDouble(prompt);
               if (emp.setRate(rate)) break;
           }
           
           while (true)
           {
               prompt= "Hours("+ emp.getHourRules()+"): ";
               hours=r.readInt(prompt);
               if (emp.setHours(hours)) break;
           }
           
           //print name and pay
           System.out.print("The weekly pay for ");
           System.out.print(emp.getName());
           System.out.println(" is $" + emp.getPay());
    }
   
    }
    
    
}
