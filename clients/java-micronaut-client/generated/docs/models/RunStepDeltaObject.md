

# RunStepDeltaObject

Represents a run step delta i.e. any changed fields on a run step during streaming. 

The class is defined in **[RunStepDeltaObject.java](../../src/main/java/org/openapitools/model/RunStepDeltaObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The identifier of the run step, which can be referenced in API endpoints. | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.run.step.delta&#x60;. | 
**delta** | [`RunStepDeltaObjectDelta`](RunStepDeltaObjectDelta.md) |  | 


## ObjectEnum

Name | Value
---- | -----
THREAD_RUN_STEP_DELTA | `"thread.run.step.delta"`



