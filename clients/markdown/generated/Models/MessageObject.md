# MessageObject
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | The identifier, which can be referenced in API endpoints. | [default to null] |
| **object** | **String** | The object type, which is always &#x60;thread.message&#x60;. | [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the message was created. | [default to null] |
| **thread\_id** | **String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | [default to null] |
| **status** | **String** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | [default to null] |
| **incomplete\_details** | [**MessageObject_incomplete_details**](MessageObject_incomplete_details.md) |  | [default to null] |
| **completed\_at** | **Integer** | The Unix timestamp (in seconds) for when the message was completed. | [default to null] |
| **incomplete\_at** | **Integer** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | [default to null] |
| **role** | **String** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [default to null] |
| **content** | [**List**](MessageObject_content_inner.md) | The content of the message in array of text and/or images. | [default to null] |
| **assistant\_id** | **String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | [default to null] |
| **run\_id** | **String** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | [default to null] |
| **file\_ids** | **List** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [default to []] |
| **metadata** | [**Object**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

