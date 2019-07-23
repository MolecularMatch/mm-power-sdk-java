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
 * DrugDosages
 */


public class DrugDosages {
  @SerializedName("form")
  private String form = null;

  @SerializedName("route")
  private String route = null;

  @SerializedName("strength")
  private String strength = null;

  public DrugDosages form(String form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @Schema(description = "")
  public String getForm() {
    return form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  public DrugDosages route(String route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @Schema(description = "")
  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public DrugDosages strength(String strength) {
    this.strength = strength;
    return this;
  }

   /**
   * Get strength
   * @return strength
  **/
  @Schema(description = "")
  public String getStrength() {
    return strength;
  }

  public void setStrength(String strength) {
    this.strength = strength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugDosages drugDosages = (DrugDosages) o;
    return Objects.equals(this.form, drugDosages.form) &&
        Objects.equals(this.route, drugDosages.route) &&
        Objects.equals(this.strength, drugDosages.strength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(form, route, strength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugDosages {\n");
    
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    strength: ").append(toIndentedString(strength)).append("\n");
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