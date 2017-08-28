
public class Berries extends CondimentDecorator {
	Beverage beverage;
	public Berries (Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Berries" ;
	}
		public double cost(){
			return 0.39 + beverage.cost();
		}
	}