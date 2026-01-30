
# RealtimeClientEventResponseCreate

This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session\'s  configuration for this Response only. 

## Properties

Name | Type
------------ | -------------
`eventId` | string
`type` | string
`response` | [RealtimeResponseCreateParams](RealtimeResponseCreateParams.md)

## Example

```typescript
import type { RealtimeClientEventResponseCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "eventId": null,
  "type": null,
  "response": null,
} satisfies RealtimeClientEventResponseCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeClientEventResponseCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


