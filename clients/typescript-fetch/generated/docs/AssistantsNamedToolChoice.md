
# AssistantsNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

## Properties

Name | Type
------------ | -------------
`type` | string
`_function` | [AssistantsNamedToolChoiceFunction](AssistantsNamedToolChoiceFunction.md)

## Example

```typescript
import type { AssistantsNamedToolChoice } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "_function": null,
} satisfies AssistantsNamedToolChoice

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssistantsNamedToolChoice
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


