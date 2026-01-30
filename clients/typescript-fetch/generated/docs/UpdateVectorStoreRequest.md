
# UpdateVectorStoreRequest


## Properties

Name | Type
------------ | -------------
`name` | string
`expiresAfter` | [VectorStoreExpirationAfter](VectorStoreExpirationAfter.md)
`metadata` | object

## Example

```typescript
import type { UpdateVectorStoreRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "expiresAfter": null,
  "metadata": null,
} satisfies UpdateVectorStoreRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdateVectorStoreRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


