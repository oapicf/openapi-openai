# Org.OpenAPITools.Model.Batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Object** | **string** | The object type, which is always &#x60;batch&#x60;. | 
**Endpoint** | **string** | The OpenAI API endpoint used by the batch. | 
**InputFileId** | **string** | The ID of the input file for the batch. | 
**CompletionWindow** | **string** | The time frame within which the batch should be processed. | 
**Status** | **string** | The current status of the batch. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the batch was created. | 
**Errors** | [**BatchErrors**](BatchErrors.md) |  | [optional] 
**OutputFileId** | **string** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**ErrorFileId** | **string** | The ID of the file containing the outputs of requests with errors. | [optional] 
**InProgressAt** | **int** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**ExpiresAt** | **int** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**FinalizingAt** | **int** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**CompletedAt** | **int** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**FailedAt** | **int** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**ExpiredAt** | **int** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**CancellingAt** | **int** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**CancelledAt** | **int** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**RequestCounts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] 
**Metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

