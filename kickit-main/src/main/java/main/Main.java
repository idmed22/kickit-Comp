package main;

import java.util.Scanner;
import dao.QuestionDao;
import model.question;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		QuestionDao questionDao = new QuestionDao();
		String hhh;
		char operationType;

		System.out.println("****** KickIt CTB Quiz App ******");
		System.out.println("Enter your Name: ");
		hhh = reader.nextLine();
		System.out.println("Hi there, " + hhh + "!");
		
		

		do {
			System.out.println("1-Start Quiz.\n2-Add Question.\n3-Edit Question.\n4-remove Question.  \n0-Exit.  ");
			System.out.print("Enter type of the operation: ");
			operationType = reader.next().charAt(0);

			if (operationType == '0') {
				System.out.println("Exit!");
				reader.close();
				break; 
				
				
				
			}else if(operationType == '2'){
				System.out.println("Enter ID");
				Scanner op0 = new Scanner(System.in);
				op0.next();
				System.out.println("Enter Question ?");
				Scanner op1 = new Scanner(System.in);
				op1.next();
				System.out.println("Enter option 1 :");
				Scanner op2 = new Scanner(System.in);
				op2.next();
				System.out.println("Enter option 2 :");
				Scanner op3 = new Scanner(System.in);
				op3.next();
				System.out.println("Enter option 3 :");
				Scanner op4 = new Scanner(System.in);
				op4.next();
				System.out.println("Enter option 4 :");
				Scanner op5 = new Scanner(System.in);
				op5.next();
				System.out.println("Answer");
				Scanner op6 = new Scanner(System.in);
				op6.next();
				
				
				question ques = new question();
				questionDao.insert(ques);
				
				
				
				
				
				
				
				
				
				
			} else if (operationType == '1') { // Start Quiz
				for (question question : questionDao.getAll()) {
					System.out.println("\n\nQuestion"+question.getId()+":"+question.getQuestion());
					System.out.println("1-"+question.getOption1()+".\n2-"+question.getOption2()+".\n3-"+question.getOption3()+"\n4-"+question.getOption4()+".");
					System.out.print("Your Answer is:");
					char answer = reader.next().charAt(0);
					if(answer == question.getAnswer().charAt(0)) {
						System.out.println("\n==========> Correct!");
					}else {
						System.out.println("\n==========> InCorrect!");
					}
				} 
				
				System.out.println("\n\n[http://localhost:8080/brief9-javaweb-todo/Question?count="+questionDao.getAll().size()+"&name="+hhh+"]\n\n");

	        } else {
				System.out.println("Error opertaion doesnt exist!");
				continue;
			}

		} while (true);

		reader.close();       
	}

}
