
public class Brownies extends CondimentDecorator {
	Beverage beverage;
	public Brownies (Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Brownies" ;
	}
		public double cost(){
			return 0.25 + beverage.cost();
		}
	}



