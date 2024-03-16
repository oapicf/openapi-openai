# openapiopenai.OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tune**](OpenAIApi.md#cancel_fine_tune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**create_chat_completion**](OpenAIApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation.
[**create_completion**](OpenAIApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.
[**create_edit**](OpenAIApi.md#create_edit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**create_embedding**](OpenAIApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**create_file**](OpenAIApi.md#create_file) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**create_fine_tune**](OpenAIApi.md#create_fine_tune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**create_image**](OpenAIApi.md#create_image) | **POST** /images/generations | Creates an image given a prompt.
[**create_image_edit**](OpenAIApi.md#create_image_edit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**create_image_variation**](OpenAIApi.md#create_image_variation) | **POST** /images/variations | Creates a variation of a given image.
[**create_moderation**](OpenAIApi.md#create_moderation) | **POST** /moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**create_transcription**](OpenAIApi.md#create_transcription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**create_translation**](OpenAIApi.md#create_translation) | **POST** /audio/translations | Translates audio into English.
[**delete_file**](OpenAIApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
[**delete_model**](OpenAIApi.md#delete_model) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**download_file**](OpenAIApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**list_files**](OpenAIApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**list_fine_tune_events**](OpenAIApi.md#list_fine_tune_events) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**list_fine_tunes**](OpenAIApi.md#list_fine_tunes) | **GET** /fine-tunes | List your organization&#39;s fine-tuning jobs 
[**list_models**](OpenAIApi.md#list_models) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieve_file**](OpenAIApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieve_fine_tune**](OpenAIApi.md#retrieve_fine_tune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieve_model**](OpenAIApi.md#retrieve_model) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


# **cancel_fine_tune**
> FineTune cancel_fine_tune(fine_tune_id)

Immediately cancel a fine-tune job. 

### Example


```python
import openapiopenai
from openapiopenai.models.fine_tune import FineTune
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tune job to cancel 

    try:
        # Immediately cancel a fine-tune job. 
        api_response = api_instance.cancel_fine_tune(fine_tune_id)
        print("The response of OpenAIApi->cancel_fine_tune:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->cancel_fine_tune: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **str**| The ID of the fine-tune job to cancel  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_chat_completion**
> CreateChatCompletionResponse create_chat_completion(create_chat_completion_request)

Creates a model response for the given chat conversation.

### Example


```python
import openapiopenai
from openapiopenai.models.create_chat_completion_request import CreateChatCompletionRequest
from openapiopenai.models.create_chat_completion_response import CreateChatCompletionResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_chat_completion_request = openapiopenai.CreateChatCompletionRequest() # CreateChatCompletionRequest | 

    try:
        # Creates a model response for the given chat conversation.
        api_response = api_instance.create_chat_completion(create_chat_completion_request)
        print("The response of OpenAIApi->create_chat_completion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_chat_completion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_completion**
> CreateCompletionResponse create_completion(create_completion_request)

Creates a completion for the provided prompt and parameters.

### Example


```python
import openapiopenai
from openapiopenai.models.create_completion_request import CreateCompletionRequest
from openapiopenai.models.create_completion_response import CreateCompletionResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_completion_request = openapiopenai.CreateCompletionRequest() # CreateCompletionRequest | 

    try:
        # Creates a completion for the provided prompt and parameters.
        api_response = api_instance.create_completion(create_completion_request)
        print("The response of OpenAIApi->create_completion:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_completion: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_edit**
> CreateEditResponse create_edit(create_edit_request)

Creates a new edit for the provided input, instruction, and parameters.

### Example


```python
import openapiopenai
from openapiopenai.models.create_edit_request import CreateEditRequest
from openapiopenai.models.create_edit_response import CreateEditResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_edit_request = openapiopenai.CreateEditRequest() # CreateEditRequest | 

    try:
        # Creates a new edit for the provided input, instruction, and parameters.
        api_response = api_instance.create_edit(create_edit_request)
        print("The response of OpenAIApi->create_edit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_edit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_edit_request** | [**CreateEditRequest**](CreateEditRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_embedding**
> CreateEmbeddingResponse create_embedding(create_embedding_request)

Creates an embedding vector representing the input text.

### Example


```python
import openapiopenai
from openapiopenai.models.create_embedding_request import CreateEmbeddingRequest
from openapiopenai.models.create_embedding_response import CreateEmbeddingResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_embedding_request = openapiopenai.CreateEmbeddingRequest() # CreateEmbeddingRequest | 

    try:
        # Creates an embedding vector representing the input text.
        api_response = api_instance.create_embedding(create_embedding_request)
        print("The response of OpenAIApi->create_embedding:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_embedding: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_file**
> OpenAIFile create_file(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example


```python
import openapiopenai
from openapiopenai.models.open_ai_file import OpenAIFile
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    file = None # bytearray | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
    purpose = 'purpose_example' # str | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

    try:
        # Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
        api_response = api_instance.create_file(file, purpose)
        print("The response of OpenAIApi->create_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **bytearray**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  | 
 **purpose** | **str**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fine_tune**
> FineTune create_fine_tune(create_fine_tune_request)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example


```python
import openapiopenai
from openapiopenai.models.create_fine_tune_request import CreateFineTuneRequest
from openapiopenai.models.fine_tune import FineTune
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_fine_tune_request = openapiopenai.CreateFineTuneRequest() # CreateFineTuneRequest | 

    try:
        # Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
        api_response = api_instance.create_fine_tune(create_fine_tune_request)
        print("The response of OpenAIApi->create_fine_tune:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_fine_tune: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tune_request** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image**
> ImagesResponse create_image(create_image_request)

Creates an image given a prompt.

### Example


```python
import openapiopenai
from openapiopenai.models.create_image_request import CreateImageRequest
from openapiopenai.models.images_response import ImagesResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_image_request = openapiopenai.CreateImageRequest() # CreateImageRequest | 

    try:
        # Creates an image given a prompt.
        api_response = api_instance.create_image(create_image_request)
        print("The response of OpenAIApi->create_image:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_image: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_image_request** | [**CreateImageRequest**](CreateImageRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_edit**
> ImagesResponse create_image_edit(image, prompt, mask=mask, n=n, size=size, response_format=response_format, user=user)

Creates an edited or extended image given an original image and a prompt.

### Example


```python
import openapiopenai
from openapiopenai.models.images_response import ImagesResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    image = None # bytearray | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    prompt = 'prompt_example' # str | A text description of the desired image(s). The maximum length is 1000 characters.
    mask = None # bytearray | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
    n = 1 # int | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
    size = '1024x1024' # str | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to '1024x1024')
    response_format = 'url' # str | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to 'url')
    user = 'user_example' # str | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

    try:
        # Creates an edited or extended image given an original image and a prompt.
        api_response = api_instance.create_image_edit(image, prompt, mask=mask, n=n, size=size, response_format=response_format, user=user)
        print("The response of OpenAIApi->create_image_edit:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_image_edit: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **bytearray**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. | 
 **prompt** | **str**| A text description of the desired image(s). The maximum length is 1000 characters. | 
 **mask** | **bytearray**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional] 
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **str**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **response_format** | **str**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **str**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_image_variation**
> ImagesResponse create_image_variation(image, n=n, size=size, response_format=response_format, user=user)

Creates a variation of a given image.

### Example


```python
import openapiopenai
from openapiopenai.models.images_response import ImagesResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    image = None # bytearray | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    n = 1 # int | The number of images to generate. Must be between 1 and 10. (optional) (default to 1)
    size = '1024x1024' # str | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional) (default to '1024x1024')
    response_format = 'url' # str | The format in which the generated images are returned. Must be one of `url` or `b64_json`. (optional) (default to 'url')
    user = 'user_example' # str | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)

    try:
        # Creates a variation of a given image.
        api_response = api_instance.create_image_variation(image, n=n, size=size, response_format=response_format, user=user)
        print("The response of OpenAIApi->create_image_variation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_image_variation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **bytearray**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. | 
 **n** | **int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **str**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to &#39;1024x1024&#39;]
 **response_format** | **str**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to &#39;url&#39;]
 **user** | **str**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional] 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_moderation**
> CreateModerationResponse create_moderation(create_moderation_request)

Classifies if text violates OpenAI's Content Policy

### Example


```python
import openapiopenai
from openapiopenai.models.create_moderation_request import CreateModerationRequest
from openapiopenai.models.create_moderation_response import CreateModerationResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    create_moderation_request = openapiopenai.CreateModerationRequest() # CreateModerationRequest | 

    try:
        # Classifies if text violates OpenAI's Content Policy
        api_response = api_instance.create_moderation(create_moderation_request)
        print("The response of OpenAIApi->create_moderation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_moderation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_transcription**
> CreateTranscriptionResponse create_transcription(file, model, prompt=prompt, response_format=response_format, temperature=temperature, language=language)

Transcribes audio into the input language.

### Example


```python
import openapiopenai
from openapiopenai.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapiopenai.models.create_transcription_response import CreateTranscriptionResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    file = None # bytearray | The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
    model = openapiopenai.CreateTranscriptionRequestModel() # CreateTranscriptionRequestModel | 
    prompt = 'prompt_example' # str | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
    response_format = 'json' # str | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to 'json')
    temperature = 0 # float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)
    language = 'language_example' # str | The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)

    try:
        # Transcribes audio into the input language.
        api_response = api_instance.create_transcription(file, model, prompt=prompt, response_format=response_format, temperature=temperature, language=language)
        print("The response of OpenAIApi->create_transcription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_transcription: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **bytearray**| The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **str**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  | [optional] 
 **response_format** | **str**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
 **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]
 **language** | **str**| The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  | [optional] 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_translation**
> CreateTranslationResponse create_translation(file, model, prompt=prompt, response_format=response_format, temperature=temperature)

Translates audio into English.

### Example


```python
import openapiopenai
from openapiopenai.models.create_transcription_request_model import CreateTranscriptionRequestModel
from openapiopenai.models.create_translation_response import CreateTranslationResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    file = None # bytearray | The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
    model = openapiopenai.CreateTranscriptionRequestModel() # CreateTranscriptionRequestModel | 
    prompt = 'prompt_example' # str | An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
    response_format = 'json' # str | The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  (optional) (default to 'json')
    temperature = 0 # float | The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional) (default to 0)

    try:
        # Translates audio into English.
        api_response = api_instance.create_translation(file, model, prompt=prompt, response_format=response_format, temperature=temperature)
        print("The response of OpenAIApi->create_translation:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->create_translation: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **bytearray**| The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm.  | 
 **model** | [**CreateTranscriptionRequestModel**](CreateTranscriptionRequestModel.md)|  | 
 **prompt** | **str**| An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  | [optional] 
 **response_format** | **str**| The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt.  | [optional] [default to &#39;json&#39;]
 **temperature** | **float**| The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  | [optional] [default to 0]

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_file**
> DeleteFileResponse delete_file(file_id)

Delete a file.

### Example


```python
import openapiopenai
from openapiopenai.models.delete_file_response import DeleteFileResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    file_id = 'file_id_example' # str | The ID of the file to use for this request

    try:
        # Delete a file.
        api_response = api_instance.delete_file(file_id)
        print("The response of OpenAIApi->delete_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->delete_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **str**| The ID of the file to use for this request | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_model**
> DeleteModelResponse delete_model(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example


```python
import openapiopenai
from openapiopenai.models.delete_model_response import DeleteModelResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    model = 'curie:ft-acmeco-2021-03-03-21-44-20' # str | The model to delete

    try:
        # Delete a fine-tuned model. You must have the Owner role in your organization.
        api_response = api_instance.delete_model(model)
        print("The response of OpenAIApi->delete_model:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->delete_model: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **str**| The model to delete | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_file**
> str download_file(file_id)

Returns the contents of the specified file

### Example


```python
import openapiopenai
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    file_id = 'file_id_example' # str | The ID of the file to use for this request

    try:
        # Returns the contents of the specified file
        api_response = api_instance.download_file(file_id)
        print("The response of OpenAIApi->download_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->download_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **str**| The ID of the file to use for this request | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_files**
> ListFilesResponse list_files()

Returns a list of files that belong to the user's organization.

### Example


```python
import openapiopenai
from openapiopenai.models.list_files_response import ListFilesResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)

    try:
        # Returns a list of files that belong to the user's organization.
        api_response = api_instance.list_files()
        print("The response of OpenAIApi->list_files:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->list_files: %s\n" % e)
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tune_events**
> ListFineTuneEventsResponse list_fine_tune_events(fine_tune_id, stream=stream)

Get fine-grained status updates for a fine-tune job. 

### Example


```python
import openapiopenai
from openapiopenai.models.list_fine_tune_events_response import ListFineTuneEventsResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tune job to get events for. 
    stream = False # bool | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional) (default to False)

    try:
        # Get fine-grained status updates for a fine-tune job. 
        api_response = api_instance.list_fine_tune_events(fine_tune_id, stream=stream)
        print("The response of OpenAIApi->list_fine_tune_events:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->list_fine_tune_events: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **str**| The ID of the fine-tune job to get events for.  | 
 **stream** | **bool**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to False]

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tunes**
> ListFineTunesResponse list_fine_tunes()

List your organization's fine-tuning jobs 

### Example


```python
import openapiopenai
from openapiopenai.models.list_fine_tunes_response import ListFineTunesResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)

    try:
        # List your organization's fine-tuning jobs 
        api_response = api_instance.list_fine_tunes()
        print("The response of OpenAIApi->list_fine_tunes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->list_fine_tunes: %s\n" % e)
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_models**
> ListModelsResponse list_models()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example


```python
import openapiopenai
from openapiopenai.models.list_models_response import ListModelsResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)

    try:
        # Lists the currently available models, and provides basic information about each one such as the owner and availability.
        api_response = api_instance.list_models()
        print("The response of OpenAIApi->list_models:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->list_models: %s\n" % e)
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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_file**
> OpenAIFile retrieve_file(file_id)

Returns information about a specific file.

### Example


```python
import openapiopenai
from openapiopenai.models.open_ai_file import OpenAIFile
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    file_id = 'file_id_example' # str | The ID of the file to use for this request

    try:
        # Returns information about a specific file.
        api_response = api_instance.retrieve_file(file_id)
        print("The response of OpenAIApi->retrieve_file:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->retrieve_file: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **str**| The ID of the file to use for this request | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_fine_tune**
> FineTune retrieve_fine_tune(fine_tune_id)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example


```python
import openapiopenai
from openapiopenai.models.fine_tune import FineTune
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    fine_tune_id = 'ft-AF1WoRqd3aJAHsqc9NY7iL8F' # str | The ID of the fine-tune job 

    try:
        # Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
        api_response = api_instance.retrieve_fine_tune(fine_tune_id)
        print("The response of OpenAIApi->retrieve_fine_tune:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->retrieve_fine_tune: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tune_id** | **str**| The ID of the fine-tune job  | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_model**
> Model retrieve_model(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example


```python
import openapiopenai
from openapiopenai.models.model import Model
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)


# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.OpenAIApi(api_client)
    model = 'text-davinci-001' # str | The ID of the model to use for this request

    try:
        # Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
        api_response = api_instance.retrieve_model(model)
        print("The response of OpenAIApi->retrieve_model:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling OpenAIApi->retrieve_model: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **str**| The ID of the model to use for this request | 

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
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

