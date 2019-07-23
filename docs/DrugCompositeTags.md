# DrugCompositeTags

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**term** | **String** |  | 
**facet** | **String** |  | 
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) |  |  [optional]
**priority** | **Integer** |  | 
**suppress** | **Boolean** |  |  [optional]
**suppressBoost** | **Boolean** |  |  [optional]
**custom** | **Boolean** |  |  [optional]
**manualSuppress** | [**ManualSuppressEnum**](#ManualSuppressEnum) |  |  [optional]

<a name="FilterTypeEnum"></a>
## Enum: FilterTypeEnum
Name | Value
---- | -----
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;

<a name="ManualSuppressEnum"></a>
## Enum: ManualSuppressEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
