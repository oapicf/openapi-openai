# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_api_keys_create**](DefaultApi.md#admin_api_keys_create) | **POST** /organization/admin_api_keys | Create an organization admin API key
[**admin_api_keys_delete**](DefaultApi.md#admin_api_keys_delete) | **DELETE** /organization/admin_api_keys/{key_id} | Delete an organization admin API key
[**admin_api_keys_get**](DefaultApi.md#admin_api_keys_get) | **GET** /organization/admin_api_keys/{key_id} | Retrieve a single organization API key
[**admin_api_keys_list**](DefaultApi.md#admin_api_keys_list) | **GET** /organization/admin_api_keys | List organization API keys


# **admin_api_keys_create**
> AdminApiKey admin_api_keys_create(admin_api_keys_create_request => $admin_api_keys_create_request)

Create an organization admin API key

Create a new admin-level API key for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $admin_api_keys_create_request = WWW::OpenAPIClient::Object::AdminApiKeysCreateRequest->new(); # AdminApiKeysCreateRequest | 

eval {
    my $result = $api_instance->admin_api_keys_create(admin_api_keys_create_request => $admin_api_keys_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->admin_api_keys_create: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_delete**
> AdminApiKeysDelete200Response admin_api_keys_delete(key_id => $key_id)

Delete an organization admin API key

Delete the specified admin API key.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $key_id = "key_id_example"; # string | 

eval {
    my $result = $api_instance->admin_api_keys_delete(key_id => $key_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->admin_api_keys_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **string**|  | 

### Return type

[**AdminApiKeysDelete200Response**](AdminApiKeysDelete200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_get**
> AdminApiKey admin_api_keys_get(key_id => $key_id)

Retrieve a single organization API key

Get details for a specific organization API key by its ID.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $key_id = "key_id_example"; # string | 

eval {
    my $result = $api_instance->admin_api_keys_get(key_id => $key_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->admin_api_keys_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **string**|  | 

### Return type

[**AdminApiKey**](AdminApiKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **admin_api_keys_list**
> ApiKeyList admin_api_keys_list(after => $after, order => $order, limit => $limit)

List organization API keys

Retrieve a paginated list of organization admin API keys.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $after = "after_example"; # string | 
my $order = 'asc'; # string | 
my $limit = 20; # int | 

eval {
    my $result = $api_instance->admin_api_keys_list(after => $after, order => $order, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->admin_api_keys_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string**|  | [optional] 
 **order** | **string**|  | [optional] [default to &#39;asc&#39;]
 **limit** | **int**|  | [optional] [default to 20]

### Return type

[**ApiKeyList**](ApiKeyList.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

