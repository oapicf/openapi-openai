# ModelsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelsAPI_deleteModel**](ModelsAPI.md#ModelsAPI_deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**ModelsAPI_listModels**](ModelsAPI.md#ModelsAPI_listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**ModelsAPI_retrieveModel**](ModelsAPI.md#ModelsAPI_retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **ModelsAPI_deleteModel**
```c
// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
//
delete_model_response_t* ModelsAPI_deleteModel(apiClient_t *apiClient, char *model);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**model** | **char \*** | The model to delete | 

### Return type

[delete_model_response_t](delete_model_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ModelsAPI_listModels**
```c
// Lists the currently available models, and provides basic information about each one such as the owner and availability.
//
list_models_response_t* ModelsAPI_listModels(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[list_models_response_t](list_models_response.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ModelsAPI_retrieveModel**
```c
// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
//
model_t* ModelsAPI_retrieveModel(apiClient_t *apiClient, char *model);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**model** | **char \*** | The ID of the model to use for this request | 

### Return type

[model_t](model.md) *


### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

