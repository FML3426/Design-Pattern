package structural.composite;

import java.util.ArrayList;

/**
 * Created by ML3426 on 16/8/1.
 */
public class Composite extends Component
{
	private ArrayList list = new ArrayList();

	public void add(Component c)
	{
		list.add(c);
	}

	public void remove(Component c)
	{
		list.remove(c);
	}

	public Component getChild(int i)
	{
		return (Component)list.get(i);
	}

	public void operation()
	{
		for(Object obj:list)
		{
			((Component)obj).operation();
		}
	}
}
