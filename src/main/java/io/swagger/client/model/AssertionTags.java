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
 * AssertionTags
 */


public class AssertionTags {
  @SerializedName("term")
  private String term = null;

  @SerializedName("facet")
  private String facet = null;

  /**
   * Inclusion or exclusion association.
   */
  @JsonAdapter(FilterTypeEnum.Adapter.class)
  public enum FilterTypeEnum {
    INCLUDE("include"),
    EXCLUDE("exclude");

    private String value;

    FilterTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static FilterTypeEnum fromValue(String text) {
      for (FilterTypeEnum b : FilterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<FilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FilterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("filterType")
  private FilterTypeEnum filterType = FilterTypeEnum.INCLUDE;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("suppress")
  private Boolean suppress = null;

  @SerializedName("compositeKey")
  private String compositeKey = null;

  @SerializedName("generatedBy")
  private String generatedBy = null;

  @SerializedName("generatedByTerm")
  private String generatedByTerm = null;

  @SerializedName("manualSuppress")
  private Integer manualSuppress = null;

  @SerializedName("transcript")
  private String transcript = null;

  @SerializedName("primary")
  private Boolean primary = null;

  @SerializedName("valid")
  private Boolean valid = null;

  public AssertionTags term(String term) {
    this.term = term;
    return this;
  }

   /**
   * The associated term.
   * @return term
  **/
  @Schema(required = true, description = "The associated term.")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public AssertionTags facet(String facet) {
    this.facet = facet;
    return this;
  }

   /**
   * The facet of the associated term.
   * @return facet
  **/
  @Schema(required = true, description = "The facet of the associated term.")
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public AssertionTags filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Inclusion or exclusion association.
   * @return filterType
  **/
  @Schema(description = "Inclusion or exclusion association.")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }

  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }

  public AssertionTags priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The quality of the association.
   * @return priority
  **/
  @Schema(description = "The quality of the association.")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public AssertionTags suppress(Boolean suppress) {
    this.suppress = suppress;
    return this;
  }

   /**
   * If true the association is removed.
   * @return suppress
  **/
  @Schema(description = "If true the association is removed.")
  public Boolean isSuppress() {
    return suppress;
  }

  public void setSuppress(Boolean suppress) {
    this.suppress = suppress;
  }

  public AssertionTags compositeKey(String compositeKey) {
    this.compositeKey = compositeKey;
    return this;
  }

   /**
   * The tag identifier.
   * @return compositeKey
  **/
  @Schema(description = "The tag identifier.")
  public String getCompositeKey() {
    return compositeKey;
  }

  public void setCompositeKey(String compositeKey) {
    this.compositeKey = compositeKey;
  }

  public AssertionTags generatedBy(String generatedBy) {
    this.generatedBy = generatedBy;
    return this;
  }

   /**
   * The inferring facet.
   * @return generatedBy
  **/
  @Schema(description = "The inferring facet.")
  public String getGeneratedBy() {
    return generatedBy;
  }

  public void setGeneratedBy(String generatedBy) {
    this.generatedBy = generatedBy;
  }

  public AssertionTags generatedByTerm(String generatedByTerm) {
    this.generatedByTerm = generatedByTerm;
    return this;
  }

   /**
   * The inferring term.
   * @return generatedByTerm
  **/
  @Schema(description = "The inferring term.")
  public String getGeneratedByTerm() {
    return generatedByTerm;
  }

  public void setGeneratedByTerm(String generatedByTerm) {
    this.generatedByTerm = generatedByTerm;
  }

  public AssertionTags manualSuppress(Integer manualSuppress) {
    this.manualSuppress = manualSuppress;
    return this;
  }

   /**
   * Indication of whether the tag was suppressed or unsuppressed from the UI.
   * @return manualSuppress
  **/
  @Schema(description = "Indication of whether the tag was suppressed or unsuppressed from the UI.")
  public Integer getManualSuppress() {
    return manualSuppress;
  }

  public void setManualSuppress(Integer manualSuppress) {
    this.manualSuppress = manualSuppress;
  }

  public AssertionTags transcript(String transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * The particular transcript for a mutation tag.
   * @return transcript
  **/
  @Schema(description = "The particular transcript for a mutation tag.")
  public String getTranscript() {
    return transcript;
  }

  public void setTranscript(String transcript) {
    this.transcript = transcript;
  }

  public AssertionTags primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Indicates a primary condition.
   * @return primary
  **/
  @Schema(description = "Indicates a primary condition.")
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public AssertionTags valid(Boolean valid) {
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
    AssertionTags assertionTags = (AssertionTags) o;
    return Objects.equals(this.term, assertionTags.term) &&
        Objects.equals(this.facet, assertionTags.facet) &&
        Objects.equals(this.filterType, assertionTags.filterType) &&
        Objects.equals(this.priority, assertionTags.priority) &&
        Objects.equals(this.suppress, assertionTags.suppress) &&
        Objects.equals(this.compositeKey, assertionTags.compositeKey) &&
        Objects.equals(this.generatedBy, assertionTags.generatedBy) &&
        Objects.equals(this.generatedByTerm, assertionTags.generatedByTerm) &&
        Objects.equals(this.manualSuppress, assertionTags.manualSuppress) &&
        Objects.equals(this.transcript, assertionTags.transcript) &&
        Objects.equals(this.primary, assertionTags.primary) &&
        Objects.equals(this.valid, assertionTags.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, facet, filterType, priority, suppress, compositeKey, generatedBy, generatedByTerm, manualSuppress, transcript, primary, valid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionTags {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    suppress: ").append(toIndentedString(suppress)).append("\n");
    sb.append("    compositeKey: ").append(toIndentedString(compositeKey)).append("\n");
    sb.append("    generatedBy: ").append(toIndentedString(generatedBy)).append("\n");
    sb.append("    generatedByTerm: ").append(toIndentedString(generatedByTerm)).append("\n");
    sb.append("    manualSuppress: ").append(toIndentedString(manualSuppress)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
