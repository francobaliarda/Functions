package functions;

public class ExponentialFunction extends Function{
	double base;
	
	public ExponentialFunction(double base){
		this.base=base;
	}
	
	public double getBase(){
		return base;
	}
	@Override
	public double evaluate(double value){
		return Math.pow(base, value);
	}
	@Override
	public String toString(){
		return base + "^x";
	}
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(!(obj instanceof ExponentialFunction))
			return false;
		ExponentialFunction f = (ExponentialFunction)obj;
		return Double.compare(this.base,f.base)==0;
	}
	@Override
	public int hashCode(){
		int hash=22;
		long baseHash = Double.doubleToLongBits(base);
		hash = hash*31 + (int)(baseHash ^ (baseHash >>> 32));
		return hash;
	}
	
}
