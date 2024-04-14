# openapi::RunCompletionUsage

Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **integer** | Number of completion tokens used over the course of the run. | 
**prompt_tokens** | **integer** | Number of prompt tokens used over the course of the run. | 
**total_tokens** | **integer** | Total number of tokens used (prompt + completion). | 


