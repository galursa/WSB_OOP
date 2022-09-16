public class Container<T>{
	public T element;
	public Container(T something) {
		element = something;
	}
	public T returnElement()
	{
		return element;
	}
}