import java.util.*;
import java.text.*;
import java.io.*;

class Login{
	public static void main(String[]args)throws IOException{
		BufferedReader br9=new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		int x=0;
		int y=0;
		boolean bool=true;
		boolean bool1=true;
		while(bool1){

          x=0;
		  y=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Faculty f1=new Faculty();
		Student s1=new Student();
		System.out.println();
		System.out.println("Student or Faculty:");

        String user=br.readLine();
        if(user.equals("faculty")){
        	x=f1.login();
        }
        else if(user.equals("student")){
        	y=s1.login();
        }
        if(x==1)
         {
          while(true)
          {	
          	BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br5=new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
          System.out.println(">>>>>>>Faculty Menu<<<<<<<<<");
          System.out.println();
          System.out.println(">>>>>>>>>Select the choice which you want to do<<<<<<<<<<");
          System.out.println();
          System.out.println("a. Modify the marks of the oneword and multiplechoice questionnare.");
          System.out.println();
          System.out.println("b. Add questions to the oneword question paper");
          System.out.println();
          System.out.println("c. Add questions to the multiple-choice question paper");
          System.out.println();
          System.out.println("d. Add a new student record with student details");
          System.out.println();
          System.out.println("e. Find out the marks of oneword and multiple choice");
          System.out.println();
          char ch=(char)br5.read();
          switch(ch)
          {
          	case 'a' : f1.setMarks();
          	          break;

          	case 'b' : f1.addOneword();
          	          break;
          	case 'c' : f1.addMcq();
          	          break;
          	case 'd' : f1.addStudent();
          	            break;
            case 'e' : f1.displaymark();
                      break;                      	
          	 default : break;         
          }
          System.out.println("Do you want to enter more (y/n)");
          char ch1=(char)br7.read();
          if(ch1=='n'||ch1=='N')
          {
          	break;
          }
        }
       }
       else if(y==1){
        System.out.println(">>>>>Student Menu<<<<<<");
        System.out.println("a. Take the Test");
        System.out.println("b. Display your mark");
        System.out.println("c. Display the marking scheme");
        char ch3=(char)br.read();
        switch(ch3)
           {
           	 case 'a': s1.takeExam();
           	           break;
           	 case 'b': s1.findmarks();
           	           break;          
            case 'c': s1.displaymark();
                       break;

           	 default : break; }}
           	 
          System.out.println("Do you want to continue loggin in ? (y/n)");
          char ch5=(char)br9.read();
          if(ch5=='N'||ch5=='n')
          {
          	break;
          }
          }
}
}
