package models

type MessageStreamEvent struct {

	Event string `json:"event"`

	Data MessageObject `json:"data"`
}
