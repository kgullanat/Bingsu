
public class Conflake extends CondimentDecorator {
	Sweet sweet;
	public Conflake (Sweet sweet){
		this.sweet = sweet;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return sweet.getDescription()+",Conflake" ;
	}
		public double cost(){
			return 0.40 + sweet.cost();
		}
	}