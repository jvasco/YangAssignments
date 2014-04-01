class RationalNumSimplifier
{
	private double nume;
	private double deno;
	private int gcd;
	public RationalNumSimplifier()
	{
		nume = 0;
		deno = 1;
	}
	public RationalNumSimplifier(int a, int b)
	{
		nume = a;
		deno = b;
	}
	public void simplify()
	{
		if(nume>deno && nume>0 && deno>0)
		{
			for(int x = 1; x<=nume; x++)
			{
				if(nume%x==0 && deno%x==0)
				{
					gcd = x;
				}
			}
		}
		else if(deno>nume && nume>0 && deno>0)
		{
			for(int x = 1; x<=deno; x++)
			{
				if(nume%x==0 && deno%x==0)
				{
					gcd = x;
				}
			}
		}
		nume = nume/gcd;
		deno = deno/gcd;
	}
	public int getGCD()
	{
		return gcd;
	}
	public double getValue()
	{
		double butts = nume/deno;
		return butts;
	}
	public String toString()
	{
		String num = Double.toString(nume);
		String den = Double.toString(deno);
		return (num + "/" + den);
	}
}