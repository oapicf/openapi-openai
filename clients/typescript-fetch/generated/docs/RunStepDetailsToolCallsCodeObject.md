
# RunStepDetailsToolCallsCodeObject

Details of the Code Interpreter tool call the run step was involved in.

## Properties

Name | Type
------------ | -------------
`id` | string
`type` | string
`codeInterpreter` | [RunStepDetailsToolCallsCodeObjectCodeInterpreter](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md)

## Example

```typescript
import type { RunStepDetailsToolCallsCodeObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "type": null,
  "codeInterpreter": null,
} satisfies RunStepDetailsToolCallsCodeObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RunStepDetailsToolCallsCodeObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


