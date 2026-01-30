
# BatchRequestOutputError

For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.

## Properties

Name | Type
------------ | -------------
`code` | string
`message` | string

## Example

```typescript
import type { BatchRequestOutputError } from ''

// TODO: Update the object below with actual values
const example = {
  "code": null,
  "message": null,
} satisfies BatchRequestOutputError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BatchRequestOutputError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


