package Test0630;

public class Employee {
		int id;
		String name;
		int basic;
		int benefit;
		int total;
		
		public Employee() {}
		
		public Employee(int id, String name, int basic, int benefit){
			this.id=id;
			this.name=name;
			this.basic=basic;
			this.benefit=benefit;
		}
				
		public int Pay(){
			total = basic+benefit;
			return total;
		}
	}

