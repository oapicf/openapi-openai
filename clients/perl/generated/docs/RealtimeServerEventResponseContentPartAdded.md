# WWW::OpenAPIClient::Object::RealtimeServerEventResponseContentPartAdded

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeServerEventResponseContentPartAdded;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | 
**type** | **string** | The event type, must be &#x60;response.content_part.added&#x60;. | 
**response_id** | **string** | The ID of the response. | 
**item_id** | **string** | The ID of the item to which the content part was added. | 
**output_index** | **int** | The index of the output item in the response. | 
**content_index** | **int** | The index of the content part in the item&#39;s content array. | 
**part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


