# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test AudioApi")

api_instance <- AudioApi$new()

test_that("CreateSpeech", {
  # tests for CreateSpeech
  # base path: https://api.openai.com/v1
  # Generates audio from the input text.
  # @param create_speech_request CreateSpeechRequest 
  # @return [data.frame]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CreateTranscription", {
  # tests for CreateTranscription
  # base path: https://api.openai.com/v1
  # Transcribes audio into the input language.
  # @param file data.frame The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  # @param model CreateTranscriptionRequestModel 
  # @param language character The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency.  (optional)
  # @param prompt character An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language.  (optional)
  # @param response_format character The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional)
  # @param temperature numeric The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
  # @param timestamp_granularities array[character] The timestamp granularities to populate for this transcription. `response_format` must be set `verbose_json` to use timestamp granularities. Either or both of these options are supported: `word`, or `segment`. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency.  (optional)
  # @return [CreateTranscription200Response]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("CreateTranslation", {
  # tests for CreateTranslation
  # base path: https://api.openai.com/v1
  # Translates audio into English.
  # @param file data.frame The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  # @param model CreateTranscriptionRequestModel 
  # @param prompt character An optional text to guide the model's style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English.  (optional)
  # @param response_format character The format of the transcript output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`.  (optional)
  # @param temperature numeric The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit.  (optional)
  # @return [CreateTranslation200Response]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})
