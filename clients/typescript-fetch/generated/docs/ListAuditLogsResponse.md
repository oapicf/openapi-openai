
# ListAuditLogsResponse


## Properties

Name | Type
------------ | -------------
`object` | string
`data` | [Array&lt;AuditLog&gt;](AuditLog.md)
`firstId` | string
`lastId` | string
`hasMore` | boolean

## Example

```typescript
import type { ListAuditLogsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "data": null,
  "firstId": audit_log-defb456h8dks,
  "lastId": audit_log-hnbkd8s93s,
  "hasMore": null,
} satisfies ListAuditLogsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ListAuditLogsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


