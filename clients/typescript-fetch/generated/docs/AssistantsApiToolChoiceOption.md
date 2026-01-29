
# AssistantsApiToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 

## Properties

Name | Type
------------ | -------------
`type` | string
`_function` | [ChatCompletionNamedToolChoiceFunction](ChatCompletionNamedToolChoiceFunction.md)

## Example

```typescript
import type { AssistantsApiToolChoiceOption } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "_function": null,
} satisfies AssistantsApiToolChoiceOption

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssistantsApiToolChoiceOption
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


