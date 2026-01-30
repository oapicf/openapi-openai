# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteInvite**](InvitesApi.md#DeleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**InviteUser**](InvitesApi.md#InviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**ListInvites**](InvitesApi.md#ListInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**RetrieveInvite**](InvitesApi.md#RetrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **DeleteInvite**
> InviteDeleteResponse DeleteInvite(invite_id)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example
```R
library(openapi)

# Delete an invite. If the invite has already been accepted, it cannot be deleted.
#
# prepare function argument(s)
var_invite_id <- "invite_id_example" # character | The ID of the invite to delete.

api_instance <- InvitesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeleteInvite(var_invite_iddata_file = "result.txt")
result <- api_instance$DeleteInvite(var_invite_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **character**| The ID of the invite to delete. | 

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invite deleted successfully. |  -  |

# **InviteUser**
> Invite InviteUser(invite_request)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example
```R
library(openapi)

# Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
#
# prepare function argument(s)
var_invite_request <- InviteRequest$new("email_example", "reader", c(InviteRequest_projects_inner$new("id_example", "member"))) # InviteRequest | The invite request payload.

api_instance <- InvitesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$InviteUser(var_invite_requestdata_file = "result.txt")
result <- api_instance$InviteUser(var_invite_request)
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User invited successfully. |  -  |

# **ListInvites**
> InviteListResponse ListInvites(limit = 20, after = var.after)

Returns a list of invites in the organization.

### Example
```R
library(openapi)

# Returns a list of invites in the organization.
#
# prepare function argument(s)
var_limit <- 20 # integer | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (Optional)
var_after <- "after_example" # character | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (Optional)

api_instance <- InvitesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ListInvites(limit = var_limit, after = var_afterdata_file = "result.txt")
result <- api_instance$ListInvites(limit = var_limit, after = var_after)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **character**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invites listed successfully. |  -  |

# **RetrieveInvite**
> Invite RetrieveInvite(invite_id)

Retrieves an invite.

### Example
```R
library(openapi)

# Retrieves an invite.
#
# prepare function argument(s)
var_invite_id <- "invite_id_example" # character | The ID of the invite to retrieve.

api_instance <- InvitesApi$new()
# Configure HTTP bearer authorization: ApiKeyAuth
api_instance$api_client$bearer_token <- Sys.getenv("BEARER_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RetrieveInvite(var_invite_iddata_file = "result.txt")
result <- api_instance$RetrieveInvite(var_invite_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **character**| The ID of the invite to retrieve. | 

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invite retrieved successfully. |  -  |

