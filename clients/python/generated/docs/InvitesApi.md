# openapiopenai.InvitesApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_invite**](InvitesApi.md#delete_invite) | **DELETE** /organization/invites/{invite_id} | Delete an invite. If the invite has already been accepted, it cannot be deleted.
[**invite_user**](InvitesApi.md#invite_user) | **POST** /organization/invites | Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
[**list_invites**](InvitesApi.md#list_invites) | **GET** /organization/invites | Returns a list of invites in the organization.
[**retrieve_invite**](InvitesApi.md#retrieve_invite) | **GET** /organization/invites/{invite_id} | Retrieves an invite.


# **delete_invite**
> InviteDeleteResponse delete_invite(invite_id)

Delete an invite. If the invite has already been accepted, it cannot be deleted.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.invite_delete_response import InviteDeleteResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.InvitesApi(api_client)
    invite_id = 'invite_id_example' # str | The ID of the invite to delete.

    try:
        # Delete an invite. If the invite has already been accepted, it cannot be deleted.
        api_response = api_instance.delete_invite(invite_id)
        print("The response of InvitesApi->delete_invite:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InvitesApi->delete_invite: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **str**| The ID of the invite to delete. | 

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
**200** | Invite deleted successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invite_user**
> Invite invite_user(invite_request)

Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.invite import Invite
from openapiopenai.models.invite_request import InviteRequest
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.InvitesApi(api_client)
    invite_request = openapiopenai.InviteRequest() # InviteRequest | The invite request payload.

    try:
        # Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
        api_response = api_instance.invite_user(invite_request)
        print("The response of InvitesApi->invite_user:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InvitesApi->invite_user: %s\n" % e)
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
**200** | User invited successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_invites**
> InviteListResponse list_invites(limit=limit, after=after)

Returns a list of invites in the organization.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.invite_list_response import InviteListResponse
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.InvitesApi(api_client)
    limit = 20 # int | A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  (optional) (default to 20)
    after = 'after_example' # str | A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.  (optional)

    try:
        # Returns a list of invites in the organization.
        api_response = api_instance.list_invites(limit=limit, after=after)
        print("The response of InvitesApi->list_invites:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InvitesApi->list_invites: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**| A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.  | [optional] [default to 20]
 **after** | **str**| A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list.  | [optional] 

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
**200** | Invites listed successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **retrieve_invite**
> Invite retrieve_invite(invite_id)

Retrieves an invite.

### Example

* Bearer Authentication (ApiKeyAuth):

```python
import openapiopenai
from openapiopenai.models.invite import Invite
from openapiopenai.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.openai.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiopenai.Configuration(
    host = "https://api.openai.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: ApiKeyAuth
configuration = openapiopenai.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapiopenai.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiopenai.InvitesApi(api_client)
    invite_id = 'invite_id_example' # str | The ID of the invite to retrieve.

    try:
        # Retrieves an invite.
        api_response = api_instance.retrieve_invite(invite_id)
        print("The response of InvitesApi->retrieve_invite:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling InvitesApi->retrieve_invite: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invite_id** | **str**| The ID of the invite to retrieve. | 

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
**200** | Invite retrieved successfully. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

