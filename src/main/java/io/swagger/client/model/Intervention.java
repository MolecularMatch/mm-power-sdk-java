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
 * Intervention
 */


public class Intervention {
  @SerializedName("intervention_type")
  private String interventionType = "Other";

  @SerializedName("intervention_name")
  private String interventionName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("arm_group_label")
  private java.util.List<String> armGroupLabel = null;

  @SerializedName("other_name")
  private java.util.List<String> otherName = null;

  public Intervention interventionType(String interventionType) {
    this.interventionType = interventionType;
    return this;
  }

   /**
   * For each intervention studied in the clinical study, the general type of intervention.
   * @return interventionType
  **/
  @Schema(description = "For each intervention studied in the clinical study, the general type of intervention.")
  public String getInterventionType() {
    return interventionType;
  }

  public void setInterventionType(String interventionType) {
    this.interventionType = interventionType;
  }

  public Intervention interventionName(String interventionName) {
    this.interventionName = interventionName;
    return this;
  }

   /**
   * A brief descriptive name used to refer to the intervention(s) studied in each arm of the clinical study.
   * @return interventionName
  **/
  @Schema(required = true, description = "A brief descriptive name used to refer to the intervention(s) studied in each arm of the clinical study.")
  public String getInterventionName() {
    return interventionName;
  }

  public void setInterventionName(String interventionName) {
    this.interventionName = interventionName;
  }

  public Intervention description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Details that can be made public about the intervention, other than the Intervention Name(s) and Other Intervention Name(s), sufficient to distinguish the intervention from other, similar interventions studied in the same or another clinical study. For example, interventions involving drugs may include dosage form, dosage, frequency, and duration.
   * @return description
  **/
  @Schema(description = "Details that can be made public about the intervention, other than the Intervention Name(s) and Other Intervention Name(s), sufficient to distinguish the intervention from other, similar interventions studied in the same or another clinical study. For example, interventions involving drugs may include dosage form, dosage, frequency, and duration.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Intervention armGroupLabel(java.util.List<String> armGroupLabel) {
    this.armGroupLabel = armGroupLabel;
    return this;
  }

  public Intervention addArmGroupLabelItem(String armGroupLabelItem) {
    if (this.armGroupLabel == null) {
      this.armGroupLabel = new java.util.ArrayList<>();
    }
    this.armGroupLabel.add(armGroupLabelItem);
    return this;
  }

   /**
   * If multiple Arms or Groups have been specified, indicate which Arm Groups this intervention applies to.
   * @return armGroupLabel
  **/
  @Schema(description = "If multiple Arms or Groups have been specified, indicate which Arm Groups this intervention applies to.")
  public java.util.List<String> getArmGroupLabel() {
    return armGroupLabel;
  }

  public void setArmGroupLabel(java.util.List<String> armGroupLabel) {
    this.armGroupLabel = armGroupLabel;
  }

  public Intervention otherName(java.util.List<String> otherName) {
    this.otherName = otherName;
    return this;
  }

  public Intervention addOtherNameItem(String otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new java.util.ArrayList<>();
    }
    this.otherName.add(otherNameItem);
    return this;
  }

   /**
   * Get otherName
   * @return otherName
  **/
  @Schema(description = "")
  public java.util.List<String> getOtherName() {
    return otherName;
  }

  public void setOtherName(java.util.List<String> otherName) {
    this.otherName = otherName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intervention intervention = (Intervention) o;
    return Objects.equals(this.interventionType, intervention.interventionType) &&
        Objects.equals(this.interventionName, intervention.interventionName) &&
        Objects.equals(this.description, intervention.description) &&
        Objects.equals(this.armGroupLabel, intervention.armGroupLabel) &&
        Objects.equals(this.otherName, intervention.otherName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interventionType, interventionName, description, armGroupLabel, otherName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intervention {\n");
    
    sb.append("    interventionType: ").append(toIndentedString(interventionType)).append("\n");
    sb.append("    interventionName: ").append(toIndentedString(interventionName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    armGroupLabel: ").append(toIndentedString(armGroupLabel)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
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