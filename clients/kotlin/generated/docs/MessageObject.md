
# MessageObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;thread.message&#x60;. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the message was created. |  |
| **threadId** | **kotlin.String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. |  |
| **status** | [**inline**](#Status) | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. |  |
| **incompleteDetails** | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  |  |
| **completedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the message was completed. |  |
| **incompleteAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. |  |
| **role** | [**inline**](#Role) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  |
| **content** | [**kotlin.collections.List&lt;MessageObjectContentInner&gt;**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. |  |
| **assistantId** | **kotlin.String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. |  |
| **runId** | **kotlin.String** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. |  |
| **attachments** | [**kotlin.collections.List&lt;CreateMessageRequestAttachmentsInner&gt;**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. |  |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | thread.message |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, incomplete, completed |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | user, assistant |



