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
   * Get street
   * @return street
  **/
  @Schema(description = "")
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
   * Get country
   * @return country
  **/
  @Schema(description = "")
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
   * Get name
   * @return name
  **/
  @Schema(description = "")
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
   * Get poBox
   * @return poBox
  **/
  @Schema(description = "")
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
   * Get city
   * @return city
  **/
  @Schema(description = "")
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
   * Get state
   * @return state
  **/
  @Schema(description = "")
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
   * Get zip
   * @return zip
  **/
  @Schema(description = "")
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
   * Get status
   * @return status
  **/
  @Schema(description = "")
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
   * Get firstName
   * @return firstName
  **/
  @Schema(description = "")
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
   * Get middleName
   * @return middleName
  **/
  @Schema(description = "")
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
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
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
   * Get degrees
   * @return degrees
  **/
  @Schema(description = "")
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
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
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
   * Get phoneExt
   * @return phoneExt
  **/
  @Schema(description = "")
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
   * Get email
   * @return email
  **/
  @Schema(description = "")
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
   * Get firstNameBackup
   * @return firstNameBackup
  **/
  @Schema(description = "")
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
   * Get middleNameBackup
   * @return middleNameBackup
  **/
  @Schema(description = "")
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
   * Get lastNameBackup
   * @return lastNameBackup
  **/
  @Schema(description = "")
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
   * Get degreesBackup
   * @return degreesBackup
  **/
  @Schema(description = "")
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
   * Get phoneBackup
   * @return phoneBackup
  **/
  @Schema(description = "")
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
   * Get phoneExtBackup
   * @return phoneExtBackup
  **/
  @Schema(description = "")
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
   * Get emailBackup
   * @return emailBackup
  **/
  @Schema(description = "")
  public String getEmailBackup() {
    return emailBackup;
  }

  public void setEmailBackup(String emailBackup) {
    this.emailBackup = emailBackup;
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
        Objects.equals(this.emailBackup, clinicalTrialLocations.emailBackup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, street, country, name, poBox, city, state, zip, geo, status, firstName, middleName, lastName, degrees, phone, phoneExt, email, firstNameBackup, middleNameBackup, lastNameBackup, degreesBackup, phoneBackup, phoneExtBackup, emailBackup);
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
