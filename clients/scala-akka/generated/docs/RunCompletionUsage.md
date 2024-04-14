

# RunCompletionUsage

Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTokens** | **Int** | Number of completion tokens used over the course of the run. | 
**promptTokens** | **Int** | Number of prompt tokens used over the course of the run. | 
**totalTokens** | **Int** | Total number of tokens used (prompt + completion). | 



