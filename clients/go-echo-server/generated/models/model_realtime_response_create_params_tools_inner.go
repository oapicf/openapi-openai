package models

type RealtimeResponseCreateParamsToolsInner struct {

	// The type of the tool, i.e. `function`.
	Type string `json:"type,omitempty"`

	// The name of the function.
	Name string `json:"name,omitempty"`

	// The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
	Description string `json:"description,omitempty"`

	// Parameters of the function in JSON Schema.
	Parameters map[string]interface{} `json:"parameters,omitempty"`
}
