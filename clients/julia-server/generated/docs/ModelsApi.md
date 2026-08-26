# ModelsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_model**](ModelsApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**list_models**](ModelsApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_model**](ModelsApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **delete_model**
> `delete_model`(req::`HTTP.Request`, `model`::`String`;) -> `DeleteModelResponse`

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`model`** | **`String`**| The model to delete |

### Return type

[**`DeleteModelResponse`**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> `list_models`(req::`HTTP.Request`;) -> `ListModelsResponse`

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`ListModelsResponse`**](ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_model**
> `retrieve_model`(req::`HTTP.Request`, `model`::`String`;) -> `Model`

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`model`** | **`String`**| The ID of the model to use for this request |

### Return type

[**`Model`**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

