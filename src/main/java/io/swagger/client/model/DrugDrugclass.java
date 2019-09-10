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
 * DrugDrugclass
 */


public class DrugDrugclass {
  @SerializedName("name")
  private String name = null;

  @SerializedName("source")
  private String source = null;

  public DrugDrugclass name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The classes (pharmacological, treatment, chemical, etc.) of the drug inferred from the source or manually added
   * @return name
  **/
  @Schema(required = true, description = "The classes (pharmacological, treatment, chemical, etc.) of the drug inferred from the source or manually added")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DrugDrugclass source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(required = true, description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugDrugclass drugDrugclass = (DrugDrugclass) o;
    return Objects.equals(this.name, drugDrugclass.name) &&
        Objects.equals(this.source, drugDrugclass.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugDrugclass {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
