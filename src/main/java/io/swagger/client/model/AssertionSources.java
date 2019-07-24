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
 * AssertionSources
 */


public class AssertionSources {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("subType")
  private String subType = null;

  @SerializedName("pubId")
  private String pubId = null;

  @SerializedName("trialId")
  private String trialId = null;

  @SerializedName("trialPhase")
  private String trialPhase = null;

  @SerializedName("functionalConsequence")
  private String functionalConsequence = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("year")
  private Integer year = null;

  @SerializedName("trustRating")
  private Float trustRating = null;

  @SerializedName("suppress")
  private Boolean suppress = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public AssertionSources id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssertionSources type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AssertionSources subType(String subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @Schema(description = "")
  public String getSubType() {
    return subType;
  }

  public void setSubType(String subType) {
    this.subType = subType;
  }

  public AssertionSources pubId(String pubId) {
    this.pubId = pubId;
    return this;
  }

   /**
   * Get pubId
   * @return pubId
  **/
  @Schema(description = "")
  public String getPubId() {
    return pubId;
  }

  public void setPubId(String pubId) {
    this.pubId = pubId;
  }

  public AssertionSources trialId(String trialId) {
    this.trialId = trialId;
    return this;
  }

   /**
   * Get trialId
   * @return trialId
  **/
  @Schema(description = "")
  public String getTrialId() {
    return trialId;
  }

  public void setTrialId(String trialId) {
    this.trialId = trialId;
  }

  public AssertionSources trialPhase(String trialPhase) {
    this.trialPhase = trialPhase;
    return this;
  }

   /**
   * Get trialPhase
   * @return trialPhase
  **/
  @Schema(description = "")
  public String getTrialPhase() {
    return trialPhase;
  }

  public void setTrialPhase(String trialPhase) {
    this.trialPhase = trialPhase;
  }

  public AssertionSources functionalConsequence(String functionalConsequence) {
    this.functionalConsequence = functionalConsequence;
    return this;
  }

   /**
   * Get functionalConsequence
   * @return functionalConsequence
  **/
  @Schema(description = "")
  public String getFunctionalConsequence() {
    return functionalConsequence;
  }

  public void setFunctionalConsequence(String functionalConsequence) {
    this.functionalConsequence = functionalConsequence;
  }

  public AssertionSources name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssertionSources link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public AssertionSources year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @Schema(description = "")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public AssertionSources trustRating(Float trustRating) {
    this.trustRating = trustRating;
    return this;
  }

   /**
   * Get trustRating
   * @return trustRating
  **/
  @Schema(description = "")
  public Float getTrustRating() {
    return trustRating;
  }

  public void setTrustRating(Float trustRating) {
    this.trustRating = trustRating;
  }

  public AssertionSources suppress(Boolean suppress) {
    this.suppress = suppress;
    return this;
  }

   /**
   * Get suppress
   * @return suppress
  **/
  @Schema(description = "")
  public Boolean isSuppress() {
    return suppress;
  }

  public void setSuppress(Boolean suppress) {
    this.suppress = suppress;
  }

  public AssertionSources valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @Schema(description = "")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionSources assertionSources = (AssertionSources) o;
    return Objects.equals(this.id, assertionSources.id) &&
        Objects.equals(this.type, assertionSources.type) &&
        Objects.equals(this.subType, assertionSources.subType) &&
        Objects.equals(this.pubId, assertionSources.pubId) &&
        Objects.equals(this.trialId, assertionSources.trialId) &&
        Objects.equals(this.trialPhase, assertionSources.trialPhase) &&
        Objects.equals(this.functionalConsequence, assertionSources.functionalConsequence) &&
        Objects.equals(this.name, assertionSources.name) &&
        Objects.equals(this.link, assertionSources.link) &&
        Objects.equals(this.year, assertionSources.year) &&
        Objects.equals(this.trustRating, assertionSources.trustRating) &&
        Objects.equals(this.suppress, assertionSources.suppress) &&
        Objects.equals(this.valid, assertionSources.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, subType, pubId, trialId, trialPhase, functionalConsequence, name, link, year, trustRating, suppress, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionSources {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
    sb.append("    trialId: ").append(toIndentedString(trialId)).append("\n");
    sb.append("    trialPhase: ").append(toIndentedString(trialPhase)).append("\n");
    sb.append("    functionalConsequence: ").append(toIndentedString(functionalConsequence)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    trustRating: ").append(toIndentedString(trustRating)).append("\n");
    sb.append("    suppress: ").append(toIndentedString(suppress)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
