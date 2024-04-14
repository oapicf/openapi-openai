# MessageObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | 
**object** | **string** | The object type, which is always &#x60;thread.message&#x60;. | 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the message was created. | 
**threadId** | **string** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**status** | **string** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**incompleteDetails** | [**OpenAPI\Server\Model\MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  | 
**completedAt** | **int** | The Unix timestamp (in seconds) for when the message was completed. | 
**incompleteAt** | **int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**role** | **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**content** | [**OpenAPI\Server\Model\MessageObjectContentInner**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | 
**assistantId** | **string** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**runId** | **string** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**fileIds** | **string** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | 
**metadata** | **array** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


