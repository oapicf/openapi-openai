
# MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

## Properties

Name | Type
------------ | -------------
`role` | string
`content` | [Array&lt;MessageDeltaObjectDeltaContentInner&gt;](MessageDeltaObjectDeltaContentInner.md)

## Example

```typescript
import type { MessageDeltaObjectDelta } from ''

// TODO: Update the object below with actual values
const example = {
  "role": null,
  "content": null,
} satisfies MessageDeltaObjectDelta

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MessageDeltaObjectDelta
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


