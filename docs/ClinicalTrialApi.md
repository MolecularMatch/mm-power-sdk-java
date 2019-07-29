# ClinicalTrialApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrial**](ClinicalTrialApi.md#getTrial) | **GET** /trial/:id | Get a Clinical Trial

<a name="getTrial"></a>
# **getTrial**
> ClinicalTrial getTrial(:Id)

Get a Clinical Trial

Get a Clinical Trial

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClinicalTrialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ClinicalTrialApi apiInstance = new ClinicalTrialApi();
String :Id = ":Id_example"; // String | ID of the Clinical Trial to return
try {
    ClinicalTrial result = apiInstance.getTrial(:Id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClinicalTrialApi#getTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **:Id** | **String**| ID of the Clinical Trial to return |

### Return type

[**ClinicalTrial**](ClinicalTrial.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

