# WWW::OpenAPIClient::EmbeddingsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EmbeddingsApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_embedding**](EmbeddingsApi.md#create_embedding) | **POST** /embeddings | Creates an embedding vector representing the input text.


# **create_embedding**
> CreateEmbeddingResponse create_embedding(create_embedding_request => $create_embedding_request)

Creates an embedding vector representing the input text.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EmbeddingsApi;
my $api_instance = WWW::OpenAPIClient::EmbeddingsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_embedding_request = WWW::OpenAPIClient::Object::CreateEmbeddingRequest->new(); # CreateEmbeddingRequest | 

eval {
    my $result = $api_instance->create_embedding(create_embedding_request => $create_embedding_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EmbeddingsApi->create_embedding: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_embedding_request** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  | 

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

