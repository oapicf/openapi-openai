# RealtimeServerEventResponseAudioDelta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventId** | **String!** | The unique ID of the server event. | [default to null]
**Type_** | **String!** | The event type, must be &#x60;response.audio.delta&#x60;. | [default to null]
**responseId** | **String!** | The ID of the response. | [default to null]
**itemId** | **String!** | The ID of the item. | [default to null]
**outputIndex** | **Int!** | The index of the output item in the response. | [default to null]
**contentIndex** | **Int!** | The index of the content part in the item&#39;s content array. | [default to null]
**delta** | **String!** | Base64-encoded audio data delta. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


