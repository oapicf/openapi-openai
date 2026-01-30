# OAIBatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** |  | 
**object** | **NSString*** | The object type, which is always &#x60;batch&#x60;. | 
**endpoint** | **NSString*** | The OpenAI API endpoint used by the batch. | 
**errors** | [**OAIBatchErrors***](OAIBatchErrors.md) |  | [optional] 
**inputFileId** | **NSString*** | The ID of the input file for the batch. | 
**completionWindow** | **NSString*** | The time frame within which the batch should be processed. | 
**status** | **NSString*** | The current status of the batch. | 
**outputFileId** | **NSString*** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**errorFileId** | **NSString*** | The ID of the file containing the outputs of requests with errors. | [optional] 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch was created. | 
**inProgressAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**expiresAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**finalizingAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**completedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**failedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**expiredAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**cancellingAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**cancelledAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**requestCounts** | [**OAIBatchRequestCounts***](OAIBatchRequestCounts.md) |  | [optional] 
**metadata** | [**NSObject***](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


