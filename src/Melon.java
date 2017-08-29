
public class Melon extends CondimentDecorator {
	Sweet sweet;
	public Melon (Sweet sweet){
		this.sweet = sweet;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return sweet.getDescription()+",Melon" ;
	}
		public double cost(){
			return 0.40 + sweet.cost();
		}
	}
