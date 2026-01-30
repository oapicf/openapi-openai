# WWW::OpenAPIClient::FilesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::FilesApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_file**](FilesApi.md#create_file) | **POST** /files | Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**delete_file**](FilesApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
[**download_file**](FilesApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**list_files**](FilesApi.md#list_files) | **GET** /files | Returns a list of files.
[**retrieve_file**](FilesApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.


# **create_file**
> OpenAIFile create_file(file => $file, purpose => $purpose)

Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file = "/path/to/file"; # string | The File object (not file name) to be uploaded. 
my $purpose = "purpose_example"; # string | The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning). 

eval {
    my $result = $api_instance->create_file(file => $file, purpose => $purpose);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FilesApi->create_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **string****string**| The File object (not file name) to be uploaded.  | 
 **purpose** | **string**| The intended purpose of the uploaded file.  Use \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\&quot;vision\\\&quot; for Assistants image file inputs, \\\&quot;batch\\\&quot; for [Batch API](/docs/guides/batch), and \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning).  | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_file**
> DeleteFileResponse delete_file(file_id => $file_id)

Delete a file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file_id = "file_id_example"; # string | The ID of the file to use for this request.

eval {
    my $result = $api_instance->delete_file(file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FilesApi->delete_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **string**| The ID of the file to use for this request. | 

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_file**
> string download_file(file_id => $file_id)

Returns the contents of the specified file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file_id = "file_id_example"; # string | The ID of the file to use for this request.

eval {
    my $result = $api_instance->download_file(file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FilesApi->download_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **string**| The ID of the file to use for this request. | 

### Return type

**string**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_files**
> ListFilesResponse list_files(purpose => $purpose, limit => $limit, order => $order, after => $after)

Returns a list of files.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $purpose = "purpose_example"; # string | Only return files with the given purpose.
my $limit = 10000; # int | A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
my $order = 'desc'; # string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

eval {
    my $result = $api_instance->list_files(purpose => $purpose, limit => $limit, order => $order, after => $after);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FilesApi->list_files: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purpose** | **string**| Only return files with the given purpose. | [optional] 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000.  | [optional] [default to 10000]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_file**
> OpenAIFile retrieve_file(file_id => $file_id)

Returns information about a specific file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file_id = "file_id_example"; # string | The ID of the file to use for this request.

eval {
    my $result = $api_instance->retrieve_file(file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FilesApi->retrieve_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file_id** | **string**| The ID of the file to use for this request. | 

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

