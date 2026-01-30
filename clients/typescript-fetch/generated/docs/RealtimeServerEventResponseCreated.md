
# RealtimeServerEventResponseCreated

Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`response` | [RealtimeResponse](RealtimeResponse.md)

## Example

```typescript
import type { RealtimeServerEventResponseCreated } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "response": null,
} satisfies RealtimeServerEventResponseCreated

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeServerEventResponseCreated
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


