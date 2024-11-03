/*
OpenAI API

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

API version: 2.0.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the CreateCompletionRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateCompletionRequest{}

// CreateCompletionRequest struct for CreateCompletionRequest
type CreateCompletionRequest struct {
	Model CreateCompletionRequestModel `json:"model"`
	Prompt NullableCreateCompletionRequestPrompt `json:"prompt"`
	// Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
	BestOf NullableInt32 `json:"best_of,omitempty"`
	// Echo back the prompt in addition to the completion 
	Echo NullableBool `json:"echo,omitempty"`
	// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
	FrequencyPenalty NullableFloat32 `json:"frequency_penalty,omitempty"`
	// Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
	LogitBias map[string]int32 `json:"logit_bias,omitempty"`
	// Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
	Logprobs NullableInt32 `json:"logprobs,omitempty"`
	// The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
	MaxTokens NullableInt32 `json:"max_tokens,omitempty"`
	// How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
	N NullableInt32 `json:"n,omitempty"`
	// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
	PresencePenalty NullableFloat32 `json:"presence_penalty,omitempty"`
	// If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
	Seed NullableInt32 `json:"seed,omitempty"`
	Stop NullableCreateCompletionRequestStop `json:"stop,omitempty"`
	// Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
	Stream NullableBool `json:"stream,omitempty"`
	// The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. 
	Suffix NullableString `json:"suffix,omitempty"`
	// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
	Temperature NullableFloat32 `json:"temperature,omitempty"`
	// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
	TopP NullableFloat32 `json:"top_p,omitempty"`
	// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	User *string `json:"user,omitempty"`
}

type _CreateCompletionRequest CreateCompletionRequest

// NewCreateCompletionRequest instantiates a new CreateCompletionRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateCompletionRequest(model CreateCompletionRequestModel, prompt NullableCreateCompletionRequestPrompt) *CreateCompletionRequest {
	this := CreateCompletionRequest{}
	this.Model = model
	this.Prompt = prompt
	var bestOf int32 = 1
	this.BestOf = *NewNullableInt32(&bestOf)
	var echo bool = false
	this.Echo = *NewNullableBool(&echo)
	var frequencyPenalty float32 = 0
	this.FrequencyPenalty = *NewNullableFloat32(&frequencyPenalty)
	var maxTokens int32 = 16
	this.MaxTokens = *NewNullableInt32(&maxTokens)
	var n int32 = 1
	this.N = *NewNullableInt32(&n)
	var presencePenalty float32 = 0
	this.PresencePenalty = *NewNullableFloat32(&presencePenalty)
	var stop CreateCompletionRequestStop = null
	this.Stop = *NewNullableCreateCompletionRequestStop(&stop)
	var stream bool = false
	this.Stream = *NewNullableBool(&stream)
	var temperature float32 = 1
	this.Temperature = *NewNullableFloat32(&temperature)
	var topP float32 = 1
	this.TopP = *NewNullableFloat32(&topP)
	return &this
}

// NewCreateCompletionRequestWithDefaults instantiates a new CreateCompletionRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateCompletionRequestWithDefaults() *CreateCompletionRequest {
	this := CreateCompletionRequest{}
	var prompt CreateCompletionRequestPrompt = <|endoftext|>
	this.Prompt = *NewNullableCreateCompletionRequestPrompt(&prompt)
	var bestOf int32 = 1
	this.BestOf = *NewNullableInt32(&bestOf)
	var echo bool = false
	this.Echo = *NewNullableBool(&echo)
	var frequencyPenalty float32 = 0
	this.FrequencyPenalty = *NewNullableFloat32(&frequencyPenalty)
	var maxTokens int32 = 16
	this.MaxTokens = *NewNullableInt32(&maxTokens)
	var n int32 = 1
	this.N = *NewNullableInt32(&n)
	var presencePenalty float32 = 0
	this.PresencePenalty = *NewNullableFloat32(&presencePenalty)
	var stop CreateCompletionRequestStop = null
	this.Stop = *NewNullableCreateCompletionRequestStop(&stop)
	var stream bool = false
	this.Stream = *NewNullableBool(&stream)
	var temperature float32 = 1
	this.Temperature = *NewNullableFloat32(&temperature)
	var topP float32 = 1
	this.TopP = *NewNullableFloat32(&topP)
	return &this
}

// GetModel returns the Model field value
func (o *CreateCompletionRequest) GetModel() CreateCompletionRequestModel {
	if o == nil {
		var ret CreateCompletionRequestModel
		return ret
	}

	return o.Model
}

// GetModelOk returns a tuple with the Model field value
// and a boolean to check if the value has been set.
func (o *CreateCompletionRequest) GetModelOk() (*CreateCompletionRequestModel, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Model, true
}

// SetModel sets field value
func (o *CreateCompletionRequest) SetModel(v CreateCompletionRequestModel) {
	o.Model = v
}

// GetPrompt returns the Prompt field value
// If the value is explicit nil, the zero value for CreateCompletionRequestPrompt will be returned
func (o *CreateCompletionRequest) GetPrompt() CreateCompletionRequestPrompt {
	if o == nil || o.Prompt.Get() == nil {
		var ret CreateCompletionRequestPrompt
		return ret
	}

	return *o.Prompt.Get()
}

// GetPromptOk returns a tuple with the Prompt field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetPromptOk() (*CreateCompletionRequestPrompt, bool) {
	if o == nil {
		return nil, false
	}
	return o.Prompt.Get(), o.Prompt.IsSet()
}

// SetPrompt sets field value
func (o *CreateCompletionRequest) SetPrompt(v CreateCompletionRequestPrompt) {
	o.Prompt.Set(&v)
}

// GetBestOf returns the BestOf field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetBestOf() int32 {
	if o == nil || IsNil(o.BestOf.Get()) {
		var ret int32
		return ret
	}
	return *o.BestOf.Get()
}

// GetBestOfOk returns a tuple with the BestOf field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetBestOfOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.BestOf.Get(), o.BestOf.IsSet()
}

// HasBestOf returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasBestOf() bool {
	if o != nil && o.BestOf.IsSet() {
		return true
	}

	return false
}

// SetBestOf gets a reference to the given NullableInt32 and assigns it to the BestOf field.
func (o *CreateCompletionRequest) SetBestOf(v int32) {
	o.BestOf.Set(&v)
}
// SetBestOfNil sets the value for BestOf to be an explicit nil
func (o *CreateCompletionRequest) SetBestOfNil() {
	o.BestOf.Set(nil)
}

// UnsetBestOf ensures that no value is present for BestOf, not even an explicit nil
func (o *CreateCompletionRequest) UnsetBestOf() {
	o.BestOf.Unset()
}

// GetEcho returns the Echo field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetEcho() bool {
	if o == nil || IsNil(o.Echo.Get()) {
		var ret bool
		return ret
	}
	return *o.Echo.Get()
}

// GetEchoOk returns a tuple with the Echo field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetEchoOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return o.Echo.Get(), o.Echo.IsSet()
}

// HasEcho returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasEcho() bool {
	if o != nil && o.Echo.IsSet() {
		return true
	}

	return false
}

// SetEcho gets a reference to the given NullableBool and assigns it to the Echo field.
func (o *CreateCompletionRequest) SetEcho(v bool) {
	o.Echo.Set(&v)
}
// SetEchoNil sets the value for Echo to be an explicit nil
func (o *CreateCompletionRequest) SetEchoNil() {
	o.Echo.Set(nil)
}

// UnsetEcho ensures that no value is present for Echo, not even an explicit nil
func (o *CreateCompletionRequest) UnsetEcho() {
	o.Echo.Unset()
}

// GetFrequencyPenalty returns the FrequencyPenalty field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetFrequencyPenalty() float32 {
	if o == nil || IsNil(o.FrequencyPenalty.Get()) {
		var ret float32
		return ret
	}
	return *o.FrequencyPenalty.Get()
}

// GetFrequencyPenaltyOk returns a tuple with the FrequencyPenalty field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetFrequencyPenaltyOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.FrequencyPenalty.Get(), o.FrequencyPenalty.IsSet()
}

// HasFrequencyPenalty returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasFrequencyPenalty() bool {
	if o != nil && o.FrequencyPenalty.IsSet() {
		return true
	}

	return false
}

// SetFrequencyPenalty gets a reference to the given NullableFloat32 and assigns it to the FrequencyPenalty field.
func (o *CreateCompletionRequest) SetFrequencyPenalty(v float32) {
	o.FrequencyPenalty.Set(&v)
}
// SetFrequencyPenaltyNil sets the value for FrequencyPenalty to be an explicit nil
func (o *CreateCompletionRequest) SetFrequencyPenaltyNil() {
	o.FrequencyPenalty.Set(nil)
}

// UnsetFrequencyPenalty ensures that no value is present for FrequencyPenalty, not even an explicit nil
func (o *CreateCompletionRequest) UnsetFrequencyPenalty() {
	o.FrequencyPenalty.Unset()
}

// GetLogitBias returns the LogitBias field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetLogitBias() map[string]int32 {
	if o == nil {
		var ret map[string]int32
		return ret
	}
	return o.LogitBias
}

// GetLogitBiasOk returns a tuple with the LogitBias field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetLogitBiasOk() (*map[string]int32, bool) {
	if o == nil || IsNil(o.LogitBias) {
		return nil, false
	}
	return &o.LogitBias, true
}

// HasLogitBias returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasLogitBias() bool {
	if o != nil && !IsNil(o.LogitBias) {
		return true
	}

	return false
}

// SetLogitBias gets a reference to the given map[string]int32 and assigns it to the LogitBias field.
func (o *CreateCompletionRequest) SetLogitBias(v map[string]int32) {
	o.LogitBias = v
}

// GetLogprobs returns the Logprobs field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetLogprobs() int32 {
	if o == nil || IsNil(o.Logprobs.Get()) {
		var ret int32
		return ret
	}
	return *o.Logprobs.Get()
}

// GetLogprobsOk returns a tuple with the Logprobs field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetLogprobsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Logprobs.Get(), o.Logprobs.IsSet()
}

// HasLogprobs returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasLogprobs() bool {
	if o != nil && o.Logprobs.IsSet() {
		return true
	}

	return false
}

// SetLogprobs gets a reference to the given NullableInt32 and assigns it to the Logprobs field.
func (o *CreateCompletionRequest) SetLogprobs(v int32) {
	o.Logprobs.Set(&v)
}
// SetLogprobsNil sets the value for Logprobs to be an explicit nil
func (o *CreateCompletionRequest) SetLogprobsNil() {
	o.Logprobs.Set(nil)
}

// UnsetLogprobs ensures that no value is present for Logprobs, not even an explicit nil
func (o *CreateCompletionRequest) UnsetLogprobs() {
	o.Logprobs.Unset()
}

// GetMaxTokens returns the MaxTokens field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetMaxTokens() int32 {
	if o == nil || IsNil(o.MaxTokens.Get()) {
		var ret int32
		return ret
	}
	return *o.MaxTokens.Get()
}

// GetMaxTokensOk returns a tuple with the MaxTokens field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetMaxTokensOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.MaxTokens.Get(), o.MaxTokens.IsSet()
}

// HasMaxTokens returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasMaxTokens() bool {
	if o != nil && o.MaxTokens.IsSet() {
		return true
	}

	return false
}

// SetMaxTokens gets a reference to the given NullableInt32 and assigns it to the MaxTokens field.
func (o *CreateCompletionRequest) SetMaxTokens(v int32) {
	o.MaxTokens.Set(&v)
}
// SetMaxTokensNil sets the value for MaxTokens to be an explicit nil
func (o *CreateCompletionRequest) SetMaxTokensNil() {
	o.MaxTokens.Set(nil)
}

// UnsetMaxTokens ensures that no value is present for MaxTokens, not even an explicit nil
func (o *CreateCompletionRequest) UnsetMaxTokens() {
	o.MaxTokens.Unset()
}

// GetN returns the N field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetN() int32 {
	if o == nil || IsNil(o.N.Get()) {
		var ret int32
		return ret
	}
	return *o.N.Get()
}

// GetNOk returns a tuple with the N field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetNOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.N.Get(), o.N.IsSet()
}

// HasN returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasN() bool {
	if o != nil && o.N.IsSet() {
		return true
	}

	return false
}

// SetN gets a reference to the given NullableInt32 and assigns it to the N field.
func (o *CreateCompletionRequest) SetN(v int32) {
	o.N.Set(&v)
}
// SetNNil sets the value for N to be an explicit nil
func (o *CreateCompletionRequest) SetNNil() {
	o.N.Set(nil)
}

// UnsetN ensures that no value is present for N, not even an explicit nil
func (o *CreateCompletionRequest) UnsetN() {
	o.N.Unset()
}

// GetPresencePenalty returns the PresencePenalty field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetPresencePenalty() float32 {
	if o == nil || IsNil(o.PresencePenalty.Get()) {
		var ret float32
		return ret
	}
	return *o.PresencePenalty.Get()
}

// GetPresencePenaltyOk returns a tuple with the PresencePenalty field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetPresencePenaltyOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.PresencePenalty.Get(), o.PresencePenalty.IsSet()
}

// HasPresencePenalty returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasPresencePenalty() bool {
	if o != nil && o.PresencePenalty.IsSet() {
		return true
	}

	return false
}

// SetPresencePenalty gets a reference to the given NullableFloat32 and assigns it to the PresencePenalty field.
func (o *CreateCompletionRequest) SetPresencePenalty(v float32) {
	o.PresencePenalty.Set(&v)
}
// SetPresencePenaltyNil sets the value for PresencePenalty to be an explicit nil
func (o *CreateCompletionRequest) SetPresencePenaltyNil() {
	o.PresencePenalty.Set(nil)
}

// UnsetPresencePenalty ensures that no value is present for PresencePenalty, not even an explicit nil
func (o *CreateCompletionRequest) UnsetPresencePenalty() {
	o.PresencePenalty.Unset()
}

// GetSeed returns the Seed field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetSeed() int32 {
	if o == nil || IsNil(o.Seed.Get()) {
		var ret int32
		return ret
	}
	return *o.Seed.Get()
}

// GetSeedOk returns a tuple with the Seed field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetSeedOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Seed.Get(), o.Seed.IsSet()
}

// HasSeed returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasSeed() bool {
	if o != nil && o.Seed.IsSet() {
		return true
	}

	return false
}

// SetSeed gets a reference to the given NullableInt32 and assigns it to the Seed field.
func (o *CreateCompletionRequest) SetSeed(v int32) {
	o.Seed.Set(&v)
}
// SetSeedNil sets the value for Seed to be an explicit nil
func (o *CreateCompletionRequest) SetSeedNil() {
	o.Seed.Set(nil)
}

// UnsetSeed ensures that no value is present for Seed, not even an explicit nil
func (o *CreateCompletionRequest) UnsetSeed() {
	o.Seed.Unset()
}

// GetStop returns the Stop field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetStop() CreateCompletionRequestStop {
	if o == nil || IsNil(o.Stop.Get()) {
		var ret CreateCompletionRequestStop
		return ret
	}
	return *o.Stop.Get()
}

// GetStopOk returns a tuple with the Stop field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetStopOk() (*CreateCompletionRequestStop, bool) {
	if o == nil {
		return nil, false
	}
	return o.Stop.Get(), o.Stop.IsSet()
}

// HasStop returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasStop() bool {
	if o != nil && o.Stop.IsSet() {
		return true
	}

	return false
}

// SetStop gets a reference to the given NullableCreateCompletionRequestStop and assigns it to the Stop field.
func (o *CreateCompletionRequest) SetStop(v CreateCompletionRequestStop) {
	o.Stop.Set(&v)
}
// SetStopNil sets the value for Stop to be an explicit nil
func (o *CreateCompletionRequest) SetStopNil() {
	o.Stop.Set(nil)
}

// UnsetStop ensures that no value is present for Stop, not even an explicit nil
func (o *CreateCompletionRequest) UnsetStop() {
	o.Stop.Unset()
}

// GetStream returns the Stream field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetStream() bool {
	if o == nil || IsNil(o.Stream.Get()) {
		var ret bool
		return ret
	}
	return *o.Stream.Get()
}

// GetStreamOk returns a tuple with the Stream field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetStreamOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return o.Stream.Get(), o.Stream.IsSet()
}

// HasStream returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasStream() bool {
	if o != nil && o.Stream.IsSet() {
		return true
	}

	return false
}

// SetStream gets a reference to the given NullableBool and assigns it to the Stream field.
func (o *CreateCompletionRequest) SetStream(v bool) {
	o.Stream.Set(&v)
}
// SetStreamNil sets the value for Stream to be an explicit nil
func (o *CreateCompletionRequest) SetStreamNil() {
	o.Stream.Set(nil)
}

// UnsetStream ensures that no value is present for Stream, not even an explicit nil
func (o *CreateCompletionRequest) UnsetStream() {
	o.Stream.Unset()
}

// GetSuffix returns the Suffix field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetSuffix() string {
	if o == nil || IsNil(o.Suffix.Get()) {
		var ret string
		return ret
	}
	return *o.Suffix.Get()
}

// GetSuffixOk returns a tuple with the Suffix field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetSuffixOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Suffix.Get(), o.Suffix.IsSet()
}

// HasSuffix returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasSuffix() bool {
	if o != nil && o.Suffix.IsSet() {
		return true
	}

	return false
}

// SetSuffix gets a reference to the given NullableString and assigns it to the Suffix field.
func (o *CreateCompletionRequest) SetSuffix(v string) {
	o.Suffix.Set(&v)
}
// SetSuffixNil sets the value for Suffix to be an explicit nil
func (o *CreateCompletionRequest) SetSuffixNil() {
	o.Suffix.Set(nil)
}

// UnsetSuffix ensures that no value is present for Suffix, not even an explicit nil
func (o *CreateCompletionRequest) UnsetSuffix() {
	o.Suffix.Unset()
}

// GetTemperature returns the Temperature field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetTemperature() float32 {
	if o == nil || IsNil(o.Temperature.Get()) {
		var ret float32
		return ret
	}
	return *o.Temperature.Get()
}

// GetTemperatureOk returns a tuple with the Temperature field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetTemperatureOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Temperature.Get(), o.Temperature.IsSet()
}

// HasTemperature returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasTemperature() bool {
	if o != nil && o.Temperature.IsSet() {
		return true
	}

	return false
}

// SetTemperature gets a reference to the given NullableFloat32 and assigns it to the Temperature field.
func (o *CreateCompletionRequest) SetTemperature(v float32) {
	o.Temperature.Set(&v)
}
// SetTemperatureNil sets the value for Temperature to be an explicit nil
func (o *CreateCompletionRequest) SetTemperatureNil() {
	o.Temperature.Set(nil)
}

// UnsetTemperature ensures that no value is present for Temperature, not even an explicit nil
func (o *CreateCompletionRequest) UnsetTemperature() {
	o.Temperature.Unset()
}

// GetTopP returns the TopP field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateCompletionRequest) GetTopP() float32 {
	if o == nil || IsNil(o.TopP.Get()) {
		var ret float32
		return ret
	}
	return *o.TopP.Get()
}

// GetTopPOk returns a tuple with the TopP field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateCompletionRequest) GetTopPOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.TopP.Get(), o.TopP.IsSet()
}

// HasTopP returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasTopP() bool {
	if o != nil && o.TopP.IsSet() {
		return true
	}

	return false
}

// SetTopP gets a reference to the given NullableFloat32 and assigns it to the TopP field.
func (o *CreateCompletionRequest) SetTopP(v float32) {
	o.TopP.Set(&v)
}
// SetTopPNil sets the value for TopP to be an explicit nil
func (o *CreateCompletionRequest) SetTopPNil() {
	o.TopP.Set(nil)
}

// UnsetTopP ensures that no value is present for TopP, not even an explicit nil
func (o *CreateCompletionRequest) UnsetTopP() {
	o.TopP.Unset()
}

// GetUser returns the User field value if set, zero value otherwise.
func (o *CreateCompletionRequest) GetUser() string {
	if o == nil || IsNil(o.User) {
		var ret string
		return ret
	}
	return *o.User
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCompletionRequest) GetUserOk() (*string, bool) {
	if o == nil || IsNil(o.User) {
		return nil, false
	}
	return o.User, true
}

// HasUser returns a boolean if a field has been set.
func (o *CreateCompletionRequest) HasUser() bool {
	if o != nil && !IsNil(o.User) {
		return true
	}

	return false
}

// SetUser gets a reference to the given string and assigns it to the User field.
func (o *CreateCompletionRequest) SetUser(v string) {
	o.User = &v
}

func (o CreateCompletionRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateCompletionRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["model"] = o.Model
	toSerialize["prompt"] = o.Prompt.Get()
	if o.BestOf.IsSet() {
		toSerialize["best_of"] = o.BestOf.Get()
	}
	if o.Echo.IsSet() {
		toSerialize["echo"] = o.Echo.Get()
	}
	if o.FrequencyPenalty.IsSet() {
		toSerialize["frequency_penalty"] = o.FrequencyPenalty.Get()
	}
	if o.LogitBias != nil {
		toSerialize["logit_bias"] = o.LogitBias
	}
	if o.Logprobs.IsSet() {
		toSerialize["logprobs"] = o.Logprobs.Get()
	}
	if o.MaxTokens.IsSet() {
		toSerialize["max_tokens"] = o.MaxTokens.Get()
	}
	if o.N.IsSet() {
		toSerialize["n"] = o.N.Get()
	}
	if o.PresencePenalty.IsSet() {
		toSerialize["presence_penalty"] = o.PresencePenalty.Get()
	}
	if o.Seed.IsSet() {
		toSerialize["seed"] = o.Seed.Get()
	}
	if o.Stop.IsSet() {
		toSerialize["stop"] = o.Stop.Get()
	}
	if o.Stream.IsSet() {
		toSerialize["stream"] = o.Stream.Get()
	}
	if o.Suffix.IsSet() {
		toSerialize["suffix"] = o.Suffix.Get()
	}
	if o.Temperature.IsSet() {
		toSerialize["temperature"] = o.Temperature.Get()
	}
	if o.TopP.IsSet() {
		toSerialize["top_p"] = o.TopP.Get()
	}
	if !IsNil(o.User) {
		toSerialize["user"] = o.User
	}
	return toSerialize, nil
}

func (o *CreateCompletionRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"model",
		"prompt",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCreateCompletionRequest := _CreateCompletionRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCreateCompletionRequest)

	if err != nil {
		return err
	}

	*o = CreateCompletionRequest(varCreateCompletionRequest)

	return err
}

type NullableCreateCompletionRequest struct {
	value *CreateCompletionRequest
	isSet bool
}

func (v NullableCreateCompletionRequest) Get() *CreateCompletionRequest {
	return v.value
}

func (v *NullableCreateCompletionRequest) Set(val *CreateCompletionRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateCompletionRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateCompletionRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateCompletionRequest(val *CreateCompletionRequest) *NullableCreateCompletionRequest {
	return &NullableCreateCompletionRequest{value: val, isSet: true}
}

func (v NullableCreateCompletionRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateCompletionRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


