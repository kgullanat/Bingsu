
public class Brownies extends CondimentDecorator {
	Sweet sweet;
	public Brownies (Sweet sweet){
		this.sweet = sweet;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return sweet.getDescription()+",Brownies" ;
	}
		public double cost(){
			return 0.25 + sweet.cost();
		}
	}



