# OpenApiOpenAIClient::RealtimeResponseUsage

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **total_tokens** | **Integer** | The total number of tokens in the Response including input and output  text and audio tokens.  | [optional] |
| **input_tokens** | **Integer** | The number of input tokens used in the Response, including text and  audio tokens.  | [optional] |
| **output_tokens** | **Integer** | The number of output tokens sent in the Response, including text and  audio tokens.  | [optional] |
| **input_token_details** | [**RealtimeResponseUsageInputTokenDetails**](RealtimeResponseUsageInputTokenDetails.md) |  | [optional] |
| **output_token_details** | [**RealtimeResponseUsageOutputTokenDetails**](RealtimeResponseUsageOutputTokenDetails.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeResponseUsage.new(
  total_tokens: null,
  input_tokens: null,
  output_tokens: null,
  input_token_details: null,
  output_token_details: null
)
```

