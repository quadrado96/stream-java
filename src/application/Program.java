package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Type file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String txtLine = br.readLine();
			
			while (txtLine != null) {
				String[] fields = txtLine.split(","); 
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				txtLine = br.readLine();
			}
			
			Comparator<String> email = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());
			
			List<String> sortedEmails = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted(email).collect(Collectors.toList());
			System.out.println("email of people whose salary is more than " + salary + ": ");
			sortedEmails.forEach(System.out::println);
		
			Double salarySum = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (s1, s2) -> s1 + s2);
			System.out.println("\nSum of salary of people whose name starts with 'M': " + salarySum);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}

}
