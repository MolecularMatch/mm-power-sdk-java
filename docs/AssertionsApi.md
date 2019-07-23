# AssertionsApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchAssertions**](AssertionsApi.md#searchAssertions) | **POST** /assertion/search | Search for assertions

<a name="searchAssertions"></a>
# **searchAssertions**
> SearchResponseDrug searchAssertions(body)

Search for assertions

Search for evidence backed assertions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AssertionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AssertionsApi apiInstance = new AssertionsApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
try {
    SearchResponseDrug result = apiInstance.searchAssertions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssertionsApi#searchAssertions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| SearchRequest object to send to MolecularMatch for processing |

### Return type

[**SearchResponseDrug**](SearchResponseDrug.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

