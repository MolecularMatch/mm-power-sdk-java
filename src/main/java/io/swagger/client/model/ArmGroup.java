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
 * ArmGroup
 */


public class ArmGroup {
  @SerializedName("arm_group_label")
  private String armGroupLabel = null;

  @SerializedName("arm_group_type")
  private String armGroupType = null;

  @SerializedName("description")
  private String description = null;

  public ArmGroup armGroupLabel(String armGroupLabel) {
    this.armGroupLabel = armGroupLabel;
    return this;
  }

   /**
   * A label describing a group or subgroup of participants in a clinical trial that receives a specific intervention/treatment, or no intervention, according to the trial&#x27;s protocol.
   * @return armGroupLabel
  **/
  @Schema(required = true, description = "A label describing a group or subgroup of participants in a clinical trial that receives a specific intervention/treatment, or no intervention, according to the trial's protocol.")
  public String getArmGroupLabel() {
    return armGroupLabel;
  }

  public void setArmGroupLabel(String armGroupLabel) {
    this.armGroupLabel = armGroupLabel;
  }

  public ArmGroup armGroupType(String armGroupType) {
    this.armGroupType = armGroupType;
    return this;
  }

   /**
   * A general description of the clinical trial arm. It identifies the role of the intervention that participants receive. Types of arms include experimental arm, active comparator arm, placebo comparator arm, sham comparator arm, and no intervention arm.
   * @return armGroupType
  **/
  @Schema(description = "A general description of the clinical trial arm. It identifies the role of the intervention that participants receive. Types of arms include experimental arm, active comparator arm, placebo comparator arm, sham comparator arm, and no intervention arm.")
  public String getArmGroupType() {
    return armGroupType;
  }

  public void setArmGroupType(String armGroupType) {
    this.armGroupType = armGroupType;
  }

  public ArmGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of a group or subgroup of participants in a clinical trial that receives a specific intervention/treatment, or no intervention, according to the trial&#x27;s protocol.
   * @return description
  **/
  @Schema(description = "A description of a group or subgroup of participants in a clinical trial that receives a specific intervention/treatment, or no intervention, according to the trial's protocol.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArmGroup armGroup = (ArmGroup) o;
    return Objects.equals(this.armGroupLabel, armGroup.armGroupLabel) &&
        Objects.equals(this.armGroupType, armGroup.armGroupType) &&
        Objects.equals(this.description, armGroup.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(armGroupLabel, armGroupType, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArmGroup {\n");
    
    sb.append("    armGroupLabel: ").append(toIndentedString(armGroupLabel)).append("\n");
    sb.append("    armGroupType: ").append(toIndentedString(armGroupType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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