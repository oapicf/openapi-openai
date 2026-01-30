# OpenAPI\Server\Api\VectorStoresApiInterface

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVectorStoreFileBatch**](VectorStoresApiInterface.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**createVectorStore**](VectorStoresApiInterface.md#createVectorStore) | **POST** /vector_stores | Create a vector store.
[**createVectorStoreFile**](VectorStoresApiInterface.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**createVectorStoreFileBatch**](VectorStoresApiInterface.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**deleteVectorStore**](VectorStoresApiInterface.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**deleteVectorStoreFile**](VectorStoresApiInterface.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**getVectorStore**](VectorStoresApiInterface.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**getVectorStoreFile**](VectorStoresApiInterface.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**getVectorStoreFileBatch**](VectorStoresApiInterface.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**listFilesInVectorStoreBatch**](VectorStoresApiInterface.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**listVectorStoreFiles**](VectorStoresApiInterface.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**listVectorStores**](VectorStoresApiInterface.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**modifyVectorStore**](VectorStoresApiInterface.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\VectorStoresApi:
        tags:
            - { name: "open_api_server.api", api: "vectorStores" }
    # ...
```

## **cancelVectorStoreFileBatch**
> OpenAPI\Server\Model\VectorStoreFileBatchObject cancelVectorStoreFileBatch($vectorStoreId, $batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#cancelVectorStoreFileBatch
     */
    public function cancelVectorStoreFileBatch(string $vectorStoreId, string $batchId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store that the file batch belongs to. |
 **batchId** | **string**| The ID of the file batch to cancel. |

### Return type

[**OpenAPI\Server\Model\VectorStoreFileBatchObject**](../Model/VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createVectorStore**
> OpenAPI\Server\Model\VectorStoreObject createVectorStore($createVectorStoreRequest)

Create a vector store.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#createVectorStore
     */
    public function createVectorStore(CreateVectorStoreRequest $createVectorStoreRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createVectorStoreRequest** | [**OpenAPI\Server\Model\CreateVectorStoreRequest**](../Model/CreateVectorStoreRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\VectorStoreObject**](../Model/VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createVectorStoreFile**
> OpenAPI\Server\Model\VectorStoreFileObject createVectorStoreFile($vectorStoreId, $createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#createVectorStoreFile
     */
    public function createVectorStoreFile(string $vectorStoreId, CreateVectorStoreFileRequest $createVectorStoreFileRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store for which to create a File. |
 **createVectorStoreFileRequest** | [**OpenAPI\Server\Model\CreateVectorStoreFileRequest**](../Model/CreateVectorStoreFileRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\VectorStoreFileObject**](../Model/VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **createVectorStoreFileBatch**
> OpenAPI\Server\Model\VectorStoreFileBatchObject createVectorStoreFileBatch($vectorStoreId, $createVectorStoreFileBatchRequest)

Create a vector store file batch.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#createVectorStoreFileBatch
     */
    public function createVectorStoreFileBatch(string $vectorStoreId, CreateVectorStoreFileBatchRequest $createVectorStoreFileBatchRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store for which to create a File Batch. |
 **createVectorStoreFileBatchRequest** | [**OpenAPI\Server\Model\CreateVectorStoreFileBatchRequest**](../Model/CreateVectorStoreFileBatchRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\VectorStoreFileBatchObject**](../Model/VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteVectorStore**
> OpenAPI\Server\Model\DeleteVectorStoreResponse deleteVectorStore($vectorStoreId)

Delete a vector store.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#deleteVectorStore
     */
    public function deleteVectorStore(string $vectorStoreId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store to delete. |

### Return type

[**OpenAPI\Server\Model\DeleteVectorStoreResponse**](../Model/DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteVectorStoreFile**
> OpenAPI\Server\Model\DeleteVectorStoreFileResponse deleteVectorStoreFile($vectorStoreId, $fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#deleteVectorStoreFile
     */
    public function deleteVectorStoreFile(string $vectorStoreId, string $fileId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store that the file belongs to. |
 **fileId** | **string**| The ID of the file to delete. |

### Return type

[**OpenAPI\Server\Model\DeleteVectorStoreFileResponse**](../Model/DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVectorStore**
> OpenAPI\Server\Model\VectorStoreObject getVectorStore($vectorStoreId)

Retrieves a vector store.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#getVectorStore
     */
    public function getVectorStore(string $vectorStoreId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store to retrieve. |

### Return type

[**OpenAPI\Server\Model\VectorStoreObject**](../Model/VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVectorStoreFile**
> OpenAPI\Server\Model\VectorStoreFileObject getVectorStoreFile($vectorStoreId, $fileId)

Retrieves a vector store file.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#getVectorStoreFile
     */
    public function getVectorStoreFile(string $vectorStoreId, string $fileId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store that the file belongs to. |
 **fileId** | **string**| The ID of the file being retrieved. |

### Return type

[**OpenAPI\Server\Model\VectorStoreFileObject**](../Model/VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getVectorStoreFileBatch**
> OpenAPI\Server\Model\VectorStoreFileBatchObject getVectorStoreFileBatch($vectorStoreId, $batchId)

Retrieves a vector store file batch.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#getVectorStoreFileBatch
     */
    public function getVectorStoreFileBatch(string $vectorStoreId, string $batchId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store that the file batch belongs to. |
 **batchId** | **string**| The ID of the file batch being retrieved. |

### Return type

[**OpenAPI\Server\Model\VectorStoreFileBatchObject**](../Model/VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listFilesInVectorStoreBatch**
> OpenAPI\Server\Model\ListVectorStoreFilesResponse listFilesInVectorStoreBatch($vectorStoreId, $batchId, $limit, $order, $after, $before, $filter)

Returns a list of vector store files in a batch.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#listFilesInVectorStoreBatch
     */
    public function listFilesInVectorStoreBatch(string $vectorStoreId, string $batchId, int $limit, string $order, ?string $after, ?string $before, ?string $filter, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store that the files belong to. |
 **batchId** | **string**| The ID of the file batch that the files belong to. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]
 **filter** | **string**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional]

### Return type

[**OpenAPI\Server\Model\ListVectorStoreFilesResponse**](../Model/ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listVectorStoreFiles**
> OpenAPI\Server\Model\ListVectorStoreFilesResponse listVectorStoreFiles($vectorStoreId, $limit, $order, $after, $before, $filter)

Returns a list of vector store files.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#listVectorStoreFiles
     */
    public function listVectorStoreFiles(string $vectorStoreId, int $limit, string $order, ?string $after, ?string $before, ?string $filter, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store that the files belong to. |
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]
 **filter** | **string**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional]

### Return type

[**OpenAPI\Server\Model\ListVectorStoreFilesResponse**](../Model/ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **listVectorStores**
> OpenAPI\Server\Model\ListVectorStoresResponse listVectorStores($limit, $order, $after, $before)

Returns a list of vector stores.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#listVectorStores
     */
    public function listVectorStores(int $limit, string $order, ?string $after, ?string $before, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional]
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. | [optional]

### Return type

[**OpenAPI\Server\Model\ListVectorStoresResponse**](../Model/ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **modifyVectorStore**
> OpenAPI\Server\Model\VectorStoreObject modifyVectorStore($vectorStoreId, $updateVectorStoreRequest)

Modifies a vector store.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/VectorStoresApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\VectorStoresApiInterface;

class VectorStoresApi implements VectorStoresApiInterface
{

    // ...

    /**
     * Implementation of VectorStoresApiInterface#modifyVectorStore
     */
    public function modifyVectorStore(string $vectorStoreId, UpdateVectorStoreRequest $updateVectorStoreRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vectorStoreId** | **string**| The ID of the vector store to modify. |
 **updateVectorStoreRequest** | [**OpenAPI\Server\Model\UpdateVectorStoreRequest**](../Model/UpdateVectorStoreRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\VectorStoreObject**](../Model/VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

