# ModelsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteModel**](ModelsApi.md#DeleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**ListModels**](ModelsApi.md#ListModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**RetrieveModel**](ModelsApi.md#RetrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **DeleteModel**
> DeleteModelResponse DeleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example
```R
library(openapi)

# Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
#
# prepare function argument(s)
var_model <- "ft:gpt-4o-mini:acemeco:suffix:abc123" # character | The model to delete

api_instance <- ModelsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteModel(var_modeldata_file = "result.txt")
result <- api_instance$DeleteModel(var_model)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **character**| The model to delete | 

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

# **ListModels**
> ListModelsResponse ListModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```R
library(openapi)

# Lists the currently available models, and provides basic information about each one such as the owner and availability.
#

api_instance <- ModelsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListModels(data_file = "result.txt")
result <- api_instance$ListModels()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

# **RetrieveModel**
> Model RetrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```R
library(openapi)

# Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
#
# prepare function argument(s)
var_model <- "gpt-4o-mini" # character | The ID of the model to use for this request

api_instance <- ModelsApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveModel(var_modeldata_file = "result.txt")
result <- api_instance$RetrieveModel(var_model)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **character**| The ID of the model to use for this request | 

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

