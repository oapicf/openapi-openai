
# ThreadStreamEvent

Occurs when a new [thread](/docs/api-reference/threads/object) is created.

## Properties

Name | Type
------------ | -------------
`enabled` | boolean
`event` | string
`data` | [ThreadObject](ThreadObject.md)

## Example

```typescript
import type { ThreadStreamEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "enabled": null,
  "event": null,
  "data": null,
} satisfies ThreadStreamEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ThreadStreamEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


