
# Table `CreateTranscriptionResponseVerboseJson`
(mapped from: CreateTranscriptionResponseVerboseJson)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**language** | language | text NOT NULL |  | **kotlin.String** | The language of the input audio. | 
**duration** | duration | text NOT NULL |  | **kotlin.String** | The duration of the input audio. | 
**text** | text | text NOT NULL |  | **kotlin.String** | The transcribed text. | 
**words** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TranscriptionWord&gt;**](TranscriptionWord.md) | Extracted words and their corresponding timestamps. |  [optional]
**segments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the transcribed text and their corresponding details. |  [optional]





# **Table `CreateTranscriptionResponseVerboseJsonTranscriptionWord`**
(mapped from: CreateTranscriptionResponseVerboseJsonTranscriptionWord)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createTranscriptionResponseVerboseJson | createTranscriptionResponseVerboseJson | long | | kotlin.Long | Primary Key | *one*
transcriptionWord | transcriptionWord | long | | kotlin.Long | Foreign Key | *many*



# **Table `CreateTranscriptionResponseVerboseJsonTranscriptionSegment`**
(mapped from: CreateTranscriptionResponseVerboseJsonTranscriptionSegment)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createTranscriptionResponseVerboseJson | createTranscriptionResponseVerboseJson | long | | kotlin.Long | Primary Key | *one*
transcriptionSegment | transcriptionSegment | long | | kotlin.Long | Foreign Key | *many*



