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
 * Sponsor
 */


public class Sponsor {
  @SerializedName("agency")
  private String agency = null;

  @SerializedName("agency_class")
  private java.util.List<String> agencyClass = null;

  public Sponsor agency(String agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @Schema(required = true, description = "")
  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public Sponsor agencyClass(java.util.List<String> agencyClass) {
    this.agencyClass = agencyClass;
    return this;
  }

  public Sponsor addAgencyClassItem(String agencyClassItem) {
    if (this.agencyClass == null) {
      this.agencyClass = new java.util.ArrayList<>();
    }
    this.agencyClass.add(agencyClassItem);
    return this;
  }

   /**
   * Get agencyClass
   * @return agencyClass
  **/
  @Schema(description = "")
  public java.util.List<String> getAgencyClass() {
    return agencyClass;
  }

  public void setAgencyClass(java.util.List<String> agencyClass) {
    this.agencyClass = agencyClass;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sponsor sponsor = (Sponsor) o;
    return Objects.equals(this.agency, sponsor.agency) &&
        Objects.equals(this.agencyClass, sponsor.agencyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agency, agencyClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sponsor {\n");
    
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    agencyClass: ").append(toIndentedString(agencyClass)).append("\n");
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
