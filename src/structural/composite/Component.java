package structural.composite;

/**
 * Created by ML3426 on 16/8/1.
 */
public abstract class Component
{
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract Component getChild(int i);
	public abstract void operation();
}