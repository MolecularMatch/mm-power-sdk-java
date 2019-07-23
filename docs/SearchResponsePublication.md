# SearchResponsePublication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchKey** | **String** | Search key from a previous response to reconsititute a prior request. |  [optional]
**institutionId** | **String** | An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness. |  [optional]
**caseId** | **String** | For lab specific case tracking. |  [optional]
**total** | **Integer** | The total number of records that match this search. | 
**totalPages** | **Integer** | The number of results pages for this search based on the limit provided in the request. | 
**page** | **Integer** | The results page number this response corresponds to. | 
**rows** | [**List&lt;Publication&gt;**](Publication.md) | The array of results records.  Rows must be cast accordingly to ct, drug, publication, etc. |  [optional]
**rationalized** | [**List&lt;Filter&gt;**](Filter.md) | The array of filters and how they were interpreted by the MolecularMatch search engine. |  [optional]
**unrecognized** | [**List&lt;Filter&gt;**](Filter.md) | The array of filters that were not recognized by the MolecularMatch search engine. |  [optional]
**ambiguousNarrative** | **List&lt;String&gt;** | if true include a human readable ambiguous narrative.  This enables the consumer to activate \&quot;did you mean\&quot; search capability. |  [optional]