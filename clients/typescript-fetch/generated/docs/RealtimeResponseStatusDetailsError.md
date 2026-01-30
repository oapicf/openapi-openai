
# RealtimeResponseStatusDetailsError

A description of the error that caused the response to fail,  populated when the `status` is `failed`. 

## Properties

Name | Type
------------ | -------------
`type` | string
`code` | string

## Example

```typescript
import type { RealtimeResponseStatusDetailsError } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "code": null,
} satisfies RealtimeResponseStatusDetailsError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseStatusDetailsError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


