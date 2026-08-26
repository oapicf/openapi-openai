

# CreateChatCompletionStreamResponseUsage

An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTokens** | **Int** | Number of tokens in the generated completion. | 
**promptTokens** | **Int** | Number of tokens in the prompt. | 
**totalTokens** | **Int** | Total number of tokens used in the request (prompt + completion). | 



