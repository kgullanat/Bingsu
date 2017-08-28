
public class Melon extends CondimentDecorator {
	Beverage beverage;
	public Melon (Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Melon" ;
	}
		public double cost(){
			return 0.40 + beverage.cost();
		}
	}
