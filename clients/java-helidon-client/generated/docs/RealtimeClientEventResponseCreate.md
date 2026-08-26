

# RealtimeClientEventResponseCreate

This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Optional client-generated ID used to identify this event. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.create&#x60;. |  |
|**response** | [**RealtimeResponseCreateParams**](RealtimeResponseCreateParams.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_CREATE | &quot;response.create&quot; |



