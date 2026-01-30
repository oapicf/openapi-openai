
# RealtimeServerEventResponseTextDelta

Returned when the text value of a \"text\" content part is updated.

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`responseId` | string
`itemId` | string
`outputIndex` | number
`contentIndex` | number
`delta` | string

## Example

```typescript
import type { RealtimeServerEventResponseTextDelta } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "responseId": null,
  "itemId": null,
  "outputIndex": null,
  "contentIndex": null,
  "delta": null,
} satisfies RealtimeServerEventResponseTextDelta

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseTextDelta
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


