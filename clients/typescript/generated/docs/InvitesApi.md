# .InvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteInvite**](InvitesApi.md#deleteInvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**inviteUser**](InvitesApi.md#inviteUser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**listInvites**](InvitesApi.md#listInvites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieveInvite**](InvitesApi.md#retrieveInvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **deleteInvite**
> InviteDeleteResponse deleteInvite()


### Example


```typescript
import { createConfiguration, InvitesApi } from '';
import type { InvitesApiDeleteInviteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new InvitesApi(configuration);

const request: InvitesApiDeleteInviteRequest = {
    // The ID of the invite to delete.
  inviteId: "invite_id_example",
};

const data = await apiInstance.deleteInvite(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | [**string**] | The ID of the invite to delete. | defaults to undefined


### Return type

**InviteDeleteResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invite deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **inviteUser**
> Invite inviteUser(inviteRequest)


### Example


```typescript
import { createConfiguration, InvitesApi } from '';
import type { InvitesApiInviteUserRequest } from '';

const configuration = createConfiguration();
const apiInstance = new InvitesApi(configuration);

const request: InvitesApiInviteUserRequest = {
    // The invite request payload.
  inviteRequest: {
    email: "email_example",
    role: "reader",
    projects: [
      {
        id: "id_example",
        role: "member",
      },
    ],
  },
};

const data = await apiInstance.inviteUser(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteRequest** | **InviteRequest**| The invite request payload. |


### Return type

**Invite**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | User invited successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listInvites**
> InviteListResponse listInvites()


### Example


```typescript
import { createConfiguration, InvitesApi } from '';
import type { InvitesApiListInvitesRequest } from '';

const configuration = createConfiguration();
const apiInstance = new InvitesApi(configuration);

const request: InvitesApiListInvitesRequest = {
    // A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
  limit: 20,
    // A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
  after: "after_example",
};

const data = await apiInstance.listInvites(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20
 **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined


### Return type

**InviteListResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invites listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveInvite**
> Invite retrieveInvite()


### Example


```typescript
import { createConfiguration, InvitesApi } from '';
import type { InvitesApiRetrieveInviteRequest } from '';

const configuration = createConfiguration();
const apiInstance = new InvitesApi(configuration);

const request: InvitesApiRetrieveInviteRequest = {
    // The ID of the invite to retrieve.
  inviteId: "invite_id_example",
};

const data = await apiInstance.retrieveInvite(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inviteId** | [**string**] | The ID of the invite to retrieve. | defaults to undefined


### Return type

**Invite**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Invite retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


