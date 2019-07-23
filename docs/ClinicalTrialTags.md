# ClinicalTrialTags

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**term** | **String** | The associated term. | 
**facet** | **String** | The facet of the associated term. | 
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | Inclusion or exclusion association. |  [optional]
**priority** | **Integer** | The quality of the association. |  [optional]
**suppress** | **Boolean** | If true the association is removed. |  [optional]
**custom** | **Boolean** | If true the association was manually established. |  [optional]
**compositeKey** | **String** | The tag identifier. |  [optional]
**generatedBy** | **String** | The inferring facet. |  [optional]
**generatedByTerm** | **String** | The inferring term. |  [optional]
**alias** | **String** | The displayable form of the term. |  [optional]

<a name="FilterTypeEnum"></a>
## Enum: FilterTypeEnum
Name | Value
---- | -----
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;
