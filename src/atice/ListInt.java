class ListInt
{
    LinkdList<ListInt> listInt;
    int value;
	ListInt(int val)
	{
		value = val;
	}
	ListInt()
	{
	}
    public static void main(String[] args)
    {
	ListInt lI = new ListInt();
	lI.begin();
    }

    void begin()
    {
		listInt = new LinkdList<ListInt>();
		ListInt tmp = new ListInt(1);
		listInt.insert(listInt,tmp);
		display();
		
    }
	void display()
	{
		System.out.println("in display");
		for(LinkdList<ListInt> tmp = listInt.head;tmp != null ;tmp = tmp.next)
		{
			System.out.println(tmp.obj.value);
		}
	}
}
