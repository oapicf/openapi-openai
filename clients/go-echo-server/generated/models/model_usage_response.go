package models

type UsageResponse struct {

	Object string `json:"object"`

	Data []UsageTimeBucket `json:"data"`

	HasMore bool `json:"has_more"`

	NextPage string `json:"next_page"`
}
