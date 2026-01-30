# openapi::CreateChatCompletionStreamResponseUsage

An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **integer** | Number of tokens in the generated completion. | 
**prompt_tokens** | **integer** | Number of tokens in the prompt. | 
**total_tokens** | **integer** | Total number of tokens used in the request (prompt + completion). | 


