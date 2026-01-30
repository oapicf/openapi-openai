# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminApiKeysCreate**](DefaultApi.md#adminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**adminApiKeysDelete**](DefaultApi.md#adminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**adminApiKeysGet**](DefaultApi.md#adminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**adminApiKeysList**](DefaultApi.md#adminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys



## adminApiKeysCreate

> AdminApiKey adminApiKeysCreate(adminApiKeysCreateRequest)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
AdminApiKeysCreateRequest adminApiKeysCreateRequest = new AdminApiKeysCreateRequest(); // AdminApiKeysCreateRequest | 
try {
    AdminApiKey result = apiInstance.adminApiKeysCreate(adminApiKeysCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#adminApiKeysCreate");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminApiKeysCreateRequest** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  |

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## adminApiKeysDelete

> AdminApiKeysDelete200Response adminApiKeysDelete(keyId)

Delete an organization admin API key

Delete the specified admin API key.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String keyId = null; // String | 
try {
    AdminApiKeysDelete200Response result = apiInstance.adminApiKeysDelete(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#adminApiKeysDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**|  | [default to null]

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adminApiKeysGet

> AdminApiKey adminApiKeysGet(keyId)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String keyId = null; // String | 
try {
    AdminApiKey result = apiInstance.adminApiKeysGet(keyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#adminApiKeysGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**|  | [default to null]

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adminApiKeysList

> ApiKeyList adminApiKeysList(after, order, limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String after = null; // String | 
String order = asc; // String | 
Integer limit = 20; // Integer | 
try {
    ApiKeyList result = apiInstance.adminApiKeysList(after, order, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#adminApiKeysList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**|  | [optional] [default to null]
 **order** | **String**|  | [optional] [default to asc] [enum: asc, desc]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

