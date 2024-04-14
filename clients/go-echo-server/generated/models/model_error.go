package models

type Error struct {

	Code *string `json:"code"`

	Message string `json:"message"`

	Param *string `json:"param"`

	Type string `json:"type"`
}
