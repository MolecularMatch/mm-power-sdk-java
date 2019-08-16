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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Filter
 */


public class Filter {
  @SerializedName("term")
  private String term = null;

  @SerializedName("rootTerm")
  private String rootTerm = null;

  @SerializedName("facet")
  private String facet = null;

  /**
   * Inclusion or exclusion search.
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

  /**
   * Used by DISTANCE filters only.  Specify distance in kilometers or miles.
   */
  @JsonAdapter(DistanceUOMEnum.Adapter.class)
  public enum DistanceUOMEnum {
    MI("mi"),
    KM("km");

    private String value;

    DistanceUOMEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DistanceUOMEnum fromValue(String text) {
      for (DistanceUOMEnum b : DistanceUOMEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DistanceUOMEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DistanceUOMEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DistanceUOMEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DistanceUOMEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("distanceUOM")
  private DistanceUOMEnum distanceUOM = DistanceUOMEnum.MI;

  @SerializedName("postalCode")
  private String postalCode = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("geneExpand")
  private Boolean geneExpand = null;

  @SerializedName("excludeFilterOnly")
  private Boolean excludeFilterOnly = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("ambiguous")
  private Filter ambiguous = null;

  public Filter term(String term) {
    this.term = term;
    return this;
  }

   /**
   * The term to search.
   * @return term
  **/
  @Schema(required = true, description = "The term to search.")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public Filter rootTerm(String rootTerm) {
    this.rootTerm = rootTerm;
    return this;
  }

   /**
   * The root term corresponding to the term.  Terms can be synonyms of root term, whereas the root term is what is annotated the records being searched.
   * @return rootTerm
  **/
  @Schema(description = "The root term corresponding to the term.  Terms can be synonyms of root term, whereas the root term is what is annotated the records being searched.")
  public String getRootTerm() {
    return rootTerm;
  }

  public void setRootTerm(String rootTerm) {
    this.rootTerm = rootTerm;
  }

  public Filter facet(String facet) {
    this.facet = facet;
    return this;
  }

   /**
   * The facet or domain the term belongs to.  provide PHRASE if unknown.
   * @return facet
  **/
  @Schema(required = true, description = "The facet or domain the term belongs to.  provide PHRASE if unknown.")
  public String getFacet() {
    return facet;
  }

  public void setFacet(String facet) {
    this.facet = facet;
  }

  public Filter filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }

   /**
   * Inclusion or exclusion search.
   * @return filterType
  **/
  @Schema(description = "Inclusion or exclusion search.")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }

  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }

  public Filter distanceUOM(DistanceUOMEnum distanceUOM) {
    this.distanceUOM = distanceUOM;
    return this;
  }

   /**
   * Used by DISTANCE filters only.  Specify distance in kilometers or miles.
   * @return distanceUOM
  **/
  @Schema(description = "Used by DISTANCE filters only.  Specify distance in kilometers or miles.")
  public DistanceUOMEnum getDistanceUOM() {
    return distanceUOM;
  }

  public void setDistanceUOM(DistanceUOMEnum distanceUOM) {
    this.distanceUOM = distanceUOM;
  }

  public Filter postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Used by DISTANCE filters only.  Specify postal code to center distance search from.
   * @return postalCode
  **/
  @Schema(description = "Used by DISTANCE filters only.  Specify postal code to center distance search from.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Filter countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Used by DISTANCE filters only.  Specify a 2 digit ISO-3166 country code to center distance search from.
   * @return countryCode
  **/
  @Schema(description = "Used by DISTANCE filters only.  Specify a 2 digit ISO-3166 country code to center distance search from.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Filter geneExpand(Boolean geneExpand) {
    this.geneExpand = geneExpand;
    return this;
  }

   /**
   * Used by MUTATION filters only.  If true, expand the search to include results maching the mutation gene.
   * @return geneExpand
  **/
  @Schema(description = "Used by MUTATION filters only.  If true, expand the search to include results maching the mutation gene.")
  public Boolean isGeneExpand() {
    return geneExpand;
  }

  public void setGeneExpand(Boolean geneExpand) {
    this.geneExpand = geneExpand;
  }

  public Filter excludeFilterOnly(Boolean excludeFilterOnly) {
    this.excludeFilterOnly = excludeFilterOnly;
    return this;
  }

   /**
   * To create a soft include filter, add excludeFilterOnly&#x3D;true (and specify filterType of include.
   * @return excludeFilterOnly
  **/
  @Schema(description = "To create a soft include filter, add excludeFilterOnly=true (and specify filterType of include.")
  public Boolean isExcludeFilterOnly() {
    return excludeFilterOnly;
  }

  public void setExcludeFilterOnly(Boolean excludeFilterOnly) {
    this.excludeFilterOnly = excludeFilterOnly;
  }

  public Filter error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Filter ambiguous(Filter ambiguous) {
    this.ambiguous = ambiguous;
    return this;
  }

   /**
   * Get ambiguous
   * @return ambiguous
  **/
  @Schema(description = "")
  public Filter getAmbiguous() {
    return ambiguous;
  }

  public void setAmbiguous(Filter ambiguous) {
    this.ambiguous = ambiguous;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.term, filter.term) &&
        Objects.equals(this.rootTerm, filter.rootTerm) &&
        Objects.equals(this.facet, filter.facet) &&
        Objects.equals(this.filterType, filter.filterType) &&
        Objects.equals(this.distanceUOM, filter.distanceUOM) &&
        Objects.equals(this.postalCode, filter.postalCode) &&
        Objects.equals(this.countryCode, filter.countryCode) &&
        Objects.equals(this.geneExpand, filter.geneExpand) &&
        Objects.equals(this.excludeFilterOnly, filter.excludeFilterOnly) &&
        Objects.equals(this.error, filter.error) &&
        Objects.equals(this.ambiguous, filter.ambiguous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, rootTerm, facet, filterType, distanceUOM, postalCode, countryCode, geneExpand, excludeFilterOnly, error, ambiguous);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    rootTerm: ").append(toIndentedString(rootTerm)).append("\n");
    sb.append("    facet: ").append(toIndentedString(facet)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    distanceUOM: ").append(toIndentedString(distanceUOM)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    geneExpand: ").append(toIndentedString(geneExpand)).append("\n");
    sb.append("    excludeFilterOnly: ").append(toIndentedString(excludeFilterOnly)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    ambiguous: ").append(toIndentedString(ambiguous)).append("\n");
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
