# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 



## createModeration

> CreateModerationResponse createModeration(createModerationRequest)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ModerationsApi;

ModerationsApi apiInstance = new ModerationsApi();
CreateModerationRequest createModerationRequest = new CreateModerationRequest(); // CreateModerationRequest | 
try {
    CreateModerationResponse result = apiInstance.createModeration(createModerationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModerationsApi#createModeration");
    e.printStackTrace();
}
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

