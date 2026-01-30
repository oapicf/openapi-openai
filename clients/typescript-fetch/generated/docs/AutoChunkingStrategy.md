
# AutoChunkingStrategy

The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.

## Properties

Name | Type
------------ | -------------
`type` | string

## Example

```typescript
import type { AutoChunkingStrategy } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
} satisfies AutoChunkingStrategy

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AutoChunkingStrategy
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


