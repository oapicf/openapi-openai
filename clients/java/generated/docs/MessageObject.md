

# MessageObject

Represents a message within a [thread](/docs/api-reference/threads).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.message&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the message was created. |  |
|**threadId** | **String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. |  |
|**incompleteDetails** | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  |  |
|**completedAt** | **Integer** | The Unix timestamp (in seconds) for when the message was completed. |  |
|**incompleteAt** | **Integer** | The Unix timestamp (in seconds) for when the message was marked as incomplete. |  |
|**role** | [**RoleEnum**](#RoleEnum) | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. |  |
|**content** | [**List&lt;MessageObjectContentInner&gt;**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. |  |
|**assistantId** | **String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. |  |
|**runId** | **String** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. |  |
|**attachments** | [**List&lt;CreateMessageRequestAttachmentsInner&gt;**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. |  |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD_MESSAGE | &quot;thread.message&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| INCOMPLETE | &quot;incomplete&quot; |
| COMPLETED | &quot;completed&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ASSISTANT | &quot;assistant&quot; |



