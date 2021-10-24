package Kotlin ;

import java.util.ArrayList;
import java.util.List;

public class User {

  private String firstName;
  private String lastName;
  private List<Address>addresses = new ArrayList<Address>();

  // private String city;
  //private String country;
  public List<Address> getAddresses(){
    return addresses
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
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
/*
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }*/

  @Override
  public String toString() {
  //  return firstName + " " + lastName + "\n";
    //  return  userExtensions.getFullName(this);
   return userExtensions.getFullName(this) + "- Addresses:"+ addresses.size();
  }



}
