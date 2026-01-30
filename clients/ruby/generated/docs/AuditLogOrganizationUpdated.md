# OpenApiOpenAIClient::AuditLogOrganizationUpdated

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The organization ID. | [optional] |
| **changes_requested** | [**AuditLogOrganizationUpdatedChangesRequested**](AuditLogOrganizationUpdatedChangesRequested.md) |  | [optional] |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::AuditLogOrganizationUpdated.new(
  id: null,
  changes_requested: null
)
```

