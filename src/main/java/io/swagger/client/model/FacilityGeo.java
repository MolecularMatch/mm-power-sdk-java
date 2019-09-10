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
 * Site geo-point.
 */
@Schema(description = "Site geo-point.")

public class FacilityGeo {
  @SerializedName("lat")
  private Float lat = null;

  @SerializedName("lon")
  private Float lon = null;

  public FacilityGeo lat(Float lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @Schema(required = true, description = "")
  public Float getLat() {
    return lat;
  }

  public void setLat(Float lat) {
    this.lat = lat;
  }

  public FacilityGeo lon(Float lon) {
    this.lon = lon;
    return this;
  }

   /**
   * Get lon
   * @return lon
  **/
  @Schema(required = true, description = "")
  public Float getLon() {
    return lon;
  }

  public void setLon(Float lon) {
    this.lon = lon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacilityGeo facilityGeo = (FacilityGeo) o;
    return Objects.equals(this.lat, facilityGeo.lat) &&
        Objects.equals(this.lon, facilityGeo.lon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacilityGeo {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
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