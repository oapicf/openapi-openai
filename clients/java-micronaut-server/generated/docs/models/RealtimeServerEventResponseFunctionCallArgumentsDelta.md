

# RealtimeServerEventResponseFunctionCallArgumentsDelta

Returned when the model-generated function call arguments are updated. 

The class is defined in **[RealtimeServerEventResponseFunctionCallArgumentsDelta.java](../../src/main/java/org/openapitools/model/RealtimeServerEventResponseFunctionCallArgumentsDelta.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | `String` | The unique ID of the server event. | 
**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.function_call_arguments.delta&#x60;.  | 
**responseId** | `String` | The ID of the response. | 
**itemId** | `String` | The ID of the function call item. | 
**outputIndex** | `Integer` | The index of the output item in the response. | 
**callId** | `String` | The ID of the function call. | 
**delta** | `String` | The arguments delta as a JSON string. | 


## TypeEnum

Name | Value
---- | -----
RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA | `"response.function_call_arguments.delta"`







