# VectorStoresApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelVectorStoreFileBatch**](VectorStoresApi.md#cancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible. |
| [**createVectorStore**](VectorStoresApi.md#createVectorStore) | **POST** /vector_stores | Create a vector store. |
| [**createVectorStoreFile**](VectorStoresApi.md#createVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object). |
| [**createVectorStoreFileBatch**](VectorStoresApi.md#createVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch. |
| [**deleteVectorStore**](VectorStoresApi.md#deleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store. |
| [**deleteVectorStoreFile**](VectorStoresApi.md#deleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint. |
| [**getVectorStore**](VectorStoresApi.md#getVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store. |
| [**getVectorStoreFile**](VectorStoresApi.md#getVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file. |
| [**getVectorStoreFileBatch**](VectorStoresApi.md#getVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch. |
| [**listFilesInVectorStoreBatch**](VectorStoresApi.md#listFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch. |
| [**listVectorStoreFiles**](VectorStoresApi.md#listVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files. |
| [**listVectorStores**](VectorStoresApi.md#listVectorStores) | **GET** /vector_stores | Returns a list of vector stores. |
| [**modifyVectorStore**](VectorStoresApi.md#modifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store. |


<a id="cancelVectorStoreFileBatch"></a>
# **cancelVectorStoreFileBatch**
> VectorStoreFileBatchObject cancelVectorStoreFileBatch(vectorStoreId, batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store that the file batch belongs to.
    String batchId = "batchId_example"; // String | The ID of the file batch to cancel.
    try {
      VectorStoreFileBatchObject result = apiInstance.cancelVectorStoreFileBatch(vectorStoreId, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#cancelVectorStoreFileBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. | |
| **batchId** | **String**| The ID of the file batch to cancel. | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createVectorStore"></a>
# **createVectorStore**
> VectorStoreObject createVectorStore(createVectorStoreRequest)

Create a vector store.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    CreateVectorStoreRequest createVectorStoreRequest = new CreateVectorStoreRequest(); // CreateVectorStoreRequest | 
    try {
      VectorStoreObject result = apiInstance.createVectorStore(createVectorStoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#createVectorStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createVectorStoreRequest** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createVectorStoreFile"></a>
# **createVectorStoreFile**
> VectorStoreFileObject createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vs_abc123"; // String | The ID of the vector store for which to create a File. 
    CreateVectorStoreFileRequest createVectorStoreFileRequest = new CreateVectorStoreFileRequest(); // CreateVectorStoreFileRequest | 
    try {
      VectorStoreFileObject result = apiInstance.createVectorStoreFile(vectorStoreId, createVectorStoreFileRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#createVectorStoreFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store for which to create a File.  | |
| **createVectorStoreFileRequest** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  | |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createVectorStoreFileBatch"></a>
# **createVectorStoreFileBatch**
> VectorStoreFileBatchObject createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)

Create a vector store file batch.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vs_abc123"; // String | The ID of the vector store for which to create a File Batch. 
    CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = new CreateVectorStoreFileBatchRequest(); // CreateVectorStoreFileBatchRequest | 
    try {
      VectorStoreFileBatchObject result = apiInstance.createVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#createVectorStoreFileBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store for which to create a File Batch.  | |
| **createVectorStoreFileBatchRequest** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteVectorStore"></a>
# **deleteVectorStore**
> DeleteVectorStoreResponse deleteVectorStore(vectorStoreId)

Delete a vector store.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store to delete.
    try {
      DeleteVectorStoreResponse result = apiInstance.deleteVectorStore(vectorStoreId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#deleteVectorStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store to delete. | |

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteVectorStoreFile"></a>
# **deleteVectorStoreFile**
> DeleteVectorStoreFileResponse deleteVectorStoreFile(vectorStoreId, fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store that the file belongs to.
    String fileId = "fileId_example"; // String | The ID of the file to delete.
    try {
      DeleteVectorStoreFileResponse result = apiInstance.deleteVectorStoreFile(vectorStoreId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#deleteVectorStoreFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store that the file belongs to. | |
| **fileId** | **String**| The ID of the file to delete. | |

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getVectorStore"></a>
# **getVectorStore**
> VectorStoreObject getVectorStore(vectorStoreId)

Retrieves a vector store.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store to retrieve.
    try {
      VectorStoreObject result = apiInstance.getVectorStore(vectorStoreId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#getVectorStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store to retrieve. | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getVectorStoreFile"></a>
# **getVectorStoreFile**
> VectorStoreFileObject getVectorStoreFile(vectorStoreId, fileId)

Retrieves a vector store file.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vs_abc123"; // String | The ID of the vector store that the file belongs to.
    String fileId = "file-abc123"; // String | The ID of the file being retrieved.
    try {
      VectorStoreFileObject result = apiInstance.getVectorStoreFile(vectorStoreId, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#getVectorStoreFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store that the file belongs to. | |
| **fileId** | **String**| The ID of the file being retrieved. | |

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getVectorStoreFileBatch"></a>
# **getVectorStoreFileBatch**
> VectorStoreFileBatchObject getVectorStoreFileBatch(vectorStoreId, batchId)

Retrieves a vector store file batch.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vs_abc123"; // String | The ID of the vector store that the file batch belongs to.
    String batchId = "vsfb_abc123"; // String | The ID of the file batch being retrieved.
    try {
      VectorStoreFileBatchObject result = apiInstance.getVectorStoreFileBatch(vectorStoreId, batchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#getVectorStoreFileBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store that the file batch belongs to. | |
| **batchId** | **String**| The ID of the file batch being retrieved. | |

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listFilesInVectorStoreBatch"></a>
# **listFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)

Returns a list of vector store files in a batch.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store that the files belong to.
    String batchId = "batchId_example"; // String | The ID of the file batch that the files belong to.
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String order = "asc"; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    String before = "before_example"; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    String filter = "in_progress"; // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
    try {
      ListVectorStoreFilesResponse result = apiInstance.listFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#listFilesInVectorStoreBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store that the files belong to. | |
| **batchId** | **String**| The ID of the file batch that the files belong to. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |
| **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listVectorStoreFiles"></a>
# **listVectorStoreFiles**
> ListVectorStoreFilesResponse listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)

Returns a list of vector store files.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store that the files belong to.
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String order = "asc"; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    String before = "before_example"; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    String filter = "in_progress"; // String | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
    try {
      ListVectorStoreFilesResponse result = apiInstance.listVectorStoreFiles(vectorStoreId, limit, order, after, before, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#listVectorStoreFiles");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store that the files belong to. | |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |
| **filter** | **String**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] [enum: in_progress, completed, failed, cancelled] |

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listVectorStores"></a>
# **listVectorStores**
> ListVectorStoresResponse listVectorStores(limit, order, after, before)

Returns a list of vector stores.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    Integer limit = 20; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    String order = "asc"; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    String before = "before_example"; // String | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    try {
      ListVectorStoresResponse result = apiInstance.listVectorStores(limit, order, after, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#listVectorStores");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |
| **before** | **String**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] |

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="modifyVectorStore"></a>
# **modifyVectorStore**
> VectorStoreObject modifyVectorStore(vectorStoreId, updateVectorStoreRequest)

Modifies a vector store.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.VectorStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    VectorStoresApi apiInstance = new VectorStoresApi(defaultClient);
    String vectorStoreId = "vectorStoreId_example"; // String | The ID of the vector store to modify.
    UpdateVectorStoreRequest updateVectorStoreRequest = new UpdateVectorStoreRequest(); // UpdateVectorStoreRequest | 
    try {
      VectorStoreObject result = apiInstance.modifyVectorStore(vectorStoreId, updateVectorStoreRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VectorStoresApi#modifyVectorStore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **vectorStoreId** | **String**| The ID of the vector store to modify. | |
| **updateVectorStoreRequest** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  | |

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

