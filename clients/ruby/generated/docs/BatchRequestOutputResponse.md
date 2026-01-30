# OpenApiOpenAIClient::BatchRequestOutputResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status_code** | **Integer** | The HTTP status code of the response | [optional] |
| **request_id** | **String** | An unique identifier for the OpenAI API request. Please include this request ID when contacting support. | [optional] |
| **body** | **Object** | The JSON body of the response | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::BatchRequestOutputResponse.new(
  status_code: null,
  request_id: null,
  body: null
)
```

