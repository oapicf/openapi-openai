# OpenapiOpenai.DefaultApi

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.DefaultApi();
let adminApiKeysCreateRequest = new OpenapiOpenai.AdminApiKeysCreateRequest(); // AdminApiKeysCreateRequest | 
apiInstance.adminApiKeysCreate(adminApiKeysCreateRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.DefaultApi();
let keyId = "keyId_example"; // String | 
apiInstance.adminApiKeysDelete(keyId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**|  | 

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

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.DefaultApi();
let keyId = "keyId_example"; // String | 
apiInstance.adminApiKeysGet(keyId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyId** | **String**|  | 

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## adminApiKeysList

> ApiKeyList adminApiKeysList(opts)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.DefaultApi();
let opts = {
  'after': "after_example", // String | 
  'order': "'asc'", // String | 
  'limit': 20 // Number | 
};
apiInstance.adminApiKeysList(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **String**|  | [optional] 
 **order** | **String**|  | [optional] [default to &#39;asc&#39;]
 **limit** | **Number**|  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

