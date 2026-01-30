
# ChatCompletionToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tool and instead generates a message. `auto` means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools. Specifying a particular tool via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool.  `none` is the default when no tools are present. `auto` is the default if tools are present. 

## Properties

Name | Type
------------ | -------------
`type` | string
`_function` | [AssistantsNamedToolChoiceFunction](AssistantsNamedToolChoiceFunction.md)

## Example

```typescript
import type { ChatCompletionToolChoiceOption } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "_function": null,
} satisfies ChatCompletionToolChoiceOption

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChatCompletionToolChoiceOption
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


