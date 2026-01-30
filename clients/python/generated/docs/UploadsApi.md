# openapiopenai.UploadsApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_upload_part**](UploadsApi.md#add_upload_part) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[**cancel_upload**](UploadsApi.md#cancel_upload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[**complete_upload**](UploadsApi.md#complete_upload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[**create_upload**](UploadsApi.md#create_upload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 


# **add_upload_part**
> UploadPart add_upload_part(upload_id, data)

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.upload_part import UploadPart
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.UploadsApi(api_client)
    upload_id = 'upload_abc123' # str | The ID of the Upload. 
    data = None # bytearray | The chunk of bytes for this Part. 

    try:
        # Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
        api_response = api_instance.add_upload_part(upload_id, data)
        print("The response of UploadsApi->add_upload_part:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UploadsApi->add_upload_part: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id** | **str**| The ID of the Upload.  | 
 **data** | **bytearray**| The chunk of bytes for this Part.  | 

### Return type

[**UploadPart**](UploadPart.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_upload**
> Upload cancel_upload(upload_id)

Cancels the Upload. No Parts may be added after an Upload is cancelled. 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.upload import Upload
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.UploadsApi(api_client)
    upload_id = 'upload_abc123' # str | The ID of the Upload. 

    try:
        # Cancels the Upload. No Parts may be added after an Upload is cancelled. 
        api_response = api_instance.cancel_upload(upload_id)
        print("The response of UploadsApi->cancel_upload:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UploadsApi->cancel_upload: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id** | **str**| The ID of the Upload.  | 

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **complete_upload**
> Upload complete_upload(upload_id, complete_upload_request)

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.complete_upload_request import CompleteUploadRequest
from openapiopenai.models.upload import Upload
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.UploadsApi(api_client)
    upload_id = 'upload_abc123' # str | The ID of the Upload. 
    complete_upload_request = openapiopenai.CompleteUploadRequest() # CompleteUploadRequest | 

    try:
        # Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
        api_response = api_instance.complete_upload(upload_id, complete_upload_request)
        print("The response of UploadsApi->complete_upload:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UploadsApi->complete_upload: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id** | **str**| The ID of the Upload.  | 
 **complete_upload_request** | [**CompleteUploadRequest**](CompleteUploadRequest.md)|  | 

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_upload**
> Upload create_upload(create_upload_request)

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.create_upload_request import CreateUploadRequest
from openapiopenai.models.upload import Upload
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.UploadsApi(api_client)
    create_upload_request = openapiopenai.CreateUploadRequest() # CreateUploadRequest | 

    try:
        # Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 
        api_response = api_instance.create_upload(create_upload_request)
        print("The response of UploadsApi->create_upload:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UploadsApi->create_upload: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_upload_request** | [**CreateUploadRequest**](CreateUploadRequest.md)|  | 

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

