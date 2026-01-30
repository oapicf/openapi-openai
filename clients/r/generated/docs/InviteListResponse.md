# openapi::InviteListResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **character** | The object type, which is always &#x60;list&#x60; | [Enum: [list]] 
**data** | [**array[Invite]**](Invite.md) |  | 
**first_id** | **character** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**last_id** | **character** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; | [optional] 
**has_more** | **character** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. | [optional] 


