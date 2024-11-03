package models

import (
	"gopkg.in/validator.v2"
)

type RunStepStreamEvent struct {

	Event string `json:"event"`

	Data RunStepObject `json:"data"`
}
