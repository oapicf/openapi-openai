# MessageDeltaObject_delta
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **role** | **String** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] [default to null] |
| **content** | [**List**](MessageDeltaObject_delta_content_inner.md) | The content of the message in array of text and/or images. | [optional] [default to null] |
| **file\_ids** | **List** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] [default to []] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

