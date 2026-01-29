# Org.OpenAPITools.Model.RunCompletionUsage
Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompletionTokens** | **int** | Number of completion tokens used over the course of the run. | 
**PromptTokens** | **int** | Number of prompt tokens used over the course of the run. | 
**TotalTokens** | **int** | Total number of tokens used (prompt + completion). | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

