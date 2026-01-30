

# RealtimeServerEventResponseFunctionCallArgumentsDone

Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String** | The unique ID of the server event. | 
**`type`** | [**`Type`**](#`Type`) | The event type, must be &#x60;response.function_call_arguments.done&#x60;.  | 
**responseId** | **String** | The ID of the response. | 
**itemId** | **String** | The ID of the function call item. | 
**outputIndex** | **Int** | The index of the output item in the response. | 
**callId** | **String** | The ID of the function call. | 
**arguments** | **String** | The final arguments as a JSON string. | 


## Enum: `Type`
Allowed values: [response.function_call_arguments.done]




