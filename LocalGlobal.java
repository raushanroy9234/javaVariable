
//new commit op
//raushan raushan
//JAVA CORE
class LocalGlobal{
    static String str = "make my machine";//Global variable
    public static void main(String[] args) {
        int x = 10;//local variable
        //int j=69;
        System.out.println(x);
        System.out.println(str);

        {
            int y = 20;//local variable
            System.out.println(y);
            System.out.println(str);
            System.out.println(x);
        }
        //int j=69;
        {
            int j = 890;//local variable
            System.out.println(j);
            System.out.println(str);
        }
        {
            int j = 676;//local variable
            j = 5550;
            System.out.println(j);
            System.out.println(j);
        }
        
        
    
    }
   
   
    

   
=======


class LocalGlobal{
    static String str = "make my machine";//Global variable
    public static void main(String[] args) {
        int x = 10;//local variable
        System.out.println(x);
        System.out.println(str);

        {
            int y = 20;//local variable
            System.out.println(y);
            System.out.println(str);
        }
        {
            int j = 890;//local variable
            System.out.println(j);
            System.out.println(str);
        }
        {
            int j = 676;//local variable
            j = 5550;
            System.out.println(j);
            System.out.println(j);
        }
        
        
    
    }
   
   
    

   
>>>>>>> 3bce3077601a8b9e30ea27a526c45c61f644ff02
}