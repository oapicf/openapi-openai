# OpenApiOpenAIClient::RunStepDetailsToolCallsFileSearchResultObject

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file_id** | **String** | The ID of the file that result was found in. |  |
| **file_name** | **String** | The name of the file that result was found in. |  |
| **score** | **Float** | The score of the result. All values must be a floating point number between 0 and 1. |  |
| **content** | [**Array&lt;RunStepDetailsToolCallsFileSearchResultObjectContentInner&gt;**](RunStepDetailsToolCallsFileSearchResultObjectContentInner.md) | The content of the result that was found. The content is only included if requested via the include query parameter. | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RunStepDetailsToolCallsFileSearchResultObject.new(
  file_id: null,
  file_name: null,
  score: null,
  content: null
)
```

