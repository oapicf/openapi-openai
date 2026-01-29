
# CreateEmbeddingRequest


## Properties

Name | Type
------------ | -------------
`input` | [CreateEmbeddingRequestInput](CreateEmbeddingRequestInput.md)
`model` | [CreateEmbeddingRequestModel](CreateEmbeddingRequestModel.md)
`encodingFormat` | string
`dimensions` | number
`user` | string

## Example

```typescript
import type { CreateEmbeddingRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "input": null,
  "model": null,
  "encodingFormat": float,
  "dimensions": null,
  "user": user-1234,
} satisfies CreateEmbeddingRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateEmbeddingRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


