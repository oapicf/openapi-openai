# ModelsAPI

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](ModelsAPI.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**listModels**](ModelsAPI.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveModel**](ModelsAPI.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **deleteModel**
```swift
    open class func deleteModel(model: String, completion: @escaping (_ data: DeleteModelResponse?, _ error: Error?) -> Void)
```

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let model = "model_example" // String | The model to delete

// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
ModelsAPI.deleteModel(model: model) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String** | The model to delete | 

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listModels**
```swift
    open class func listModels(completion: @escaping (_ data: ListModelsResponse?, _ error: Error?) -> Void)
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// Lists the currently available models, and provides basic information about each one such as the owner and availability.
ModelsAPI.listModels() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveModel**
```swift
    open class func retrieveModel(model: String, completion: @escaping (_ data: Model?, _ error: Error?) -> Void)
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let model = "model_example" // String | The ID of the model to use for this request

// Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
ModelsAPI.retrieveModel(model: model) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String** | The ID of the model to use for this request | 

### Return type

[**Model**](Model.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

