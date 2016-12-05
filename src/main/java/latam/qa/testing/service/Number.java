package latam.qa.testing.service;

public class Number {

    public String stringCalc(int x, int y){
    	return String.format("%d,%d",x,y);
    }
    public int divideYentregaEntero(int x,int y){
    	if(y==0){
    		return 0;
    	} 
    	int division = x/y;
        return division;
    }
}