# MessageDeltaObjectDelta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **String** | The entity that produced the message. One of `user` or `assistant`. | [optional] [default to None]
**content** | [**Vec<models::MessageDeltaObjectDeltaContentInner>**](MessageDeltaObject_delta_content_inner.md) | The content of the message in array of text and/or images. | [optional] [default to None]
**file_ids** | **Vec<String>** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


