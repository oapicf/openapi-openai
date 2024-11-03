
# Table `RunStepDeltaObject`
(mapped from: RunStepDeltaObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | object | text NOT NULL |  | [**object**](#Object) | The object type, which is always &#x60;thread.run.step.delta&#x60;. | 
**delta** | delta | long NOT NULL |  | [**RunStepDeltaObjectDelta**](RunStepDeltaObjectDelta.md) |  |  [foreignkey]





