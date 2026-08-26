

# RealtimeServerEventResponseCreated

Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | The unique ID of the server event. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, must be &#x60;response.created&#x60;. |  |
|**response** | [**RealtimeResponse**](RealtimeResponse.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESPONSE_CREATED | &quot;response.created&quot; |



