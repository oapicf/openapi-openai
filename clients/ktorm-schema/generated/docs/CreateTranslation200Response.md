
# Table `createTranslation_200_response`
(mapped from: CreateTranslation200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**text** | text | text NOT NULL |  | **kotlin.String** | The translated text. | 
**language** | language | text NOT NULL |  | **kotlin.String** | The language of the output translation (always &#x60;english&#x60;). | 
**duration** | duration | text NOT NULL |  | **kotlin.String** | The duration of the input audio. | 
**segments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TranscriptionSegment&gt;**](TranscriptionSegment.md) | Segments of the translated text and their corresponding details. |  [optional]





# **Table `CreateTranslation200ResponseTranscriptionSegment`**
(mapped from: CreateTranslation200ResponseTranscriptionSegment)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createTranslation200Response | createTranslation200Response | long | | kotlin.Long | Primary Key | *one*
transcriptionSegment | transcriptionSegment | long | | kotlin.Long | Foreign Key | *many*



