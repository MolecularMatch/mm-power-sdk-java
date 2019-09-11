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
 * AssertionTherapeuticContext
 */


public class AssertionTherapeuticContext {
  @SerializedName("name")
  private String name = null;

  @SerializedName("facet")
  private String facet = null;

  public AssertionTherapeuticContext name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Drug name.
   * @return name
  **/
  @Schema(required = true, description = "Drug name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssertionTherapeuticContext facet(String facet) {
    this.facet = facet;
    return this;
  }

   /**
   * Get facet
   * @return facet
  **/
  @Schema(required = true, description = "")
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionTherapeuticContext assertionTherapeuticContext = (AssertionTherapeuticContext) o;
    return Objects.equals(this.name, assertionTherapeuticContext.name) &&
        Objects.equals(this.facet, assertionTherapeuticContext.facet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, facet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionTherapeuticContext {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
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
