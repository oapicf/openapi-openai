# MessageDeltaObjectDelta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] 
**content** | [**OpenAPI\Server\Model\MessageDeltaObjectDeltaContentInner**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. | [optional] 
**fileIds** | **string** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


