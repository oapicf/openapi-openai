# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**deleteInvite**](#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.|
|[**inviteUser**](#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.|
|[**listInvites**](#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization.|
|[**retrieveInvite**](#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.|

# **deleteInvite**
> InviteDeleteResponse deleteInvite()


### Example

```typescript
import {
    InvitesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new InvitesApi(configuration);

let inviteId: string; //The ID of the invite to delete. (default to undefined)

const { status, data } = await apiInstance.deleteInvite(
    inviteId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **inviteId** | [**string**] | The ID of the invite to delete. | defaults to undefined|


### Return type

**InviteDeleteResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Invite deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **inviteUser**
> Invite inviteUser(inviteRequest)


### Example

```typescript
import {
    InvitesApi,
    Configuration,
    InviteRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new InvitesApi(configuration);

let inviteRequest: InviteRequest; //The invite request payload.

const { status, data } = await apiInstance.inviteUser(
    inviteRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **inviteRequest** | **InviteRequest**| The invite request payload. | |


### Return type

**Invite**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | User invited successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listInvites**
> InviteListResponse listInvites()


### Example

```typescript
import {
    InvitesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new InvitesApi(configuration);

let limit: number; //A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
let after: string; //A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional) (default to undefined)

const { status, data } = await apiInstance.listInvites(
    limit,
    after
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | (optional) defaults to 20|
| **after** | [**string**] | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | (optional) defaults to undefined|


### Return type

**InviteListResponse**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Invites listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieveInvite**
> Invite retrieveInvite()


### Example

```typescript
import {
    InvitesApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new InvitesApi(configuration);

let inviteId: string; //The ID of the invite to retrieve. (default to undefined)

const { status, data } = await apiInstance.retrieveInvite(
    inviteId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **inviteId** | [**string**] | The ID of the invite to retrieve. | defaults to undefined|


### Return type

**Invite**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Invite retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

