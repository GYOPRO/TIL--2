package Test0630;

public class Engineer extends Employee{
		int Epee, Epee2;
		
		public Engineer(int id, String name, int basic, int benefit, int Epee,int Epee2) {
			super(id, name, basic, benefit);
			this.Epee=Epee;
			this.Epee2=Epee2;
		}
		public int Pay(){
			total = basic+benefit+Epee+Epee2;
			return total;
		}		
	}

