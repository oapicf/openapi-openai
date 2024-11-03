package models

import (
	"gopkg.in/validator.v2"
)

type MessageStreamEvent struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}
