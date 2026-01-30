# OpenapiOpenai.Batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**object** | **String** | The object type, which is always &#x60;batch&#x60;. | 
**endpoint** | **String** | The OpenAI API endpoint used by the batch. | 
**errors** | [**BatchErrors**](BatchErrors.md) |  | [optional] 
**inputFileId** | **String** | The ID of the input file for the batch. | 
**completionWindow** | **String** | The time frame within which the batch should be processed. | 
**status** | **String** | The current status of the batch. | 
**outputFileId** | **String** | The ID of the file containing the outputs of successfully executed requests. | [optional] 
**errorFileId** | **String** | The ID of the file containing the outputs of requests with errors. | [optional] 
**createdAt** | **Number** | The Unix timestamp (in seconds) for when the batch was created. | 
**inProgressAt** | **Number** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] 
**expiresAt** | **Number** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] 
**finalizingAt** | **Number** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] 
**completedAt** | **Number** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] 
**failedAt** | **Number** | The Unix timestamp (in seconds) for when the batch failed. | [optional] 
**expiredAt** | **Number** | The Unix timestamp (in seconds) for when the batch expired. | [optional] 
**cancellingAt** | **Number** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] 
**cancelledAt** | **Number** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] 
**requestCounts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  | [optional] 
**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 



## Enum: ObjectEnum


* `batch` (value: `"batch"`)





## Enum: StatusEnum


* `validating` (value: `"validating"`)

* `failed` (value: `"failed"`)

* `in_progress` (value: `"in_progress"`)

* `finalizing` (value: `"finalizing"`)

* `completed` (value: `"completed"`)

* `expired` (value: `"expired"`)

* `cancelling` (value: `"cancelling"`)

* `cancelled` (value: `"cancelled"`)




