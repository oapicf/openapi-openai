# WWW::OpenAPIClient::VectorStoresApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::VectorStoresApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_vector_store_file_batch**](VectorStoresApi.md#cancel_vector_store_file_batch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**create_vector_store**](VectorStoresApi.md#create_vector_store) | **POST** /vector_stores | Create a vector store.
[**create_vector_store_file**](VectorStoresApi.md#create_vector_store_file) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**create_vector_store_file_batch**](VectorStoresApi.md#create_vector_store_file_batch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**delete_vector_store**](VectorStoresApi.md#delete_vector_store) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**delete_vector_store_file**](VectorStoresApi.md#delete_vector_store_file) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**get_vector_store**](VectorStoresApi.md#get_vector_store) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**get_vector_store_file**](VectorStoresApi.md#get_vector_store_file) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**get_vector_store_file_batch**](VectorStoresApi.md#get_vector_store_file_batch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**list_files_in_vector_store_batch**](VectorStoresApi.md#list_files_in_vector_store_batch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**list_vector_store_files**](VectorStoresApi.md#list_vector_store_files) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**list_vector_stores**](VectorStoresApi.md#list_vector_stores) | **GET** /vector_stores | Returns a list of vector stores.
[**modify_vector_store**](VectorStoresApi.md#modify_vector_store) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


# **cancel_vector_store_file_batch**
> VectorStoreFileBatchObject cancel_vector_store_file_batch(vector_store_id => $vector_store_id, batch_id => $batch_id)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store that the file batch belongs to.
my $batch_id = "batch_id_example"; # string | The ID of the file batch to cancel.

eval {
    my $result = $api_instance->cancel_vector_store_file_batch(vector_store_id => $vector_store_id, batch_id => $batch_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->cancel_vector_store_file_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store that the file batch belongs to. | 
 **batch_id** | **string**| The ID of the file batch to cancel. | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vector_store**
> VectorStoreObject create_vector_store(create_vector_store_request => $create_vector_store_request)

Create a vector store.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_vector_store_request = WWW::OpenAPIClient::Object::CreateVectorStoreRequest->new(); # CreateVectorStoreRequest | 

eval {
    my $result = $api_instance->create_vector_store(create_vector_store_request => $create_vector_store_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->create_vector_store: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_vector_store_request** | [**CreateVectorStoreRequest**](CreateVectorStoreRequest.md)|  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vector_store_file**
> VectorStoreFileObject create_vector_store_file(vector_store_id => $vector_store_id, create_vector_store_file_request => $create_vector_store_file_request)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = vs_abc123; # string | The ID of the vector store for which to create a File. 
my $create_vector_store_file_request = WWW::OpenAPIClient::Object::CreateVectorStoreFileRequest->new(); # CreateVectorStoreFileRequest | 

eval {
    my $result = $api_instance->create_vector_store_file(vector_store_id => $vector_store_id, create_vector_store_file_request => $create_vector_store_file_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->create_vector_store_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store for which to create a File.  | 
 **create_vector_store_file_request** | [**CreateVectorStoreFileRequest**](CreateVectorStoreFileRequest.md)|  | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vector_store_file_batch**
> VectorStoreFileBatchObject create_vector_store_file_batch(vector_store_id => $vector_store_id, create_vector_store_file_batch_request => $create_vector_store_file_batch_request)

Create a vector store file batch.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = vs_abc123; # string | The ID of the vector store for which to create a File Batch. 
my $create_vector_store_file_batch_request = WWW::OpenAPIClient::Object::CreateVectorStoreFileBatchRequest->new(); # CreateVectorStoreFileBatchRequest | 

eval {
    my $result = $api_instance->create_vector_store_file_batch(vector_store_id => $vector_store_id, create_vector_store_file_batch_request => $create_vector_store_file_batch_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->create_vector_store_file_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store for which to create a File Batch.  | 
 **create_vector_store_file_batch_request** | [**CreateVectorStoreFileBatchRequest**](CreateVectorStoreFileBatchRequest.md)|  | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_vector_store**
> DeleteVectorStoreResponse delete_vector_store(vector_store_id => $vector_store_id)

Delete a vector store.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store to delete.

eval {
    my $result = $api_instance->delete_vector_store(vector_store_id => $vector_store_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->delete_vector_store: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store to delete. | 

### Return type

[**DeleteVectorStoreResponse**](DeleteVectorStoreResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_vector_store_file**
> DeleteVectorStoreFileResponse delete_vector_store_file(vector_store_id => $vector_store_id, file_id => $file_id)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store that the file belongs to.
my $file_id = "file_id_example"; # string | The ID of the file to delete.

eval {
    my $result = $api_instance->delete_vector_store_file(vector_store_id => $vector_store_id, file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->delete_vector_store_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store that the file belongs to. | 
 **file_id** | **string**| The ID of the file to delete. | 

### Return type

[**DeleteVectorStoreFileResponse**](DeleteVectorStoreFileResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vector_store**
> VectorStoreObject get_vector_store(vector_store_id => $vector_store_id)

Retrieves a vector store.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store to retrieve.

eval {
    my $result = $api_instance->get_vector_store(vector_store_id => $vector_store_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->get_vector_store: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store to retrieve. | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vector_store_file**
> VectorStoreFileObject get_vector_store_file(vector_store_id => $vector_store_id, file_id => $file_id)

Retrieves a vector store file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = vs_abc123; # string | The ID of the vector store that the file belongs to.
my $file_id = file-abc123; # string | The ID of the file being retrieved.

eval {
    my $result = $api_instance->get_vector_store_file(vector_store_id => $vector_store_id, file_id => $file_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->get_vector_store_file: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store that the file belongs to. | 
 **file_id** | **string**| The ID of the file being retrieved. | 

### Return type

[**VectorStoreFileObject**](VectorStoreFileObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vector_store_file_batch**
> VectorStoreFileBatchObject get_vector_store_file_batch(vector_store_id => $vector_store_id, batch_id => $batch_id)

Retrieves a vector store file batch.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = vs_abc123; # string | The ID of the vector store that the file batch belongs to.
my $batch_id = vsfb_abc123; # string | The ID of the file batch being retrieved.

eval {
    my $result = $api_instance->get_vector_store_file_batch(vector_store_id => $vector_store_id, batch_id => $batch_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->get_vector_store_file_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store that the file batch belongs to. | 
 **batch_id** | **string**| The ID of the file batch being retrieved. | 

### Return type

[**VectorStoreFileBatchObject**](VectorStoreFileBatchObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_files_in_vector_store_batch**
> ListVectorStoreFilesResponse list_files_in_vector_store_batch(vector_store_id => $vector_store_id, batch_id => $batch_id, limit => $limit, order => $order, after => $after, before => $before, filter => $filter)

Returns a list of vector store files in a batch.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store that the files belong to.
my $batch_id = "batch_id_example"; # string | The ID of the file batch that the files belong to.
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $order = 'desc'; # string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $before = "before_example"; # string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
my $filter = "filter_example"; # string | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.

eval {
    my $result = $api_instance->list_files_in_vector_store_batch(vector_store_id => $vector_store_id, batch_id => $batch_id, limit => $limit, order => $order, after => $after, before => $before, filter => $filter);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->list_files_in_vector_store_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store that the files belong to. | 
 **batch_id** | **string**| The ID of the file batch that the files belong to. | 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | **string**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_vector_store_files**
> ListVectorStoreFilesResponse list_vector_store_files(vector_store_id => $vector_store_id, limit => $limit, order => $order, after => $after, before => $before, filter => $filter)

Returns a list of vector store files.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store that the files belong to.
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $order = 'desc'; # string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $before = "before_example"; # string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
my $filter = "filter_example"; # string | Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.

eval {
    my $result = $api_instance->list_vector_store_files(vector_store_id => $vector_store_id, limit => $limit, order => $order, after => $after, before => $before, filter => $filter);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->list_vector_store_files: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store that the files belong to. | 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 
 **filter** | **string**| Filter by file status. One of &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;failed&#x60;, &#x60;cancelled&#x60;. | [optional] 

### Return type

[**ListVectorStoreFilesResponse**](ListVectorStoreFilesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_vector_stores**
> ListVectorStoresResponse list_vector_stores(limit => $limit, order => $order, after => $after, before => $before)

Returns a list of vector stores.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $order = 'desc'; # string | Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $before = "before_example"; # string | A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 

eval {
    my $result = $api_instance->list_vector_stores(limit => $limit, order => $order, after => $after, before => $before);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->list_vector_stores: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **order** | **string**| Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order.  | [optional] [default to &#39;desc&#39;]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **before** | **string**| A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list.  | [optional] 

### Return type

[**ListVectorStoresResponse**](ListVectorStoresResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_vector_store**
> VectorStoreObject modify_vector_store(vector_store_id => $vector_store_id, update_vector_store_request => $update_vector_store_request)

Modifies a vector store.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::VectorStoresApi;
my $api_instance = WWW::OpenAPIClient::VectorStoresApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $vector_store_id = "vector_store_id_example"; # string | The ID of the vector store to modify.
my $update_vector_store_request = WWW::OpenAPIClient::Object::UpdateVectorStoreRequest->new(); # UpdateVectorStoreRequest | 

eval {
    my $result = $api_instance->modify_vector_store(vector_store_id => $vector_store_id, update_vector_store_request => $update_vector_store_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling VectorStoresApi->modify_vector_store: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vector_store_id** | **string**| The ID of the vector store to modify. | 
 **update_vector_store_request** | [**UpdateVectorStoreRequest**](UpdateVectorStoreRequest.md)|  | 

### Return type

[**VectorStoreObject**](VectorStoreObject.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

