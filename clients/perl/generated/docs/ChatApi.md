# WWW::OpenAPIClient::ChatApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ChatApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat_completion**](ChatApi.md#create_chat_completion) | **POST** /chat/completions | Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 


# **create_chat_completion**
> CreateChatCompletionResponse create_chat_completion(create_chat_completion_request => $create_chat_completion_request)

Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 

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

