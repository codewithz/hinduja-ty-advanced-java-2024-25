package com.codewithz;

import com.github.javafaker.Faker;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Faker faker=new Faker();
        for(int person=1;person<=20;person++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String email = String.format("%s.%s@gmail.com", firstName, lastName);
            String phone = faker.phoneNumber().phoneNumber();
            String dateOfBirth = faker.date().birthday(20, 30).toString();

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phone);
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("-------------------------------------------------");
        }

    }
}
