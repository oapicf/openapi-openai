
# Table `CreateTranslationResponseVerboseJson`
(mapped from: CreateTranslationResponseVerboseJson)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**language** | language | text NOT NULL |  | **kotlin.String** | The language of the output translation (always &#x60;english&#x60;). | 
**duration** | duration | text NOT NULL |  | **kotlin.String** | The duration of the input audio. | 
**text** | text | text NOT NULL |  | **kotlin.String** | The translated text. | 
**segments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. |  [optional]





# **Table `CreateTranslationResponseVerboseJsonTranscriptionSegment`**
(mapped from: CreateTranslationResponseVerboseJsonTranscriptionSegment)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createTranslationResponseVerboseJson | createTranslationResponseVerboseJson | long | | kotlin.Long | Primary Key | *one*
transcriptionSegment | transcriptionSegment | long | | kotlin.Long | Foreign Key | *many*



