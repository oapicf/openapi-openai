# OpenApiOpenAIClient::ListAuditLogsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **object** | **String** |  |  |
| **data** | [**Array&lt;AuditLog&gt;**](AuditLog.md) |  |  |
| **first_id** | **String** |  |  |
| **last_id** | **String** |  |  |
| **has_more** | **Boolean** |  |  |

## Example

```ruby
require 'openapi_openai'

instance = OpenApiOpenAIClient::ListAuditLogsResponse.new(
  object: null,
  data: null,
  first_id: audit_log-defb456h8dks,
  last_id: audit_log-hnbkd8s93s,
  has_more: null
)
```

