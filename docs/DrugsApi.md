# DrugsApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDrug**](DrugsApi.md#getDrug) | **GET** /drug/{id} | Get a Drug
[**searchDrugs**](DrugsApi.md#searchDrugs) | **POST** /drug/search | Search for drugs

<a name="getDrug"></a>
# **getDrug**
> Drug getDrug(id)

Get a Drug

Get a drug

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DrugsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugsApi apiInstance = new DrugsApi();
String id = "id_example"; // String | ID of the Drug to return
try {
    Drug result = apiInstance.getDrug(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugsApi#getDrug");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Drug to return |

### Return type

[**Drug**](Drug.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchDrugs"></a>
# **searchDrugs**
> SearchResponseDrug searchDrugs(body)

Search for drugs

Search for drugs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DrugsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DrugsApi apiInstance = new DrugsApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
try {
    SearchResponseDrug result = apiInstance.searchDrugs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugsApi#searchDrugs");
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

