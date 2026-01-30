
# CreateThreadAndRunRequest


## Properties

Name | Type
------------ | -------------
`assistantId` | string
`thread` | [CreateThreadRequest](CreateThreadRequest.md)
`model` | [CreateRunRequestModel](CreateRunRequestModel.md)
`instructions` | string
`tools` | [Array&lt;CreateThreadAndRunRequestToolsInner&gt;](CreateThreadAndRunRequestToolsInner.md)
`toolResources` | [CreateThreadAndRunRequestToolResources](CreateThreadAndRunRequestToolResources.md)
`metadata` | object
`temperature` | number
`topP` | number
`stream` | boolean
`maxPromptTokens` | number
`maxCompletionTokens` | number
`truncationStrategy` | [TruncationObject](TruncationObject.md)
`toolChoice` | [AssistantsApiToolChoiceOption](AssistantsApiToolChoiceOption.md)
`parallelToolCalls` | boolean
`responseFormat` | [AssistantsApiResponseFormatOption](AssistantsApiResponseFormatOption.md)

## Example

```typescript
import type { CreateThreadAndRunRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "assistantId": null,
  "thread": null,
  "model": null,
  "instructions": null,
  "tools": null,
  "toolResources": null,
  "metadata": null,
  "temperature": 1,
  "topP": 1,
  "stream": null,
  "maxPromptTokens": null,
  "maxCompletionTokens": null,
  "truncationStrategy": null,
  "toolChoice": null,
  "parallelToolCalls": null,
  "responseFormat": null,
} satisfies CreateThreadAndRunRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateThreadAndRunRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


