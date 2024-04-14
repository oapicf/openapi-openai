package models

// RunStepDeltaObject - Represents a run step delta i.e. any changed fields on a run step during streaming. 
type RunStepDeltaObject struct {

	// The identifier of the run step, which can be referenced in API endpoints.
	Id string `json:"id"`

	// The object type, which is always `thread.run.step.delta`.
	Object string `json:"object"`

	Delta RunStepDeltaObjectDelta `json:"delta"`
}
