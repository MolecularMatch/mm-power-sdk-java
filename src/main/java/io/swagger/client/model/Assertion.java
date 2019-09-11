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
import io.swagger.client.model.AssertionClassifications;
import io.swagger.client.model.AssertionPrevalence;
import io.swagger.client.model.AssertionSources;
import io.swagger.client.model.AssertionTherapeuticContext;
import io.swagger.client.model.ConceptAssociation;
import io.swagger.client.model.TierExplanation;
import io.swagger.client.model.VariantInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Assertion
 */


public class Assertion {
  @SerializedName("_score")
  private Float _score = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("external_id")
  private java.util.List<String> externalId = null;

  @SerializedName("uniqueKey")
  private String uniqueKey = null;

  @SerializedName("hashKey")
  private String hashKey = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("narrative")
  private String narrative = null;

  /**
   * The regulatory body that has governance over this assertion.
   */
  @JsonAdapter(RegulatoryBodyEnum.Adapter.class)
  public enum RegulatoryBodyEnum {
    FDA("FDA"),
    EMA("EMA"),
    HCA("HCA"),
    TGA("TGA");

    private String value;

    RegulatoryBodyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RegulatoryBodyEnum fromValue(String text) {
      for (RegulatoryBodyEnum b : RegulatoryBodyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RegulatoryBodyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegulatoryBodyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegulatoryBodyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RegulatoryBodyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("regulatoryBody")
  private RegulatoryBodyEnum regulatoryBody = null;

  @SerializedName("customer")
  private String customer = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("regulatoryBodyApproved")
  private Boolean regulatoryBodyApproved = null;

  @SerializedName("regulatoryBodyApprovedBy")
  private String regulatoryBodyApprovedBy = null;

  /**
   * Indicates whether assertion supports or does not support the therapy.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    SUPPORTS("supports"),
    DOES_NOT_SUPPORT("does_not_support");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("direction")
  private DirectionEnum direction = null;

  /**
   * A professional committee recommendation.
   */
  @JsonAdapter(GuidelineBodyEnum.Adapter.class)
  public enum GuidelineBodyEnum {
    NCCN("NCCN"),
    ASCO("ASCO"),
    ESMO("ESMO"),
    AJCC("AJCC"),
    AMP("AMP"),
    CAP("CAP");

    private String value;

    GuidelineBodyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GuidelineBodyEnum fromValue(String text) {
      for (GuidelineBodyEnum b : GuidelineBodyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GuidelineBodyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GuidelineBodyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GuidelineBodyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GuidelineBodyEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("guidelineBody")
  private GuidelineBodyEnum guidelineBody = null;

  @SerializedName("guidelineVersion")
  private String guidelineVersion = null;

  /**
   * Utility of biomarker in clinical setting.
   */
  @JsonAdapter(ClinicalSignificanceEnum.Adapter.class)
  public enum ClinicalSignificanceEnum {
    NO_RESPONSE("no_response"),
    SENSITIVE("sensitive"),
    FAVORABLE("favorable"),
    UNFAVORABLE("unfavorable"),
    UNKNOWN("unknown"),
    RESISTANT("resistant"),
    INTERMEDIATE("intermediate"),
    ADVERSE_RESPONSE("adverse_response"),
    PATHOGENIC("pathogenic");

    private String value;

    ClinicalSignificanceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ClinicalSignificanceEnum fromValue(String text) {
      for (ClinicalSignificanceEnum b : ClinicalSignificanceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ClinicalSignificanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClinicalSignificanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClinicalSignificanceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ClinicalSignificanceEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("clinicalSignificance")
  private ClinicalSignificanceEnum clinicalSignificance = null;

  /**
   * Indicator of response to therapy
   */
  @JsonAdapter(BiomarkerClassEnum.Adapter.class)
  public enum BiomarkerClassEnum {
    PREDICTIVE("predictive"),
    DIAGNOSTIC("diagnostic"),
    PROGNOSTIC("prognostic"),
    UNKNOWN("unknown"),
    PREDISPOSING("predisposing");

    private String value;

    BiomarkerClassEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BiomarkerClassEnum fromValue(String text) {
      for (BiomarkerClassEnum b : BiomarkerClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BiomarkerClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BiomarkerClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BiomarkerClassEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BiomarkerClassEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("biomarkerClass")
  private BiomarkerClassEnum biomarkerClass = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("sources")
  private java.util.List<AssertionSources> sources = null;

  @SerializedName("noTherapyAvailable")
  private Boolean noTherapyAvailable = null;

  @SerializedName("therapeuticContext")
  private java.util.List<AssertionTherapeuticContext> therapeuticContext = null;

  @SerializedName("tier")
  private String tier = null;

  @SerializedName("tierExplanation")
  private java.util.List<TierExplanation> tierExplanation = null;

  @SerializedName("criteriaUnmet")
  private java.util.List<ConceptAssociation> criteriaUnmet = null;

  @SerializedName("criteriaMet")
  private java.util.List<ConceptAssociation> criteriaMet = null;

  @SerializedName("classifications")
  private java.util.List<AssertionClassifications> classifications = null;

  @SerializedName("prevalence")
  private java.util.List<AssertionPrevalence> prevalence = null;

  @SerializedName("variantInfo")
  private java.util.List<VariantInfo> variantInfo = null;

  public Assertion _score(Float _score) {
    this._score = _score;
    return this;
  }

   /**
   * indicator of the quality of the match.
   * @return _score
  **/
  @Schema(description = "indicator of the quality of the match.")
  public Float getScore() {
    return _score;
  }

  public void setScore(Float _score) {
    this._score = _score;
  }

  public Assertion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Assertion externalId(java.util.List<String> externalId) {
    this.externalId = externalId;
    return this;
  }

  public Assertion addExternalIdItem(String externalIdItem) {
    if (this.externalId == null) {
      this.externalId = new java.util.ArrayList<>();
    }
    this.externalId.add(externalIdItem);
    return this;
  }

   /**
   * Optional institution specific identifier.
   * @return externalId
  **/
  @Schema(description = "Optional institution specific identifier.")
  public java.util.List<String> getExternalId() {
    return externalId;
  }

  public void setExternalId(java.util.List<String> externalId) {
    this.externalId = externalId;
  }

  public Assertion uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * Unique identifer inclusive of version.
   * @return uniqueKey
  **/
  @Schema(description = "Unique identifer inclusive of version.")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

  public Assertion hashKey(String hashKey) {
    this.hashKey = hashKey;
    return this;
  }

   /**
   * Static identifier agnostic of version.
   * @return hashKey
  **/
  @Schema(description = "Static identifier agnostic of version.")
  public String getHashKey() {
    return hashKey;
  }

  public void setHashKey(String hashKey) {
    this.hashKey = hashKey;
  }

  public Assertion description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Detailed description of the assertion.
   * @return description
  **/
  @Schema(description = "Detailed description of the assertion.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Assertion narrative(String narrative) {
    this.narrative = narrative;
    return this;
  }

   /**
   * A human readeable narrative describing the assertion.
   * @return narrative
  **/
  @Schema(description = "A human readeable narrative describing the assertion.")
  public String getNarrative() {
    return narrative;
  }

  public void setNarrative(String narrative) {
    this.narrative = narrative;
  }

  public Assertion regulatoryBody(RegulatoryBodyEnum regulatoryBody) {
    this.regulatoryBody = regulatoryBody;
    return this;
  }

   /**
   * The regulatory body that has governance over this assertion.
   * @return regulatoryBody
  **/
  @Schema(required = true, description = "The regulatory body that has governance over this assertion.")
  public RegulatoryBodyEnum getRegulatoryBody() {
    return regulatoryBody;
  }

  public void setRegulatoryBody(RegulatoryBodyEnum regulatoryBody) {
    this.regulatoryBody = regulatoryBody;
  }

  public Assertion customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * The customer identifier that has governance over this assertion.
   * @return customer
  **/
  @Schema(required = true, description = "The customer identifier that has governance over this assertion.")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public Assertion version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The assertion set version number.
   * @return version
  **/
  @Schema(required = true, description = "The assertion set version number.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Assertion regulatoryBodyApproved(Boolean regulatoryBodyApproved) {
    this.regulatoryBodyApproved = regulatoryBodyApproved;
    return this;
  }

   /**
   * If true, this assertion&#x27;s therapuetic context has regulatory approval.
   * @return regulatoryBodyApproved
  **/
  @Schema(description = "If true, this assertion's therapuetic context has regulatory approval.")
  public Boolean isRegulatoryBodyApproved() {
    return regulatoryBodyApproved;
  }

  public void setRegulatoryBodyApproved(Boolean regulatoryBodyApproved) {
    this.regulatoryBodyApproved = regulatoryBodyApproved;
  }

  public Assertion regulatoryBodyApprovedBy(String regulatoryBodyApprovedBy) {
    this.regulatoryBodyApprovedBy = regulatoryBodyApprovedBy;
    return this;
  }

   /**
   * Governing body granting approval.
   * @return regulatoryBodyApprovedBy
  **/
  @Schema(description = "Governing body granting approval.")
  public String getRegulatoryBodyApprovedBy() {
    return regulatoryBodyApprovedBy;
  }

  public void setRegulatoryBodyApprovedBy(String regulatoryBodyApprovedBy) {
    this.regulatoryBodyApprovedBy = regulatoryBodyApprovedBy;
  }

  public Assertion direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Indicates whether assertion supports or does not support the therapy.
   * @return direction
  **/
  @Schema(description = "Indicates whether assertion supports or does not support the therapy.")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public Assertion guidelineBody(GuidelineBodyEnum guidelineBody) {
    this.guidelineBody = guidelineBody;
    return this;
  }

   /**
   * A professional committee recommendation.
   * @return guidelineBody
  **/
  @Schema(description = "A professional committee recommendation.")
  public GuidelineBodyEnum getGuidelineBody() {
    return guidelineBody;
  }

  public void setGuidelineBody(GuidelineBodyEnum guidelineBody) {
    this.guidelineBody = guidelineBody;
  }

  public Assertion guidelineVersion(String guidelineVersion) {
    this.guidelineVersion = guidelineVersion;
    return this;
  }

   /**
   * Release version of professional committee recommendation.
   * @return guidelineVersion
  **/
  @Schema(description = "Release version of professional committee recommendation.")
  public String getGuidelineVersion() {
    return guidelineVersion;
  }

  public void setGuidelineVersion(String guidelineVersion) {
    this.guidelineVersion = guidelineVersion;
  }

  public Assertion clinicalSignificance(ClinicalSignificanceEnum clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
    return this;
  }

   /**
   * Utility of biomarker in clinical setting.
   * @return clinicalSignificance
  **/
  @Schema(description = "Utility of biomarker in clinical setting.")
  public ClinicalSignificanceEnum getClinicalSignificance() {
    return clinicalSignificance;
  }

  public void setClinicalSignificance(ClinicalSignificanceEnum clinicalSignificance) {
    this.clinicalSignificance = clinicalSignificance;
  }

  public Assertion biomarkerClass(BiomarkerClassEnum biomarkerClass) {
    this.biomarkerClass = biomarkerClass;
    return this;
  }

   /**
   * Indicator of response to therapy
   * @return biomarkerClass
  **/
  @Schema(description = "Indicator of response to therapy")
  public BiomarkerClassEnum getBiomarkerClass() {
    return biomarkerClass;
  }

  public void setBiomarkerClass(BiomarkerClassEnum biomarkerClass) {
    this.biomarkerClass = biomarkerClass;
  }

  public Assertion expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * mathematical expression characterizing the clinical scope of the assertion.
   * @return expression
  **/
  @Schema(description = "mathematical expression characterizing the clinical scope of the assertion.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Assertion sources(java.util.List<AssertionSources> sources) {
    this.sources = sources;
    return this;
  }

  public Assertion addSourcesItem(AssertionSources sourcesItem) {
    if (this.sources == null) {
      this.sources = new java.util.ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * The supporting evidence for this assertion.
   * @return sources
  **/
  @Schema(description = "The supporting evidence for this assertion.")
  public java.util.List<AssertionSources> getSources() {
    return sources;
  }

  public void setSources(java.util.List<AssertionSources> sources) {
    this.sources = sources;
  }

  public Assertion noTherapyAvailable(Boolean noTherapyAvailable) {
    this.noTherapyAvailable = noTherapyAvailable;
    return this;
  }

   /**
   * If true, there is no therapy related to this assertion.
   * @return noTherapyAvailable
  **/
  @Schema(description = "If true, there is no therapy related to this assertion.")
  public Boolean isNoTherapyAvailable() {
    return noTherapyAvailable;
  }

  public void setNoTherapyAvailable(Boolean noTherapyAvailable) {
    this.noTherapyAvailable = noTherapyAvailable;
  }

  public Assertion therapeuticContext(java.util.List<AssertionTherapeuticContext> therapeuticContext) {
    this.therapeuticContext = therapeuticContext;
    return this;
  }

  public Assertion addTherapeuticContextItem(AssertionTherapeuticContext therapeuticContextItem) {
    if (this.therapeuticContext == null) {
      this.therapeuticContext = new java.util.ArrayList<>();
    }
    this.therapeuticContext.add(therapeuticContextItem);
    return this;
  }

   /**
   * The therapies associated with this assertion.
   * @return therapeuticContext
  **/
  @Schema(description = "The therapies associated with this assertion.")
  public java.util.List<AssertionTherapeuticContext> getTherapeuticContext() {
    return therapeuticContext;
  }

  public void setTherapeuticContext(java.util.List<AssertionTherapeuticContext> therapeuticContext) {
    this.therapeuticContext = therapeuticContext;
  }

  public Assertion tier(String tier) {
    this.tier = tier;
    return this;
  }

   /**
   * The tiering template specific tier associated with the therapy.
   * @return tier
  **/
  @Schema(description = "The tiering template specific tier associated with the therapy.")
  public String getTier() {
    return tier;
  }

  public void setTier(String tier) {
    this.tier = tier;
  }

  public Assertion tierExplanation(java.util.List<TierExplanation> tierExplanation) {
    this.tierExplanation = tierExplanation;
    return this;
  }

  public Assertion addTierExplanationItem(TierExplanation tierExplanationItem) {
    if (this.tierExplanation == null) {
      this.tierExplanation = new java.util.ArrayList<>();
    }
    this.tierExplanation.add(tierExplanationItem);
    return this;
  }

   /**
   * The explanation of how the tier was calculated.
   * @return tierExplanation
  **/
  @Schema(description = "The explanation of how the tier was calculated.")
  public java.util.List<TierExplanation> getTierExplanation() {
    return tierExplanation;
  }

  public void setTierExplanation(java.util.List<TierExplanation> tierExplanation) {
    this.tierExplanation = tierExplanation;
  }

  public Assertion criteriaUnmet(java.util.List<ConceptAssociation> criteriaUnmet) {
    this.criteriaUnmet = criteriaUnmet;
    return this;
  }

  public Assertion addCriteriaUnmetItem(ConceptAssociation criteriaUnmetItem) {
    if (this.criteriaUnmet == null) {
      this.criteriaUnmet = new java.util.ArrayList<>();
    }
    this.criteriaUnmet.add(criteriaUnmetItem);
    return this;
  }

   /**
   * Get criteriaUnmet
   * @return criteriaUnmet
  **/
  @Schema(description = "")
  public java.util.List<ConceptAssociation> getCriteriaUnmet() {
    return criteriaUnmet;
  }

  public void setCriteriaUnmet(java.util.List<ConceptAssociation> criteriaUnmet) {
    this.criteriaUnmet = criteriaUnmet;
  }

  public Assertion criteriaMet(java.util.List<ConceptAssociation> criteriaMet) {
    this.criteriaMet = criteriaMet;
    return this;
  }

  public Assertion addCriteriaMetItem(ConceptAssociation criteriaMetItem) {
    if (this.criteriaMet == null) {
      this.criteriaMet = new java.util.ArrayList<>();
    }
    this.criteriaMet.add(criteriaMetItem);
    return this;
  }

   /**
   * Get criteriaMet
   * @return criteriaMet
  **/
  @Schema(description = "")
  public java.util.List<ConceptAssociation> getCriteriaMet() {
    return criteriaMet;
  }

  public void setCriteriaMet(java.util.List<ConceptAssociation> criteriaMet) {
    this.criteriaMet = criteriaMet;
  }

  public Assertion classifications(java.util.List<AssertionClassifications> classifications) {
    this.classifications = classifications;
    return this;
  }

  public Assertion addClassificationsItem(AssertionClassifications classificationsItem) {
    if (this.classifications == null) {
      this.classifications = new java.util.ArrayList<>();
    }
    this.classifications.add(classificationsItem);
    return this;
  }

   /**
   * Get classifications
   * @return classifications
  **/
  @Schema(description = "")
  public java.util.List<AssertionClassifications> getClassifications() {
    return classifications;
  }

  public void setClassifications(java.util.List<AssertionClassifications> classifications) {
    this.classifications = classifications;
  }

  public Assertion prevalence(java.util.List<AssertionPrevalence> prevalence) {
    this.prevalence = prevalence;
    return this;
  }

  public Assertion addPrevalenceItem(AssertionPrevalence prevalenceItem) {
    if (this.prevalence == null) {
      this.prevalence = new java.util.ArrayList<>();
    }
    this.prevalence.add(prevalenceItem);
    return this;
  }

   /**
   * Get prevalence
   * @return prevalence
  **/
  @Schema(description = "")
  public java.util.List<AssertionPrevalence> getPrevalence() {
    return prevalence;
  }

  public void setPrevalence(java.util.List<AssertionPrevalence> prevalence) {
    this.prevalence = prevalence;
  }

  public Assertion variantInfo(java.util.List<VariantInfo> variantInfo) {
    this.variantInfo = variantInfo;
    return this;
  }

  public Assertion addVariantInfoItem(VariantInfo variantInfoItem) {
    if (this.variantInfo == null) {
      this.variantInfo = new java.util.ArrayList<>();
    }
    this.variantInfo.add(variantInfoItem);
    return this;
  }

   /**
   * Genomic information pertaining to variant.
   * @return variantInfo
  **/
  @Schema(description = "Genomic information pertaining to variant.")
  public java.util.List<VariantInfo> getVariantInfo() {
    return variantInfo;
  }

  public void setVariantInfo(java.util.List<VariantInfo> variantInfo) {
    this.variantInfo = variantInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Assertion assertion = (Assertion) o;
    return Objects.equals(this._score, assertion._score) &&
        Objects.equals(this.id, assertion.id) &&
        Objects.equals(this.externalId, assertion.externalId) &&
        Objects.equals(this.uniqueKey, assertion.uniqueKey) &&
        Objects.equals(this.hashKey, assertion.hashKey) &&
        Objects.equals(this.description, assertion.description) &&
        Objects.equals(this.narrative, assertion.narrative) &&
        Objects.equals(this.regulatoryBody, assertion.regulatoryBody) &&
        Objects.equals(this.customer, assertion.customer) &&
        Objects.equals(this.version, assertion.version) &&
        Objects.equals(this.regulatoryBodyApproved, assertion.regulatoryBodyApproved) &&
        Objects.equals(this.regulatoryBodyApprovedBy, assertion.regulatoryBodyApprovedBy) &&
        Objects.equals(this.direction, assertion.direction) &&
        Objects.equals(this.guidelineBody, assertion.guidelineBody) &&
        Objects.equals(this.guidelineVersion, assertion.guidelineVersion) &&
        Objects.equals(this.clinicalSignificance, assertion.clinicalSignificance) &&
        Objects.equals(this.biomarkerClass, assertion.biomarkerClass) &&
        Objects.equals(this.expression, assertion.expression) &&
        Objects.equals(this.sources, assertion.sources) &&
        Objects.equals(this.noTherapyAvailable, assertion.noTherapyAvailable) &&
        Objects.equals(this.therapeuticContext, assertion.therapeuticContext) &&
        Objects.equals(this.tier, assertion.tier) &&
        Objects.equals(this.tierExplanation, assertion.tierExplanation) &&
        Objects.equals(this.criteriaUnmet, assertion.criteriaUnmet) &&
        Objects.equals(this.criteriaMet, assertion.criteriaMet) &&
        Objects.equals(this.classifications, assertion.classifications) &&
        Objects.equals(this.prevalence, assertion.prevalence) &&
        Objects.equals(this.variantInfo, assertion.variantInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_score, id, externalId, uniqueKey, hashKey, description, narrative, regulatoryBody, customer, version, regulatoryBodyApproved, regulatoryBodyApprovedBy, direction, guidelineBody, guidelineVersion, clinicalSignificance, biomarkerClass, expression, sources, noTherapyAvailable, therapeuticContext, tier, tierExplanation, criteriaUnmet, criteriaMet, classifications, prevalence, variantInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Assertion {\n");
    
    sb.append("    _score: ").append(toIndentedString(_score)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    hashKey: ").append(toIndentedString(hashKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    narrative: ").append(toIndentedString(narrative)).append("\n");
    sb.append("    regulatoryBody: ").append(toIndentedString(regulatoryBody)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    regulatoryBodyApproved: ").append(toIndentedString(regulatoryBodyApproved)).append("\n");
    sb.append("    regulatoryBodyApprovedBy: ").append(toIndentedString(regulatoryBodyApprovedBy)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    guidelineBody: ").append(toIndentedString(guidelineBody)).append("\n");
    sb.append("    guidelineVersion: ").append(toIndentedString(guidelineVersion)).append("\n");
    sb.append("    clinicalSignificance: ").append(toIndentedString(clinicalSignificance)).append("\n");
    sb.append("    biomarkerClass: ").append(toIndentedString(biomarkerClass)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    noTherapyAvailable: ").append(toIndentedString(noTherapyAvailable)).append("\n");
    sb.append("    therapeuticContext: ").append(toIndentedString(therapeuticContext)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    tierExplanation: ").append(toIndentedString(tierExplanation)).append("\n");
    sb.append("    criteriaUnmet: ").append(toIndentedString(criteriaUnmet)).append("\n");
    sb.append("    criteriaMet: ").append(toIndentedString(criteriaMet)).append("\n");
    sb.append("    classifications: ").append(toIndentedString(classifications)).append("\n");
    sb.append("    prevalence: ").append(toIndentedString(prevalence)).append("\n");
    sb.append("    variantInfo: ").append(toIndentedString(variantInfo)).append("\n");
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
