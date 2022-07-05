package Test0630;

public class SalaryTest{
public static void main(String args[]){

	Employee e [] = new Employee[4];
	// 1.상속 2.생성자(타입 순서 갯수....)
	e[0] = new Employee(1000,"이",10000,5000);
	e[1] = new Manager(2000,"김",20000,10000,10000);
	e[2] = new Engineer(3000,"박",15000,7500,5000,5000);
	e[3] = new Secretary(4000,"최",15000,7000,10000);
	
	e[0].Pay();
	e[1].Pay();
	e[2].Pay();
	e[3].Pay();
	
	System.out.println("id : name : pay : total\t");
	for(int i=0;i<e.length;i++) {
		System.out.println(e[i].id+" : "+e[i].name+" : "+e[i].basic+" : "+e[i].Pay()+"\t");
		}

	//System.out.println(((Manager)e[1]).Mpee);
	}
}