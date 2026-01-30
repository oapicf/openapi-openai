# OpenApiOpenAIClient::BatchErrors

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** | The object type, which is always &#x60;list&#x60;. | [optional] |
| **data** | [**Array&lt;BatchErrorsDataInner&gt;**](BatchErrorsDataInner.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::BatchErrors.new(
  object: null,
  data: null
)
```

