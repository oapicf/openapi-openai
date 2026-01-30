
# Batch

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;batch&#x60;. |  |
| **endpoint** | **kotlin.String** | The OpenAI API endpoint used by the batch. |  |
| **inputFileId** | **kotlin.String** | The ID of the input file for the batch. |  |
| **completionWindow** | **kotlin.String** | The time frame within which the batch should be processed. |  |
| **status** | [**inline**](#Status) | The current status of the batch. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch was created. |  |
| **errors** | [**BatchErrors**](BatchErrors.md) |  |  [optional] |
| **outputFileId** | **kotlin.String** | The ID of the file containing the outputs of successfully executed requests. |  [optional] |
| **errorFileId** | **kotlin.String** | The ID of the file containing the outputs of requests with errors. |  [optional] |
| **inProgressAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch started processing. |  [optional] |
| **expiresAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch will expire. |  [optional] |
| **finalizingAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch started finalizing. |  [optional] |
| **completedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch was completed. |  [optional] |
| **failedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch failed. |  [optional] |
| **expiredAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch expired. |  [optional] |
| **cancellingAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch started cancelling. |  [optional] |
| **cancelledAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the batch was cancelled. |  [optional] |
| **requestCounts** | [**BatchRequestCounts**](BatchRequestCounts.md) |  |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | batch |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | validating, failed, in_progress, finalizing, completed, expired, cancelling, cancelled |



