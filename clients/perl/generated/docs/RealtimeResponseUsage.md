# WWW::OpenAPIClient::Object::RealtimeResponseUsage

## Load the model package
```perl
use WWW::OpenAPIClient::Object::RealtimeResponseUsage;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_tokens** | **int** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] 
**input_tokens** | **int** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] 
**output_tokens** | **int** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] 
**input_token_details** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] 
**output_token_details** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


