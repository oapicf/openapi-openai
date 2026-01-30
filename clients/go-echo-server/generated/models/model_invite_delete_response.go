package models

type InviteDeleteResponse struct {

	// The object type, which is always `organization.invite.deleted`
	Object string `json:"object"`

	Id string `json:"id"`

	Deleted bool `json:"deleted"`
}
