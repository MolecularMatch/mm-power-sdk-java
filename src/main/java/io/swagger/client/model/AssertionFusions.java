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
 * AssertionFusions
 */


public class AssertionFusions {
  @SerializedName("chr")
  private String chr = null;

  @SerializedName("exonNumber")
  private String exonNumber = null;

  @SerializedName("intronNumber")
  private String intronNumber = null;

  @SerializedName("LBPWLEP")
  private Integer LBPWLEP = null;

  @SerializedName("LBPWREP")
  private Integer LBPWREP = null;

  @SerializedName("RBPWLEP")
  private Integer RBPWLEP = null;

  @SerializedName("RBPWREP")
  private Integer RBPWREP = null;

  /**
   * Gets or Sets referenceGenome
   */
  @JsonAdapter(ReferenceGenomeEnum.Adapter.class)
  public enum ReferenceGenomeEnum {
    GRCH37_HG19("grch37_hg19"),
    GRCH38_HG38("grch38_hg38");

    private String value;

    ReferenceGenomeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReferenceGenomeEnum fromValue(String text) {
      for (ReferenceGenomeEnum b : ReferenceGenomeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReferenceGenomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceGenomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceGenomeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReferenceGenomeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("referenceGenome")
  private ReferenceGenomeEnum referenceGenome = null;

  public AssertionFusions chr(String chr) {
    this.chr = chr;
    return this;
  }

   /**
   * Get chr
   * @return chr
  **/
  @Schema(description = "")
  public String getChr() {
    return chr;
  }

  public void setChr(String chr) {
    this.chr = chr;
  }

  public AssertionFusions exonNumber(String exonNumber) {
    this.exonNumber = exonNumber;
    return this;
  }

   /**
   * Get exonNumber
   * @return exonNumber
  **/
  @Schema(description = "")
  public String getExonNumber() {
    return exonNumber;
  }

  public void setExonNumber(String exonNumber) {
    this.exonNumber = exonNumber;
  }

  public AssertionFusions intronNumber(String intronNumber) {
    this.intronNumber = intronNumber;
    return this;
  }

   /**
   * Get intronNumber
   * @return intronNumber
  **/
  @Schema(description = "")
  public String getIntronNumber() {
    return intronNumber;
  }

  public void setIntronNumber(String intronNumber) {
    this.intronNumber = intronNumber;
  }

  public AssertionFusions LBPWLEP(Integer LBPWLEP) {
    this.LBPWLEP = LBPWLEP;
    return this;
  }

   /**
   * Get LBPWLEP
   * @return LBPWLEP
  **/
  @Schema(description = "")
  public Integer getLBPWLEP() {
    return LBPWLEP;
  }

  public void setLBPWLEP(Integer LBPWLEP) {
    this.LBPWLEP = LBPWLEP;
  }

  public AssertionFusions LBPWREP(Integer LBPWREP) {
    this.LBPWREP = LBPWREP;
    return this;
  }

   /**
   * Get LBPWREP
   * @return LBPWREP
  **/
  @Schema(description = "")
  public Integer getLBPWREP() {
    return LBPWREP;
  }

  public void setLBPWREP(Integer LBPWREP) {
    this.LBPWREP = LBPWREP;
  }

  public AssertionFusions RBPWLEP(Integer RBPWLEP) {
    this.RBPWLEP = RBPWLEP;
    return this;
  }

   /**
   * Get RBPWLEP
   * @return RBPWLEP
  **/
  @Schema(description = "")
  public Integer getRBPWLEP() {
    return RBPWLEP;
  }

  public void setRBPWLEP(Integer RBPWLEP) {
    this.RBPWLEP = RBPWLEP;
  }

  public AssertionFusions RBPWREP(Integer RBPWREP) {
    this.RBPWREP = RBPWREP;
    return this;
  }

   /**
   * Get RBPWREP
   * @return RBPWREP
  **/
  @Schema(description = "")
  public Integer getRBPWREP() {
    return RBPWREP;
  }

  public void setRBPWREP(Integer RBPWREP) {
    this.RBPWREP = RBPWREP;
  }

  public AssertionFusions referenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @Schema(description = "")
  public ReferenceGenomeEnum getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionFusions assertionFusions = (AssertionFusions) o;
    return Objects.equals(this.chr, assertionFusions.chr) &&
        Objects.equals(this.exonNumber, assertionFusions.exonNumber) &&
        Objects.equals(this.intronNumber, assertionFusions.intronNumber) &&
        Objects.equals(this.LBPWLEP, assertionFusions.LBPWLEP) &&
        Objects.equals(this.LBPWREP, assertionFusions.LBPWREP) &&
        Objects.equals(this.RBPWLEP, assertionFusions.RBPWLEP) &&
        Objects.equals(this.RBPWREP, assertionFusions.RBPWREP) &&
        Objects.equals(this.referenceGenome, assertionFusions.referenceGenome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chr, exonNumber, intronNumber, LBPWLEP, LBPWREP, RBPWLEP, RBPWREP, referenceGenome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionFusions {\n");
    
    sb.append("    chr: ").append(toIndentedString(chr)).append("\n");
    sb.append("    exonNumber: ").append(toIndentedString(exonNumber)).append("\n");
    sb.append("    intronNumber: ").append(toIndentedString(intronNumber)).append("\n");
    sb.append("    LBPWLEP: ").append(toIndentedString(LBPWLEP)).append("\n");
    sb.append("    LBPWREP: ").append(toIndentedString(LBPWREP)).append("\n");
    sb.append("    RBPWLEP: ").append(toIndentedString(RBPWLEP)).append("\n");
    sb.append("    RBPWREP: ").append(toIndentedString(RBPWREP)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
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
