# InstitutionsApi

All URIs are relative to *https://api.molecularmatch.com/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInstitution**](InstitutionsApi.md#deleteInstitution) | **DELETE** /institution/{id} | Delete an institution
[**deletePrivateTrial**](InstitutionsApi.md#deletePrivateTrial) | **DELETE** /institution/{id}/trial/{trialId} | Delete a private trial
[**getInstitution**](InstitutionsApi.md#getInstitution) | **GET** /institution/{id} | Get an institution
[**getInstitutionStatus**](InstitutionsApi.md#getInstitutionStatus) | **GET** /institution/{id}/status | Get an institution record&#x27;s status
[**getInstitutions**](InstitutionsApi.md#getInstitutions) | **GET** /institutions | Get a paginated list of institutions
[**getPrivateTrial**](InstitutionsApi.md#getPrivateTrial) | **GET** /institution/{id}/trial/{trialId} | Get a private trial
[**getPrivateTrialStatus**](InstitutionsApi.md#getPrivateTrialStatus) | **GET** /institution/{id}/trial/{trialId}/status | Get a private trial record&#x27;s status
[**getPrivateTrials**](InstitutionsApi.md#getPrivateTrials) | **GET** /institution/{id}/trials | Get a paginated list of private 
[**postInstitution**](InstitutionsApi.md#postInstitution) | **POST** /institution | Create an institution
[**postPrivateTrial**](InstitutionsApi.md#postPrivateTrial) | **POST** /institution/{id}/trial | Create a private trial
[**putInstitution**](InstitutionsApi.md#putInstitution) | **PUT** /institution/{id} | Put/Update an institution
[**putPrivateTrial**](InstitutionsApi.md#putPrivateTrial) | **PUT** /institution/{id}/trial/{trialId} | Put/Update a private trial

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

<a name="deletePrivateTrial"></a>
# **deletePrivateTrial**
> PrivateTrial deletePrivateTrial(id, trialId)

Delete a private trial

Delete a private trial

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
String id = "id_example"; // String | ID of the Institution governing the private trial
String trialId = "trialId_example"; // String | ID of the private trial to delete
try {
    PrivateTrial result = apiInstance.deletePrivateTrial(id, trialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#deletePrivateTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution governing the private trial |
 **trialId** | **String**| ID of the private trial to delete |

### Return type

[**PrivateTrial**](PrivateTrial.md)





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

<a name="getPrivateTrial"></a>
# **getPrivateTrial**
> PrivateTrial getPrivateTrial(id, trialId)

Get a private trial

Get a private trial

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
String id = "id_example"; // String | ID of the Institution governing the private trial
String trialId = "trialId_example"; // String | ID of the private trial to return
try {
    PrivateTrial result = apiInstance.getPrivateTrial(id, trialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getPrivateTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution governing the private trial |
 **trialId** | **String**| ID of the private trial to return |

### Return type

[**PrivateTrial**](PrivateTrial.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrivateTrialStatus"></a>
# **getPrivateTrialStatus**
> PrivateTrial getPrivateTrialStatus(id, trialId)

Get a private trial record&#x27;s status

Get a private trial&#x27;s status

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
String id = "id_example"; // String | ID of the Institution governing the private trial
String trialId = "trialId_example"; // String | ID of the private trial to return status for
try {
    PrivateTrial result = apiInstance.getPrivateTrialStatus(id, trialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getPrivateTrialStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution governing the private trial |
 **trialId** | **String**| ID of the private trial to return status for |

### Return type

[**PrivateTrial**](PrivateTrial.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrivateTrials"></a>
# **getPrivateTrials**
> PrivateTrial getPrivateTrials(id)

Get a paginated list of private 

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
String id = "id_example"; // String | ID of the Institution governing the private trial
try {
    PrivateTrial result = apiInstance.getPrivateTrials(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#getPrivateTrials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution governing the private trial |

### Return type

[**PrivateTrial**](PrivateTrial.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postInstitution"></a>
# **postInstitution**
> Institution postInstitution(body)

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
Institution body = new Institution(); // Institution | Institution object to send to MolecularMatch for processing
try {
    Institution result = apiInstance.postInstitution(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#postInstitution");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Institution**](Institution.md)| Institution object to send to MolecularMatch for processing |

### Return type

[**Institution**](Institution.md)





### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postPrivateTrial"></a>
# **postPrivateTrial**
> PrivateTrial postPrivateTrial(body)

Create a private trial

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
PrivateTrial body = new PrivateTrial(); // PrivateTrial | Private Trial object to send to MolecularMatch for processing
try {
    PrivateTrial result = apiInstance.postPrivateTrial(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#postPrivateTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrivateTrial**](PrivateTrial.md)| Private Trial object to send to MolecularMatch for processing |

### Return type

[**PrivateTrial**](PrivateTrial.md)





### HTTP request headers

 - **Content-Type**: application/json
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

<a name="putPrivateTrial"></a>
# **putPrivateTrial**
> PrivateTrial putPrivateTrial(id, trialId)

Put/Update a private trial

Put a private trial

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
String id = "id_example"; // String | ID of the Institution governing the private trial
String trialId = "trialId_example"; // String | ID of the private trial
try {
    PrivateTrial result = apiInstance.putPrivateTrial(id, trialId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstitutionsApi#putPrivateTrial");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the Institution governing the private trial |
 **trialId** | **String**| ID of the private trial |

### Return type

[**PrivateTrial**](PrivateTrial.md)





### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

