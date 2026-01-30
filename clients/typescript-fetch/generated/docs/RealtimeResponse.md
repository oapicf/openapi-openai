
# RealtimeResponse

The response resource.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`status` | string
`statusDetails` | [RealtimeResponseStatusDetails](RealtimeResponseStatusDetails.md)
`output` | [Array&lt;RealtimeConversationItem&gt;](RealtimeConversationItem.md)
`metadata` | object
`usage` | [RealtimeResponseUsage](RealtimeResponseUsage.md)

## Example

```typescript
import type { RealtimeResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "status": null,
  "statusDetails": null,
  "output": null,
  "metadata": null,
  "usage": null,
} satisfies RealtimeResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


