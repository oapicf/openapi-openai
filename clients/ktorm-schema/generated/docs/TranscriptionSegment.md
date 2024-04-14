
# Table `TranscriptionSegment`
(mapped from: TranscriptionSegment)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | Unique identifier of the segment. | 
**seek** | seek | int NOT NULL |  | **kotlin.Int** | Seek offset of the segment. | 
**start** | start | float NOT NULL |  | **kotlin.Float** | Start time of the segment in seconds. | 
**end** | end | float NOT NULL |  | **kotlin.Float** | End time of the segment in seconds. | 
**text** | text | text NOT NULL |  | **kotlin.String** | Text content of the segment. | 
**tokens** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Array of token IDs for the text content. | 
**temperature** | temperature | float NOT NULL |  | **kotlin.Float** | Temperature parameter used for generating the segment. | 
**avgLogprob** | avg_logprob | float NOT NULL |  | **kotlin.Float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compressionRatio** | compression_ratio | float NOT NULL |  | **kotlin.Float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**noSpeechProb** | no_speech_prob | float NOT NULL |  | **kotlin.Float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 







# **Table `TranscriptionSegmentTokens`**
(mapped from: TranscriptionSegmentTokens)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
transcriptionSegment | transcriptionSegment | long | | kotlin.Long | Primary Key | *one*
tokens | tokens | int | | kotlin.Int | Foreign Key | *many*







