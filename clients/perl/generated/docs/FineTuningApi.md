# WWW::OpenAPIClient::FineTuningApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::FineTuningApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_fine_tuning_job**](FineTuningApi.md#cancel_fine_tuning_job) | **POST** /fine_tuning/jobs/{fine_tuning_job_id}/cancel | Immediately cancel a fine-tune job. 
[**create_fine_tuning_job**](FineTuningApi.md#create_fine_tuning_job) | **POST** /fine_tuning/jobs | Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
[**list_fine_tuning_events**](FineTuningApi.md#list_fine_tuning_events) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/events | Get status updates for a fine-tuning job. 
[**list_fine_tuning_job_checkpoints**](FineTuningApi.md#list_fine_tuning_job_checkpoints) | **GET** /fine_tuning/jobs/{fine_tuning_job_id}/checkpoints | List checkpoints for a fine-tuning job. 
[**list_paginated_fine_tuning_jobs**](FineTuningApi.md#list_paginated_fine_tuning_jobs) | **GET** /fine_tuning/jobs | List your organization&#39;s fine-tuning jobs 
[**retrieve_fine_tuning_job**](FineTuningApi.md#retrieve_fine_tuning_job) | **GET** /fine_tuning/jobs/{fine_tuning_job_id} | Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 


# **cancel_fine_tuning_job**
> FineTuningJob cancel_fine_tuning_job(fine_tuning_job_id => $fine_tuning_job_id)

Immediately cancel a fine-tune job. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FineTuningApi;
my $api_instance = WWW::OpenAPIClient::FineTuningApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tuning job to cancel. 

eval {
    my $result = $api_instance->cancel_fine_tuning_job(fine_tuning_job_id => $fine_tuning_job_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FineTuningApi->cancel_fine_tuning_job: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **string**| The ID of the fine-tuning job to cancel.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fine_tuning_job**
> FineTuningJob create_fine_tuning_job(create_fine_tuning_job_request => $create_fine_tuning_job_request)

Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FineTuningApi;
my $api_instance = WWW::OpenAPIClient::FineTuningApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_fine_tuning_job_request = WWW::OpenAPIClient::Object::CreateFineTuningJobRequest->new(); # CreateFineTuningJobRequest | 

eval {
    my $result = $api_instance->create_fine_tuning_job(create_fine_tuning_job_request => $create_fine_tuning_job_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FineTuningApi->create_fine_tuning_job: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fine_tuning_job_request** | [**CreateFineTuningJobRequest**](CreateFineTuningJobRequest.md)|  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tuning_events**
> ListFineTuningJobEventsResponse list_fine_tuning_events(fine_tuning_job_id => $fine_tuning_job_id, after => $after, limit => $limit)

Get status updates for a fine-tuning job. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FineTuningApi;
my $api_instance = WWW::OpenAPIClient::FineTuningApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tuning job to get events for. 
my $after = "after_example"; # string | Identifier for the last event from the previous pagination request.
my $limit = 20; # int | Number of events to retrieve.

eval {
    my $result = $api_instance->list_fine_tuning_events(fine_tuning_job_id => $fine_tuning_job_id, after => $after, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FineTuningApi->list_fine_tuning_events: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **string**| The ID of the fine-tuning job to get events for.  | 
 **after** | **string**| Identifier for the last event from the previous pagination request. | [optional] 
 **limit** | **int**| Number of events to retrieve. | [optional] [default to 20]

### Return type

[**ListFineTuningJobEventsResponse**](ListFineTuningJobEventsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fine_tuning_job_checkpoints**
> ListFineTuningJobCheckpointsResponse list_fine_tuning_job_checkpoints(fine_tuning_job_id => $fine_tuning_job_id, after => $after, limit => $limit)

List checkpoints for a fine-tuning job. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FineTuningApi;
my $api_instance = WWW::OpenAPIClient::FineTuningApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tuning job to get checkpoints for. 
my $after = "after_example"; # string | Identifier for the last checkpoint ID from the previous pagination request.
my $limit = 10; # int | Number of checkpoints to retrieve.

eval {
    my $result = $api_instance->list_fine_tuning_job_checkpoints(fine_tuning_job_id => $fine_tuning_job_id, after => $after, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FineTuningApi->list_fine_tuning_job_checkpoints: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **string**| The ID of the fine-tuning job to get checkpoints for.  | 
 **after** | **string**| Identifier for the last checkpoint ID from the previous pagination request. | [optional] 
 **limit** | **int**| Number of checkpoints to retrieve. | [optional] [default to 10]

### Return type

[**ListFineTuningJobCheckpointsResponse**](ListFineTuningJobCheckpointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_paginated_fine_tuning_jobs**
> ListPaginatedFineTuningJobsResponse list_paginated_fine_tuning_jobs(after => $after, limit => $limit)

List your organization's fine-tuning jobs 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FineTuningApi;
my $api_instance = WWW::OpenAPIClient::FineTuningApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $after = "after_example"; # string | Identifier for the last job from the previous pagination request.
my $limit = 20; # int | Number of fine-tuning jobs to retrieve.

eval {
    my $result = $api_instance->list_paginated_fine_tuning_jobs(after => $after, limit => $limit);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FineTuningApi->list_paginated_fine_tuning_jobs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **string**| Identifier for the last job from the previous pagination request. | [optional] 
 **limit** | **int**| Number of fine-tuning jobs to retrieve. | [optional] [default to 20]

### Return type

[**ListPaginatedFineTuningJobsResponse**](ListPaginatedFineTuningJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_fine_tuning_job**
> FineTuningJob retrieve_fine_tuning_job(fine_tuning_job_id => $fine_tuning_job_id)

Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::FineTuningApi;
my $api_instance = WWW::OpenAPIClient::FineTuningApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $fine_tuning_job_id = ft-AF1WoRqd3aJAHsqc9NY7iL8F; # string | The ID of the fine-tuning job. 

eval {
    my $result = $api_instance->retrieve_fine_tuning_job(fine_tuning_job_id => $fine_tuning_job_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling FineTuningApi->retrieve_fine_tuning_job: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fine_tuning_job_id** | **string**| The ID of the fine-tuning job.  | 

### Return type

[**FineTuningJob**](FineTuningJob.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

