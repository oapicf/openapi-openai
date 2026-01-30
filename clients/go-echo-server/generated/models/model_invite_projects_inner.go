package models

type InviteProjectsInner struct {

	// Project's public ID
	Id string `json:"id,omitempty"`

	// Project membership role
	Role string `json:"role,omitempty"`
}
