# SearchResponseAssertion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchKey** | **String** | Search key from a previous response to reconsititute a prior request. |  [optional]
**institutionId** | **String** | An institution identifier recognized by MolecularMatch to enable institution specific results and location awareness. |  [optional]
**caseId** | **String** | For lab specific case tracking. |  [optional]
**tieringTemplate** | **String** | The tiering template used to assess the quality of evidence. | 
**tieringTemplateLegend** | **Object** | The tiering template legend explains the tiers pertaining to the template. |  [optional]
**total** | **Integer** | The total number of records that match this search. | 
**totalPages** | **Integer** | The number of results pages for this search based on the limit provided in the request. | 
**page** | **Integer** | The results page number this response corresponds to. | 
**rows** | [**java.util.List&lt;Assertion&gt;**](Assertion.md) | The array of assertions that match the search criteria. |  [optional]
**rationalized** | [**java.util.List&lt;Filter&gt;**](Filter.md) | The array of filters and how they were interpreted by the MolecularMatch search engine. |  [optional]
**unrecognized** | [**java.util.List&lt;Filter&gt;**](Filter.md) | The array of filters that were not recognized by the MolecularMatch search engine. |  [optional]
**filterNarrative** | **String** | A human readable narrative describing the search conducted. Can be used to provide \&quot;Showing results for\&quot; functionality. |  [optional]
**ambiguousNarrative** | **java.util.List&lt;String&gt;** | if true include a human readable ambiguous narrative.  This enables the consumer to activate \&quot;did you mean\&quot; search capability. |  [optional]
