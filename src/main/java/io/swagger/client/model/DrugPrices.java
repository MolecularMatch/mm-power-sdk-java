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
 * DrugPrices
 */


public class DrugPrices {
  @SerializedName("description")
  private String description = null;

  @SerializedName("cost")
  private String cost = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("unit")
  private String unit = null;

  public DrugPrices description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DrugPrices cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Drug price per unit.
   * @return cost
  **/
  @Schema(description = "Drug price per unit.")
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }

  public DrugPrices currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency of price, example: USD.
   * @return currency
  **/
  @Schema(description = "Currency of price, example: USD.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DrugPrices unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The dosage form, example: tablet.
   * @return unit
  **/
  @Schema(description = "The dosage form, example: tablet.")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugPrices drugPrices = (DrugPrices) o;
    return Objects.equals(this.description, drugPrices.description) &&
        Objects.equals(this.cost, drugPrices.cost) &&
        Objects.equals(this.currency, drugPrices.currency) &&
        Objects.equals(this.unit, drugPrices.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, cost, currency, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugPrices {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
