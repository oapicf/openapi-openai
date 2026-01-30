# Org.OpenAPITools.Model.RealtimeServerEventResponseContentPartAdded
Returned when a new content part is added to an assistant message item during response generation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventId** | **string** | The unique ID of the server event. | 
**Type** | **string** | The event type, must be &#x60;response.content_part.added&#x60;. | 
**ResponseId** | **string** | The ID of the response. | 
**ItemId** | **string** | The ID of the item to which the content part was added. | 
**OutputIndex** | **int** | The index of the output item in the response. | 
**ContentIndex** | **int** | The index of the content part in the item&#39;s content array. | 
**Part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

