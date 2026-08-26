# ModelsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](ModelsApi.md#deleteModel) | **Delete** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**listModels**](ModelsApi.md#listModels) | **Get** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveModel**](ModelsApi.md#retrieveModel) | **Get** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a name="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ModelsApi()
val model : kotlin.String = ft:gpt-4o-mini:acemeco:suffix:abc123 // kotlin.String | The model to delete
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The model to delete |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="listModels"></a>
# **listModels**
> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="retrieveModel"></a>
# **retrieveModel**
> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = ModelsApi()
val model : kotlin.String = gpt-4o-mini // kotlin.String | The ID of the model to use for this request
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The ID of the model to use for this request |

### Return type

[**Model**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

