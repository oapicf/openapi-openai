# REALTIME_SERVER_EVENT_RESPONSE_AUDIO_DELTA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | [**STRING_32**](STRING_32.md) | The unique ID of the server event. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | The event type, must be &#x60;response.audio.delta&#x60;. | [default to null]
**response_id** | [**STRING_32**](STRING_32.md) | The ID of the response. | [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | The ID of the item. | [default to null]
**output_index** | **INTEGER_32** | The index of the output item in the response. | [default to null]
**content_index** | **INTEGER_32** | The index of the content part in the item&#39;s content array. | [default to null]
**delta** | [**STRING_32**](STRING_32.md) | Base64-encoded audio data delta. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


