

# Batch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;batch&#x60;. |  |
|**endpoint** | **String** | The OpenAI API endpoint used by the batch. |  |
|**errors** | [**BatchErrors**](BatchErrors.md) |  |  [optional] |
|**inputFileId** | **String** | The ID of the input file for the batch. |  |
|**completionWindow** | **String** | The time frame within which the batch should be processed. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the batch. |  |
|**outputFileId** | **String** | The ID of the file containing the outputs of successfully executed requests. |  [optional] |
|**errorFileId** | **String** | The ID of the file containing the outputs of requests with errors. |  [optional] |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the batch was created. |  |
|**inProgressAt** | **Integer** | The Unix timestamp (in seconds) for when the batch started processing. |  [optional] |
|**expiresAt** | **Integer** | The Unix timestamp (in seconds) for when the batch will expire. |  [optional] |
|**finalizingAt** | **Integer** | The Unix timestamp (in seconds) for when the batch started finalizing. |  [optional] |
|**completedAt** | **Integer** | The Unix timestamp (in seconds) for when the batch was completed. |  [optional] |
|**failedAt** | **Integer** | The Unix timestamp (in seconds) for when the batch failed. |  [optional] |
|**expiredAt** | **Integer** | The Unix timestamp (in seconds) for when the batch expired. |  [optional] |
|**cancellingAt** | **Integer** | The Unix timestamp (in seconds) for when the batch started cancelling. |  [optional] |
|**cancelledAt** | **Integer** | The Unix timestamp (in seconds) for when the batch was cancelled. |  [optional] |
|**requestCounts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  |  [optional] |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BATCH | &quot;batch&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATING | &quot;validating&quot; |
| FAILED | &quot;failed&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| FINALIZING | &quot;finalizing&quot; |
| COMPLETED | &quot;completed&quot; |
| EXPIRED | &quot;expired&quot; |
| CANCELLING | &quot;cancelling&quot; |
| CANCELLED | &quot;cancelled&quot; |



