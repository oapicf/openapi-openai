# OpenApiOpenAIClient::AuditLogRateLimitUpdated

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The rate limit ID | [optional] |
| **changes_requested** | [**AuditLogRateLimitUpdatedChangesRequested**](AuditLogRateLimitUpdatedChangesRequested.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AuditLogRateLimitUpdated.new(
  id: null,
  changes_requested: null
)
```

