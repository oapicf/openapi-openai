
# ChatCompletionMessageToolCallFunction

The function that the model called.

## Properties

Name | Type
------------ | -------------
`name` | string
`arguments` | string

## Example

```typescript
import type { ChatCompletionMessageToolCallFunction } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "arguments": null,
} satisfies ChatCompletionMessageToolCallFunction

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionMessageToolCallFunction
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


