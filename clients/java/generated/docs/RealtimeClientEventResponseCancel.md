

# RealtimeClientEventResponseCancel

Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.cancel&#x60;. |  |
|**responseId** | **String** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_CANCEL | &quot;response.cancel&quot; |



