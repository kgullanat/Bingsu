
public class Berries extends CondimentDecorator {
	Sweet sweet;
	public Berries (Sweet sweet){
		this.sweet = sweet;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return sweet.getDescription()+",Berries" ;
	}
		public double cost(){
			return 0.39 + sweet.cost();
		}
	}