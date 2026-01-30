# Org.OpenAPITools.Model.MessageObject
Represents a message within a [thread](/docs/api-reference/threads).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.message&#x60;. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the message was created. | 
**ThreadId** | **string** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**Status** | **string** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**Role** | **string** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**Content** | [**List&lt;MessageObjectContentInner&gt;**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | 
**IncompleteDetails** | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  | 
**CompletedAt** | **int** | The Unix timestamp (in seconds) for when the message was completed. | 
**IncompleteAt** | **int** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**AssistantId** | **string** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**RunId** | **string** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**Attachments** | [**List&lt;CreateMessageRequestAttachmentsInner&gt;**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. | 
**Metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

