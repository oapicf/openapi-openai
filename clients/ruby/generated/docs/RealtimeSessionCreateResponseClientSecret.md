# OpenApiOpenAIClient::RealtimeSessionCreateResponseClientSecret

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **value** | **String** | Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  | [optional] |
| **expires_at** | **Integer** | Timestamp for when the token expires. Currently, all tokens expire after one minute.  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::RealtimeSessionCreateResponseClientSecret.new(
  value: null,
  expires_at: null
)
```

