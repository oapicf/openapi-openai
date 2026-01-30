package models

type InviteListResponse struct {

	// The object type, which is always `list`
	Object string `json:"object"`

	Data []Invite `json:"data"`

	// The first `invite_id` in the retrieved `list`
	FirstId string `json:"first_id,omitempty"`

	// The last `invite_id` in the retrieved `list`
	LastId string `json:"last_id,omitempty"`

	// The `has_more` property is used for pagination to indicate there are additional results.
	HasMore bool `json:"has_more,omitempty"`
}
