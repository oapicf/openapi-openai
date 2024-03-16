# Org.OpenAPITools.Api.OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelFineTune**](OpenAIApi.md#cancelfinetune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job.  |
| [**CreateChatCompletion**](OpenAIApi.md#createchatcompletion) | **POST** /chat/completions | Creates a model response for the given chat conversation. |
| [**CreateCompletion**](OpenAIApi.md#createcompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters. |
| [**CreateEdit**](OpenAIApi.md#createedit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters. |
| [**CreateEmbedding**](OpenAIApi.md#createembedding) | **POST** /embeddings | Creates an embedding vector representing the input text. |
| [**CreateFile**](OpenAIApi.md#createfile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit.  |
| [**CreateFineTune**](OpenAIApi.md#createfinetune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**CreateImage**](OpenAIApi.md#createimage) | **POST** /images/generations | Creates an image given a prompt. |
| [**CreateImageEdit**](OpenAIApi.md#createimageedit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt. |
| [**CreateImageVariation**](OpenAIApi.md#createimagevariation) | **POST** /images/variations | Creates a variation of a given image. |
| [**CreateModeration**](OpenAIApi.md#createmoderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy |
| [**CreateTranscription**](OpenAIApi.md#createtranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language. |
| [**CreateTranslation**](OpenAIApi.md#createtranslation) | **POST** /audio/translations | Translates audio into English. |
| [**DeleteFile**](OpenAIApi.md#deletefile) | **DELETE** /files/{file_id} | Delete a file. |
| [**DeleteModel**](OpenAIApi.md#deletemodel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization. |
| [**DownloadFile**](OpenAIApi.md#downloadfile) | **GET** /files/{file_id}/content | Returns the contents of the specified file |
| [**ListFiles**](OpenAIApi.md#listfiles) | **GET** /files | Returns a list of files that belong to the user&#39;s organization. |
| [**ListFineTuneEvents**](OpenAIApi.md#listfinetuneevents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job.  |
| [**ListFineTunes**](OpenAIApi.md#listfinetunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs  |
| [**ListModels**](OpenAIApi.md#listmodels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability. |
| [**RetrieveFile**](OpenAIApi.md#retrievefile) | **GET** /files/{file_id} | Returns information about a specific file. |
| [**RetrieveFineTune**](OpenAIApi.md#retrievefinetune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning)  |
| [**RetrieveModel**](OpenAIApi.md#retrievemodel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning. |

<a id="cancelfinetune"></a>
# **CancelFineTune**
> FineTune CancelFineTune (string fineTuneId)

Immediately cancel a fine-tune job. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CancelFineTuneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tune job to cancel 

            try
            {
                // Immediately cancel a fine-tune job. 
                FineTune result = apiInstance.CancelFineTune(fineTuneId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CancelFineTune: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CancelFineTuneWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Immediately cancel a fine-tune job. 
    ApiResponse<FineTune> response = apiInstance.CancelFineTuneWithHttpInfo(fineTuneId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CancelFineTuneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuneId** | **string** | The ID of the fine-tune job to cancel  |  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createchatcompletion"></a>
# **CreateChatCompletion**
> CreateChatCompletionResponse CreateChatCompletion (CreateChatCompletionRequest createChatCompletionRequest)

Creates a model response for the given chat conversation.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateChatCompletionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createChatCompletionRequest = new CreateChatCompletionRequest(); // CreateChatCompletionRequest | 

            try
            {
                // Creates a model response for the given chat conversation.
                CreateChatCompletionResponse result = apiInstance.CreateChatCompletion(createChatCompletionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateChatCompletion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateChatCompletionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a model response for the given chat conversation.
    ApiResponse<CreateChatCompletionResponse> response = apiInstance.CreateChatCompletionWithHttpInfo(createChatCompletionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateChatCompletionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createChatCompletionRequest** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md) |  |  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createcompletion"></a>
# **CreateCompletion**
> CreateCompletionResponse CreateCompletion (CreateCompletionRequest createCompletionRequest)

Creates a completion for the provided prompt and parameters.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateCompletionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createCompletionRequest = new CreateCompletionRequest(); // CreateCompletionRequest | 

            try
            {
                // Creates a completion for the provided prompt and parameters.
                CreateCompletionResponse result = apiInstance.CreateCompletion(createCompletionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateCompletion: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateCompletionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a completion for the provided prompt and parameters.
    ApiResponse<CreateCompletionResponse> response = apiInstance.CreateCompletionWithHttpInfo(createCompletionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateCompletionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md) |  |  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createedit"></a>
# **CreateEdit**
> CreateEditResponse CreateEdit (CreateEditRequest createEditRequest)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateEditExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createEditRequest = new CreateEditRequest(); // CreateEditRequest | 

            try
            {
                // Creates a new edit for the provided input, instruction, and parameters.
                CreateEditResponse result = apiInstance.CreateEdit(createEditRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateEdit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateEditWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a new edit for the provided input, instruction, and parameters.
    ApiResponse<CreateEditResponse> response = apiInstance.CreateEditWithHttpInfo(createEditRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateEditWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md) |  |  |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createembedding"></a>
# **CreateEmbedding**
> CreateEmbeddingResponse CreateEmbedding (CreateEmbeddingRequest createEmbeddingRequest)

Creates an embedding vector representing the input text.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateEmbeddingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createEmbeddingRequest = new CreateEmbeddingRequest(); // CreateEmbeddingRequest | 

            try
            {
                // Creates an embedding vector representing the input text.
                CreateEmbeddingResponse result = apiInstance.CreateEmbedding(createEmbeddingRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateEmbedding: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateEmbeddingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates an embedding vector representing the input text.
    ApiResponse<CreateEmbeddingResponse> response = apiInstance.CreateEmbeddingWithHttpInfo(createEmbeddingRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateEmbeddingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md) |  |  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createfile"></a>
# **CreateFile**
> OpenAIFile CreateFile (System.IO.Stream file, string purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateFileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
            var purpose = "purpose_example";  // string | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

            try
            {
                // Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
                OpenAIFile result = apiInstance.CreateFile(file, purpose);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateFile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateFileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
    ApiResponse<OpenAIFile> response = apiInstance.CreateFileWithHttpInfo(file, purpose);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateFileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **file** | **System.IO.Stream****System.IO.Stream** | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  |  |
| **purpose** | **string** | The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  |  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createfinetune"></a>
# **CreateFineTune**
> FineTune CreateFineTune (CreateFineTuneRequest createFineTuneRequest)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateFineTuneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createFineTuneRequest = new CreateFineTuneRequest(); // CreateFineTuneRequest | 

            try
            {
                // Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
                FineTune result = apiInstance.CreateFineTune(createFineTuneRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateFineTune: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateFineTuneWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    ApiResponse<FineTune> response = apiInstance.CreateFineTuneWithHttpInfo(createFineTuneRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateFineTuneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md) |  |  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createimage"></a>
# **CreateImage**
> ImagesResponse CreateImage (CreateImageRequest createImageRequest)

Creates an image given a prompt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateImageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createImageRequest = new CreateImageRequest(); // CreateImageRequest | 

            try
            {
                // Creates an image given a prompt.
                ImagesResponse result = apiInstance.CreateImage(createImageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateImage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateImageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates an image given a prompt.
    ApiResponse<ImagesResponse> response = apiInstance.CreateImageWithHttpInfo(createImageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateImageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md) |  |  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createimageedit"></a>
# **CreateImageEdit**
> ImagesResponse CreateImageEdit (System.IO.Stream image, string prompt, System.IO.Stream? mask = null, int? n = null, string? size = null, string? responseFormat = null, string? user = null)

Creates an edited or extended image given an original image and a prompt.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateImageEditExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var image = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
            var prompt = "prompt_example";  // string | A text description of the desired image(s). The maximum length is 1000 characters.
            var mask = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream? | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional) 
            var n = 1;  // int? | The number of images to generate. Must be between 1 and 10. (optional)  (default to 1)
            var size = "256x256";  // string? | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)  (default to 1024x1024)
            var responseFormat = "url";  // string? | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional)  (default to url)
            var user = "user_example";  // string? | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional) 

            try
            {
                // Creates an edited or extended image given an original image and a prompt.
                ImagesResponse result = apiInstance.CreateImageEdit(image, prompt, mask, n, size, responseFormat, user);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateImageEdit: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateImageEditWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates an edited or extended image given an original image and a prompt.
    ApiResponse<ImagesResponse> response = apiInstance.CreateImageEditWithHttpInfo(image, prompt, mask, n, size, responseFormat, user);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateImageEditWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **image** | **System.IO.Stream****System.IO.Stream** | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |  |
| **prompt** | **string** | A text description of the desired image(s). The maximum length is 1000 characters. |  |
| **mask** | **System.IO.Stream?****System.IO.Stream?** | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]  |
| **n** | **int?** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string?** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] |
| **responseFormat** | **string?** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] |
| **user** | **string?** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createimagevariation"></a>
# **CreateImageVariation**
> ImagesResponse CreateImageVariation (System.IO.Stream image, int? n = null, string? size = null, string? responseFormat = null, string? user = null)

Creates a variation of a given image.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateImageVariationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var image = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
            var n = 1;  // int? | The number of images to generate. Must be between 1 and 10. (optional)  (default to 1)
            var size = "256x256";  // string? | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)  (default to 1024x1024)
            var responseFormat = "url";  // string? | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional)  (default to url)
            var user = "user_example";  // string? | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional) 

            try
            {
                // Creates a variation of a given image.
                ImagesResponse result = apiInstance.CreateImageVariation(image, n, size, responseFormat, user);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateImageVariation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateImageVariationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Creates a variation of a given image.
    ApiResponse<ImagesResponse> response = apiInstance.CreateImageVariationWithHttpInfo(image, n, size, responseFormat, user);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateImageVariationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **image** | **System.IO.Stream****System.IO.Stream** | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |  |
| **n** | **int?** | The number of images to generate. Must be between 1 and 10. | [optional] [default to 1] |
| **size** | **string?** | The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] |
| **responseFormat** | **string?** | The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] |
| **user** | **string?** | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createmoderation"></a>
# **CreateModeration**
> CreateModerationResponse CreateModeration (CreateModerationRequest createModerationRequest)

Classifies if text violates OpenAI's Content Policy

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateModerationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var createModerationRequest = new CreateModerationRequest(); // CreateModerationRequest | 

            try
            {
                // Classifies if text violates OpenAI's Content Policy
                CreateModerationResponse result = apiInstance.CreateModeration(createModerationRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateModeration: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateModerationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Classifies if text violates OpenAI's Content Policy
    ApiResponse<CreateModerationResponse> response = apiInstance.CreateModerationWithHttpInfo(createModerationRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateModerationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md) |  |  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createtranscription"></a>
# **CreateTranscription**
> CreateTranscriptionResponse CreateTranscription (System.IO.Stream file, CreateTranscriptionRequestModel model, string? prompt = null, string? responseFormat = null, decimal? temperature = null, string? language = null)

Transcribes audio into the input language.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateTranscriptionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
            var model = new CreateTranscriptionRequestModel(); // CreateTranscriptionRequestModel | 
            var prompt = "prompt_example";  // string? | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional) 
            var responseFormat = "\"json\"";  // string? | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional)  (default to "json")
            var temperature = 0MD;  // decimal? | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)  (default to 0M)
            var language = "language_example";  // string? | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional) 

            try
            {
                // Transcribes audio into the input language.
                CreateTranscriptionResponse result = apiInstance.CreateTranscription(file, model, prompt, responseFormat, temperature, language);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateTranscription: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateTranscriptionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Transcribes audio into the input language.
    ApiResponse<CreateTranscriptionResponse> response = apiInstance.CreateTranscriptionWithHttpInfo(file, model, prompt, responseFormat, temperature, language);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateTranscriptionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **file** | **System.IO.Stream****System.IO.Stream** | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |  |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
| **prompt** | **string?** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional]  |
| **responseFormat** | **string?** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;] |
| **temperature** | **decimal?** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0M] |
| **language** | **string?** | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional]  |

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createtranslation"></a>
# **CreateTranslation**
> CreateTranslationResponse CreateTranslation (System.IO.Stream file, CreateTranscriptionRequestModel model, string? prompt = null, string? responseFormat = null, decimal? temperature = null)

Translates audio into English.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CreateTranslationExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
            var model = new CreateTranscriptionRequestModel(); // CreateTranscriptionRequestModel | 
            var prompt = "prompt_example";  // string? | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional) 
            var responseFormat = "\"json\"";  // string? | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional)  (default to "json")
            var temperature = 0MD;  // decimal? | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)  (default to 0M)

            try
            {
                // Translates audio into English.
                CreateTranslationResponse result = apiInstance.CreateTranslation(file, model, prompt, responseFormat, temperature);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.CreateTranslation: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateTranslationWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Translates audio into English.
    ApiResponse<CreateTranslationResponse> response = apiInstance.CreateTranslationWithHttpInfo(file, model, prompt, responseFormat, temperature);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.CreateTranslationWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **file** | **System.IO.Stream****System.IO.Stream** | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  |  |
| **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md) |  |  |
| **prompt** | **string?** | An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional]  |
| **responseFormat** | **string?** | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &quot;json&quot;] |
| **temperature** | **decimal?** | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0M] |

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletefile"></a>
# **DeleteFile**
> DeleteFileResponse DeleteFile (string fileId)

Delete a file.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteFileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var fileId = "fileId_example";  // string | The ID of the file to use for this request

            try
            {
                // Delete a file.
                DeleteFileResponse result = apiInstance.DeleteFile(fileId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.DeleteFile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteFileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a file.
    ApiResponse<DeleteFileResponse> response = apiInstance.DeleteFileWithHttpInfo(fileId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.DeleteFileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fileId** | **string** | The ID of the file to use for this request |  |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="deletemodel"></a>
# **DeleteModel**
> DeleteModelResponse DeleteModel (string model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DeleteModelExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var model = curie:ft-acmeco-2021-03-03-21-44-20;  // string | The model to delete

            try
            {
                // Delete a fine-tuned model. You must have the Owner role in your organization.
                DeleteModelResponse result = apiInstance.DeleteModel(model);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.DeleteModel: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DeleteModelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a fine-tuned model. You must have the Owner role in your organization.
    ApiResponse<DeleteModelResponse> response = apiInstance.DeleteModelWithHttpInfo(model);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.DeleteModelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **model** | **string** | The model to delete |  |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="downloadfile"></a>
# **DownloadFile**
> string DownloadFile (string fileId)

Returns the contents of the specified file

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class DownloadFileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var fileId = "fileId_example";  // string | The ID of the file to use for this request

            try
            {
                // Returns the contents of the specified file
                string result = apiInstance.DownloadFile(fileId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.DownloadFile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the DownloadFileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns the contents of the specified file
    ApiResponse<string> response = apiInstance.DownloadFileWithHttpInfo(fileId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.DownloadFileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fileId** | **string** | The ID of the file to use for this request |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listfiles"></a>
# **ListFiles**
> ListFilesResponse ListFiles ()

Returns a list of files that belong to the user's organization.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListFilesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);

            try
            {
                // Returns a list of files that belong to the user's organization.
                ListFilesResponse result = apiInstance.ListFiles();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.ListFiles: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListFilesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns a list of files that belong to the user's organization.
    ApiResponse<ListFilesResponse> response = apiInstance.ListFilesWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.ListFilesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listfinetuneevents"></a>
# **ListFineTuneEvents**
> ListFineTuneEventsResponse ListFineTuneEvents (string fineTuneId, bool? stream = null)

Get fine-grained status updates for a fine-tune job. 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListFineTuneEventsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tune job to get events for. 
            var stream = false;  // bool? | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional)  (default to false)

            try
            {
                // Get fine-grained status updates for a fine-tune job. 
                ListFineTuneEventsResponse result = apiInstance.ListFineTuneEvents(fineTuneId, stream);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.ListFineTuneEvents: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListFineTuneEventsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get fine-grained status updates for a fine-tune job. 
    ApiResponse<ListFineTuneEventsResponse> response = apiInstance.ListFineTuneEventsWithHttpInfo(fineTuneId, stream);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.ListFineTuneEventsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuneId** | **string** | The ID of the fine-tune job to get events for.  |  |
| **stream** | **bool?** | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false] |

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listfinetunes"></a>
# **ListFineTunes**
> ListFineTunesResponse ListFineTunes ()

List your organization's fine-tuning jobs 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListFineTunesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);

            try
            {
                // List your organization's fine-tuning jobs 
                ListFineTunesResponse result = apiInstance.ListFineTunes();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.ListFineTunes: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListFineTunesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List your organization's fine-tuning jobs 
    ApiResponse<ListFineTunesResponse> response = apiInstance.ListFineTunesWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.ListFineTunesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listmodels"></a>
# **ListModels**
> ListModelsResponse ListModels ()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListModelsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);

            try
            {
                // Lists the currently available models, and provides basic information about each one such as the owner and availability.
                ListModelsResponse result = apiInstance.ListModels();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.ListModels: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListModelsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Lists the currently available models, and provides basic information about each one such as the owner and availability.
    ApiResponse<ListModelsResponse> response = apiInstance.ListModelsWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.ListModelsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="retrievefile"></a>
# **RetrieveFile**
> OpenAIFile RetrieveFile (string fileId)

Returns information about a specific file.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RetrieveFileExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var fileId = "fileId_example";  // string | The ID of the file to use for this request

            try
            {
                // Returns information about a specific file.
                OpenAIFile result = apiInstance.RetrieveFile(fileId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.RetrieveFile: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RetrieveFileWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Returns information about a specific file.
    ApiResponse<OpenAIFile> response = apiInstance.RetrieveFileWithHttpInfo(fileId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.RetrieveFileWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fileId** | **string** | The ID of the file to use for this request |  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="retrievefinetune"></a>
# **RetrieveFineTune**
> FineTune RetrieveFineTune (string fineTuneId)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RetrieveFineTuneExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var fineTuneId = ft-AF1WoRqd3aJAHsqc9NY7iL8F;  // string | The ID of the fine-tune job 

            try
            {
                // Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
                FineTune result = apiInstance.RetrieveFineTune(fineTuneId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.RetrieveFineTune: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RetrieveFineTuneWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
    ApiResponse<FineTune> response = apiInstance.RetrieveFineTuneWithHttpInfo(fineTuneId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.RetrieveFineTuneWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **fineTuneId** | **string** | The ID of the fine-tune job  |  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="retrievemodel"></a>
# **RetrieveModel**
> Model RetrieveModel (string model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RetrieveModelExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.openai.com/v1";
            var apiInstance = new OpenAIApi(config);
            var model = text-davinci-001;  // string | The ID of the model to use for this request

            try
            {
                // Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
                Model result = apiInstance.RetrieveModel(model);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OpenAIApi.RetrieveModel: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RetrieveModelWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
    ApiResponse<Model> response = apiInstance.RetrieveModelWithHttpInfo(model);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OpenAIApi.RetrieveModelWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **model** | **string** | The ID of the model to use for this request |  |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

