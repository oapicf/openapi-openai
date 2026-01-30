# WWW::OpenAPIClient::InvitesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::InvitesApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_invite**](InvitesApi.md#delete_invite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**invite_user**](InvitesApi.md#invite_user) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**list_invites**](InvitesApi.md#list_invites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieve_invite**](InvitesApi.md#retrieve_invite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **delete_invite**
> InviteDeleteResponse delete_invite(invite_id => $invite_id)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::InvitesApi;
my $api_instance = WWW::OpenAPIClient::InvitesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $invite_id = "invite_id_example"; # string | The ID of the invite to delete.

eval {
    my $result = $api_instance->delete_invite(invite_id => $invite_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvitesApi->delete_invite: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **string**| The ID of the invite to delete. | 

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invite_user**
> Invite invite_user(invite_request => $invite_request)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::InvitesApi;
my $api_instance = WWW::OpenAPIClient::InvitesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $invite_request = WWW::OpenAPIClient::Object::InviteRequest->new(); # InviteRequest | The invite request payload.

eval {
    my $result = $api_instance->invite_user(invite_request => $invite_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvitesApi->invite_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_request** | [**InviteRequest**](InviteRequest.md)| The invite request payload. | 

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_invites**
> InviteListResponse list_invites(limit => $limit, after => $after)

Returns a list of invites in the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::InvitesApi;
my $api_instance = WWW::OpenAPIClient::InvitesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

eval {
    my $result = $api_instance->list_invites(limit => $limit, after => $after);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvitesApi->list_invites: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_invite**
> Invite retrieve_invite(invite_id => $invite_id)

Retrieves an invite.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::InvitesApi;
my $api_instance = WWW::OpenAPIClient::InvitesApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $invite_id = "invite_id_example"; # string | The ID of the invite to retrieve.

eval {
    my $result = $api_instance->retrieve_invite(invite_id => $invite_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling InvitesApi->retrieve_invite: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **string**| The ID of the invite to retrieve. | 

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

