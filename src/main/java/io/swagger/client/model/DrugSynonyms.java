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
 * DrugSynonyms
 */


public class DrugSynonyms {
  @SerializedName("suppress")
  private Boolean suppress = null;

  @SerializedName("custom")
  private Boolean custom = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name_lower")
  private String nameLower = null;

  /**
   * Gets or Sets analyzer
   */
  @JsonAdapter(AnalyzerEnum.Adapter.class)
  public enum AnalyzerEnum {
    DEFAULT("DEFAULT"),
    CASE_SENSITIVE("CASE_SENSITIVE");

    private String value;

    AnalyzerEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AnalyzerEnum fromValue(String text) {
      for (AnalyzerEnum b : AnalyzerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AnalyzerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnalyzerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnalyzerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnalyzerEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("analyzer")
  private AnalyzerEnum analyzer = AnalyzerEnum.DEFAULT;

  public DrugSynonyms suppress(Boolean suppress) {
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

  public DrugSynonyms custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Get custom
   * @return custom
  **/
  @Schema(description = "")
  public Boolean isCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public DrugSynonyms name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DrugSynonyms nameLower(String nameLower) {
    this.nameLower = nameLower;
    return this;
  }

   /**
   * Get nameLower
   * @return nameLower
  **/
  @Schema(required = true, description = "")
  public String getNameLower() {
    return nameLower;
  }

  public void setNameLower(String nameLower) {
    this.nameLower = nameLower;
  }

  public DrugSynonyms analyzer(AnalyzerEnum analyzer) {
    this.analyzer = analyzer;
    return this;
  }

   /**
   * Get analyzer
   * @return analyzer
  **/
  @Schema(description = "")
  public AnalyzerEnum getAnalyzer() {
    return analyzer;
  }

  public void setAnalyzer(AnalyzerEnum analyzer) {
    this.analyzer = analyzer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrugSynonyms drugSynonyms = (DrugSynonyms) o;
    return Objects.equals(this.suppress, drugSynonyms.suppress) &&
        Objects.equals(this.custom, drugSynonyms.custom) &&
        Objects.equals(this.name, drugSynonyms.name) &&
        Objects.equals(this.nameLower, drugSynonyms.nameLower) &&
        Objects.equals(this.analyzer, drugSynonyms.analyzer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppress, custom, name, nameLower, analyzer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrugSynonyms {\n");
    
    sb.append("    suppress: ").append(toIndentedString(suppress)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLower: ").append(toIndentedString(nameLower)).append("\n");
    sb.append("    analyzer: ").append(toIndentedString(analyzer)).append("\n");
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