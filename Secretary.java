package Test0630;

public class Secretary extends Employee {
	
	int Spee;
		
	public Secretary(int id, String name, int basic, int benefit, int Spee) {
		super(id, name, basic, benefit);
		this.Spee=Spee;
		
		}
		public int Pay(){
			total = basic+benefit+Spee;
			return total;
		}		
	}