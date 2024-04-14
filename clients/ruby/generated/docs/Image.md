# OpenApiOpenAIClient::Image

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **b64_json** | **String** | The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;. | [optional] |
| **url** | **String** | The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default). | [optional] |
| **revised_prompt** | **String** | The prompt that was used to generate the image, if there was any revision to the prompt. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::Image.new(
  b64_json: null,
  url: null,
  revised_prompt: null
)
```

