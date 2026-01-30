# Batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** |  | 
**object** | **string** | The object type, which is always &#x60;batch&#x60;. | 
**endpoint** | **string** | The OpenAI API endpoint used by the batch. | 
**errors** | [**OpenAPI\Server\Model\BatchErrors**](BatchErrors.md) |  | [optional] 
**inputFileId** | **string** | The ID of the input file for the batch. | 
**completionWindow** | **string** | The time frame within which the batch should be processed. | 
**status** | **string** | The current status of the batch. | 
**outputFileId** | **string** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**errorFileId** | **string** | The ID of the file containing the outputs of requests with errors. | [optional] 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the batch was created. | 
**inProgressAt** | **int** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**expiresAt** | **int** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**finalizingAt** | **int** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**completedAt** | **int** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**failedAt** | **int** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**expiredAt** | **int** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**cancellingAt** | **int** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**cancelledAt** | **int** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**requestCounts** | [**OpenAPI\Server\Model\BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] 
**metadata** | **array** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


