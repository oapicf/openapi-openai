
# AdminApiKeysDelete200Response


## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`deleted` | boolean

## Example

```typescript
import type { AdminApiKeysDelete200Response } from ''

// TODO: Update the object below with actual values
const example = {
  "id": key_abc,
  "object": organization.admin_api_key.deleted,
  "deleted": true,
} satisfies AdminApiKeysDelete200Response

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdminApiKeysDelete200Response
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


