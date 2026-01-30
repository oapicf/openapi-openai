
# ApiKeyList


## Properties

Name | Type
------------ | -------------
`object` | string
`data` | [Array&lt;AdminApiKey&gt;](AdminApiKey.md)
`hasMore` | boolean
`firstId` | string
`lastId` | string

## Example

```typescript
import type { ApiKeyList } from ''

// TODO: Update the object below with actual values
const example = {
  "object": list,
  "data": null,
  "hasMore": false,
  "firstId": key_abc,
  "lastId": key_xyz,
} satisfies ApiKeyList

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ApiKeyList
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


