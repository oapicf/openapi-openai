
# RealtimeClientEventResponseCancel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | The event type, must be &#x60;response.cancel&#x60;. |  |
| **eventId** | **kotlin.String** | Optional client-generated ID used to identify this event. |  [optional] |
| **responseId** | **kotlin.String** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | response.cancel |



