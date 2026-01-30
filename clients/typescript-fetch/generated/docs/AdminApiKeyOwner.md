
# AdminApiKeyOwner


## Properties

Name | Type
------------ | -------------
`type` | string
`id` | string
`name` | string
`createdAt` | number
`role` | string

## Example

```typescript
import type { AdminApiKeyOwner } from ''

// TODO: Update the object below with actual values
const example = {
  "type": service_account,
  "id": sa_456,
  "name": My Service Account,
  "createdAt": 1711471533,
  "role": member,
} satisfies AdminApiKeyOwner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdminApiKeyOwner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


