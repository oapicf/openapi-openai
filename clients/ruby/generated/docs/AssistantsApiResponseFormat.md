# OpenApiOpenAIClient::AssistantsApiResponseFormat

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;. | [optional][default to &#39;text&#39;] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AssistantsApiResponseFormat.new(
  type: json_object
)
```

