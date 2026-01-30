# Org.OpenAPITools.Model.RealtimeResponseUsage
Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TotalTokens** | **int** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] 
**InputTokens** | **int** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] 
**OutputTokens** | **int** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] 
**InputTokenDetails** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] 
**OutputTokenDetails** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

