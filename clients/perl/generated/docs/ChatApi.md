# WWW::OpenAPIClient::ChatApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ChatApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat_completion**](ChatApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation.


# **create_chat_completion**
> CreateChatCompletionResponse create_chat_completion(create_chat_completion_request => $create_chat_completion_request)

Creates a model response for the given chat conversation.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ChatApi;
my $api_instance = WWW::OpenAPIClient::ChatApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_chat_completion_request = WWW::OpenAPIClient::Object::CreateChatCompletionRequest->new(); # CreateChatCompletionRequest | 

eval {
    my $result = $api_instance->create_chat_completion(create_chat_completion_request => $create_chat_completion_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ChatApi->create_chat_completion: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_chat_completion_request** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  | 

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

