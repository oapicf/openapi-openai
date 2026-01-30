

# RealtimeResponseUsage

Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalTokens** | **Integer** | The total number of tokens in the Response including input and output  text and audio tokens.  |  [optional] |
|**inputTokens** | **Integer** | The number of input tokens used in the Response, including text and  audio tokens.  |  [optional] |
|**outputTokens** | **Integer** | The number of output tokens sent in the Response, including text and  audio tokens.  |  [optional] |
|**inputTokenDetails** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  |  [optional] |
|**outputTokenDetails** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  |  [optional] |



