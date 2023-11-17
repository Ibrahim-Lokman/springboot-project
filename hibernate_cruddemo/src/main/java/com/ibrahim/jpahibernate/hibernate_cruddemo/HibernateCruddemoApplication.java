package com.ibrahim.jpahibernate.hibernate_cruddemo;

import com.ibrahim.jpahibernate.hibernate_cruddemo.dao.AppDAO;
import com.ibrahim.jpahibernate.hibernate_cruddemo.entity.Instructor;
import com.ibrahim.jpahibernate.hibernate_cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateCruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			// createInstructor(appDAO);
			// findInstructor(appDAO);
			// deleteInstructor(appDAO);
			// findInstructorDetail(appDAO);
			 deleteInstructorDetail(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {
		Instructor tempInstructor = new Instructor(
				"Ibrahim 3", "Lokman", "ibrahim3@lokman.com"
		);

		InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.ibrahim3lokman.com/youtube",
				"Gaming 3"
				);

		tempInstructor.setInstructorDetail(tempInstructorDetail);

		System.out.println("Saving Instructor = " + tempInstructor);

		appDAO.save(tempInstructor);
	}

	private void findInstructor(AppDAO appDAO) {
		int theId = 7;
		System.out.println("Finding instructor id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("TEMP INSTRUCTOR: " + tempInstructor);
		System.out.println("The associated instructor only: " + tempInstructor.getInstructorDetail());
	}

	private void deleteInstructor(AppDAO appDAO) {
		int theId = 7;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteInstructorById(theId);
		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int theId = 8;
		System.out.println("Finding instructor id: " + theId);
		InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);
		System.out.println("TEMP INSTRUCTOR: " + tempInstructorDetail);
		System.out.println("The associated instructor only: " + tempInstructorDetail.getInstructor());
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int theId = 8;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteInstructorDetailById(theId);
		System.out.println("Done!");
	}
}