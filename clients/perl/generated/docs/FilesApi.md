# WWW::OpenAPIClient::FilesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::FilesApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_file**](FilesApi.md#create_file) | **POST** /files | Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports &#x60;.jsonl&#x60; files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
[**delete_file**](FilesApi.md#delete_file) | **DELETE** /files/{file_id} | Delete a file.
[**download_file**](FilesApi.md#download_file) | **GET** /files/{file_id}/content | Returns the contents of the specified file.
[**list_files**](FilesApi.md#list_files) | **GET** /files | Returns a list of files that belong to the user&#39;s organization.
[**retrieve_file**](FilesApi.md#retrieve_file) | **GET** /files/{file_id} | Returns information about a specific file.


# **create_file**
> OpenAIFile create_file(file => $file, purpose => $purpose)

Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $file = "/path/to/file"; # string | The File object (not file name) to be uploaded. 
my $purpose = "purpose_example"; # string | The intended purpose of the uploaded file.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 

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
 **purpose** | **string**| The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.  | 

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
> ListFilesResponse list_files(purpose => $purpose)

Returns a list of files that belong to the user's organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FilesApi;
my $api_instance = WWW::OpenAPIClient::FilesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $purpose = "purpose_example"; # string | Only return files with the given purpose.

eval {
    my $result = $api_instance->list_files(purpose => $purpose);
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

