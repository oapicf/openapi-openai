# InvitesApi

All URIs are relative to *https://api.openai.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteInvite**](InvitesApi.md#deleteinvite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted. |
| [**inviteUser**](InvitesApi.md#inviteuser) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization. |
| [**listInvites**](InvitesApi.md#listinvites) | **GET** /organization/invites | Returns a list of invites in the organization. |
| [**retrieveInvite**](InvitesApi.md#retrieveinvite) | **GET** /organization/invites/{invite_id} | Retrieves an invite. |



## deleteInvite

> InviteDeleteResponse deleteInvite(inviteId)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example

```ts
import {
  Configuration,
  InvitesApi,
} from '';
import type { DeleteInviteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new InvitesApi(config);

  const body = {
    // string | The ID of the invite to delete.
    inviteId: inviteId_example,
  } satisfies DeleteInviteRequest;

  try {
    const data = await api.deleteInvite(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteId** | `string` | The ID of the invite to delete. | [Defaults to `undefined`] |

### Return type

[**InviteDeleteResponse**](InviteDeleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invite deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## inviteUser

> Invite inviteUser(inviteRequest)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example

```ts
import {
  Configuration,
  InvitesApi,
} from '';
import type { InviteUserRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new InvitesApi(config);

  const body = {
    // InviteRequest | The invite request payload.
    inviteRequest: ...,
  } satisfies InviteUserRequest;

  try {
    const data = await api.inviteUser(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteRequest** | [InviteRequest](InviteRequest.md) | The invite request payload. | |

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User invited successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listInvites

> InviteListResponse listInvites(limit, after)

Returns a list of invites in the organization.

### Example

```ts
import {
  Configuration,
  InvitesApi,
} from '';
import type { ListInvitesRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new InvitesApi(config);

  const body = {
    // number | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional)
    limit: 56,
    // string | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)
    after: after_example,
  } satisfies ListInvitesRequest;

  try {
    const data = await api.listInvites(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [Optional] [Defaults to `20`] |
| **after** | `string` | A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [Optional] [Defaults to `undefined`] |

### Return type

[**InviteListResponse**](InviteListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invites listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## retrieveInvite

> Invite retrieveInvite(inviteId)

Retrieves an invite.

### Example

```ts
import {
  Configuration,
  InvitesApi,
} from '';
import type { RetrieveInviteRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: ApiKeyAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new InvitesApi(config);

  const body = {
    // string | The ID of the invite to retrieve.
    inviteId: inviteId_example,
  } satisfies RetrieveInviteRequest;

  try {
    const data = await api.retrieveInvite(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inviteId** | `string` | The ID of the invite to retrieve. | [Defaults to `undefined`] |

### Return type

[**Invite**](Invite.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Invite retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

