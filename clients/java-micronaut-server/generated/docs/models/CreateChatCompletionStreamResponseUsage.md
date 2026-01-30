

# CreateChatCompletionStreamResponseUsage

An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

The class is defined in **[CreateChatCompletionStreamResponseUsage.java](../../src/main/java/org/openapitools/model/CreateChatCompletionStreamResponseUsage.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTokens** | `Integer` | Number of tokens in the generated completion. | 
**promptTokens** | `Integer` | Number of tokens in the prompt. | 
**totalTokens** | `Integer` | Total number of tokens used in the request (prompt + completion). | 





