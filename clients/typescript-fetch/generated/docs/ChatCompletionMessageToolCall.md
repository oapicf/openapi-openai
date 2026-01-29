
# ChatCompletionMessageToolCall


## Properties

Name | Type
------------ | -------------
`id` | string
`type` | string
`_function` | [ChatCompletionMessageToolCallFunction](ChatCompletionMessageToolCallFunction.md)

## Example

```typescript
import type { ChatCompletionMessageToolCall } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "type": null,
  "_function": null,
} satisfies ChatCompletionMessageToolCall

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionMessageToolCall
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


