# #OpenAI API
#
##The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
#
#The version of the OpenAPI document: 2.0.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "../spec_helper"
require "json"
require "time"

# Unit tests for OpenAPIClient::AudioApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe "AudioApi" do
  describe "test an instance of AudioApi" do
    it "should create an instance of AudioApi" do
      api_instance = OpenAPIClient::AudioApi.new
      # TODO expect(api_instance).to be_instance_of(OpenAPIClient::AudioApi)
    end
  end

  # unit tests for create_speech
  # Generates audio from the input text.
  # @param create_speech_request 
  # @param [Hash] opts the optional parameters
  # @return [::File]
  describe "create_speech test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_transcription
  # Transcribes audio into the input language.
  # @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  # @param model 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
  # @option opts [String] :prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
  # @option opts [String] :response_format The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
  # @option opts [Float64] :temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  # @option opts [Array(String)] :timestamp_granularities The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
  # @return [CreateTranscription200Response]
  describe "create_transcription test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

  # unit tests for create_translation
  # Translates audio into English.
  # @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
  # @param model 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :prompt An optional text to guide the model&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
  # @option opts [String] :response_format The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
  # @option opts [Float64] :temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
  # @return [CreateTranslation200Response]
  describe "create_translation test" do
    it "should work" do
      # assertion here. ref: https://crystal-lang.org/reference/guides/testing.html
    end
  end

end
