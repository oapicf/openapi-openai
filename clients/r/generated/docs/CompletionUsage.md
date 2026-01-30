# openapi::CompletionUsage

Usage statistics for the completion request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **integer** | Number of tokens in the generated completion. | 
**prompt_tokens** | **integer** | Number of tokens in the prompt. | 
**total_tokens** | **integer** | Total number of tokens used in the request (prompt + completion). | 
**completion_tokens_details** | [**CompletionUsageCompletionTokensDetails**](CompletionUsage_completion_tokens_details.md) |  | [optional] 
**prompt_tokens_details** | [**CompletionUsagePromptTokensDetails**](CompletionUsage_prompt_tokens_details.md) |  | [optional] 


