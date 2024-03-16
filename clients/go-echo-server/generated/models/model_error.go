package models

type Error struct {

	Type string `json:"type"`

	Message string `json:"message"`

	Param *string `json:"param"`

	Code *string `json:"code"`
}
