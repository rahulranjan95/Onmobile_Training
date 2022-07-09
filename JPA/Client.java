package com.rahul.tester;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.rahul.entity.Student;

public class Client {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Student s1 = new Student(1, "Rahul", 34.40f, "43424", "Delhi");

		// Loading the xml configuratons
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sleeping");
		EntityManager em = factory.createEntityManager();
		while (true) {
			System.out.println("##### Welcome to Student Application #####");
			System.out.println("1.Insert Records");
			System.out.println("2.Update a Records");
			System.out.println("3.Delete a Record");
			System.out.println("4. Display a Record");
			System.out.println("5. Display all Record");
			System.out.println("0. Exit the Application");
			em.getTransaction().begin();

			System.out.println("Enter your choice");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				// em.getTransaction().begin();

				Student s1 = new Student();

				System.out.println("Enter student id");
				s1.setId(scan.nextInt());

				System.out.println("Enter name");
				s1.setName(scan.next());

				System.out.println("Enter marks");
				s1.setMarks(scan.nextFloat());

				System.out.println("Enter mobile");
				s1.setMobile(scan.next());

				System.out.println("Enter address");
				s1.setAddress(scan.next());

				em.persist(s1);

				// em.getTransaction().commit();
				break;

			case 2:
				System.out.println("Enter id of student to update");
				Student s2 = em.find(Student.class, scan.nextInt());

				System.out.println("Enter name");
				s2.setName(scan.next());

				System.out.println("Enter marks");
				s2.setMarks(scan.nextFloat());

				System.out.println("Enter mobile");
				s2.setMobile(scan.nextLine());

				System.out.println("Enter address");
				s2.setAddress(scan.nextLine());

				em.merge(s2);
				// em.getTransaction().commit();

				break;

			case 3:
				System.out.println("Enter id of student to delete");
				Student s3 = em.find(Student.class, scan.nextInt());
				// em.getTransaction().begin();
				em.remove(s3);

				break;

			case 4:
				System.out.println("Enter id of student");
				Student s4 = em.find(Student.class, scan.nextInt());

				System.out.println(s4.toString());

				break;
			case 5:

				TypedQuery<Student> tq = em.createQuery("select studs from Student studs", Student.class);
				List<Student> studList = tq.getResultList();

				for (Student item : studList) {
					System.out.println(item);

				}

				// studList.stream().forEach(System.out::println);

				break;

				default:
				System.out.println("Exiting....");
				System.exit(0);
			}
			em.getTransaction().commit();

		}

	}

}
