# openapiopenai.DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](DefaultApi.md#admin_api_keys_create) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**admin_api_keys_delete**](DefaultApi.md#admin_api_keys_delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**admin_api_keys_get**](DefaultApi.md#admin_api_keys_get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**admin_api_keys_list**](DefaultApi.md#admin_api_keys_list) | **GET** /organization/admin_api_keys | List organization API keys


# **admin_api_keys_create**
> AdminApiKey admin_api_keys_create(admin_api_keys_create_request)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.admin_api_key import AdminApiKey
from openapiopenai.models.admin_api_keys_create_request import AdminApiKeysCreateRequest
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
    api_instance = openapiopenai.DefaultApi(api_client)
    admin_api_keys_create_request = openapiopenai.AdminApiKeysCreateRequest() # AdminApiKeysCreateRequest | 

    try:
        # Create an organization admin API key
        api_response = api_instance.admin_api_keys_create(admin_api_keys_create_request)
        print("The response of DefaultApi->admin_api_keys_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->admin_api_keys_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **admin_api_keys_create_request** | [**AdminApiKeysCreateRequest**](AdminApiKeysCreateRequest.md)|  | 

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The newly created admin API key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_delete**
> AdminApiKeysDelete200Response admin_api_keys_delete(key_id)

Delete an organization admin API key

Delete the specified admin API key.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.admin_api_keys_delete200_response import AdminApiKeysDelete200Response
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
    api_instance = openapiopenai.DefaultApi(api_client)
    key_id = 'key_id_example' # str | 

    try:
        # Delete an organization admin API key
        api_response = api_instance.admin_api_keys_delete(key_id)
        print("The response of DefaultApi->admin_api_keys_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->admin_api_keys_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **str**|  | 

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Confirmation that the API key was deleted. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_get**
> AdminApiKey admin_api_keys_get(key_id)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.admin_api_key import AdminApiKey
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
    api_instance = openapiopenai.DefaultApi(api_client)
    key_id = 'key_id_example' # str | 

    try:
        # Retrieve a single organization API key
        api_response = api_instance.admin_api_keys_get(key_id)
        print("The response of DefaultApi->admin_api_keys_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->admin_api_keys_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **str**|  | 

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Details of the requested API key. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_list**
> ApiKeyList admin_api_keys_list(after=after, order=order, limit=limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.api_key_list import ApiKeyList
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
    api_instance = openapiopenai.DefaultApi(api_client)
    after = 'after_example' # str |  (optional)
    order = asc # str |  (optional) (default to asc)
    limit = 20 # int |  (optional) (default to 20)

    try:
        # List organization API keys
        api_response = api_instance.admin_api_keys_list(after=after, order=order, limit=limit)
        print("The response of DefaultApi->admin_api_keys_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->admin_api_keys_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **str**|  | [optional] 
 **order** | **str**|  | [optional] [default to asc]
 **limit** | **int**|  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of organization API keys. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

