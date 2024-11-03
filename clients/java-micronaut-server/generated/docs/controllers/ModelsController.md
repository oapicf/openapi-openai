# ModelsController

All URIs are relative to `"/v1"`

The controller class is defined in **[ModelsController.java](../../src/main/java/org/openapitools/controller/ModelsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**listModels**](#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveModel**](#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

<a id="deleteModel"></a>
# **deleteModel**
```java
Mono<DeleteModelResponse> ModelsController.deleteModel(model)
```

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**model** | `String` | The model to delete |

### Return type
[**DeleteModelResponse**](../../docs/models/DeleteModelResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="listModels"></a>
# **listModels**
```java
Mono<ListModelsResponse> ModelsController.listModels()
```

Lists the currently available models, and provides basic information about each one such as the owner and availability.


### Return type
[**ListModelsResponse**](../../docs/models/ListModelsResponse.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="retrieveModel"></a>
# **retrieveModel**
```java
Mono<Model> ModelsController.retrieveModel(model)
```

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**model** | `String` | The ID of the model to use for this request |

### Return type
[**Model**](../../docs/models/Model.md)

### Authorization
* **ApiKeyAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

