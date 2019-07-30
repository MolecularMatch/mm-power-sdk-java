# AssertionsApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssertion**](AssertionsApi.md#getAssertion) | **GET** /assertion/{id} | Get an Assertion
[**searchAssertions**](AssertionsApi.md#searchAssertions) | **POST** /assertion/search | Search for assertions

<a name="getAssertion"></a>
# **getAssertion**
> Assertion getAssertion(id)

Get an Assertion

Get an evidence backed assertion

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
String id = "id_example"; // String | ID of the Assertion to return
try {
    Assertion result = apiInstance.getAssertion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssertionsApi#getAssertion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Assertion to return |

### Return type

[**Assertion**](Assertion.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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





### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

