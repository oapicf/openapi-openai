package models

type ThreadStreamEvent struct {

	Event string `json:"event"`

	Data ThreadObject `json:"data"`
}
