

# Batch

The class is defined in **[Batch.java](../../src/main/java/org/openapitools/model/Batch.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` |  | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;batch&#x60;. | 
**endpoint** | `String` | The OpenAI API endpoint used by the batch. | 
**errors** | [`BatchErrors`](BatchErrors.md) |  |  [optional property]
**inputFileId** | `String` | The ID of the input file for the batch. | 
**completionWindow** | `String` | The time frame within which the batch should be processed. | 
**status** | [**StatusEnum**](#StatusEnum) | The current status of the batch. | 
**outputFileId** | `String` | The ID of the file containing the outputs of successfully executed requests. |  [optional property]
**errorFileId** | `String` | The ID of the file containing the outputs of requests with errors. |  [optional property]
**createdAt** | `Integer` | The Unix timestamp (in seconds) for when the batch was created. | 
**inProgressAt** | `Integer` | The Unix timestamp (in seconds) for when the batch started processing. |  [optional property]
**expiresAt** | `Integer` | The Unix timestamp (in seconds) for when the batch will expire. |  [optional property]
**finalizingAt** | `Integer` | The Unix timestamp (in seconds) for when the batch started finalizing. |  [optional property]
**completedAt** | `Integer` | The Unix timestamp (in seconds) for when the batch was completed. |  [optional property]
**failedAt** | `Integer` | The Unix timestamp (in seconds) for when the batch failed. |  [optional property]
**expiredAt** | `Integer` | The Unix timestamp (in seconds) for when the batch expired. |  [optional property]
**cancellingAt** | `Integer` | The Unix timestamp (in seconds) for when the batch started cancelling. |  [optional property]
**cancelledAt** | `Integer` | The Unix timestamp (in seconds) for when the batch was cancelled. |  [optional property]
**requestCounts** | [`BatchRequestCounts`](BatchRequestCounts.md) |  |  [optional property]
**metadata** | `Object` | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional property]


## ObjectEnum

Name | Value
---- | -----
BATCH | `"batch"`





## StatusEnum

Name | Value
---- | -----
VALIDATING | `"validating"`
FAILED | `"failed"`
IN_PROGRESS | `"in_progress"`
FINALIZING | `"finalizing"`
COMPLETED | `"completed"`
EXPIRED | `"expired"`
CANCELLING | `"cancelling"`
CANCELLED | `"cancelled"`















