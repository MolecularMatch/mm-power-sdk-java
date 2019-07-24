# Assertion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**externalId** | **List&lt;String&gt;** |  |  [optional]
**uniqueKey** | **String** |  | 
**hashKey** | **String** |  | 
**description** | **String** |  |  [optional]
**narrative** | **String** | A human readeable narrative describing the assertion. |  [optional]
**regulatoryBody** | **String** | The regulatory body that has governance over this assertion. | 
**customer** | **String** | The customer identifier that has governance over this assertion. | 
**version** | **Integer** | The assertion set version number. | 
**regulatoryBodyApproved** | **Boolean** | If true, this assertion&#x27;s therapuetic context has regulatory approval. |  [optional]
**regulatoryBodyApprovedBy** | **String** |  |  [optional]
**direction** | **String** |  |  [optional]
**guidelineBody** | **String** |  |  [optional]
**guidelineVersion** | **String** |  |  [optional]
**clinicalSignificance** | **String** |  |  [optional]
**biomarkerClass** | **String** |  |  [optional]
**expression** | **String** |  |  [optional]
**tags** | [**List&lt;AssertionTags&gt;**](AssertionTags.md) |  |  [optional]
**sources** | [**List&lt;AssertionSources&gt;**](AssertionSources.md) | The supporting evidence for this assertion. |  [optional]
**noTherapyAvailable** | **Boolean** | If true, there is no therapy related to this assertion. |  [optional]
**therapeuticContext** | [**List&lt;AssertionTherapeuticContext&gt;**](AssertionTherapeuticContext.md) | The therapies associated with this assertion. |  [optional]
**tiers** | [**List&lt;AssertionTiers&gt;**](AssertionTiers.md) |  |  [optional]
**releasedTiers** | [**List&lt;AssertionTiers&gt;**](AssertionTiers.md) |  |  [optional]
**classifications** | [**List&lt;AssertionClassifications&gt;**](AssertionClassifications.md) |  |  [optional]
**prevalence** | [**List&lt;AssertionPrevalence&gt;**](AssertionPrevalence.md) |  |  [optional]
