public class Calculator{
    
    public void display(int qA, int qB, int qC, int sY2, int sY1, int sX2, int sX1, int mY2, int mY1, int mX2, int mX1, double start, double increase, int terms, double gStart, double gInc, double gTerms){
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + qA + "x^2 + " + qB + "x + " + qC + " are " + quad1(qA, qB, qC) + " and " + quad2(qA,qB,qC) + ".");
        System.out.println();
        
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + sY2 + ", " + sY1 + ") and (" + sX2 + ", " + sX1 + ") has a slope of " + slope(sY2, sY1, sX2, sX1));
        System.out.println();
        
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + mX1 + ", " + mY1 + ") and (" + mX2 + ", " + mY2 + ") is (" + midPoint(mY2, mY1, mX2, mX1)[0] + ", " + midPoint(mY2, mY1, mX2, mX1)[1] + ")");
        System.out.println();
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + terms + " terms of an arithmetic series that starts with " + start + " and increases by " + increase + " is " + arith(start, increase, terms));
        System.out.println();
        
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + gTerms + " terms of a finite geometric series that starts with " + gStart + " and increases by a rate of " + gInc + " is " + geom(gStart, gInc, gTerms));
    }
    
    public double quad1(int qA, int qB, int qC){
        return (-qB + Math.sqrt(qB*qB-4*qA*qC))/(2.0*qA);
    }
    
    public double quad2(int qA, int qB, int qC){
        return (-qB - Math.sqrt(qB*qB-4*qA*qC))/(2.0*qA);
    }
    
    public double slope(int sY2, int sY1, int sX2, int sX1){
        return ((double)(sY2) - sY1)/(sX2- sX1);
    }
    
    public double[] midPoint(int mY2, int mY1, int mX2, int mX1){
        return new double[]{((double)(mX2)+mX1)/2.0, ((double)(mY2)+mY1)/2.0};
    }
    
    public double arith(double start, double increase, int terms){
        double last = start + (terms-1)*increase;
        return terms/2.0*(start + last);
    }
    
    public double geom(double gStart, double gInc, double gTerms){
        return gStart * (1.0-Math.pow(gInc, gTerms))/(1.0-gInc);
    }
}
