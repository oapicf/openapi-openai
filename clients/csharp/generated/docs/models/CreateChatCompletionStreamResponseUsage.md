# Org.OpenAPITools.Model.CreateChatCompletionStreamResponseUsage
An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **int** | Number of tokens in the generated completion. | 
**PromptTokens** | **int** | Number of tokens in the prompt. | 
**TotalTokens** | **int** | Total number of tokens used in the request (prompt + completion). | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

