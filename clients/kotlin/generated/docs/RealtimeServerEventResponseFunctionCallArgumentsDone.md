
# RealtimeServerEventResponseFunctionCallArgumentsDone

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String** | The unique ID of the server event. |  |
| **type** | [**inline**](#Type) | The event type, must be &#x60;response.function_call_arguments.done&#x60;.  |  |
| **responseId** | **kotlin.String** | The ID of the response. |  |
| **itemId** | **kotlin.String** | The ID of the function call item. |  |
| **outputIndex** | **kotlin.Int** | The index of the output item in the response. |  |
| **callId** | **kotlin.String** | The ID of the function call. |  |
| **arguments** | **kotlin.String** | The final arguments as a JSON string. |  |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.function_call_arguments.done |



