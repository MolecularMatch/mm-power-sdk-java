# Filter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**term** | **String** | The term to search. | 
**rootTerm** | **String** | The root term corresponding to the term.  Terms can be synonyms of root term, whereas the root term is what is annotated the records being searched. |  [optional]
**facet** | **String** | The facet or domain the term belongs to.  provide PHRASE if unknown. | 
**filterType** | [**FilterTypeEnum**](#FilterTypeEnum) | Inclusion or exclusion search. |  [optional]
**distanceUOM** | [**DistanceUOMEnum**](#DistanceUOMEnum) | Used by DISTANCE filters only.  Specify distance in kilometers or miles. |  [optional]
**postalCode** | **String** | Used by DISTANCE filters only.  Specify postal code to center distance search from. |  [optional]
**countryCode** | **String** | Used by DISTANCE filters only.  Specify a 2 digit ISO-3166 country code to center distance search from. |  [optional]
**geneExpand** | **Boolean** | Used by MUTATION filters only.  If true, expand the search to include results maching the mutation gene. |  [optional]
**excludeFilterOnly** | **Boolean** | To create a soft include filter, add excludeFilterOnly&#x3D;true (and specify filterType of include. |  [optional]
**error** | **String** |  |  [optional]

<a name="FilterTypeEnum"></a>
## Enum: FilterTypeEnum
Name | Value
---- | -----
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;

<a name="DistanceUOMEnum"></a>
## Enum: DistanceUOMEnum
Name | Value
---- | -----
MI | &quot;mi&quot;
KM | &quot;km&quot;
