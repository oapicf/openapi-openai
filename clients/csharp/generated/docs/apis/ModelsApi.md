# Org.OpenAPITools.Api.ModelsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**DeleteModel**](ModelsApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. |
| [**ListModels**](ModelsApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**RetrieveModel**](ModelsApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |

<a id="deletemodel"></a>
# **DeleteModel**
> DeleteModelResponse DeleteModel (string model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **model** | **string** | The model to delete |  |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="listmodels"></a>
# **ListModels**
> ListModelsResponse ListModels ()

Lists the currently available models, and provides basic information about each one such as the owner and availability.


### Parameters
This endpoint does not need any parameter.
### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="retrievemodel"></a>
# **RetrieveModel**
> Model RetrieveModel (string model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **model** | **string** | The ID of the model to use for this request |  |

### Return type

[**Model**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

