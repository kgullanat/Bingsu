
public class Conflake extends CondimentDecorator {
	Beverage beverage;
	public Conflake (Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Conflake" ;
	}
		public double cost(){
			return 0.40 + beverage.cost();
		}
	}