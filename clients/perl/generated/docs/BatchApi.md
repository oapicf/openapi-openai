# WWW::OpenAPIClient::BatchApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BatchApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_batch**](BatchApi.md#cancel_batch) | **POST** /batches/{batch_id}/cancel | Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
[**create_batch**](BatchApi.md#create_batch) | **POST** /batches | Creates and executes a batch from an uploaded file of requests
[**list_batches**](BatchApi.md#list_batches) | **GET** /batches | List your organization&#39;s batches.
[**retrieve_batch**](BatchApi.md#retrieve_batch) | **GET** /batches/{batch_id} | Retrieves a batch.


# **cancel_batch**
> Batch cancel_batch(batch_id => $batch_id)

Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $batch_id = "batch_id_example"; # string | The ID of the batch to cancel.

eval {
    my $result = $api_instance->cancel_batch(batch_id => $batch_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->cancel_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The ID of the batch to cancel. | 

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_batch**
> Batch create_batch(create_batch_request => $create_batch_request)

Creates and executes a batch from an uploaded file of requests

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_batch_request = WWW::OpenAPIClient::Object::CreateBatchRequest->new(); # CreateBatchRequest | 

eval {
    my $result = $api_instance->create_batch(create_batch_request => $create_batch_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->create_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_batch_request** | [**CreateBatchRequest**](CreateBatchRequest.md)|  | 

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_batches**
> ListBatchesResponse list_batches(after => $after, limit => $limit)

List your organization's batches.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 

eval {
    my $result = $api_instance->list_batches(after => $after, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->list_batches: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]

### Return type

[**ListBatchesResponse**](ListBatchesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_batch**
> Batch retrieve_batch(batch_id => $batch_id)

Retrieves a batch.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $batch_id = "batch_id_example"; # string | The ID of the batch to retrieve.

eval {
    my $result = $api_instance->retrieve_batch(batch_id => $batch_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->retrieve_batch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The ID of the batch to retrieve. | 

### Return type

[**Batch**](Batch.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

