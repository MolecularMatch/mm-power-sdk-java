# Assertion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_score** | **Float** | indicator of the quality of the match. |  [optional]
**id** | **String** |  |  [optional]
**externalId** | **java.util.List&lt;String&gt;** | Optional institution specific identifier. |  [optional]
**uniqueKey** | **String** | Unique identifer inclusive of version. |  [optional]
**hashKey** | **String** | Static identifier agnostic of version. |  [optional]
**description** | **String** | Detailed description of the assertion. |  [optional]
**narrative** | **String** | A human readeable narrative describing the assertion. |  [optional]
**regulatoryBody** | [**RegulatoryBodyEnum**](#RegulatoryBodyEnum) | The regulatory body that has governance over this assertion. | 
**customer** | **String** | The customer identifier that has governance over this assertion. | 
**version** | **Integer** | The assertion set version number. | 
**regulatoryBodyApproved** | **Boolean** | If true, this assertion&#x27;s therapuetic context has regulatory approval. |  [optional]
**regulatoryBodyApprovedBy** | **String** | Governing body granting approval. |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) | Indicates whether assertion supports or does not support the therapy. |  [optional]
**guidelineBody** | [**GuidelineBodyEnum**](#GuidelineBodyEnum) | A professional committee recommendation. |  [optional]
**guidelineVersion** | **String** | Release version of professional committee recommendation. |  [optional]
**clinicalSignificance** | [**ClinicalSignificanceEnum**](#ClinicalSignificanceEnum) | Utility of biomarker in clinical setting. |  [optional]
**biomarkerClass** | [**BiomarkerClassEnum**](#BiomarkerClassEnum) | Indicator of response to therapy |  [optional]
**expression** | **String** | mathematical expression characterizing the clinical scope of the assertion. |  [optional]
**sources** | [**java.util.List&lt;AssertionSources&gt;**](AssertionSources.md) | The supporting evidence for this assertion. |  [optional]
**noTherapyAvailable** | **Boolean** | If true, there is no therapy related to this assertion. |  [optional]
**therapeuticContext** | [**java.util.List&lt;AssertionTherapeuticContext&gt;**](AssertionTherapeuticContext.md) | The therapies associated with this assertion. |  [optional]
**tier** | **String** | The tiering template specific tier associated with the therapy. |  [optional]
**tierExplanation** | [**java.util.List&lt;TierExplanation&gt;**](TierExplanation.md) | The explanation of how the tier was calculated. |  [optional]
**criteriaUnmet** | [**java.util.List&lt;ConceptAssociation&gt;**](ConceptAssociation.md) |  |  [optional]
**criteriaMet** | [**java.util.List&lt;ConceptAssociation&gt;**](ConceptAssociation.md) |  |  [optional]
**classifications** | [**java.util.List&lt;AssertionClassifications&gt;**](AssertionClassifications.md) |  |  [optional]
**prevalence** | [**java.util.List&lt;AssertionPrevalence&gt;**](AssertionPrevalence.md) |  |  [optional]
**variantInfo** | [**java.util.List&lt;VariantInfo&gt;**](VariantInfo.md) | Genomic information pertaining to variant. |  [optional]

<a name="RegulatoryBodyEnum"></a>
## Enum: RegulatoryBodyEnum
Name | Value
---- | -----
FDA | &quot;FDA&quot;
EMA | &quot;EMA&quot;
HCA | &quot;HCA&quot;
TGA | &quot;TGA&quot;

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
SUPPORTS | &quot;supports&quot;
DOES_NOT_SUPPORT | &quot;does_not_support&quot;

<a name="GuidelineBodyEnum"></a>
## Enum: GuidelineBodyEnum
Name | Value
---- | -----
NCCN | &quot;NCCN&quot;
ASCO | &quot;ASCO&quot;
ESMO | &quot;ESMO&quot;
AJCC | &quot;AJCC&quot;
AMP | &quot;AMP&quot;
CAP | &quot;CAP&quot;

<a name="ClinicalSignificanceEnum"></a>
## Enum: ClinicalSignificanceEnum
Name | Value
---- | -----
NO_RESPONSE | &quot;no_response&quot;
SENSITIVE | &quot;sensitive&quot;
FAVORABLE | &quot;favorable&quot;
UNFAVORABLE | &quot;unfavorable&quot;
UNKNOWN | &quot;unknown&quot;
RESISTANT | &quot;resistant&quot;
INTERMEDIATE | &quot;intermediate&quot;
ADVERSE_RESPONSE | &quot;adverse_response&quot;
PATHOGENIC | &quot;pathogenic&quot;
NOT_IMPLICATED | &quot;not_implicated&quot;
GAIN_OF_FUNCTION | &quot;gain_of_function&quot;
LOSS_OF_FUNCTION | &quot;loss_of_function&quot;

<a name="BiomarkerClassEnum"></a>
## Enum: BiomarkerClassEnum
Name | Value
---- | -----
PREDICTIVE | &quot;predictive&quot;
DIAGNOSTIC | &quot;diagnostic&quot;
PROGNOSTIC | &quot;prognostic&quot;
UNKNOWN | &quot;unknown&quot;
PREDISPOSING | &quot;predisposing&quot;
FUNCTIONAL | &quot;functional&quot;
