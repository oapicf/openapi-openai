# RealtimeServerEventResponseContentPartAdded


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`event_id`** | **`String`** | The unique ID of the server event. | [default to nothing]
**`type`** | **`String`** | The event type, must be &#x60;response.content_part.added&#x60;. | [default to nothing]
**`response_id`** | **`String`** | The ID of the response. | [default to nothing]
**`item_id`** | **`String`** | The ID of the item to which the content part was added. | [default to nothing]
**`output_index`** | **`Int64`** | The index of the output item in the response. | [default to nothing]
**`content_index`** | **`Int64`** | The index of the content part in the item&#39;s content array. | [default to nothing]
**`part`** | [**`*RealtimeServerEventResponseContentPartAddedPart`**](RealtimeServerEventResponseContentPartAddedPart.md) |  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


