
# RealtimeServerEventResponseTextDone

Returned when the text value of a \"text\" content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`responseId` | string
`itemId` | string
`outputIndex` | number
`contentIndex` | number
`text` | string

## Example

```typescript
import type { RealtimeServerEventResponseTextDone } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "responseId": null,
  "itemId": null,
  "outputIndex": null,
  "contentIndex": null,
  "text": null,
} satisfies RealtimeServerEventResponseTextDone

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseTextDone
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


