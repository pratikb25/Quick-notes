/**
 * This class allows creation of different types of topping objects
 * @author Nitinkumar Gove
 *
 */
public class ToppingFactory {
	public Topping getTopping(String  topping){
		Topping t = null;
		
		if(topping == null)
			return null;
		
		if(topping.equalsIgnoreCase("spinach")){
			t = new Spinach();
		}
		else if(topping.equalsIgnoreCase("onions")){
			t = new Onions();
		}
		else if(topping.equalsIgnoreCase("veggies")){
			t = new Veggies();
		}
		else
			t = null;
		
		return t;
		
	}
}
