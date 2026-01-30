# WWW::OpenAPIClient::UsersApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::UsersApi;
```

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_user**](UsersApi.md#delete_user) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**list_users**](UsersApi.md#list_users) | **GET** /organization/users | Lists all of the users in the organization.
[**modify_user**](UsersApi.md#modify_user) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**retrieve_user**](UsersApi.md#retrieve_user) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


# **delete_user**
> UserDeleteResponse delete_user(user_id => $user_id)

Deletes a user from the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $user_id = "user_id_example"; # string | The ID of the user.

eval {
    my $result = $api_instance->delete_user(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->delete_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The ID of the user. | 

### Return type

[**UserDeleteResponse**](UserDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_users**
> UserListResponse list_users(limit => $limit, after => $after)

Lists all of the users in the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $limit = 20; # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
my $after = "after_example"; # string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 

eval {
    my $result = $api_instance->list_users(limit => $limit, after => $after);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->list_users: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **string**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**UserListResponse**](UserListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_user**
> User modify_user(user_id => $user_id, user_role_update_request => $user_role_update_request)

Modifies a user's role in the organization.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $user_id = "user_id_example"; # string | The ID of the user.
my $user_role_update_request = WWW::OpenAPIClient::Object::UserRoleUpdateRequest->new(); # UserRoleUpdateRequest | The new user role to modify. This must be one of `owner` or `member`.

eval {
    my $result = $api_instance->modify_user(user_id => $user_id, user_role_update_request => $user_role_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->modify_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The ID of the user. | 
 **user_role_update_request** | [**UserRoleUpdateRequest**](UserRoleUpdateRequest.md)| The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;. | 

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_user**
> User retrieve_user(user_id => $user_id)

Retrieves a user by their identifier.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UsersApi;
my $api_instance = WWW::OpenAPIClient::UsersApi->new(

    # Configure bearer access token for authorization: ApiKeyAuth
    access_token => 'YOUR_BEARER_TOKEN',
    
);

my $user_id = "user_id_example"; # string | The ID of the user.

eval {
    my $result = $api_instance->retrieve_user(user_id => $user_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UsersApi->retrieve_user: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **string**| The ID of the user. | 

### Return type

[**User**](User.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

