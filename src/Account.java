import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Scanner;

@RequiredArgsConstructor
public class Account extends RuntimeException {
    String userName;
    String passWord;


    public void Login(String userName, String password) {
        Scanner scanner =new Scanner(System.in);
        try {
            System.out.print(" Enter user name => ");
            userName = scanner.nextLine();

            System.out.print(" Enter password => ");
            password = scanner.nextLine();

            if ("ramesh".equals(userName) && "password".equals(password)) {
                System.out.println(" User successfully logged-in.. ");
            } else {
                System.out.println(" In valid userName of password ");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

    }


    Register register = new Register();

    /* basic implementation with the terminal and subsequent changes from the front*/

//           try  {
//                System.out.print(" Enter firstName => ");
//                String firstName = scanner.nextLine();
//                register.setFirstName(firstName);
//
//                System.out.print(" Enter lastName => ");
//                String lastName = scanner.nextLine();
//                register.setLastName(lastName);
//
//                System.out.print(" Enter userName => ");
//                String userName = scanner.nextLine();
//                register.setUserName(userName);
//
//                System.out.print(" Enter password => ");
//                String password = scanner.nextLine();
//                register.setPassword(password);
//
//                System.out.print(" Enter emailId => ");
//                String emailId = scanner.nextLine();
//                register.setEmailId(emailId);
//
//                System.out.print(" Enter phoneNo => ");
//                long phoneNo = scanner.nextLong();
//                register.setPhoneNo(phoneNo);
//
//                System.out.println(register.toString());
//            }

@Getter
@Setter
//@RequiredArgsConstructor

    class Register extends Account {
        private String firstName;
        private String lastName;
        private String userName;
        private String password;
        private String emailId;
        private long phoneNo;

        public Register(String firstName, String lastName, String userName, String password, String emailId, long phoneNo) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
            this.emailId = emailId;
            this.phoneNo = phoneNo;
        }

        // constractor 2 without write an email or phone num

        public Register(String firstName, String lastName, String userName, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
        }

        public Register() {

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public long getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
        }


        @Override
        public String toString() {
            return "Register [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" +
                    password + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
        }
    }


}
