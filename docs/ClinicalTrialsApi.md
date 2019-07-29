# ClinicalTrialsApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countTrials**](ClinicalTrialsApi.md#countTrials) | **POST** /trial/count | Get the count of Clinical Trials matching a searchRequest
[**searchTrials**](ClinicalTrialsApi.md#searchTrials) | **POST** /trial/search | Search for clinical trials

<a name="countTrials"></a>
# **countTrials**
> SearchResponse countTrials(body)

Get the count of Clinical Trials matching a searchRequest

Get the count of Clinical Trials matching a searchRequest

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClinicalTrialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ClinicalTrialsApi apiInstance = new ClinicalTrialsApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
try {
    SearchResponse result = apiInstance.countTrials(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClinicalTrialsApi#countTrials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| SearchRequest object to send to MolecularMatch for processing |

### Return type

[**SearchResponse**](SearchResponse.md)





### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchTrials"></a>
# **searchTrials**
> SearchResponse searchTrials(body)

Search for clinical trials

Search for clinical trials

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClinicalTrialsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ClinicalTrialsApi apiInstance = new ClinicalTrialsApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
try {
    SearchResponse result = apiInstance.searchTrials(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClinicalTrialsApi#searchTrials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| SearchRequest object to send to MolecularMatch for processing |

### Return type

[**SearchResponse**](SearchResponse.md)





### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

