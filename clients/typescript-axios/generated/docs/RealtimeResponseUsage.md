# RealtimeResponseUsage

Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_tokens** | **number** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] [default to undefined]
**input_tokens** | **number** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] [default to undefined]
**output_tokens** | **number** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] [default to undefined]
**input_token_details** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] [default to undefined]
**output_token_details** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] [default to undefined]

## Example

```typescript
import { RealtimeResponseUsage } from './api';

const instance: RealtimeResponseUsage = {
    total_tokens,
    input_tokens,
    output_tokens,
    input_token_details,
    output_token_details,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
