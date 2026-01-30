

# RealtimeServerEventResponseAudioDone

Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;response.audio.done&#x60;. | 
**responseId** | **String** | The ID of the response. | 
**itemId** | **String** | The ID of the item. | 
**outputIndex** | **Int** | The index of the output item in the response. | 
**contentIndex** | **Int** | The index of the content part in the item&#39;s content array. | 


## Enum: `Type`
Allowed values: [response.audio.done]




