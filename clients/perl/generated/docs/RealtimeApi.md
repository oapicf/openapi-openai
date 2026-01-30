# WWW::OpenAPIClient::RealtimeApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::RealtimeApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_realtime_session**](RealtimeApi.md#create_realtime_session) | **POST** /realtime/sessions | Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 


# **create_realtime_session**
> RealtimeSessionCreateResponse create_realtime_session(realtime_session_create_request => $realtime_session_create_request)

Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::RealtimeApi;
my $api_instance = WWW::OpenAPIClient::RealtimeApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $realtime_session_create_request = WWW::OpenAPIClient::Object::RealtimeSessionCreateRequest->new(); # RealtimeSessionCreateRequest | Create an ephemeral API key with the given session configuration.

eval {
    my $result = $api_instance->create_realtime_session(realtime_session_create_request => $realtime_session_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling RealtimeApi->create_realtime_session: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realtime_session_create_request** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md)| Create an ephemeral API key with the given session configuration. | 

### Return type

[**RealtimeSessionCreateResponse**](RealtimeSessionCreateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

