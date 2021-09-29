public class Calculator{
    int a;
    int b;
    int c;
    
    
    public Calculator(int a, int b, int c){
      this.a = a;
      this.b = b;
      this.c = c;
    }
    
    
    public void display(int qA, int qB, int qC, int sY2, int sY1, int sX2, int sX1, int mY2, int mY1, int mX2, int mX1, double start, double increase, int terms, double gStart, double gInc, double gTerms){
        
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
        
    }
}