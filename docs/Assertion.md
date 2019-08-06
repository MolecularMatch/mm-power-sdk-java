# Assertion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**externalId** | **java.util.List&lt;String&gt;** |  |  [optional]
**uniqueKey** | **String** |  | 
**hashKey** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**narrative** | **String** | A human readeable narrative describing the assertion. |  [optional]
**regulatoryBody** | [**RegulatoryBodyEnum**](#RegulatoryBodyEnum) | The regulatory body that has governance over this assertion. | 
**customer** | **String** | The customer identifier that has governance over this assertion. | 
**version** | **Integer** | The assertion set version number. | 
**regulatoryBodyApproved** | **Boolean** | If true, this assertion&#x27;s therapuetic context has regulatory approval. |  [optional]
**regulatoryBodyApprovedBy** | **String** |  |  [optional]
**direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional]
**guidelineBody** | [**GuidelineBodyEnum**](#GuidelineBodyEnum) |  |  [optional]
**guidelineVersion** | **String** |  |  [optional]
**clinicalSignificance** | [**ClinicalSignificanceEnum**](#ClinicalSignificanceEnum) |  |  [optional]
**biomarkerClass** | [**BiomarkerClassEnum**](#BiomarkerClassEnum) |  |  [optional]
**expression** | **String** |  |  [optional]
**tags** | [**java.util.List&lt;AssertionTags&gt;**](AssertionTags.md) |  |  [optional]
**sources** | [**java.util.List&lt;AssertionSources&gt;**](AssertionSources.md) | The supporting evidence for this assertion. |  [optional]
**noTherapyAvailable** | **Boolean** | If true, there is no therapy related to this assertion. |  [optional]
**therapeuticContext** | [**java.util.List&lt;AssertionTherapeuticContext&gt;**](AssertionTherapeuticContext.md) | The therapies associated with this assertion. |  [optional]
**tiers** | [**java.util.List&lt;StandardizedTier&gt;**](StandardizedTier.md) |  |  [optional]
**releasedTiers** | [**java.util.List&lt;StandardizedTier&gt;**](StandardizedTier.md) |  |  [optional]
**classifications** | [**java.util.List&lt;AssertionClassifications&gt;**](AssertionClassifications.md) |  |  [optional]
**prevalence** | [**java.util.List&lt;AssertionPrevalence&gt;**](AssertionPrevalence.md) |  |  [optional]
**variantInfo** | [**java.util.List&lt;AssertionVariantInfo&gt;**](AssertionVariantInfo.md) |  |  [optional]

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

<a name="BiomarkerClassEnum"></a>
## Enum: BiomarkerClassEnum
Name | Value
---- | -----
PREDICTIVE | &quot;predictive&quot;
DIAGNOSTIC | &quot;diagnostic&quot;
PROGNOSTIC | &quot;prognostic&quot;
UNKNOWN | &quot;unknown&quot;
PREDISPOSING | &quot;predisposing&quot;
