# .ModelsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](ModelsApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**listModels**](ModelsApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveModel**](ModelsApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **deleteModel**
> DeleteModelResponse deleteModel()


### Example


```typescript
import { createConfiguration, ModelsApi } from '';
import type { ModelsApiDeleteModelRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ModelsApi(configuration);

const request: ModelsApiDeleteModelRequest = {
    // The model to delete
  model: "ft:gpt-3.5-turbo:acemeco:suffix:abc123",
};

const data = await apiInstance.deleteModel(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**string**] | The model to delete | defaults to undefined


### Return type

**DeleteModelResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listModels**
> ListModelsResponse listModels()


### Example


```typescript
import { createConfiguration, ModelsApi } from '';

const configuration = createConfiguration();
const apiInstance = new ModelsApi(configuration);

const request = {};

const data = await apiInstance.listModels(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ListModelsResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveModel**
> Model retrieveModel()


### Example


```typescript
import { createConfiguration, ModelsApi } from '';
import type { ModelsApiRetrieveModelRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ModelsApi(configuration);

const request: ModelsApiRetrieveModelRequest = {
    // The ID of the model to use for this request
  model: "gpt-3.5-turbo",
};

const data = await apiInstance.retrieveModel(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | [**string**] | The ID of the model to use for this request | defaults to undefined


### Return type

**Model**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


