package functions;

public abstract class Function {

	public abstract double evaluate (double value);
	public Double[] evaluate (Double[] values){
		Double[] answers = new Double[values.length];
		int i=0;
		for(double value : values)
			answers[i++]=evaluate(value);
		return answers;	
	}
}
