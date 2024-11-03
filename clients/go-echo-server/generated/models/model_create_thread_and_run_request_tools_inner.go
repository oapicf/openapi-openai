package models

import (
	"gopkg.in/validator.v2"
)

type CreateThreadAndRunRequestToolsInner struct {

	// The type of tool being defined: `code_interpreter`
	Type string `json:"type"`

	Function FunctionObject `json:"function"`
}
