# ModelsApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**deleteModel**](#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.|
|[**listModels**](#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.|
|[**retrieveModel**](#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.|

# **deleteModel**
> DeleteModelResponse deleteModel()


### Example

```typescript
import {
    ModelsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ModelsApi(configuration);

let model: string; //The model to delete (default to undefined)

const { status, data } = await apiInstance.deleteModel(
    model
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **model** | [**string**] | The model to delete | defaults to undefined|


### Return type

**DeleteModelResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listModels**
> ListModelsResponse listModels()


### Example

```typescript
import {
    ModelsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ModelsApi(configuration);

const { status, data } = await apiInstance.listModels();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**ListModelsResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveModel**
> Model retrieveModel()


### Example

```typescript
import {
    ModelsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ModelsApi(configuration);

let model: string; //The ID of the model to use for this request (default to undefined)

const { status, data } = await apiInstance.retrieveModel(
    model
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **model** | [**string**] | The ID of the model to use for this request | defaults to undefined|


### Return type

**Model**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

