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
import io.swagger.client.model.AssertionTier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * StandardizedTier
 */


public class StandardizedTier {
  @SerializedName("name")
  private String name = null;

  @SerializedName("tier")
  private AssertionTier tier = null;

  public StandardizedTier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StandardizedTier tier(AssertionTier tier) {
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @Schema(description = "")
  public AssertionTier getTier() {
    return tier;
  }

  public void setTier(AssertionTier tier) {
    this.tier = tier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardizedTier standardizedTier = (StandardizedTier) o;
    return Objects.equals(this.name, standardizedTier.name) &&
        Objects.equals(this.tier, standardizedTier.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardizedTier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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