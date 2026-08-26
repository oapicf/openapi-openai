# MessageObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The identifier, which can be referenced in API endpoints. | [default to nothing]
**`object`** | **`String`** | The object type, which is always &#x60;thread.message&#x60;. | [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the message was created. | [default to nothing]
**`thread_id`** | **`String`** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | [default to nothing]
**`status`** | **`String`** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | [default to nothing]
**`incomplete_details`** | [**`*MessageObjectIncompleteDetails`**](MessageObjectIncompleteDetails.md) |  | [default to nothing]
**`completed_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the message was completed. | [default to nothing]
**`incomplete_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | [default to nothing]
**`role`** | **`String`** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [default to nothing]
**`content`** | [**`Vector{MessageObjectContentInner}`**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | [default to nothing]
**`assistant_id`** | **`String`** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | [default to nothing]
**`run_id`** | **`String`** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | [default to nothing]
**`attachments`** | [**`Vector{CreateMessageRequestAttachmentsInner}`**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. | [default to nothing]
**`metadata`** | **`Any`** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


