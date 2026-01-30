# DefaultApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminApiKeysCreate**](DefaultApi.md#AdminApiKeysCreate) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**AdminApiKeysDelete**](DefaultApi.md#AdminApiKeysDelete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**AdminApiKeysGet**](DefaultApi.md#AdminApiKeysGet) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**AdminApiKeysList**](DefaultApi.md#AdminApiKeysList) | **GET** /organization/admin_api_keys | List organization API keys


# **AdminApiKeysCreate**
> AdminApiKey AdminApiKeysCreate(admin_api_keys_create_request)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```R
library(openapi)

# Create an organization admin API key
#
# prepare function argument(s)
var_admin_api_keys_create_request <- admin_api_keys_create_request$new("name_example") # AdminApiKeysCreateRequest | 

api_instance <- DefaultApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdminApiKeysCreate(var_admin_api_keys_create_requestdata_file = "result.txt")
result <- api_instance$AdminApiKeysCreate(var_admin_api_keys_create_request)
dput(result)
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
| **200** | The newly created admin API key. |  -  |

# **AdminApiKeysDelete**
> AdminApiKeysDelete200Response AdminApiKeysDelete(key_id)

Delete an organization admin API key

Delete the specified admin API key.

### Example
```R
library(openapi)

# Delete an organization admin API key
#
# prepare function argument(s)
var_key_id <- "key_id_example" # character | 

api_instance <- DefaultApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdminApiKeysDelete(var_key_iddata_file = "result.txt")
result <- api_instance$AdminApiKeysDelete(var_key_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **character**|  | 

### Return type

[**AdminApiKeysDelete200Response**](admin_api_keys_delete_200_response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the API key was deleted. |  -  |

# **AdminApiKeysGet**
> AdminApiKey AdminApiKeysGet(key_id)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```R
library(openapi)

# Retrieve a single organization API key
#
# prepare function argument(s)
var_key_id <- "key_id_example" # character | 

api_instance <- DefaultApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdminApiKeysGet(var_key_iddata_file = "result.txt")
result <- api_instance$AdminApiKeysGet(var_key_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **character**|  | 

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
| **200** | Details of the requested API key. |  -  |

# **AdminApiKeysList**
> ApiKeyList AdminApiKeysList(after = var.after, order = "asc", limit = 20)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```R
library(openapi)

# List organization API keys
#
# prepare function argument(s)
var_after <- "after_example" # character |  (Optional)
var_order <- "asc" # character |  (Optional)
var_limit <- 20 # integer |  (Optional)

api_instance <- DefaultApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdminApiKeysList(after = var_after, order = var_order, limit = var_limitdata_file = "result.txt")
result <- api_instance$AdminApiKeysList(after = var_after, order = var_order, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **character**|  | [optional] 
 **order** | Enum [asc, desc] |  | [optional] [default to &quot;asc&quot;]
 **limit** | **integer**|  | [optional] [default to 20]

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
| **200** | A list of organization API keys. |  -  |

