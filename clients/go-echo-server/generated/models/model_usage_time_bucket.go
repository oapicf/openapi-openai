package models

type UsageTimeBucket struct {

	Object string `json:"object"`

	StartTime int32 `json:"start_time"`

	EndTime int32 `json:"end_time"`

	Result []UsageTimeBucketResultInner `json:"result"`
}
