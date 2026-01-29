# MODELS_API

All URIs are relative to *https://api.openai.com/v1*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**delete_model**](MODELS_API.md#delete_model) | **Delete** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**list_models**](MODELS_API.md#list_models) | **Get** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_model**](MODELS_API.md#retrieve_model) | **Get** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **delete_model**
> delete_model (model: STRING_32 ): detachable DELETE_MODEL_RESPONSE


Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **STRING_32**| The model to delete | [default to null]

### Return type

[**DELETE_MODEL_RESPONSE**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> list_models : detachable LIST_MODELS_RESPONSE


Lists the currently available models, and provides basic information about each one such as the owner and availability.


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST_MODELS_RESPONSE**](ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_model**
> retrieve_model (model: STRING_32 ): detachable MODEL


Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **STRING_32**| The ID of the model to use for this request | [default to null]

### Return type

[**MODEL**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

