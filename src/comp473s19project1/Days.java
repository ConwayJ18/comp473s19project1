package comp473s19project1;

public class Days
{
	boolean m; //Monday
	boolean t; //Tuesday
	boolean w; //Wednesday
	boolean r; //Thursday
	boolean f; //Friday
	boolean a; //Saturday
	boolean u; //Sunday
	
	public Days() {}
	
	/**
	 * @param m
	 * @param t
	 * @param w
	 * @param r
	 * @param f
	 * @param a
	 * @param u
	 */
	public Days(boolean m, boolean t, boolean w, boolean r, boolean f, boolean a, boolean u)
	{
		this.m = m;
		this.t = t;
		this.w = w;
		this.r = r;
		this.f = f;
		this.a = a;
		this.u = u;
	}

	/**
	 * @return the m
	 */
	public boolean isM()
	{
		return m;
	}

	/**
	 * @param m the m to set
	 */
	public void setM(boolean m)
	{
		this.m = m;
	}

	/**
	 * @return the t
	 */
	public boolean isT()
	{
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(boolean t)
	{
		this.t = t;
	}

	/**
	 * @return the w
	 */
	public boolean isW()
	{
		return w;
	}

	/**
	 * @param w the w to set
	 */
	public void setW(boolean w)
	{
		this.w = w;
	}

	/**
	 * @return the r
	 */
	public boolean isR()
	{
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(boolean r)
	{
		this.r = r;
	}

	/**
	 * @return the f
	 */
	public boolean isF()
	{
		return f;
	}

	/**
	 * @param f the f to set
	 */
	public void setF(boolean f)
	{
		this.f = f;
	}

	/**
	 * @return the a
	 */
	public boolean isA()
	{
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(boolean a)
	{
		this.a = a;
	}

	/**
	 * @return the u
	 */
	public boolean isU()
	{
		return u;
	}

	/**
	 * @param u the u to set
	 */
	public void setU(boolean u)
	{
		this.u = u;
	}
	
	public boolean overlaps(Days d)
	{
		if(this.isM() == d.isM() || this.isT() == d.isT() || this.isW() == d.isW()
		|| this.isR() == d.isR() || this.isF() == d.isF() || this.isA() == d.isA()
		|| this.isU() == d.isU())
		{
			return true;
		}
		
		return false;
	}
}
