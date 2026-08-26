# ModerationsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_moderation**](ModerationsApi.md#create_moderation) | **POST** /moderations | Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 


# **create_moderation**
> `create_moderation`(_api::`ModerationsApi`, `create_moderation_request`::`CreateModerationRequest`; _mediaType=nothing) -> `CreateModerationResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `create_moderation`(_api::`ModerationsApi`, response_stream::`Channel`, `create_moderation_request`::`CreateModerationRequest`; _mediaType=nothing) -> `Channel`{ `CreateModerationResponse` }, `OpenAPI.Clients.ApiResponse`

Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ModerationsApi`** | API context | 
**`create_moderation_request`** | [**`CreateModerationRequest`**](CreateModerationRequest.md) |  |

### Return type

[**`CreateModerationResponse`**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

