# Org.OpenAPITools.Model.RealtimeServerEventResponseOutputItemAdded
Returned when a new Item is created during Response generation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.output_item.added&#x60;. | 
**ResponseId** | **string** | The ID of the Response to which the item belongs. | 
**OutputIndex** | **int** | The index of the output item in the Response. | 
**Item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

