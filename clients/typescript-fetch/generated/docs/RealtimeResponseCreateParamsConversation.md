
# RealtimeResponseCreateParamsConversation

Controls which conversation the response is added to. Currently supports `auto` and `none`, with `auto` as the default value. The `auto` value means that the contents of the response will be added to the default conversation. Set this to `none` to create an out-of-band response which  will not add items to default conversation. 

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { RealtimeResponseCreateParamsConversation } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies RealtimeResponseCreateParamsConversation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RealtimeResponseCreateParamsConversation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


