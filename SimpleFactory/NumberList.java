
public abstract class NumberList
{
	protected int[] int_list;
	protected double[] double_list;
	protected char[] char_list;

	NumberList()
	{
		int_list = null;
		double_list = null;
		char_list = null;
	}

	public int[] getIntList() {return int_list;}
	public double[] getDoubleList() {return double_list;}
	public char[] getCharList() {return char_list;}
	public void display() {}
	public Number sum() {return null;}
}








