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
 * Reference
 */


public class Reference {
  @SerializedName("citation")
  private String citation = null;

  @SerializedName("PMID")
  private Integer PMID = null;

  public Reference citation(String citation) {
    this.citation = citation;
    return this;
  }

   /**
   * Get citation
   * @return citation
  **/
  @Schema(required = true, description = "")
  public String getCitation() {
    return citation;
  }

  public void setCitation(String citation) {
    this.citation = citation;
  }

  public Reference PMID(Integer PMID) {
    this.PMID = PMID;
    return this;
  }

   /**
   * Get PMID
   * minimum: 1
   * @return PMID
  **/
  @Schema(required = true, description = "")
  public Integer getPMID() {
    return PMID;
  }

  public void setPMID(Integer PMID) {
    this.PMID = PMID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.citation, reference.citation) &&
        Objects.equals(this.PMID, reference.PMID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(citation, PMID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    citation: ").append(toIndentedString(citation)).append("\n");
    sb.append("    PMID: ").append(toIndentedString(PMID)).append("\n");
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
