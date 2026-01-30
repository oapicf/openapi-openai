
# ErrorEvent

Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.

## Properties

Name | Type
------------ | -------------
`event` | string
`data` | Error

## Example

```typescript
import type { ErrorEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "event": null,
  "data": null,
} satisfies ErrorEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ErrorEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


