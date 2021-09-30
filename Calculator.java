/*
 * AP Comp Sci
 * Problem Set 2-A
 * Sept, 29, 2021
 * Jason Shi
 */

public class Calculator{

    public double[] QuadraticFormula(double a, double b, double c){
        double x1 = ( ( (-1*b) + Math.sqrt(b*b - 4*a*c) ) / (a*2)); //formula for quadratic 
        double x2 = ( ( (-1*b) - Math.sqrt(b*b - 4*a*c) ) / (a*2)); 
        double[] quadAns = {x1,x2}; //need array to hold both when -b + and - the discriminant 
        return quadAns; //holds both values 
     
    }

    public double Slope (double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);   //formula for slope 
        return m;
    }
    
    public double[] Midpoint (double x1, double y1, double x2, double y2){ 
        double mx = ( (x1 + x2)  /2);   //formula for midpoint 
        double my = ( (y1 + y2)  /2);  
        double[] mid = {mx, my};    //double array because 2 points needed to be stored
        return mid; 
    }
    
    public double Arithmetic (double a, double numArt, double d){
        double sumAr = ( (numArt/2)*((2*a)+(numArt-1)*d));      // formula for arithmetic 
        return sumAr;
    }
    
    public double Geometric (double a, double r, double numGeo){
        double sumG = (a*(1- Math.pow(r, numGeo)) ) / (1-r);  //formula for geometric 
        return sumG; 
    }
    
    public void display(){
        //***************QUADRATIC FORMULA
        double a = 1; //values for the quadratic; change values at initialzation if need for different values 
        double b = 5;
        double c = 6;
        double[] quadAns = QuadraticFormula(a,b,c); //to get the specific array list values
       System.out.println("QUADRATIC FORMULA");
       System.out.print("The solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + quadAns[1] + " and " + quadAns[0] + ".");
       System.out.println("");    //formatting for the next formula(s) 
       System.out.println("");    
       
       //********SLOPE FORMULA 
       double x1 = 0.0; //x and y of first set 
       double y1 = 0.0;
       
       double x2 = 2.0;
       double y2 = 3.0; //x and y of second set 
     System.out.println("SLOPE FORMULA");
     System.out.print("A line connecting the points " + "(" + (int)x1 + ", " + (int)y1 + ") and " + "(" + (int)x2 + ", " + (int)y2 + ") has a slope of " + Slope(x1,y1,x2,y2) );
     System.out.println("");
     System.out.println("");
     
     //************MIDPOINT FORMULA
      x1 = 0.0; //x and y of first set
      y1 = 0.0;
      
      x2 = 2.0; //x and y of second set 
      y2 = 3.0; 
      double[] midAns = Midpoint(x1,y1,x2,y2); //to grab each value for midpoint
     System.out.println ("MIDPOINT FORMULA");
     System.out.print( "The midpoint between (" + (int)x1 + ", " + (int)y1 + ") and " + "(" + (int)x2 + ", " + (int)y2 + ") is " + "(" + midAns[0] + ", " + midAns[1] + ")");
     System.out.println("");
     System.out.println("");
     
     //************* Sum of an Arithmetic 
     a = 1.0; //first term
     double numArt = 5; // number of terms; must be double because n is being divided by 2 and needs to hold decimals 
     double d = 1.0; //common difference
     
     System.out.println("SUM OF AN ARITHMETIC SERIES");
     System.out.println("The sum of the first " + (int)numArt + " terms of an arithmetic series that starts with " + a);
     System.out.print("and increases by " + d + " is " + Arithmetic(a,numArt,d) );
     System.out.println("");
     System.out.println("");
     
      //********************Sum of Geometric Series
     a = 3.0; //first term
     double r = 2.0; //common ratio 
     double numGeo = 3; //number of terms for geometric series
     
     System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
     System.out.println("The sum of the first " + (int)numGeo + " terms of a finite geometric series that starts with " + a);
     System.out.print("and increases by a rate of " + r + " is " + Geometric(a,r,numGeo) );
     System.out.println("");
     System.out.println("");        //for any other formulas that need to be added 
     
    }

}
