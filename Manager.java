package Test0630;

public class Manager extends Employee{
		int Mpee;
		
		public Manager(int id, String name, int basic, int benefit, int Mpee) {
			
			super(id, name, basic, benefit);
			this.Mpee=Mpee;
		}
		public int Pay(){
			super.Pay();
			total +=Mpee;
			return total;
		}		
}
