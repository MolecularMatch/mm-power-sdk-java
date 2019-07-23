# SearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchKey** | **String** | Search key from a previous response to reconsititute a prior request. |  [optional]
**institutionId** | **String** | An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness. |  [optional]
**caseId** | **String** | For lab specific case tracking. |  [optional]
**start** | **Integer** | Starting record index for paging results. |  [optional]
**limit** | **Integer** | Number of records per page. |  [optional]
**locationSummary** | **Boolean** | If true, returns a summary location structure instead of the full array of trial locations. |  [optional]
**filterNarrative** | **Boolean** | If true, include a human readable filter narrative. |  [optional]
**fields** | **List&lt;String&gt;** | Provide a field list to customize the return records fields. |  [optional]
**filters** | [**List&lt;Filter&gt;**](Filter.md) |  |  [optional]
**geopoint** | [**SearchRequestGeopoint**](SearchRequestGeopoint.md) |  |  [optional]
**location** | [**SearchRequestLocation**](SearchRequestLocation.md) |  |  [optional]
**minShouldMatch** | [**SearchRequestMinShouldMatch**](SearchRequestMinShouldMatch.md) |  |  [optional]
