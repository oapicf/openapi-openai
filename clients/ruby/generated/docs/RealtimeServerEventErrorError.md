# OpenApiOpenAIClient::RealtimeServerEventErrorError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** | The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;).  |  |
| **code** | **String** | Error code, if any. | [optional] |
| **message** | **String** | A human-readable error message. |  |
| **param** | **String** | Parameter related to the error, if any. | [optional] |
| **event_id** | **String** | The event_id of the client event that caused the error, if applicable.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeServerEventErrorError.new(
  type: null,
  code: null,
  message: null,
  param: null,
  event_id: null
)
```

