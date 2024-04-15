package models

type ChatCompletionTokenLogprob struct {

	// The token.
	Token string `json:"token"`

	// The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
	Logprob float32 `json:"logprob"`

	// A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
	Bytes *[]int32 `json:"bytes"`

	// List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
	TopLogprobs []ChatCompletionTokenLogprobTopLogprobsInner `json:"top_logprobs"`
}