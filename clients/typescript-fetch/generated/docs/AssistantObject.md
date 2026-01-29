
# AssistantObject

Represents an `assistant` that can call the model and use tools.

## Properties

Name | Type
------------ | -------------
`id` | string
`object` | string
`createdAt` | number
`name` | string
`description` | string
`model` | string
`instructions` | string
`tools` | [Array&lt;AssistantObjectToolsInner&gt;](AssistantObjectToolsInner.md)
`fileIds` | Array&lt;string&gt;
`metadata` | object

## Example

```typescript
import type { AssistantObject } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "object": null,
  "createdAt": null,
  "name": null,
  "description": null,
  "model": null,
  "instructions": null,
  "tools": null,
  "fileIds": null,
  "metadata": null,
} satisfies AssistantObject

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssistantObject
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


