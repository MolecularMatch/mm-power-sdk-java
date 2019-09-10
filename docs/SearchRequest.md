# SearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchKey** | **String** | Search key from a previous response to reconsititute a prior request. |  [optional]
**institutionId** | **String** | An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness. |  [optional]
**caseId** | **String** | For lab specific case tracking. |  [optional]
**tieringTemplate** | **String** | Applies to drug and assertion search.  Optionally supply the tiering template. |  [optional]
**start** | **Integer** | Starting record index for paging results. |  [optional]
**limit** | **Integer** | Number of records per page. |  [optional]
**fields** | **java.util.List&lt;String&gt;** | Provide a field list to customize the return records fields. |  [optional]
**filters** | [**java.util.List&lt;Filter&gt;**](Filter.md) |  |  [optional]
**geopoint** | [**SearchRequestGeopoint**](SearchRequestGeopoint.md) |  |  [optional]
**location** | [**SearchRequestLocation**](SearchRequestLocation.md) |  |  [optional]
**minShouldMatch** | [**SearchRequestMinShouldMatch**](SearchRequestMinShouldMatch.md) |  |  [optional]
