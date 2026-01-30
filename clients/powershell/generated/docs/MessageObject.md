# MessageObject
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | The identifier, which can be referenced in API endpoints. | 
**Object** | **String** | The object type, which is always &#x60;thread.message&#x60;. | 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the message was created. | 
**ThreadId** | **String** | The [thread](/docs/api-reference/threads) ID that this message belongs to. | 
**Status** | **String** | The status of the message, which can be either &#x60;in_progress&#x60;, &#x60;incomplete&#x60;, or &#x60;completed&#x60;. | 
**IncompleteDetails** | [**MessageObjectIncompleteDetails**](MessageObjectIncompleteDetails.md) |  | 
**CompletedAt** | **Int32** | The Unix timestamp (in seconds) for when the message was completed. | 
**IncompleteAt** | **Int32** | The Unix timestamp (in seconds) for when the message was marked as incomplete. | 
**Role** | **String** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | 
**Content** | [**MessageObjectContentInner[]**](MessageObjectContentInner.md) | The content of the message in array of text and/or images. | 
**AssistantId** | **String** | If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message. | 
**RunId** | **String** | The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is &#x60;null&#x60; when messages are created manually using the create message or create thread endpoints. | 
**Attachments** | [**CreateMessageRequestAttachmentsInner[]**](CreateMessageRequestAttachmentsInner.md) | A list of files attached to the message, and the tools they were added to. | 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Examples

- Prepare the resource
```powershell
$MessageObject = Initialize-PSOpenAPIToolsMessageObject  -Id null `
 -Object null `
 -CreatedAt null `
 -ThreadId null `
 -Status null `
 -IncompleteDetails null `
 -CompletedAt null `
 -IncompleteAt null `
 -Role null `
 -Content null `
 -AssistantId null `
 -RunId null `
 -Attachments null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$MessageObject | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

