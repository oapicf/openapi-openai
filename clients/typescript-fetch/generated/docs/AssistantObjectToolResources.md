
# AssistantObjectToolResources

A set of resources that are used by the assistant\'s tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties

Name | Type
------------ | -------------
`codeInterpreter` | [AssistantObjectToolResourcesCodeInterpreter](AssistantObjectToolResourcesCodeInterpreter.md)
`fileSearch` | [AssistantObjectToolResourcesFileSearch](AssistantObjectToolResourcesFileSearch.md)

## Example

```typescript
import type { AssistantObjectToolResources } from ''

// TODO: Update the object below with actual values
const example = {
  "codeInterpreter": null,
  "fileSearch": null,
} satisfies AssistantObjectToolResources

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssistantObjectToolResources
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


