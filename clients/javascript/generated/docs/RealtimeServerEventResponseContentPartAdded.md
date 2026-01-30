# OpenapiOpenai.RealtimeServerEventResponseContentPartAdded

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**type** | **String** | The event type, must be &#x60;response.content_part.added&#x60;. | 
**responseId** | **String** | The ID of the response. | 
**itemId** | **String** | The ID of the item to which the content part was added. | 
**outputIndex** | **Number** | The index of the output item in the response. | 
**contentIndex** | **Number** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  | 



## Enum: TypeEnum


* `response.content_part.added` (value: `"response.content_part.added"`)




