# InstitutionsApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstitution**](InstitutionsApi.md#deleteInstitution) | **DELETE** /institution/{id} | Delete an institution
[**getInstitution**](InstitutionsApi.md#getInstitution) | **GET** /institution/{id} | Get an institution
[**getInstitutionStatus**](InstitutionsApi.md#getInstitutionStatus) | **GET** /institution/{id}/status | Get an institution record&#x27;s status
[**getInstitutions**](InstitutionsApi.md#getInstitutions) | **GET** /institutions | Get a paginated list of institutions
[**postInstitution**](InstitutionsApi.md#postInstitution) | **POST** /institution | Create an institution
[**putInstitution**](InstitutionsApi.md#putInstitution) | **PUT** /institution/{id} | Put/Update an institution

<a name="deleteInstitution"></a>
# **deleteInstitution**
> Institution deleteInstitution(id)

Delete an institution

Delete an institution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InstitutionsApi apiInstance = new InstitutionsApi();
String id = "id_example"; // String | ID of the Institution to delete
try {
    Institution result = apiInstance.deleteInstitution(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#deleteInstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution to delete |

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInstitution"></a>
# **getInstitution**
> Institution getInstitution(id)

Get an institution

Get an institution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InstitutionsApi apiInstance = new InstitutionsApi();
String id = "id_example"; // String | ID of the Institution to return
try {
    Institution result = apiInstance.getInstitution(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getInstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution to return |

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInstitutionStatus"></a>
# **getInstitutionStatus**
> Institution getInstitutionStatus(id)

Get an institution record&#x27;s status

Get an institution status

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InstitutionsApi apiInstance = new InstitutionsApi();
String id = "id_example"; // String | ID of the Institution to return status for
try {
    Institution result = apiInstance.getInstitutionStatus(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getInstitutionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution to return status for |

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInstitutions"></a>
# **getInstitutions**
> Institution getInstitutions()

Get a paginated list of institutions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InstitutionsApi apiInstance = new InstitutionsApi();
try {
    Institution result = apiInstance.getInstitutions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getInstitutions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postInstitution"></a>
# **postInstitution**
> Institution postInstitution()

Create an institution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InstitutionsApi apiInstance = new InstitutionsApi();
try {
    Institution result = apiInstance.postInstitution();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#postInstitution");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putInstitution"></a>
# **putInstitution**
> Institution putInstitution(id)

Put/Update an institution

Put an institution

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstitutionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


InstitutionsApi apiInstance = new InstitutionsApi();
String id = "id_example"; // String | ID of the Institution to return
try {
    Institution result = apiInstance.putInstitution(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#putInstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution to return |

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

