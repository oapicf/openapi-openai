# RealtimeClientEventConversationItemCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **string** | Optional client-generated ID used to identify this event. | [optional] 
**type** | **string** | The event type, must be &#x60;conversation.item.create&#x60;. | 
**previousItemId** | **string** | The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. | [optional] 
**item** | [**OpenAPI\Server\Model\RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


