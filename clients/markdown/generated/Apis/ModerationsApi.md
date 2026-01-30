# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation).  |


<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(CreateModerationRequest)

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **CreateModerationRequest** | [**CreateModerationRequest**](../Models/CreateModerationRequest.md)|  | |

### Return type

[**CreateModerationResponse**](../Models/CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

