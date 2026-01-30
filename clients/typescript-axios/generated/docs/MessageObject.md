# MessageObject

Represents a message within a [thread](/docs/api-reference/threads).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread.message&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the message was created. | [default to undefined]
**thread_id** | **string** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | [default to undefined]
**status** | **string** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | [default to undefined]
**incomplete_details** | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  | [default to undefined]
**completed_at** | **number** | The Unix timestamp (in seconds) for when the message was completed. | [default to undefined]
**incomplete_at** | **number** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | [default to undefined]
**role** | **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [default to undefined]
**content** | [**Array&lt;MessageObjectContentInner&gt;**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | [default to undefined]
**assistant_id** | **string** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | [default to undefined]
**run_id** | **string** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | [default to undefined]
**attachments** | [**Array&lt;CreateMessageRequestAttachmentsInner&gt;**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. | [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to undefined]

## Example

```typescript
import { MessageObject } from './api';

const instance: MessageObject = {
    id,
    object,
    created_at,
    thread_id,
    status,
    incomplete_details,
    completed_at,
    incomplete_at,
    role,
    content,
    assistant_id,
    run_id,
    attachments,
    metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
