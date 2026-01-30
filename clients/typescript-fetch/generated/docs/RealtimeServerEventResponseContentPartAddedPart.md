
# RealtimeServerEventResponseContentPartAddedPart

The content part that was added.

## Properties

Name | Type
------------ | -------------
`type` | string
`text` | string
`audio` | string
`transcript` | string

## Example

```typescript
import type { RealtimeServerEventResponseContentPartAddedPart } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "text": null,
  "audio": null,
  "transcript": null,
} satisfies RealtimeServerEventResponseContentPartAddedPart

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseContentPartAddedPart
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


