# PublicationApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**countPublications**](PublicationApi.md#countPublications) | **POST** /publication/count | Get the count of Publications matching a searchRequest
[**getPublication**](PublicationApi.md#getPublication) | **GET** /publication/:id* | Get a Publication
[**searchPublications**](PublicationApi.md#searchPublications) | **POST** /publication/search | Search for Publications

<a name="countPublications"></a>
# **countPublications**
> SearchResponsePublication countPublications(body)

Get the count of Publications matching a searchRequest

Get the count of Publications matching a searchRequest

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PublicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PublicationApi apiInstance = new PublicationApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
try {
    SearchResponsePublication result = apiInstance.countPublications(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicationApi#countPublications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| SearchRequest object to send to MolecularMatch for processing |

### Return type

[**SearchResponsePublication**](SearchResponsePublication.md)





### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPublication"></a>
# **getPublication**
> Publication getPublication(:Id)

Get a Publication

Get a Publication

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PublicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PublicationApi apiInstance = new PublicationApi();
String :Id = ":Id_example"; // String | ID of the Publication to return
try {
    Publication result = apiInstance.getPublication(:Id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicationApi#getPublication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **:Id** | **String**| ID of the Publication to return |

### Return type

[**Publication**](Publication.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchPublications"></a>
# **searchPublications**
> SearchResponsePublication searchPublications(body)

Search for Publications

Search for Publications

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PublicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


PublicationApi apiInstance = new PublicationApi();
SearchRequest body = new SearchRequest(); // SearchRequest | SearchRequest object to send to MolecularMatch for processing
try {
    SearchResponsePublication result = apiInstance.searchPublications(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicationApi#searchPublications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchRequest**](SearchRequest.md)| SearchRequest object to send to MolecularMatch for processing |

### Return type

[**SearchResponsePublication**](SearchResponsePublication.md)





### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

