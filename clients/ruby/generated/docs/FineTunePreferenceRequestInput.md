# OpenApiOpenAIClient::FineTunePreferenceRequestInput

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **input** | [**FineTunePreferenceRequestInputInput**](FineTunePreferenceRequestInputInput.md) |  | [optional] |
| **preferred_completion** | [**Array&lt;FineTunePreferenceRequestInputPreferredCompletionInner&gt;**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The preferred completion message for the output. | [optional] |
| **non_preferred_completion** | [**Array&lt;FineTunePreferenceRequestInputPreferredCompletionInner&gt;**](FineTunePreferenceRequestInputPreferredCompletionInner.md) | The non-preferred completion message for the output. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::FineTunePreferenceRequestInput.new(
  input: null,
  preferred_completion: null,
  non_preferred_completion: null
)
```

