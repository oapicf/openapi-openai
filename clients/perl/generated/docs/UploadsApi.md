# WWW::OpenAPIClient::UploadsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::UploadsApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_upload_part**](UploadsApi.md#add_upload_part) | **POST** /uploads/{upload_id}/parts | Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 
[**cancel_upload**](UploadsApi.md#cancel_upload) | **POST** /uploads/{upload_id}/cancel | Cancels the Upload. No Parts may be added after an Upload is cancelled. 
[**complete_upload**](UploadsApi.md#complete_upload) | **POST** /uploads/{upload_id}/complete | Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 
[**create_upload**](UploadsApi.md#create_upload) | **POST** /uploads | Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain &#x60;purpose&#x60;s, the correct &#x60;mime_type&#x60; must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 


# **add_upload_part**
> UploadPart add_upload_part(upload_id => $upload_id, data => $data)

Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UploadsApi;
my $api_instance = WWW::OpenAPIClient::UploadsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $upload_id = upload_abc123; # string | The ID of the Upload. 
my $data = "/path/to/file"; # string | The chunk of bytes for this Part. 

eval {
    my $result = $api_instance->add_upload_part(upload_id => $upload_id, data => $data);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UploadsApi->add_upload_part: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id** | **string**| The ID of the Upload.  | 
 **data** | **string****string**| The chunk of bytes for this Part.  | 

### Return type

[**UploadPart**](UploadPart.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_upload**
> Upload cancel_upload(upload_id => $upload_id)

Cancels the Upload. No Parts may be added after an Upload is cancelled. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UploadsApi;
my $api_instance = WWW::OpenAPIClient::UploadsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $upload_id = upload_abc123; # string | The ID of the Upload. 

eval {
    my $result = $api_instance->cancel_upload(upload_id => $upload_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UploadsApi->cancel_upload: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id** | **string**| The ID of the Upload.  | 

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **complete_upload**
> Upload complete_upload(upload_id => $upload_id, complete_upload_request => $complete_upload_request)

Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UploadsApi;
my $api_instance = WWW::OpenAPIClient::UploadsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $upload_id = upload_abc123; # string | The ID of the Upload. 
my $complete_upload_request = WWW::OpenAPIClient::Object::CompleteUploadRequest->new(); # CompleteUploadRequest | 

eval {
    my $result = $api_instance->complete_upload(upload_id => $upload_id, complete_upload_request => $complete_upload_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UploadsApi->complete_upload: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upload_id** | **string**| The ID of the Upload.  | 
 **complete_upload_request** | [**CompleteUploadRequest**](CompleteUploadRequest.md)|  | 

### Return type

[**Upload**](Upload.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_upload**
> Upload create_upload(create_upload_request => $create_upload_request)

Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UploadsApi;
my $api_instance = WWW::OpenAPIClient::UploadsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_upload_request = WWW::OpenAPIClient::Object::CreateUploadRequest->new(); # CreateUploadRequest | 

eval {
    my $result = $api_instance->create_upload(create_upload_request => $create_upload_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UploadsApi->create_upload: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

