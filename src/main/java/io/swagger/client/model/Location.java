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
import io.swagger.client.model.Contact;
import io.swagger.client.model.Investigator;
import io.swagger.client.model.Site;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Location
 */


public class Location {
  @SerializedName("site")
  private Site site = null;

  /**
   * Trial site recruiting status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE_NOT_RECRUITING("Active, not recruiting"),
    APPROVED_FOR_MARKETING("Approved for marketing"),
    AVAILABLE("Available"),
    COMPLETED("Completed"),
    ENROLLING_BY_INVITATION("Enrolling by invitation"),
    NO_LONGER_AVAILABLE("No longer available"),
    NOT_YET_RECRUITING("Not yet recruiting"),
    RECRUITING("Recruiting"),
    SUSPENDED("Suspended"),
    TEMPORARILY_NOT_AVAILABLE("Temporarily not available"),
    TERMINATED("Terminated"),
    WITHDRAWN("Withdrawn"),
    WITHHELD("Withheld"),
    UNKNOWN_STATUS("Unknown status");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("contact_backup")
  private Contact contactBackup = null;

  @SerializedName("investigator")
  private java.util.List<Investigator> investigator = null;

  public Location site(Site site) {
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @Schema(description = "")
  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public Location status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Trial site recruiting status.
   * @return status
  **/
  @Schema(required = true, description = "Trial site recruiting status.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Location contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Schema(description = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Location contactBackup(Contact contactBackup) {
    this.contactBackup = contactBackup;
    return this;
  }

   /**
   * Get contactBackup
   * @return contactBackup
  **/
  @Schema(description = "")
  public Contact getContactBackup() {
    return contactBackup;
  }

  public void setContactBackup(Contact contactBackup) {
    this.contactBackup = contactBackup;
  }

  public Location investigator(java.util.List<Investigator> investigator) {
    this.investigator = investigator;
    return this;
  }

  public Location addInvestigatorItem(Investigator investigatorItem) {
    if (this.investigator == null) {
      this.investigator = new java.util.ArrayList<>();
    }
    this.investigator.add(investigatorItem);
    return this;
  }

   /**
   * Person(s) responsible for the overall scientific leadership of the protocol, including study principal investigator.
   * @return investigator
  **/
  @Schema(description = "Person(s) responsible for the overall scientific leadership of the protocol, including study principal investigator.")
  public java.util.List<Investigator> getInvestigator() {
    return investigator;
  }

  public void setInvestigator(java.util.List<Investigator> investigator) {
    this.investigator = investigator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.site, location.site) &&
        Objects.equals(this.status, location.status) &&
        Objects.equals(this.contact, location.contact) &&
        Objects.equals(this.contactBackup, location.contactBackup) &&
        Objects.equals(this.investigator, location.investigator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(site, status, contact, contactBackup, investigator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    contactBackup: ").append(toIndentedString(contactBackup)).append("\n");
    sb.append("    investigator: ").append(toIndentedString(investigator)).append("\n");
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
