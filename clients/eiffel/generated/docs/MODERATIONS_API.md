# MODERATIONS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**create_moderation**](MODERATIONS_API.md#create_moderation) | **Post** /moderations | Classifies if text is potentially harmful.


# **create_moderation**
> create_moderation (create_moderation_request: CREATE_MODERATION_REQUEST ): detachable CREATE_MODERATION_RESPONSE


Classifies if text is potentially harmful.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CREATE_MODERATION_REQUEST**](CREATE_MODERATION_REQUEST.md)|  | 

### Return type

[**CREATE_MODERATION_RESPONSE**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

