package models

import (
	"gopkg.in/validator.v2"
)

type RunStreamEvent struct {

	Event string `json:"event"`

	Data RunObject `json:"data"`
}
