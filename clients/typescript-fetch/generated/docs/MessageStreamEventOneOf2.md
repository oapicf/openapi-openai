
# MessageStreamEventOneOf2

Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.

## Properties

Name | Type
------------ | -------------
`event` | string
`data` | [MessageDeltaObject](MessageDeltaObject.md)

## Example

```typescript
import type { MessageStreamEventOneOf2 } from ''

// TODO: Update the object below with actual values
const example = {
  "event": null,
  "data": null,
} satisfies MessageStreamEventOneOf2

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageStreamEventOneOf2
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


