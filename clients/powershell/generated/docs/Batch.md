# Batch
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | 
**Object** | **String** | The object type, which is always &#x60;batch&#x60;. | 
**Endpoint** | **String** | The OpenAI API endpoint used by the batch. | 
**Errors** | [**BatchErrors**](BatchErrors.md) |  | [optional] 
**InputFileId** | **String** | The ID of the input file for the batch. | 
**CompletionWindow** | **String** | The time frame within which the batch should be processed. | 
**Status** | **String** | The current status of the batch. | 
**OutputFileId** | **String** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**ErrorFileId** | **String** | The ID of the file containing the outputs of requests with errors. | [optional] 
**CreatedAt** | **Int32** | The Unix timestamp (in seconds) for when the batch was created. | 
**InProgressAt** | **Int32** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**ExpiresAt** | **Int32** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**FinalizingAt** | **Int32** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**CompletedAt** | **Int32** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**FailedAt** | **Int32** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**ExpiredAt** | **Int32** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**CancellingAt** | **Int32** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**CancelledAt** | **Int32** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**RequestCounts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] 
**Metadata** | [**SystemCollectionsHashtable**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

## Examples

- Prepare the resource
```powershell
$Batch = Initialize-PSOpenAPIToolsBatch  -Id null `
 -Object null `
 -Endpoint null `
 -Errors null `
 -InputFileId null `
 -CompletionWindow null `
 -Status null `
 -OutputFileId null `
 -ErrorFileId null `
 -CreatedAt null `
 -InProgressAt null `
 -ExpiresAt null `
 -FinalizingAt null `
 -CompletedAt null `
 -FailedAt null `
 -ExpiredAt null `
 -CancellingAt null `
 -CancelledAt null `
 -RequestCounts null `
 -Metadata null
```

- Convert the resource to JSON
```powershell
$Batch | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

