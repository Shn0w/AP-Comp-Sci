public class Main{
    public static void main(String[] args){
        // Daniel Chen September 20th, 2021
        // ProblemSet 1-A

        // Qudratic Formula
        // qA = a, qB = b, qC = c, qAns1 = first solution, qAns2 = second solution
        int qA = 1;
        int qB = -5;
        int qC = 6;
        double qAns1 = (-qB + Math.sqrt(qB*qB-4*qA*qC))/(2.0*qA); // qudratic formula calculations for first variable
        double qAns2 = (-qB - Math.sqrt(qB*qB-4*qA*qC))/(2.0*qA); // qudratic formula calculations for second variable
        System.out.println("QUADRATIC FORMULA");
        System.out.println("The solutions for " + qA + "x^2 + " + qB + "x + " + qC + " are " + qAns1 + " and " + qAns2 + ".");
        System.out.println();

        // Slope Formula
        // sY2 = y2, sY1 = y1, sX2 = x2, sX1 = x1, sM = midpoint
        int sY2 = 3;
        int sY1 = 6;
        int sX2 = 10;
        int sX1 = 12;
        double sM = ((double)(sY2) - sY1)/(sX2- sX1); // slope formula calculations
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + sY2 + ", " + sY1 + ") and (" + sX2 + ", " + sX1 + ") has a slope of " + sM);
        System.out.println();

        // Midpoint Formula
        // mY2 = y2, mY1 = y1, mX2, x2, mX1 = x1, mX = x midpoint, mY = y midpoint
        int mY2 = 3;
        int mY1 = 6;
        int mX2 = 10;
        int mX1 = 12;
        double mX = ((double)(mX2)+mX1)/2.0; // midpoint x formula calculations
        double mY = ((double)(mY2)+mY1)/2.0; // midpoint y formula calculations
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + mX1 + ", " + mY1 + ") and (" + mX2 + ", " + mY2 + ") is (" + mX + ", " + mY + ")");
        System.out.println();

        // Sum of a Arithmetic Series
        // start = starting number, increase = increase amount, terms = number of terms, last = last term, sum = sum of arithmetic series
        double start = 1;
        double increase = 1;
        int terms = 5;
        double last = start + (terms-1)*increase; // calculate last number of arithmetic series
        double sum = terms/2.0*(start + last); // calculate sum of arithmetic series 
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + terms + " terms of an arithmetic series that starts with " + start + " and increases by " + increase + " is " + sum);
        System.out.println();
        
        // Sum of a Finite Geometric Series
        // gStart = starting number, gInc = rate of increase, gTerms = number of terms, gSum = sum of finite geometric series
        double gStart = 3;
        double gInc = 2;
        int gTerms = 3;
        double gSum = gStart * (1.0-Math.pow(gInc, gTerms))/(1.0-gInc); // calculate sum of geometric series
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + gTerms + " terms of a finite geometric series that starts with " + gStart + " and increases by a rate of " + gInc + " is " + gSum);
    }
}
