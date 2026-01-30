
# ChatCompletionRequestSystemMessage

Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 

## Properties

Name | Type
------------ | -------------
`content` | [ChatCompletionRequestSystemMessageContent](ChatCompletionRequestSystemMessageContent.md)
`role` | string
`name` | string

## Example

```typescript
import type { ChatCompletionRequestSystemMessage } from ''

// TODO: Update the object below with actual values
const example = {
  "content": null,
  "role": null,
  "name": null,
} satisfies ChatCompletionRequestSystemMessage

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionRequestSystemMessage
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


