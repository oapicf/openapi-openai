# MessageObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | **String!** | The object type, which is always &#x60;thread.message&#x60;. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the message was created. | [default to null]
**threadId** | **String!** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | [default to null]
**status** | **String!** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | [default to null]
**incompleteDetails** | [***MessageObjectIncompleteDetails**](MessageObject_incomplete_details.md) |  | [default to null]
**completedAt** | **Int** | The Unix timestamp (in seconds) for when the message was completed. | [default to null]
**incompleteAt** | **Int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | [default to null]
**role** | **String!** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [default to null]
**content** | [**MessageObjectContentInner**](MessageObject_content_inner.md) | The content of the message in array of text and/or images. | [default to null]
**assistantId** | **String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | [default to null]
**runId** | **String** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | [default to null]
**fileIds** | **String!** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [default to []]
**metadata** | [***TodoObjectMapping**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


