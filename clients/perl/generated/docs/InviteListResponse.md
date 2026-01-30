# WWW::OpenAPIClient::Object::InviteListResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::InviteListResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **string** | The object type, which is always &#x60;list&#x60; | 
**data** | [**ARRAY[Invite]**](Invite.md) |  | 
**first_id** | **string** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**last_id** | **string** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**has_more** | **boolean** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


