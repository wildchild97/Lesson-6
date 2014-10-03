public class Employee 
{
    private int type;
    private double hours;
    private double rate;
    private String name;
   
    public Employee()
    {
        name="";
        type=0;
        rate=0;
        hours=0;
    }
    
    public String getTypeRules()
    {
        return "1 or 2";
    }
   
    public String getNameRules()
    {
        return "nonblank";
    }
   
    public String getRateRules()
    {
        return "between 6.75 and 30.50, inclusive";
    }
   
    public String getHourRules()
    {
        return "between 1 and 60, inclusive";
    }
}