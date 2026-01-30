
# CreateThreadRequest


## Properties

Name | Type
------------ | -------------
`messages` | [Array&lt;CreateMessageRequest&gt;](CreateMessageRequest.md)
`toolResources` | [CreateThreadRequestToolResources](CreateThreadRequestToolResources.md)
`metadata` | object

## Example

```typescript
import type { CreateThreadRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "messages": null,
  "toolResources": null,
  "metadata": null,
} satisfies CreateThreadRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateThreadRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


