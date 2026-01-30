
# CreateModerationRequestInputOneOfInnerOneOf1

An object describing text to classify.

## Properties

Name | Type
------------ | -------------
`type` | string
`text` | string

## Example

```typescript
import type { CreateModerationRequestInputOneOfInnerOneOf1 } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "text": I want to kill them,
} satisfies CreateModerationRequestInputOneOfInnerOneOf1

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateModerationRequestInputOneOfInnerOneOf1
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


