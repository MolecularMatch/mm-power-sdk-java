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
 * ExpandedAccess
 */


public class ExpandedAccess {
  @SerializedName("expanded_access_type_individual")
  private Boolean expandedAccessTypeIndividual = null;

  @SerializedName("expanded_access_type_intermediate")
  private Boolean expandedAccessTypeIntermediate = null;

  @SerializedName("expanded_access_type_treatment")
  private Boolean expandedAccessTypeTreatment = null;

  public ExpandedAccess expandedAccessTypeIndividual(Boolean expandedAccessTypeIndividual) {
    this.expandedAccessTypeIndividual = expandedAccessTypeIndividual;
    return this;
  }

   /**
   * Individual Patients: For individual participants, including for emergency use, as specified in 21 CFR 312.310.
   * @return expandedAccessTypeIndividual
  **/
  @Schema(description = "Individual Patients: For individual participants, including for emergency use, as specified in 21 CFR 312.310.")
  public Boolean isExpandedAccessTypeIndividual() {
    return expandedAccessTypeIndividual;
  }

  public void setExpandedAccessTypeIndividual(Boolean expandedAccessTypeIndividual) {
    this.expandedAccessTypeIndividual = expandedAccessTypeIndividual;
  }

  public ExpandedAccess expandedAccessTypeIntermediate(Boolean expandedAccessTypeIntermediate) {
    this.expandedAccessTypeIntermediate = expandedAccessTypeIntermediate;
    return this;
  }

   /**
   * Intermediate-size Population: For intermediate-size participant populations, as specified in 21 CFR 312.315.
   * @return expandedAccessTypeIntermediate
  **/
  @Schema(description = "Intermediate-size Population: For intermediate-size participant populations, as specified in 21 CFR 312.315.")
  public Boolean isExpandedAccessTypeIntermediate() {
    return expandedAccessTypeIntermediate;
  }

  public void setExpandedAccessTypeIntermediate(Boolean expandedAccessTypeIntermediate) {
    this.expandedAccessTypeIntermediate = expandedAccessTypeIntermediate;
  }

  public ExpandedAccess expandedAccessTypeTreatment(Boolean expandedAccessTypeTreatment) {
    this.expandedAccessTypeTreatment = expandedAccessTypeTreatment;
    return this;
  }

   /**
   * Treatment IND/Protocol: Under a treatment IND or treatment protocol, as specified in 21 CFR 312.320.
   * @return expandedAccessTypeTreatment
  **/
  @Schema(description = "Treatment IND/Protocol: Under a treatment IND or treatment protocol, as specified in 21 CFR 312.320.")
  public Boolean isExpandedAccessTypeTreatment() {
    return expandedAccessTypeTreatment;
  }

  public void setExpandedAccessTypeTreatment(Boolean expandedAccessTypeTreatment) {
    this.expandedAccessTypeTreatment = expandedAccessTypeTreatment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpandedAccess expandedAccess = (ExpandedAccess) o;
    return Objects.equals(this.expandedAccessTypeIndividual, expandedAccess.expandedAccessTypeIndividual) &&
        Objects.equals(this.expandedAccessTypeIntermediate, expandedAccess.expandedAccessTypeIntermediate) &&
        Objects.equals(this.expandedAccessTypeTreatment, expandedAccess.expandedAccessTypeTreatment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandedAccessTypeIndividual, expandedAccessTypeIntermediate, expandedAccessTypeTreatment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpandedAccess {\n");
    
    sb.append("    expandedAccessTypeIndividual: ").append(toIndentedString(expandedAccessTypeIndividual)).append("\n");
    sb.append("    expandedAccessTypeIntermediate: ").append(toIndentedString(expandedAccessTypeIntermediate)).append("\n");
    sb.append("    expandedAccessTypeTreatment: ").append(toIndentedString(expandedAccessTypeTreatment)).append("\n");
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