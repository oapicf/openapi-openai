package models
// AudioResponseFormat : The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
type AudioResponseFormat string

// List of AudioResponseFormat
const (
	JSON AudioResponseFormat = "json"
	TEXT AudioResponseFormat = "text"
	SRT AudioResponseFormat = "srt"
	VERBOSE_JSON AudioResponseFormat = "verbose_json"
	VTT AudioResponseFormat = "vtt"
)
