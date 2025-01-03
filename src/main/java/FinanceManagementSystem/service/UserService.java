package FinanceManagementSystem.service;

import FinanceManagementSystem.domain.Adress;
import FinanceManagementSystem.domain.User;
import FinanceManagementSystem.repository.UserRepository;

import java.util.Scanner;

public class UserService {
    private Scanner scanner = new Scanner(System.in);
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser() {

        System.out.println("Enter Your name: ");
        String name =scanner.nextLine();
        System.out.println("Enter Your email: ");
        String email= scanner.nextLine();
        System.out.println("Enter Your City: ");
        String city= scanner.nextLine();
        System.out.println("Enter Your Street: ");
        String street= scanner.nextLine();
        System.out.println("Enter Your zipcode" );
        String zipcode=scanner.nextLine();
        Adress address=new Adress(city,street,zipcode);
        User user=new User(name,email,address);
        userRepository.save(user);





    }
    public void findUserById() {
    }
   
    public void findAllUser() {
    }  
    
    
    public void deleteUserById() {
    }


    public void updateUserById() {
    }
}
