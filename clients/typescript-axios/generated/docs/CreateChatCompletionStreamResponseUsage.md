# CreateChatCompletionStreamResponseUsage

An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **number** | Number of tokens in the generated completion. | [default to undefined]
**prompt_tokens** | **number** | Number of tokens in the prompt. | [default to undefined]
**total_tokens** | **number** | Total number of tokens used in the request (prompt + completion). | [default to undefined]

## Example

```typescript
import { CreateChatCompletionStreamResponseUsage } from './api';

const instance: CreateChatCompletionStreamResponseUsage = {
    completion_tokens,
    prompt_tokens,
    total_tokens,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
