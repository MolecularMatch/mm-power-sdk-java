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
import io.swagger.client.model.Filter;
import io.swagger.client.model.Publication;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The search response schema.
 */
@Schema(description = "The search response schema.")

public class SearchResponsePublication {
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
  private List<Publication> rows = null;

  @SerializedName("rationalized")
  private List<Filter> rationalized = null;

  @SerializedName("unrecognized")
  private List<Filter> unrecognized = null;

  @SerializedName("ambiguousNarrative")
  private List<String> ambiguousNarrative = null;

  public SearchResponsePublication searchKey(String searchKey) {
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

  public SearchResponsePublication institutionId(String institutionId) {
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

  public SearchResponsePublication caseId(String caseId) {
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

  public SearchResponsePublication total(Integer total) {
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

  public SearchResponsePublication totalPages(Integer totalPages) {
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

  public SearchResponsePublication page(Integer page) {
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

  public SearchResponsePublication rows(List<Publication> rows) {
    this.rows = rows;
    return this;
  }

  public SearchResponsePublication addRowsItem(Publication rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<Publication>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * The array of results records.  Rows must be cast accordingly to ct, drug, publication, etc.
   * @return rows
  **/
  @Schema(description = "The array of results records.  Rows must be cast accordingly to ct, drug, publication, etc.")
  public List<Publication> getRows() {
    return rows;
  }

  public void setRows(List<Publication> rows) {
    this.rows = rows;
  }

  public SearchResponsePublication rationalized(List<Filter> rationalized) {
    this.rationalized = rationalized;
    return this;
  }

  public SearchResponsePublication addRationalizedItem(Filter rationalizedItem) {
    if (this.rationalized == null) {
      this.rationalized = new ArrayList<Filter>();
    }
    this.rationalized.add(rationalizedItem);
    return this;
  }

   /**
   * The array of filters and how they were interpreted by the MolecularMatch search engine.
   * @return rationalized
  **/
  @Schema(description = "The array of filters and how they were interpreted by the MolecularMatch search engine.")
  public List<Filter> getRationalized() {
    return rationalized;
  }

  public void setRationalized(List<Filter> rationalized) {
    this.rationalized = rationalized;
  }

  public SearchResponsePublication unrecognized(List<Filter> unrecognized) {
    this.unrecognized = unrecognized;
    return this;
  }

  public SearchResponsePublication addUnrecognizedItem(Filter unrecognizedItem) {
    if (this.unrecognized == null) {
      this.unrecognized = new ArrayList<Filter>();
    }
    this.unrecognized.add(unrecognizedItem);
    return this;
  }

   /**
   * The array of filters that were not recognized by the MolecularMatch search engine.
   * @return unrecognized
  **/
  @Schema(description = "The array of filters that were not recognized by the MolecularMatch search engine.")
  public List<Filter> getUnrecognized() {
    return unrecognized;
  }

  public void setUnrecognized(List<Filter> unrecognized) {
    this.unrecognized = unrecognized;
  }

  public SearchResponsePublication ambiguousNarrative(List<String> ambiguousNarrative) {
    this.ambiguousNarrative = ambiguousNarrative;
    return this;
  }

  public SearchResponsePublication addAmbiguousNarrativeItem(String ambiguousNarrativeItem) {
    if (this.ambiguousNarrative == null) {
      this.ambiguousNarrative = new ArrayList<String>();
    }
    this.ambiguousNarrative.add(ambiguousNarrativeItem);
    return this;
  }

   /**
   * if true include a human readable ambiguous narrative.  This enables the consumer to activate \&quot;did you mean\&quot; search capability.
   * @return ambiguousNarrative
  **/
  @Schema(description = "if true include a human readable ambiguous narrative.  This enables the consumer to activate \"did you mean\" search capability.")
  public List<String> getAmbiguousNarrative() {
    return ambiguousNarrative;
  }

  public void setAmbiguousNarrative(List<String> ambiguousNarrative) {
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
    SearchResponsePublication searchResponsePublication = (SearchResponsePublication) o;
    return Objects.equals(this.searchKey, searchResponsePublication.searchKey) &&
        Objects.equals(this.institutionId, searchResponsePublication.institutionId) &&
        Objects.equals(this.caseId, searchResponsePublication.caseId) &&
        Objects.equals(this.total, searchResponsePublication.total) &&
        Objects.equals(this.totalPages, searchResponsePublication.totalPages) &&
        Objects.equals(this.page, searchResponsePublication.page) &&
        Objects.equals(this.rows, searchResponsePublication.rows) &&
        Objects.equals(this.rationalized, searchResponsePublication.rationalized) &&
        Objects.equals(this.unrecognized, searchResponsePublication.unrecognized) &&
        Objects.equals(this.ambiguousNarrative, searchResponsePublication.ambiguousNarrative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKey, institutionId, caseId, total, totalPages, page, rows, rationalized, unrecognized, ambiguousNarrative);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponsePublication {\n");
    
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    rationalized: ").append(toIndentedString(rationalized)).append("\n");
    sb.append("    unrecognized: ").append(toIndentedString(unrecognized)).append("\n");
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
