
# ModifyAssistantRequest


## Properties

Name | Type
------------ | -------------
`model` | string
`name` | string
`description` | string
`instructions` | string
`tools` | [Array&lt;AssistantObjectToolsInner&gt;](AssistantObjectToolsInner.md)
`toolResources` | [ModifyAssistantRequestToolResources](ModifyAssistantRequestToolResources.md)
`metadata` | object
`temperature` | number
`topP` | number
`responseFormat` | [AssistantsApiResponseFormatOption](AssistantsApiResponseFormatOption.md)

## Example

```typescript
import type { ModifyAssistantRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "model": null,
  "name": null,
  "description": null,
  "instructions": null,
  "tools": null,
  "toolResources": null,
  "metadata": null,
  "temperature": 1,
  "topP": 1,
  "responseFormat": null,
} satisfies ModifyAssistantRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ModifyAssistantRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


