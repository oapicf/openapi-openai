# WWW::OpenAPIClient::ModerationsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ModerationsApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_moderation**](ModerationsApi.md#create_moderation) | **POST** /moderations | Classifies if text is potentially harmful.


# **create_moderation**
> CreateModerationResponse create_moderation(create_moderation_request => $create_moderation_request)

Classifies if text is potentially harmful.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ModerationsApi;
my $api_instance = WWW::OpenAPIClient::ModerationsApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $create_moderation_request = WWW::OpenAPIClient::Object::CreateModerationRequest->new(); # CreateModerationRequest | 

eval {
    my $result = $api_instance->create_moderation(create_moderation_request => $create_moderation_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ModerationsApi->create_moderation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_moderation_request** | [**CreateModerationRequest**](CreateModerationRequest.md)|  | 

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

