
public class Decorator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage a1 = new BingsuFreshMilk();
		a1 = new Brownies(a1);
		a1 = new Conflake(a1);
		a1 = new Melon(a1);
		System.out.println(a1.getDescription()+" $"+a1.cost());
		
		Beverage a2 = new BingsuCocoa();
		a2 = new Berries(a2);
		a2 = new Brownies(a2);
		a2 = new Conflake(a2);
		System.out.println(a2.getDescription()+" $"+a2.cost());
		
		Beverage a3 = new BingsuMacha();
		a3 = new Conflake(a3);
		a3 = new Berries(a3);
		System.out.println(a3.getDescription()+" $"+a3.cost());

	}

}
