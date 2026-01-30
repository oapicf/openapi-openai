# openapi::RealtimeResponseUsage

Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_tokens** | **integer** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] 
**input_tokens** | **integer** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] 
**output_tokens** | **integer** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] 
**input_token_details** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponse_usage_input_token_details.md) |  | [optional] 
**output_token_details** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponse_usage_output_token_details.md) |  | [optional] 


