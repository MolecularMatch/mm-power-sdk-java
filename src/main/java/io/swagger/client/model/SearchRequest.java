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
import io.swagger.client.model.SearchRequestGeopoint;
import io.swagger.client.model.SearchRequestLocation;
import io.swagger.client.model.SearchRequestMinShouldMatch;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The search request schema.
 */
@Schema(description = "The search request schema.")

public class SearchRequest {
  @SerializedName("searchKey")
  private String searchKey = null;

  @SerializedName("institutionId")
  private String institutionId = null;

  @SerializedName("caseId")
  private String caseId = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("limit")
  private Integer limit = 20;

  @SerializedName("locationSummary")
  private Boolean locationSummary = null;

  @SerializedName("filterNarrative")
  private Boolean filterNarrative = null;

  @SerializedName("fields")
  private java.util.List<String> fields = null;

  @SerializedName("filters")
  private java.util.List<Filter> filters = null;

  @SerializedName("geopoint")
  private SearchRequestGeopoint geopoint = null;

  @SerializedName("location")
  private SearchRequestLocation location = null;

  @SerializedName("minShouldMatch")
  private SearchRequestMinShouldMatch minShouldMatch = null;

  public SearchRequest searchKey(String searchKey) {
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

  public SearchRequest institutionId(String institutionId) {
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

  public SearchRequest caseId(String caseId) {
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

  public SearchRequest start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Starting record index for paging results.
   * @return start
  **/
  @Schema(description = "Starting record index for paging results.")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public SearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of records per page.
   * @return limit
  **/
  @Schema(description = "Number of records per page.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SearchRequest locationSummary(Boolean locationSummary) {
    this.locationSummary = locationSummary;
    return this;
  }

   /**
   * If true, returns a summary location structure instead of the full array of trial locations.
   * @return locationSummary
  **/
  @Schema(description = "If true, returns a summary location structure instead of the full array of trial locations.")
  public Boolean isLocationSummary() {
    return locationSummary;
  }

  public void setLocationSummary(Boolean locationSummary) {
    this.locationSummary = locationSummary;
  }

  public SearchRequest filterNarrative(Boolean filterNarrative) {
    this.filterNarrative = filterNarrative;
    return this;
  }

   /**
   * If true, include a human readable filter narrative.
   * @return filterNarrative
  **/
  @Schema(description = "If true, include a human readable filter narrative.")
  public Boolean isFilterNarrative() {
    return filterNarrative;
  }

  public void setFilterNarrative(Boolean filterNarrative) {
    this.filterNarrative = filterNarrative;
  }

  public SearchRequest fields(java.util.List<String> fields) {
    this.fields = fields;
    return this;
  }

  public SearchRequest addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new java.util.ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Provide a field list to customize the return records fields.
   * @return fields
  **/
  @Schema(description = "Provide a field list to customize the return records fields.")
  public java.util.List<String> getFields() {
    return fields;
  }

  public void setFields(java.util.List<String> fields) {
    this.fields = fields;
  }

  public SearchRequest filters(java.util.List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  public SearchRequest addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new java.util.ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @Schema(description = "")
  public java.util.List<Filter> getFilters() {
    return filters;
  }

  public void setFilters(java.util.List<Filter> filters) {
    this.filters = filters;
  }

  public SearchRequest geopoint(SearchRequestGeopoint geopoint) {
    this.geopoint = geopoint;
    return this;
  }

   /**
   * Get geopoint
   * @return geopoint
  **/
  @Schema(description = "")
  public SearchRequestGeopoint getGeopoint() {
    return geopoint;
  }

  public void setGeopoint(SearchRequestGeopoint geopoint) {
    this.geopoint = geopoint;
  }

  public SearchRequest location(SearchRequestLocation location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public SearchRequestLocation getLocation() {
    return location;
  }

  public void setLocation(SearchRequestLocation location) {
    this.location = location;
  }

  public SearchRequest minShouldMatch(SearchRequestMinShouldMatch minShouldMatch) {
    this.minShouldMatch = minShouldMatch;
    return this;
  }

   /**
   * Get minShouldMatch
   * @return minShouldMatch
  **/
  @Schema(description = "")
  public SearchRequestMinShouldMatch getMinShouldMatch() {
    return minShouldMatch;
  }

  public void setMinShouldMatch(SearchRequestMinShouldMatch minShouldMatch) {
    this.minShouldMatch = minShouldMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.searchKey, searchRequest.searchKey) &&
        Objects.equals(this.institutionId, searchRequest.institutionId) &&
        Objects.equals(this.caseId, searchRequest.caseId) &&
        Objects.equals(this.start, searchRequest.start) &&
        Objects.equals(this.limit, searchRequest.limit) &&
        Objects.equals(this.locationSummary, searchRequest.locationSummary) &&
        Objects.equals(this.filterNarrative, searchRequest.filterNarrative) &&
        Objects.equals(this.fields, searchRequest.fields) &&
        Objects.equals(this.filters, searchRequest.filters) &&
        Objects.equals(this.geopoint, searchRequest.geopoint) &&
        Objects.equals(this.location, searchRequest.location) &&
        Objects.equals(this.minShouldMatch, searchRequest.minShouldMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchKey, institutionId, caseId, start, limit, locationSummary, filterNarrative, fields, filters, geopoint, location, minShouldMatch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    locationSummary: ").append(toIndentedString(locationSummary)).append("\n");
    sb.append("    filterNarrative: ").append(toIndentedString(filterNarrative)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    geopoint: ").append(toIndentedString(geopoint)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    minShouldMatch: ").append(toIndentedString(minShouldMatch)).append("\n");
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
