/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package human.tpfive;

/**
 *
 * @author ACER
 */
public class Person {
    private String id;
    private String name;
    private int year;
    private String category;
    private String email;


    public Person(String id, String name, int year, String category, String email) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.category = category;
        this.email = email;
    }


    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public String getCategory() {
        return this.category;
    }
    public String getEmail() {
        return this.email;
    }
}
