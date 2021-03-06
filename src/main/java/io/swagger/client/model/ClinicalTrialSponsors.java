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
import io.swagger.client.model.Agency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ClinicalTrialSponsors
 */


public class ClinicalTrialSponsors {
  @SerializedName("lead_sponsor")
  private Agency leadSponsor = null;

  @SerializedName("collaborator")
  private java.util.List<Agency> collaborator = null;

  public ClinicalTrialSponsors leadSponsor(Agency leadSponsor) {
    this.leadSponsor = leadSponsor;
    return this;
  }

   /**
   * Get leadSponsor
   * @return leadSponsor
  **/
  @Schema(description = "")
  public Agency getLeadSponsor() {
    return leadSponsor;
  }

  public void setLeadSponsor(Agency leadSponsor) {
    this.leadSponsor = leadSponsor;
  }

  public ClinicalTrialSponsors collaborator(java.util.List<Agency> collaborator) {
    this.collaborator = collaborator;
    return this;
  }

  public ClinicalTrialSponsors addCollaboratorItem(Agency collaboratorItem) {
    if (this.collaborator == null) {
      this.collaborator = new java.util.ArrayList<>();
    }
    this.collaborator.add(collaboratorItem);
    return this;
  }

   /**
   * An organization other than the sponsor that provides support for a clinical study. This support may include activities related to funding, design, implementation, data analysis, or reporting.
   * @return collaborator
  **/
  @Schema(description = "An organization other than the sponsor that provides support for a clinical study. This support may include activities related to funding, design, implementation, data analysis, or reporting.")
  public java.util.List<Agency> getCollaborator() {
    return collaborator;
  }

  public void setCollaborator(java.util.List<Agency> collaborator) {
    this.collaborator = collaborator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClinicalTrialSponsors clinicalTrialSponsors = (ClinicalTrialSponsors) o;
    return Objects.equals(this.leadSponsor, clinicalTrialSponsors.leadSponsor) &&
        Objects.equals(this.collaborator, clinicalTrialSponsors.collaborator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadSponsor, collaborator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClinicalTrialSponsors {\n");
    
    sb.append("    leadSponsor: ").append(toIndentedString(leadSponsor)).append("\n");
    sb.append("    collaborator: ").append(toIndentedString(collaborator)).append("\n");
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
