# WWW::OpenAPIClient::UsageApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::UsageApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usage_audio_speeches**](UsageApi.md#usage_audio_speeches) | **GET** /organization/usage/audio_speeches | Get audio speeches usage details for the organization.
[**usage_audio_transcriptions**](UsageApi.md#usage_audio_transcriptions) | **GET** /organization/usage/audio_transcriptions | Get audio transcriptions usage details for the organization.
[**usage_code_interpreter_sessions**](UsageApi.md#usage_code_interpreter_sessions) | **GET** /organization/usage/code_interpreter_sessions | Get code interpreter sessions usage details for the organization.
[**usage_completions**](UsageApi.md#usage_completions) | **GET** /organization/usage/completions | Get completions usage details for the organization.
[**usage_costs**](UsageApi.md#usage_costs) | **GET** /organization/costs | Get costs details for the organization.
[**usage_embeddings**](UsageApi.md#usage_embeddings) | **GET** /organization/usage/embeddings | Get embeddings usage details for the organization.
[**usage_images**](UsageApi.md#usage_images) | **GET** /organization/usage/images | Get images usage details for the organization.
[**usage_moderations**](UsageApi.md#usage_moderations) | **GET** /organization/usage/moderations | Get moderations usage details for the organization.
[**usage_vector_stores**](UsageApi.md#usage_vector_stores) | **GET** /organization/usage/vector_stores | Get vector stores usage details for the organization.


# **usage_audio_speeches**
> UsageResponse usage_audio_speeches(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page)

Get audio speeches usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $user_ids = [("null")]; # ARRAY[string] | Return only usage for these users.
my $api_key_ids = [("null")]; # ARRAY[string] | Return only usage for these API keys.
my $models = [("null")]; # ARRAY[string] | Return only usage for these models.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_audio_speeches(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_audio_speeches: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **user_ids** | [**ARRAY[string]**](string.md)| Return only usage for these users. | [optional] 
 **api_key_ids** | [**ARRAY[string]**](string.md)| Return only usage for these API keys. | [optional] 
 **models** | [**ARRAY[string]**](string.md)| Return only usage for these models. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_audio_transcriptions**
> UsageResponse usage_audio_transcriptions(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page)

Get audio transcriptions usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $user_ids = [("null")]; # ARRAY[string] | Return only usage for these users.
my $api_key_ids = [("null")]; # ARRAY[string] | Return only usage for these API keys.
my $models = [("null")]; # ARRAY[string] | Return only usage for these models.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_audio_transcriptions(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_audio_transcriptions: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **user_ids** | [**ARRAY[string]**](string.md)| Return only usage for these users. | [optional] 
 **api_key_ids** | [**ARRAY[string]**](string.md)| Return only usage for these API keys. | [optional] 
 **models** | [**ARRAY[string]**](string.md)| Return only usage for these models. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_code_interpreter_sessions**
> UsageResponse usage_code_interpreter_sessions(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, group_by => $group_by, limit => $limit, page => $page)

Get code interpreter sessions usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_code_interpreter_sessions(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_code_interpreter_sessions: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_completions**
> UsageResponse usage_completions(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, batch => $batch, group_by => $group_by, limit => $limit, page => $page)

Get completions usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $user_ids = [("null")]; # ARRAY[string] | Return only usage for these users.
my $api_key_ids = [("null")]; # ARRAY[string] | Return only usage for these API keys.
my $models = [("null")]; # ARRAY[string] | Return only usage for these models.
my $batch = null; # boolean | If `true`, return batch jobs only. If `false`, return non-batch jobs only. By default, return both. 
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `batch` or any combination of them.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_completions(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, batch => $batch, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_completions: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **user_ids** | [**ARRAY[string]**](string.md)| Return only usage for these users. | [optional] 
 **api_key_ids** | [**ARRAY[string]**](string.md)| Return only usage for these API keys. | [optional] 
 **models** | [**ARRAY[string]**](string.md)| Return only usage for these models. | [optional] 
 **batch** | **boolean**| If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both.  | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_costs**
> UsageResponse usage_costs(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, group_by => $group_by, limit => $limit, page => $page)

Get costs details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently only `1d` is supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only costs for these projects.
my $group_by = [("null")]; # ARRAY[string] | Group the costs by the specified fields. Support fields include `project_id`, `line_item` and any combination of them.
my $limit = 7; # int | A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_costs(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_costs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only costs for these projects. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them. | [optional] 
 **limit** | **int**| A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7.  | [optional] [default to 7]
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_embeddings**
> UsageResponse usage_embeddings(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page)

Get embeddings usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $user_ids = [("null")]; # ARRAY[string] | Return only usage for these users.
my $api_key_ids = [("null")]; # ARRAY[string] | Return only usage for these API keys.
my $models = [("null")]; # ARRAY[string] | Return only usage for these models.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_embeddings(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_embeddings: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **user_ids** | [**ARRAY[string]**](string.md)| Return only usage for these users. | [optional] 
 **api_key_ids** | [**ARRAY[string]**](string.md)| Return only usage for these API keys. | [optional] 
 **models** | [**ARRAY[string]**](string.md)| Return only usage for these models. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_images**
> UsageResponse usage_images(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, sources => $sources, sizes => $sizes, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page)

Get images usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $sources = [("null")]; # ARRAY[string] | Return only usages for these sources. Possible values are `image.generation`, `image.edit`, `image.variation` or any combination of them.
my $sizes = [("null")]; # ARRAY[string] | Return only usages for these image sizes. Possible values are `256x256`, `512x512`, `1024x1024`, `1792x1792`, `1024x1792` or any combination of them.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $user_ids = [("null")]; # ARRAY[string] | Return only usage for these users.
my $api_key_ids = [("null")]; # ARRAY[string] | Return only usage for these API keys.
my $models = [("null")]; # ARRAY[string] | Return only usage for these models.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model`, `size`, `source` or any combination of them.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_images(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, sources => $sources, sizes => $sizes, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_images: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **sources** | [**ARRAY[string]**](string.md)| Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them. | [optional] 
 **sizes** | [**ARRAY[string]**](string.md)| Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them. | [optional] 
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **user_ids** | [**ARRAY[string]**](string.md)| Return only usage for these users. | [optional] 
 **api_key_ids** | [**ARRAY[string]**](string.md)| Return only usage for these API keys. | [optional] 
 **models** | [**ARRAY[string]**](string.md)| Return only usage for these models. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_moderations**
> UsageResponse usage_moderations(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page)

Get moderations usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $user_ids = [("null")]; # ARRAY[string] | Return only usage for these users.
my $api_key_ids = [("null")]; # ARRAY[string] | Return only usage for these API keys.
my $models = [("null")]; # ARRAY[string] | Return only usage for these models.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`, `user_id`, `api_key_id`, `model` or any combination of them.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_moderations(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, user_ids => $user_ids, api_key_ids => $api_key_ids, models => $models, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_moderations: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **user_ids** | [**ARRAY[string]**](string.md)| Return only usage for these users. | [optional] 
 **api_key_ids** | [**ARRAY[string]**](string.md)| Return only usage for these API keys. | [optional] 
 **models** | [**ARRAY[string]**](string.md)| Return only usage for these models. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **usage_vector_stores**
> UsageResponse usage_vector_stores(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, group_by => $group_by, limit => $limit, page => $page)

Get vector stores usage details for the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsageApi;
my $api_instance = WWW::OpenAPIClient::UsageApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $start_time = 56; # int | Start time (Unix seconds) of the query time range, inclusive.
my $end_time = 56; # int | End time (Unix seconds) of the query time range, exclusive.
my $bucket_width = '1d'; # string | Width of each time bucket in response. Currently `1m`, `1h` and `1d` are supported, default to `1d`.
my $project_ids = [("null")]; # ARRAY[string] | Return only usage for these projects.
my $group_by = [("null")]; # ARRAY[string] | Group the usage data by the specified fields. Support fields include `project_id`.
my $limit = 56; # int | Specifies the number of buckets to return. - `bucket_width=1d`: default: 7, max: 31 - `bucket_width=1h`: default: 24, max: 168 - `bucket_width=1m`: default: 60, max: 1440 
my $page = "page_example"; # string | A cursor for use in pagination. Corresponding to the `next_page` field from the previous response.

eval {
    my $result = $api_instance->usage_vector_stores(start_time => $start_time, end_time => $end_time, bucket_width => $bucket_width, project_ids => $project_ids, group_by => $group_by, limit => $limit, page => $page);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsageApi->usage_vector_stores: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_time** | **int**| Start time (Unix seconds) of the query time range, inclusive. | 
 **end_time** | **int**| End time (Unix seconds) of the query time range, exclusive. | [optional] 
 **bucket_width** | **string**| Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;. | [optional] [default to &#39;1d&#39;]
 **project_ids** | [**ARRAY[string]**](string.md)| Return only usage for these projects. | [optional] 
 **group_by** | [**ARRAY[string]**](string.md)| Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;. | [optional] 
 **limit** | **int**| Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440  | [optional] 
 **page** | **string**| A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response. | [optional] 

### Return type

[**UsageResponse**](UsageResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

