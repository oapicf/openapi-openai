# Batch
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** |  | [default to null] |
| **object** | **String** | The object type, which is always &#x60;batch&#x60;. | [default to null] |
| **endpoint** | **String** | The OpenAI API endpoint used by the batch. | [default to null] |
| **errors** | [**Batch_errors**](Batch_errors.md) |  | [optional] [default to null] |
| **input\_file\_id** | **String** | The ID of the input file for the batch. | [default to null] |
| **completion\_window** | **String** | The time frame within which the batch should be processed. | [default to null] |
| **status** | **String** | The current status of the batch. | [default to null] |
| **output\_file\_id** | **String** | The ID of the file containing the outputs of successfully executed requests. | [optional] [default to null] |
| **error\_file\_id** | **String** | The ID of the file containing the outputs of requests with errors. | [optional] [default to null] |
| **created\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch was created. | [default to null] |
| **in\_progress\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch started processing. | [optional] [default to null] |
| **expires\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch will expire. | [optional] [default to null] |
| **finalizing\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch started finalizing. | [optional] [default to null] |
| **completed\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch was completed. | [optional] [default to null] |
| **failed\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch failed. | [optional] [default to null] |
| **expired\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch expired. | [optional] [default to null] |
| **cancelling\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch started cancelling. | [optional] [default to null] |
| **cancelled\_at** | **Integer** | The Unix timestamp (in seconds) for when the batch was cancelled. | [optional] [default to null] |
| **request\_counts** | [**Batch_request_counts**](Batch_request_counts.md) |  | [optional] [default to null] |
| **metadata** | [**Object**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

