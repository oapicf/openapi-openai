# OpenApiOpenAIClient::AuditLogServiceAccountUpdated

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The service account ID. | [optional] |
| **changes_requested** | [**AuditLogServiceAccountUpdatedChangesRequested**](AuditLogServiceAccountUpdatedChangesRequested.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AuditLogServiceAccountUpdated.new(
  id: null,
  changes_requested: null
)
```

