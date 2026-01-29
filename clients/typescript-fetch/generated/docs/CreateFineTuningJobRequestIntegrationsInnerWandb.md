
# CreateFineTuningJobRequestIntegrationsInnerWandb

The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 

## Properties

Name | Type
------------ | -------------
`project` | string
`name` | string
`entity` | string
`tags` | Array&lt;string&gt;

## Example

```typescript
import type { CreateFineTuningJobRequestIntegrationsInnerWandb } from ''

// TODO: Update the object below with actual values
const example = {
  "project": my-wandb-project,
  "name": null,
  "entity": null,
  "tags": null,
} satisfies CreateFineTuningJobRequestIntegrationsInnerWandb

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateFineTuningJobRequestIntegrationsInnerWandb
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


