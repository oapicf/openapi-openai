
# RealtimeResponseStatusDetails

Additional details about the status.

## Properties

Name | Type
------------ | -------------
`type` | string
`reason` | string
`error` | [RealtimeResponseStatusDetailsError](RealtimeResponseStatusDetailsError.md)

## Example

```typescript
import type { RealtimeResponseStatusDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "reason": null,
  "error": null,
} satisfies RealtimeResponseStatusDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseStatusDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


