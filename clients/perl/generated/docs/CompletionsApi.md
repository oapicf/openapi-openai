# WWW::OpenAPIClient::CompletionsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CompletionsApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_completion**](CompletionsApi.md#create_completion) | **POST** /completions | Creates a completion for the provided prompt and parameters.


# **create_completion**
> CreateCompletionResponse create_completion(create_completion_request => $create_completion_request)

Creates a completion for the provided prompt and parameters.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CompletionsApi;
my $api_instance = WWW::OpenAPIClient::CompletionsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_completion_request = WWW::OpenAPIClient::Object::CreateCompletionRequest->new(); # CreateCompletionRequest | 

eval {
    my $result = $api_instance->create_completion(create_completion_request => $create_completion_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CompletionsApi->create_completion: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_completion_request** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  | 

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

