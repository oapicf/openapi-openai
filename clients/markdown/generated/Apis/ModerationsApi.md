# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createModeration**](ModerationsApi.md#createModeration) | **POST** /moderations | Classifies if text is potentially harmful. |


<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(CreateModerationRequest)

Classifies if text is potentially harmful.

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

