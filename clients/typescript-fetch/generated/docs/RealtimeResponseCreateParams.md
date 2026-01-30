
# RealtimeResponseCreateParams

Create a new Realtime response with these parameters

## Properties

Name | Type
------------ | -------------
`modalities` | Array&lt;string&gt;
`instructions` | string
`voice` | string
`outputAudioFormat` | string
`tools` | [Array&lt;RealtimeResponseCreateParamsToolsInner&gt;](RealtimeResponseCreateParamsToolsInner.md)
`toolChoice` | string
`temperature` | number
`maxResponseOutputTokens` | [RealtimeResponseCreateParamsMaxResponseOutputTokens](RealtimeResponseCreateParamsMaxResponseOutputTokens.md)
`conversation` | [RealtimeResponseCreateParamsConversation](RealtimeResponseCreateParamsConversation.md)
`metadata` | object
`input` | [Array&lt;RealtimeConversationItem&gt;](RealtimeConversationItem.md)

## Example

```typescript
import type { RealtimeResponseCreateParams } from ''

// TODO: Update the object below with actual values
const example = {
  "modalities": null,
  "instructions": null,
  "voice": null,
  "outputAudioFormat": null,
  "tools": null,
  "toolChoice": null,
  "temperature": null,
  "maxResponseOutputTokens": null,
  "conversation": null,
  "metadata": null,
  "input": null,
} satisfies RealtimeResponseCreateParams

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseCreateParams
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


