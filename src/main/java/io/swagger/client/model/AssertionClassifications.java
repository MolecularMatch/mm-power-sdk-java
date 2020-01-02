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
 * AssertionClassifications
 */


public class AssertionClassifications {
  @SerializedName("name")
  private String name = null;

  /**
   * Clinical actionability of mutation.
   */
  @JsonAdapter(ClassificationEnum.Adapter.class)
  public enum ClassificationEnum {
    ACTIONABLE("actionable"),
    UNKNOWN("unknown"),
    COMMON("common"),
    INFORMATIVE("informative"),
    GERMLINE("germline");

    private String value;

    ClassificationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClassificationEnum fromValue(String text) {
      for (ClassificationEnum b : ClassificationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClassificationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassificationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassificationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClassificationEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("classification")
  private ClassificationEnum classification = null;

  /**
   * Manual override of classification.
   */
  @JsonAdapter(ClassificationOverrideEnum.Adapter.class)
  public enum ClassificationOverrideEnum {
    ACTIONABLE("actionable"),
    UNKNOWN("unknown"),
    COMMON("common"),
    INFORMATIVE("informative"),
    GERMLINE("germline");

    private String value;

    ClassificationOverrideEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClassificationOverrideEnum fromValue(String text) {
      for (ClassificationOverrideEnum b : ClassificationOverrideEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClassificationOverrideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClassificationOverrideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClassificationOverrideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClassificationOverrideEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("classificationOverride")
  private ClassificationOverrideEnum classificationOverride = null;

  public AssertionClassifications name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Mutation name.
   * @return name
  **/
  @Schema(required = true, description = "Mutation name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AssertionClassifications classification(ClassificationEnum classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Clinical actionability of mutation.
   * @return classification
  **/
  @Schema(required = true, description = "Clinical actionability of mutation.")
  public ClassificationEnum getClassification() {
    return classification;
  }

  public void setClassification(ClassificationEnum classification) {
    this.classification = classification;
  }

  public AssertionClassifications classificationOverride(ClassificationOverrideEnum classificationOverride) {
    this.classificationOverride = classificationOverride;
    return this;
  }

   /**
   * Manual override of classification.
   * @return classificationOverride
  **/
  @Schema(description = "Manual override of classification.")
  public ClassificationOverrideEnum getClassificationOverride() {
    return classificationOverride;
  }

  public void setClassificationOverride(ClassificationOverrideEnum classificationOverride) {
    this.classificationOverride = classificationOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssertionClassifications assertionClassifications = (AssertionClassifications) o;
    return Objects.equals(this.name, assertionClassifications.name) &&
        Objects.equals(this.classification, assertionClassifications.classification) &&
        Objects.equals(this.classificationOverride, assertionClassifications.classificationOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, classification, classificationOverride);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssertionClassifications {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    classificationOverride: ").append(toIndentedString(classificationOverride)).append("\n");
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