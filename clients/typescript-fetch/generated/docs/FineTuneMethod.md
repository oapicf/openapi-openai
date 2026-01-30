
# FineTuneMethod

The method used for fine-tuning.

## Properties

Name | Type
------------ | -------------
`type` | string
`supervised` | [FineTuneSupervisedMethod](.md)
`dpo` | [FineTuneDPOMethod](.md)

## Example

```typescript
import type { FineTuneMethod } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "supervised": null,
  "dpo": null,
} satisfies FineTuneMethod

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FineTuneMethod
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


