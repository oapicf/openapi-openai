# FilesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFile**](FilesApi.md#createFile) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits.  |
| [**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file. |
| [**downloadFile**](FilesApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file. |
| [**listFiles**](FilesApi.md#listFiles) | **GET** /files | Returns a list of files. |
| [**retrieveFile**](FilesApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file. |


<a id="createFile"></a>
# **createFile**
> OpenAIFile createFile(_file, purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    File _file = new File("/path/to/file"); // File | The File object (not file name) to be uploaded. 
    String purpose = "assistants"; // String | The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 
    try {
      OpenAIFile result = apiInstance.createFile(_file, purpose);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#createFile");
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
| **_file** | **File**| The File object (not file name) to be uploaded.  | |
| **purpose** | **String**| The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | [enum: assistants, batch, fine-tune, vision] |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "fileId_example"; // String | The ID of the file to use for this request.
    try {
      DeleteFileResponse result = apiInstance.deleteFile(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#deleteFile");
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
| **fileId** | **String**| The ID of the file to use for this request. | |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadFile"></a>
# **downloadFile**
> String downloadFile(fileId)

Returns the contents of the specified file.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "fileId_example"; // String | The ID of the file to use for this request.
    try {
      String result = apiInstance.downloadFile(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#downloadFile");
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
| **fileId** | **String**| The ID of the file to use for this request. | |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles(purpose, limit, order, after)

Returns a list of files.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String purpose = "purpose_example"; // String | Only return files with the given purpose.
    Integer limit = 10000; // Integer | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
    String order = "asc"; // String | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    String after = "after_example"; // String | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    try {
      ListFilesResponse result = apiInstance.listFiles(purpose, limit, order, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#listFiles");
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
| **purpose** | **String**| Only return files with the given purpose. | [optional] |
| **limit** | **Integer**| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional] [default to 10000] |
| **order** | **String**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to desc] [enum: asc, desc] |
| **after** | **String**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] |

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example
```java
// Import classes:
import com.github.oapicf.openapiopenai.ApiClient;
import com.github.oapicf.openapiopenai.ApiException;
import com.github.oapicf.openapiopenai.Configuration;
import com.github.oapicf.openapiopenai.auth.*;
import com.github.oapicf.openapiopenai.models.*;
import com.github.oapicf.openapiopenai.api.FilesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.openai.com/v1");
    
    // Configure HTTP bearer authorization: ApiKeyAuth
    HttpBearerAuth ApiKeyAuth = (HttpBearerAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setBearerToken("BEARER TOKEN");

    FilesApi apiInstance = new FilesApi(defaultClient);
    String fileId = "fileId_example"; // String | The ID of the file to use for this request.
    try {
      OpenAIFile result = apiInstance.retrieveFile(fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FilesApi#retrieveFile");
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
| **fileId** | **String**| The ID of the file to use for this request. | |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

