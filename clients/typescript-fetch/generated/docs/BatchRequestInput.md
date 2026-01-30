
# BatchRequestInput

The per-line object of the batch input file

## Properties

Name | Type
------------ | -------------
`customId` | string
`method` | string
`url` | string

## Example

```typescript
import type { BatchRequestInput } from ''

// TODO: Update the object below with actual values
const example = {
  "customId": null,
  "method": null,
  "url": null,
} satisfies BatchRequestInput

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BatchRequestInput
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


