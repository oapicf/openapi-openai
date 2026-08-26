

# RealtimeServerEventResponseOutputItemAdded

Returned when a new Item is created during Response generation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;response.output_item.added&#x60;. | 
**responseId** | **String** | The ID of the Response to which the item belongs. | 
**outputIndex** | **Int** | The index of the output item in the Response. | 
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | 


## Enum: `Type`
Allowed values: [response.output_item.added]




