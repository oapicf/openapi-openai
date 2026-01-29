# openapi::RunStepDeltaObject

Represents a run step delta i.e. any changed fields on a run step during streaming. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread.run.step.delta&#x60;. | [Enum: [thread.run.step.delta]] 
**delta** | [**RunStepDeltaObjectDelta**](RunStepDeltaObject_delta.md) |  | 


