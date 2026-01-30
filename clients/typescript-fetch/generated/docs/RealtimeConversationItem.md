
# RealtimeConversationItem

The item to add to the conversation.

## Properties

Name | Type
------------ | -------------
`id` | string
`type` | string
`object` | string
`status` | string
`role` | string
`content` | [Array&lt;RealtimeConversationItemContentInner&gt;](RealtimeConversationItemContentInner.md)
`callId` | string
`name` | string
`arguments` | string
`output` | string

## Example

```typescript
import type { RealtimeConversationItem } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "type": null,
  "object": null,
  "status": null,
  "role": null,
  "content": null,
  "callId": null,
  "name": null,
  "arguments": null,
  "output": null,
} satisfies RealtimeConversationItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeConversationItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


