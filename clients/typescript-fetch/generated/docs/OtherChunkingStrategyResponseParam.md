
# OtherChunkingStrategyResponseParam

This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.

## Properties

Name | Type
------------ | -------------
`type` | string

## Example

```typescript
import type { OtherChunkingStrategyResponseParam } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
} satisfies OtherChunkingStrategyResponseParam

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OtherChunkingStrategyResponseParam
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


