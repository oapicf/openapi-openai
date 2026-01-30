package models

type ProjectApiKeyOwner struct {

	// `user` or `service_account`
	Type string `json:"type,omitempty"`

	User ProjectUser `json:"user,omitempty"`

	ServiceAccount ProjectServiceAccount `json:"service_account,omitempty"`
}
