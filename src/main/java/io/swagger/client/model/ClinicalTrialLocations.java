/*
 * MolecularMatch MMPower
 * MMPower API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@molecularmatch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ClinicalTrialGeo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ClinicalTrialLocations
 */


public class ClinicalTrialLocations {
  @SerializedName("id")
  private String id = null;

  @SerializedName("street")
  private String street = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("po_box")
  private String poBox = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("zip")
  private String zip = null;

  @SerializedName("geo")
  private ClinicalTrialGeo geo = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("middle_name")
  private String middleName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("degrees")
  private String degrees = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("phone_ext")
  private String phoneExt = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name_backup")
  private String firstNameBackup = null;

  @SerializedName("middle_name_backup")
  private String middleNameBackup = null;

  @SerializedName("last_name_backup")
  private String lastNameBackup = null;

  @SerializedName("degrees_backup")
  private String degreesBackup = null;

  @SerializedName("phone_backup")
  private String phoneBackup = null;

  @SerializedName("phone_ext_backup")
  private String phoneExtBackup = null;

  @SerializedName("email_backup")
  private String emailBackup = null;

  @SerializedName("isInInstitution")
  private Boolean isInInstitution = null;

  public ClinicalTrialLocations id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClinicalTrialLocations street(String street) {
    this.street = street;
    return this;
  }

   /**
   * Site street address.
   * @return street
  **/
  @Schema(description = "Site street address.")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public ClinicalTrialLocations country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Site country.
   * @return country
  **/
  @Schema(description = "Site country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ClinicalTrialLocations name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Site name.
   * @return name
  **/
  @Schema(description = "Site name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClinicalTrialLocations poBox(String poBox) {
    this.poBox = poBox;
    return this;
  }

   /**
   * Site P.O. Box.
   * @return poBox
  **/
  @Schema(description = "Site P.O. Box.")
  public String getPoBox() {
    return poBox;
  }

  public void setPoBox(String poBox) {
    this.poBox = poBox;
  }

  public ClinicalTrialLocations city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Site city.
   * @return city
  **/
  @Schema(description = "Site city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ClinicalTrialLocations state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Site state or sub division.
   * @return state
  **/
  @Schema(description = "Site state or sub division.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ClinicalTrialLocations zip(String zip) {
    this.zip = zip;
    return this;
  }

   /**
   * Site postal code.
   * @return zip
  **/
  @Schema(description = "Site postal code.")
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public ClinicalTrialLocations geo(ClinicalTrialGeo geo) {
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @Schema(description = "")
  public ClinicalTrialGeo getGeo() {
    return geo;
  }

  public void setGeo(ClinicalTrialGeo geo) {
    this.geo = geo;
  }

  public ClinicalTrialLocations status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Site specific recruiting status.
   * @return status
  **/
  @Schema(description = "Site specific recruiting status.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ClinicalTrialLocations firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Site primary contact first name.
   * @return firstName
  **/
  @Schema(description = "Site primary contact first name.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClinicalTrialLocations middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Site primary contact middle name.
   * @return middleName
  **/
  @Schema(description = "Site primary contact middle name.")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ClinicalTrialLocations lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Site primary contact last name.
   * @return lastName
  **/
  @Schema(description = "Site primary contact last name.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClinicalTrialLocations degrees(String degrees) {
    this.degrees = degrees;
    return this;
  }

   /**
   * Site primary contact degrees.
   * @return degrees
  **/
  @Schema(description = "Site primary contact degrees.")
  public String getDegrees() {
    return degrees;
  }

  public void setDegrees(String degrees) {
    this.degrees = degrees;
  }

  public ClinicalTrialLocations phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Site primary contact phone number.
   * @return phone
  **/
  @Schema(description = "Site primary contact phone number.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ClinicalTrialLocations phoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
    return this;
  }

   /**
   * Site primary contact phone number extension.
   * @return phoneExt
  **/
  @Schema(description = "Site primary contact phone number extension.")
  public String getPhoneExt() {
    return phoneExt;
  }

  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  public ClinicalTrialLocations email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Site primary contact email address.
   * @return email
  **/
  @Schema(description = "Site primary contact email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClinicalTrialLocations firstNameBackup(String firstNameBackup) {
    this.firstNameBackup = firstNameBackup;
    return this;
  }

   /**
   * Site backup contact first name.
   * @return firstNameBackup
  **/
  @Schema(description = "Site backup contact first name.")
  public String getFirstNameBackup() {
    return firstNameBackup;
  }

  public void setFirstNameBackup(String firstNameBackup) {
    this.firstNameBackup = firstNameBackup;
  }

  public ClinicalTrialLocations middleNameBackup(String middleNameBackup) {
    this.middleNameBackup = middleNameBackup;
    return this;
  }

   /**
   * Site backup contact middle name.
   * @return middleNameBackup
  **/
  @Schema(description = "Site backup contact middle name.")
  public String getMiddleNameBackup() {
    return middleNameBackup;
  }

  public void setMiddleNameBackup(String middleNameBackup) {
    this.middleNameBackup = middleNameBackup;
  }

  public ClinicalTrialLocations lastNameBackup(String lastNameBackup) {
    this.lastNameBackup = lastNameBackup;
    return this;
  }

   /**
   * Site backup contact last name.
   * @return lastNameBackup
  **/
  @Schema(description = "Site backup contact last name.")
  public String getLastNameBackup() {
    return lastNameBackup;
  }

  public void setLastNameBackup(String lastNameBackup) {
    this.lastNameBackup = lastNameBackup;
  }

  public ClinicalTrialLocations degreesBackup(String degreesBackup) {
    this.degreesBackup = degreesBackup;
    return this;
  }

   /**
   * Site backup contact degrees.
   * @return degreesBackup
  **/
  @Schema(description = "Site backup contact degrees.")
  public String getDegreesBackup() {
    return degreesBackup;
  }

  public void setDegreesBackup(String degreesBackup) {
    this.degreesBackup = degreesBackup;
  }

  public ClinicalTrialLocations phoneBackup(String phoneBackup) {
    this.phoneBackup = phoneBackup;
    return this;
  }

   /**
   * Site backup contact phone number.
   * @return phoneBackup
  **/
  @Schema(description = "Site backup contact phone number.")
  public String getPhoneBackup() {
    return phoneBackup;
  }

  public void setPhoneBackup(String phoneBackup) {
    this.phoneBackup = phoneBackup;
  }

  public ClinicalTrialLocations phoneExtBackup(String phoneExtBackup) {
    this.phoneExtBackup = phoneExtBackup;
    return this;
  }

   /**
   * Site backup contact phone number extension.
   * @return phoneExtBackup
  **/
  @Schema(description = "Site backup contact phone number extension.")
  public String getPhoneExtBackup() {
    return phoneExtBackup;
  }

  public void setPhoneExtBackup(String phoneExtBackup) {
    this.phoneExtBackup = phoneExtBackup;
  }

  public ClinicalTrialLocations emailBackup(String emailBackup) {
    this.emailBackup = emailBackup;
    return this;
  }

   /**
   * Site backup contact email address.
   * @return emailBackup
  **/
  @Schema(description = "Site backup contact email address.")
  public String getEmailBackup() {
    return emailBackup;
  }

  public void setEmailBackup(String emailBackup) {
    this.emailBackup = emailBackup;
  }

  public ClinicalTrialLocations isInInstitution(Boolean isInInstitution) {
    this.isInInstitution = isInInstitution;
    return this;
  }

   /**
   * If an institutionId was provided for search, indicates if this site is associated with the institution.
   * @return isInInstitution
  **/
  @Schema(description = "If an institutionId was provided for search, indicates if this site is associated with the institution.")
  public Boolean isIsInInstitution() {
    return isInInstitution;
  }

  public void setIsInInstitution(Boolean isInInstitution) {
    this.isInInstitution = isInInstitution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClinicalTrialLocations clinicalTrialLocations = (ClinicalTrialLocations) o;
    return Objects.equals(this.id, clinicalTrialLocations.id) &&
        Objects.equals(this.street, clinicalTrialLocations.street) &&
        Objects.equals(this.country, clinicalTrialLocations.country) &&
        Objects.equals(this.name, clinicalTrialLocations.name) &&
        Objects.equals(this.poBox, clinicalTrialLocations.poBox) &&
        Objects.equals(this.city, clinicalTrialLocations.city) &&
        Objects.equals(this.state, clinicalTrialLocations.state) &&
        Objects.equals(this.zip, clinicalTrialLocations.zip) &&
        Objects.equals(this.geo, clinicalTrialLocations.geo) &&
        Objects.equals(this.status, clinicalTrialLocations.status) &&
        Objects.equals(this.firstName, clinicalTrialLocations.firstName) &&
        Objects.equals(this.middleName, clinicalTrialLocations.middleName) &&
        Objects.equals(this.lastName, clinicalTrialLocations.lastName) &&
        Objects.equals(this.degrees, clinicalTrialLocations.degrees) &&
        Objects.equals(this.phone, clinicalTrialLocations.phone) &&
        Objects.equals(this.phoneExt, clinicalTrialLocations.phoneExt) &&
        Objects.equals(this.email, clinicalTrialLocations.email) &&
        Objects.equals(this.firstNameBackup, clinicalTrialLocations.firstNameBackup) &&
        Objects.equals(this.middleNameBackup, clinicalTrialLocations.middleNameBackup) &&
        Objects.equals(this.lastNameBackup, clinicalTrialLocations.lastNameBackup) &&
        Objects.equals(this.degreesBackup, clinicalTrialLocations.degreesBackup) &&
        Objects.equals(this.phoneBackup, clinicalTrialLocations.phoneBackup) &&
        Objects.equals(this.phoneExtBackup, clinicalTrialLocations.phoneExtBackup) &&
        Objects.equals(this.emailBackup, clinicalTrialLocations.emailBackup) &&
        Objects.equals(this.isInInstitution, clinicalTrialLocations.isInInstitution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, street, country, name, poBox, city, state, zip, geo, status, firstName, middleName, lastName, degrees, phone, phoneExt, email, firstNameBackup, middleNameBackup, lastNameBackup, degreesBackup, phoneBackup, phoneExtBackup, emailBackup, isInInstitution);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClinicalTrialLocations {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    degrees: ").append(toIndentedString(degrees)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneExt: ").append(toIndentedString(phoneExt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstNameBackup: ").append(toIndentedString(firstNameBackup)).append("\n");
    sb.append("    middleNameBackup: ").append(toIndentedString(middleNameBackup)).append("\n");
    sb.append("    lastNameBackup: ").append(toIndentedString(lastNameBackup)).append("\n");
    sb.append("    degreesBackup: ").append(toIndentedString(degreesBackup)).append("\n");
    sb.append("    phoneBackup: ").append(toIndentedString(phoneBackup)).append("\n");
    sb.append("    phoneExtBackup: ").append(toIndentedString(phoneExtBackup)).append("\n");
    sb.append("    emailBackup: ").append(toIndentedString(emailBackup)).append("\n");
    sb.append("    isInInstitution: ").append(toIndentedString(isInInstitution)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}