
# BatchRequestOutput

The per-line object of the batch output and error files

## Properties

Name | Type
------------ | -------------
`id` | string
`customId` | string
`response` | [BatchRequestOutputResponse](BatchRequestOutputResponse.md)
`error` | [BatchRequestOutputError](BatchRequestOutputError.md)

## Example

```typescript
import type { BatchRequestOutput } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "customId": null,
  "response": null,
  "error": null,
} satisfies BatchRequestOutput

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BatchRequestOutput
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


