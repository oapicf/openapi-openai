# # TruncationObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The truncation strategy to use for the thread. The default is &#x60;auto&#x60;. If set to &#x60;last_messages&#x60;, the thread will be truncated to the n most recent messages in the thread. When set to &#x60;auto&#x60;, messages in the middle of the thread will be dropped to fit the context length of the model, &#x60;max_prompt_tokens&#x60;. | [optional]
**last_messages** | **int** | The number of most recent messages from the thread when constructing the context for the run. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
