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
import io.swagger.client.model.ClinicalTrial;
import io.swagger.client.model.Filter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The search response schema.
 */
@Schema(description = "The search response schema.")

public class SearchResponseClinicalTrial {
  @SerializedName("searchKey")
  private String searchKey = null;

  @SerializedName("institutionId")
  private String institutionId = null;

  @SerializedName("caseId")
  private String caseId = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("totalPages")
  private Integer totalPages = null;

  @SerializedName("page")
  private Integer page = null;

  @SerializedName("rows")
  private java.util.List<ClinicalTrial> rows = null;

  @SerializedName("rationalized")
  private java.util.List<Filter> rationalized = null;

  @SerializedName("unrecognized")
  private java.util.List<Filter> unrecognized = null;

  @SerializedName("filterNarrative")
  private String filterNarrative = null;

  @SerializedName("ambiguousNarrative")
  private java.util.List<String> ambiguousNarrative = null;

  public SearchResponseClinicalTrial searchKey(String searchKey) {
    this.searchKey = searchKey;
    return this;
  }

   /**
   * Search key from a previous response to reconsititute a prior request.
   * @return searchKey
  **/
  @Schema(description = "Search key from a previous response to reconsititute a prior request.")
  public String getSearchKey() {
    return searchKey;
  }

  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }

  public SearchResponseClinicalTrial institutionId(String institutionId) {
    this.institutionId = institutionId;
    return this;
  }

   /**
   * An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness.
   * @return institutionId
  **/
  @Schema(description = "An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness.")
  public String getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }

  public SearchResponseClinicalTrial caseId(String caseId) {
    this.caseId = caseId;
    return this;
  }

   /**
   * For lab specific case tracking.
   * @return caseId
  **/
  @Schema(description = "For lab specific case tracking.")
  public String getCaseId() {
    return caseId;
  }

  public void setCaseId(String caseId) {
    this.caseId = caseId;
  }

  public SearchResponseClinicalTrial total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of records that match this search.
   * @return total
  **/
  @Schema(required = true, description = "The total number of records that match this search.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public SearchResponseClinicalTrial totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * The number of results pages for this search based on the limit provided in the request.
   * @return totalPages
  **/
  @Schema(required = true, description = "The number of results pages for this search based on the limit provided in the request.")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public SearchResponseClinicalTrial page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * The results page number this response corresponds to.
   * @return page
  **/
  @Schema(required = true, description = "The results page number this response corresponds to.")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SearchResponseClinicalTrial rows(java.util.List<ClinicalTrial> rows) {
    this.rows = rows;
    return this;
  }

  public SearchResponseClinicalTrial addRowsItem(ClinicalTrial rowsItem) {
    if (this.rows == null) {
      this.rows = new java.util.ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * The array of clinical trials that match the search criteria.
   * @return rows
  **/
  @Schema(description = "The array of clinical trials that match the search criteria.")
  public java.util.List<ClinicalTrial> getRows() {
    return rows;
  }

  public void setRows(java.util.List<ClinicalTrial> rows) {
    this.rows = rows;
  }

  public SearchResponseClinicalTrial rationalized(java.util.List<Filter> rationalized) {
    this.rationalized = rationalized;
    return this;
  }

  public SearchResponseClinicalTrial addRationalizedItem(Filter rationalizedItem) {
    if (this.rationalized == null) {
      this.rationalized = new java.util.ArrayList<>();
    }
    this.rationalized.add(rationalizedItem);
    return this;
  }

   /**
   * The array of filters and how they were interpreted by the MolecularMatch search engine.
   * @return rationalized
  **/
  @Schema(description = "The array of filters and how they were interpreted by the MolecularMatch search engine.")
  public java.util.List<Filter> getRationalized() {
    return rationalized;
  }

  public void setRationalized(java.util.List<Filter> rationalized) {
    this.rationalized = rationalized;
  }

  public SearchResponseClinicalTrial unrecognized(java.util.List<Filter> unrecognized) {
    this.unrecognized = unrecognized;
    return this;
  }

  public SearchResponseClinicalTrial addUnrecognizedItem(Filter unrecognizedItem) {
    if (this.unrecognized == null) {
      this.unrecognized = new java.util.ArrayList<>();
    }
    this.unrecognized.add(unrecognizedItem);
    return this;
  }

   /**
   * The array of filters that were not recognized by the MolecularMatch search engine.
   * @return unrecognized
  **/
  @Schema(description = "The array of filters that were not recognized by the MolecularMatch search engine.")
  public java.util.List<Filter> getUnrecognized() {
    return unrecognized;
  }

  public void setUnrecognized(java.util.List<Filter> unrecognized) {
    this.unrecognized = unrecognized;
  }

  public SearchResponseClinicalTrial filterNarrative(String filterNarrative) {
    this.filterNarrative = filterNarrative;
    return this;
  }

   /**
   * A human readable narrative describing the search conducted. Can be used to provide \&quot;Showing results for\&quot; functionality.
   * @return filterNarrative
  **/
  @Schema(description = "A human readable narrative describing the search conducted. Can be used to provide \"Showing results for\" functionality.")
  public String getFilterNarrative() {
    return filterNarrative;
  }

  public void setFilterNarrative(String filterNarrative) {
    this.filterNarrative = filterNarrative;
  }

  public SearchResponseClinicalTrial ambiguousNarrative(java.util.List<String> ambiguousNarrative) {
    this.ambiguousNarrative = ambiguousNarrative;
    return this;
  }

  public SearchResponseClinicalTrial addAmbiguousNarrativeItem(String ambiguousNarrativeItem) {
    if (this.ambiguousNarrative == null) {
      this.ambiguousNarrative = new java.util.ArrayList<>();
    }
    this.ambiguousNarrative.add(ambiguousNarrativeItem);
    return this;
  }

   /**
   * if true include a human readable ambiguous narrative.  This enables the consumer to activate \&quot;did you mean\&quot; search capability.
   * @return ambiguousNarrative
  **/
  @Schema(description = "if true include a human readable ambiguous narrative.  This enables the consumer to activate \"did you mean\" search capability.")
  public java.util.List<String> getAmbiguousNarrative() {
    return ambiguousNarrative;
  }

  public void setAmbiguousNarrative(java.util.List<String> ambiguousNarrative) {
    this.ambiguousNarrative = ambiguousNarrative;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseClinicalTrial searchResponseClinicalTrial = (SearchResponseClinicalTrial) o;
    return Objects.equals(this.searchKey, searchResponseClinicalTrial.searchKey) &&
        Objects.equals(this.institutionId, searchResponseClinicalTrial.institutionId) &&
        Objects.equals(this.caseId, searchResponseClinicalTrial.caseId) &&
        Objects.equals(this.total, searchResponseClinicalTrial.total) &&
        Objects.equals(this.totalPages, searchResponseClinicalTrial.totalPages) &&
        Objects.equals(this.page, searchResponseClinicalTrial.page) &&
        Objects.equals(this.rows, searchResponseClinicalTrial.rows) &&
        Objects.equals(this.rationalized, searchResponseClinicalTrial.rationalized) &&
        Objects.equals(this.unrecognized, searchResponseClinicalTrial.unrecognized) &&
        Objects.equals(this.filterNarrative, searchResponseClinicalTrial.filterNarrative) &&
        Objects.equals(this.ambiguousNarrative, searchResponseClinicalTrial.ambiguousNarrative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKey, institutionId, caseId, total, totalPages, page, rows, rationalized, unrecognized, filterNarrative, ambiguousNarrative);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseClinicalTrial {\n");
    
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    rationalized: ").append(toIndentedString(rationalized)).append("\n");
    sb.append("    unrecognized: ").append(toIndentedString(unrecognized)).append("\n");
    sb.append("    filterNarrative: ").append(toIndentedString(filterNarrative)).append("\n");
    sb.append("    ambiguousNarrative: ").append(toIndentedString(ambiguousNarrative)).append("\n");
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
