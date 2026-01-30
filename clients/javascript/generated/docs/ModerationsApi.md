# OpenapiOpenai.ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 



## createModeration

> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Example

```javascript
import OpenapiOpenai from 'openapi_openai';
let defaultClient = OpenapiOpenai.ApiClient.instance;
// Configure Bearer access token for authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications['ApiKeyAuth'];
ApiKeyAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new OpenapiOpenai.ModerationsApi();
let createModerationRequest = new OpenapiOpenai.CreateModerationRequest(); // CreateModerationRequest | 
apiInstance.createModeration(createModerationRequest, (error, data, response) => {
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
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

