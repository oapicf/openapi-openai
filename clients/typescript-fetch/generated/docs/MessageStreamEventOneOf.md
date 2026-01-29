
# MessageStreamEventOneOf

Occurs when a [message](/docs/api-reference/messages/object) is created.

## Properties

Name | Type
------------ | -------------
`event` | string
`data` | [MessageObject](MessageObject.md)

## Example

```typescript
import type { MessageStreamEventOneOf } from ''

// TODO: Update the object below with actual values
const example = {
  "event": null,
  "data": null,
} satisfies MessageStreamEventOneOf

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageStreamEventOneOf
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


