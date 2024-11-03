package models

import (
	"gopkg.in/validator.v2"
)

type ThreadStreamEvent struct {

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}
