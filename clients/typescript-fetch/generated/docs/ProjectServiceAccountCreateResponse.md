
# ProjectServiceAccountCreateResponse


## Properties

Name | Type
------------ | -------------
`object` | string
`id` | string
`name` | string
`role` | string
`createdAt` | number
`apiKey` | [ProjectServiceAccountApiKey](ProjectServiceAccountApiKey.md)

## Example

```typescript
import type { ProjectServiceAccountCreateResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "object": null,
  "id": null,
  "name": null,
  "role": null,
  "createdAt": null,
  "apiKey": null,
} satisfies ProjectServiceAccountCreateResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProjectServiceAccountCreateResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


