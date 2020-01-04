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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Institution
 */


public class Institution {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("subDivision")
  private String subDivision = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("idn")
  private String idn = null;

  @SerializedName("synonyms")
  private java.util.List<String> synonyms = null;

  /**
   * Indication of its level of readiness and incorporation into the MolecularMatch Knowledge base.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    RECEIVED("received"),
    IN_PROCESS("in-process"),
    REGISTERED("registered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("test")
  private Boolean test = null;

  public Institution id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unique identifier.
   * @return id
  **/
  @Schema(description = "unique identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Institution name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the institution.
   * @return name
  **/
  @Schema(required = true, description = "The name of the institution.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Institution country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The ISO-3166 2 character country code where the institution is located.
   * @return country
  **/
  @Schema(required = true, description = "The ISO-3166 2 character country code where the institution is located.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Institution address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Number and street portion of the address of the institution.
   * @return address
  **/
  @Schema(description = "Number and street portion of the address of the institution.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Institution subDivision(String subDivision) {
    this.subDivision = subDivision;
    return this;
  }

   /**
   * State/Province portion of the address of the institution.
   * @return subDivision
  **/
  @Schema(description = "State/Province portion of the address of the institution.")
  public String getSubDivision() {
    return subDivision;
  }

  public void setSubDivision(String subDivision) {
    this.subDivision = subDivision;
  }

  public Institution city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City portion of the address of the institution.
   * @return city
  **/
  @Schema(description = "City portion of the address of the institution.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Institution postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code portion of the address of the institution.
   * @return postalCode
  **/
  @Schema(required = true, description = "Postal code portion of the address of the institution.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Institution idn(String idn) {
    this.idn = idn;
    return this;
  }

   /**
   * The Integrated Delivery Network (IDN) for this institution.  Provide an id of another institution that is recognized by MoleculatMatch.
   * @return idn
  **/
  @Schema(description = "The Integrated Delivery Network (IDN) for this institution.  Provide an id of another institution that is recognized by MoleculatMatch.")
  public String getIdn() {
    return idn;
  }

  public void setIdn(String idn) {
    this.idn = idn;
  }

  public Institution synonyms(java.util.List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  public Institution addSynonymsItem(String synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new java.util.ArrayList<>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Alternative names the institution is referred by.
   * @return synonyms
  **/
  @Schema(description = "Alternative names the institution is referred by.")
  public java.util.List<String> getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(java.util.List<String> synonyms) {
    this.synonyms = synonyms;
  }

  public Institution status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Indication of its level of readiness and incorporation into the MolecularMatch Knowledge base.
   * @return status
  **/
  @Schema(description = "Indication of its level of readiness and incorporation into the MolecularMatch Knowledge base.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Institution test(Boolean test) {
    this.test = test;
    return this;
  }

   /**
   * A flag to mark test institutions.
   * @return test
  **/
  @Schema(description = "A flag to mark test institutions.")
  public Boolean isTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Institution institution = (Institution) o;
    return Objects.equals(this.id, institution.id) &&
        Objects.equals(this.name, institution.name) &&
        Objects.equals(this.country, institution.country) &&
        Objects.equals(this.address, institution.address) &&
        Objects.equals(this.subDivision, institution.subDivision) &&
        Objects.equals(this.city, institution.city) &&
        Objects.equals(this.postalCode, institution.postalCode) &&
        Objects.equals(this.idn, institution.idn) &&
        Objects.equals(this.synonyms, institution.synonyms) &&
        Objects.equals(this.status, institution.status) &&
        Objects.equals(this.test, institution.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, country, address, subDivision, city, postalCode, idn, synonyms, status, test);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Institution {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    subDivision: ").append(toIndentedString(subDivision)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    idn: ").append(toIndentedString(idn)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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
