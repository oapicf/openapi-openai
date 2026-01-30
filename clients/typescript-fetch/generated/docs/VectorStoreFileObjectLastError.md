
# VectorStoreFileObjectLastError

The last error associated with this vector store file. Will be `null` if there are no errors.

## Properties

Name | Type
------------ | -------------
`code` | string
`message` | string

## Example

```typescript
import type { VectorStoreFileObjectLastError } from ''

// TODO: Update the object below with actual values
const example = {
  "code": null,
  "message": null,
} satisfies VectorStoreFileObjectLastError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VectorStoreFileObjectLastError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


