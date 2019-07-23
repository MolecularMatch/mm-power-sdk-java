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
 * ClinicalTrialMolecularAlterations
 */


public class ClinicalTrialMolecularAlterations {
  @SerializedName("term")
  private String term = null;

  @SerializedName("alias")
  private String alias = null;

  public ClinicalTrialMolecularAlterations term(String term) {
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

  public ClinicalTrialMolecularAlterations alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * The displayable form of the term.
   * @return alias
  **/
  @Schema(description = "The displayable form of the term.")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClinicalTrialMolecularAlterations clinicalTrialMolecularAlterations = (ClinicalTrialMolecularAlterations) o;
    return Objects.equals(this.term, clinicalTrialMolecularAlterations.term) &&
        Objects.equals(this.alias, clinicalTrialMolecularAlterations.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, alias);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClinicalTrialMolecularAlterations {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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
