# SearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchKey** | **String** | Search key from a previous response to reconsititute a prior request. |  [optional]
**institutionId** | **String** | An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness. |  [optional]
**caseId** | **String** | For lab specific case tracking. |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Currently applies to drug search.  Supplying the mode of discovery will perform an associative search. These are not treatment recommendations and have no tiering associated with them. Supplying criteriaunmet performs an assertion guided search and returns drugs based on assertion evidence. |  [optional]
**start** | **Integer** | Starting record index for paging results. |  [optional]
**limit** | **Integer** | Number of records per page. |  [optional]
**fields** | **java.util.List&lt;String&gt;** | Provide a field list to customize the return records fields. |  [optional]
**filters** | [**java.util.List&lt;Filter&gt;**](Filter.md) |  |  [optional]
**geopoint** | [**SearchRequestGeopoint**](SearchRequestGeopoint.md) |  |  [optional]
**location** | [**SearchRequestLocation**](SearchRequestLocation.md) |  |  [optional]
**minShouldMatch** | [**SearchRequestMinShouldMatch**](SearchRequestMinShouldMatch.md) |  |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
CRITERIAUNMET | &quot;criteriaunmet&quot;
DISCOVERY | &quot;discovery&quot;
