# Org.OpenAPITools.Api.ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateModeration**](ModerationsApi.md#createmoderation) | **POST** /moderations | Classifies if text is potentially harmful. |

<a id="createmoderation"></a>
# **CreateModeration**
> CreateModerationResponse CreateModeration (CreateModerationRequest createModerationRequest)

Classifies if text is potentially harmful.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md) |  |  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

