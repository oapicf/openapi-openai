# ModelsApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteModel**](ModelsApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model. |
| [**listModels**](ModelsApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**retrieveModel**](ModelsApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |


<a id="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
val model : kotlin.String = ft:gpt-3.5-turbo:acemeco:suffix:abc123 // kotlin.String | The model to delete
try {
    val result : DeleteModelResponse = apiInstance.deleteModel(model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#deleteModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#deleteModel")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **model** | **kotlin.String**| The model to delete | |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listModels"></a>
# **listModels**
> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
try {
    val result : ListModelsResponse = apiInstance.listModels()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#listModels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#listModels")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="retrieveModel"></a>
# **retrieveModel**
> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModelsApi()
val model : kotlin.String = gpt-3.5-turbo // kotlin.String | The ID of the model to use for this request
try {
    val result : Model = apiInstance.retrieveModel(model)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModelsApi#retrieveModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModelsApi#retrieveModel")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **model** | **kotlin.String**| The ID of the model to use for this request | |

### Return type

[**Model**](Model.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

