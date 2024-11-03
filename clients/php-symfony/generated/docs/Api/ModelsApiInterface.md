# OpenAPI\Server\Api\ModelsApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteModel**](ModelsApiInterface.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
[**listModels**](ModelsApiInterface.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveModel**](ModelsApiInterface.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ModelsApi:
        tags:
            - { name: "open_api_server.api", api: "models" }
    # ...
```

## **deleteModel**
> OpenAPI\Server\Model\DeleteModelResponse deleteModel($model)

Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ModelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ModelsApiInterface;

class ModelsApi implements ModelsApiInterface
{

    // ...

    /**
     * Implementation of ModelsApiInterface#deleteModel
     */
    public function deleteModel(string $model, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The model to delete |

### Return type

[**OpenAPI\Server\Model\DeleteModelResponse**](../Model/DeleteModelResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listModels**
> OpenAPI\Server\Model\ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ModelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ModelsApiInterface;

class ModelsApi implements ModelsApiInterface
{

    // ...

    /**
     * Implementation of ModelsApiInterface#listModels
     */
    public function listModels(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\ListModelsResponse**](../Model/ListModelsResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **retrieveModel**
> OpenAPI\Server\Model\Model retrieveModel($model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ModelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ModelsApiInterface;

class ModelsApi implements ModelsApiInterface
{

    // ...

    /**
     * Implementation of ModelsApiInterface#retrieveModel
     */
    public function retrieveModel(string $model, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **string**| The ID of the model to use for this request |

### Return type

[**OpenAPI\Server\Model\Model**](../Model/Model.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

