package functions;
import java.util.ArrayList;

public class PolinomialFunction extends Function {
	private ArrayList<Double> coefficients = new ArrayList<Double>();
	
	public PolinomialFunction(ArrayList<Double> coefficients){
		this.coefficients.addAll(coefficients);
	}
	public PolinomialFunction(Double[] coefficients,int size){
		int index;
		for(index=0; index < size ; index++)
			this.coefficients.add(coefficients[index]);
	}
	
	public ArrayList<Double> getCoefficients(){
		return new ArrayList<Double>(coefficients);
	}
	public int getDegree(){
		return coefficients.size()-1;
	}
	public void changeCoefficient(int index,double value){
		coefficients.set(index,value);
	}
	@Override
	public double evaluate (double value){
		double answer=0;
		for(double coefficient: coefficients)
			answer+=coefficient*Math.pow(value,coefficients.indexOf(coefficient));
		return answer;
	}
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder(coefficients.get(0).toString());
		if(Double.compare(coefficients.get(1),0) != 0)
			str.append(" + " + coefficients.get(1) + "x");
		for(int exponent=2; exponent < coefficients.size() ; exponent++)
		{
			if(Double.compare(coefficients.get(exponent),0) != 0)
				str.append(" + " + coefficients.get(exponent) + "x^" + exponent);
		}
			return str.toString();
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof PolinomialFunction))
			return false;
		PolinomialFunction pol = (PolinomialFunction)obj;
		return coefficients.equals(pol.coefficients);
	}
	@Override
	public int hashCode(){
		return coefficients.hashCode();
	}
}
