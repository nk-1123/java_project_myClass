package mypackage;
import java.util.*;



public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello world!");
//		System.out.println("Hello world!" + args[0]);
		
//		Employee emp1 = new Employee();
//		emp1.setEmpName("Nikita");
//		emp1.setEmpId(101);
//		emp1.setDeptName("sales");
//		emp1.setEmpSal(20000);
//		
//		PermanentEmployee emp2 = new PermanentEmployee(102, "amisha", "accounts", 20000);
//		emp2.setPfPercent(12);
//		emp2.calcPfAmount();
//		
		//System.out.println(emp2); //will give the hash value and not the values inserted if no toString function is present
//		
//		Student s1 = new Student(101, "Nikits", "10A");
//		Student s2 = new Student(102, "prachhi", "11B");
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter size of array: ");
//		int n = sc.nextInt();
//		int[] a1 = new int[n];
//		for(int i=0; i<n; i++) {
//			System.out.print("Enter element: ");
//			a1[i] = sc.nextInt();
//		}
//		sc.close();
//		Arrays.sort(a1);
//		for (int e : a1) {
//			System.out.print(e + " ");
//		}
		
		//calc pfamount of emp2
		
		//create an account interface and two implementing two classes savingsAccount and 
//		checkingAccount and calc the interest on deposited amount.
//		Account save = new SavingsAccount(2000, 3);
//		save.calcInterest();
//		Account checking = new CheckingAccount(2000, 3);
//		checking.calcInterest();
//		
//		List<Employee> empList = new ArrayList<>();
//		List<Employee> empList1 = new ArrayList<>();
//
//		empList.add(new Employee(101,"amisha","Sales",2000));
//		empList.add(new Employee(102,"ankita","Sales",2000));
//		empList.add(new Employee(103,"sanskriti","Sales",6000));
//		empList.add(new Employee(104,"tanya","Sales",20090));
//		
//		for (Employee e:empList) {
//			if (e.getEmpName().charAt(0) == 'a') {
//				empList1.add(e);
//			}
//		}
//		
//		for(Employee e:empList1) {
//			System.out.println(e.getEmpName());
//		}
		
//		Map<Integer, String> myMap = new HashMap<>();
//		myMap.put(1, "Mark");
//		myMap.put(2, "Nikita");
//		myMap.put(3, "sanskriti");
//		myMap.put(4, "amisha");
//		
//		for(Map.Entry<Integer, String> entry:myMap.entrySet()) {
//			System.out.println(entry.getKey()+": "+entry.getValue());
//		}
		
		
		//assignment for today -  sort emp objects based on their names.
		
//		ArrayList<Employee> empList = new ArrayList<Employee>();
		
//		empList.add(new Employee(101,"Nikita","Sales",200000));
//		empList.add(new Employee(102,"shavi","Sales",2009870));
//		empList.add(new Employee(103,"amisha","Sales",200000));
//		empList.add(new Employee(104,"tanya","Sales",206600));
//		empList.add(new Employee(105,"sanskriti","Sales",200000));
		
//		Collections.sort(empList, Employee.empNameComparator);

//		
//		for (Employee n:empList) {
//			System.out.println(n);
//		}
		
		
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(new Employee(101, "Nikits", "Sales", 20000));
		empSet.add(new Employee(109, "sanskriti", "Sales", 20000));
		empSet.add(new Employee(103, "amisha", "Sales", 20000));
		empSet.add(new Employee(104, "tanya", "Sales", 20000));
		
		for (Employee e:empSet) {
			System.out.println(e);
		}
		
		
		
		

		
	}

}
