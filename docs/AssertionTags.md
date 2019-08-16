# AssertionTags

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**term** | **String** | The associated term. | 
**facet** | **String** | The facet of the associated term. | 
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | Inclusion or exclusion association. |  [optional]
**priority** | **Integer** | The quality of the association. |  [optional]
**compositeKey** | **String** | The tag identifier. |  [optional]
**generatedBy** | **String** | The inferring facet. |  [optional]
**generatedByTerm** | **String** | The inferring term. |  [optional]
**transcript** | **String** | The particular transcript for a mutation tag. |  [optional]
**primary** | **Boolean** | Indicates a primary condition. |  [optional]

<a name="FilterTypeEnum"></a>
## Enum: FilterTypeEnum
Name | Value
---- | -----
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;
