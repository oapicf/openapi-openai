require "json"

module OpenAPIClient
  module Api
  class Audio
    def initialize(@conn : Connection); end

    # Generates audio from the input text.
    def speech(create_speech_request : OpenAPIClient::CreateSpeechRequest) : Response(::File)
      @conn.request(::File,
        method: :POST,
        path: "/audio/speech",
        body: create_speech_request,
        accept: %w[application/octet-stream],
        content_type: %w[application/json],
        raw: true,
        auth: %w[ApiKeyAuth])
    end

    # Transcribes audio into the input language.
    def transcriptions(file : ::File? = nil, model : OpenAPIClient::CreateTranscriptionRequestModel? = nil, language : String? = nil, prompt : String? = nil, response_format : OpenAPIClient::AudioResponseFormat? = nil, temperature : Float64? = nil, timestamp_granularities : Array(String)? = nil) : Response(OpenAPIClient::CreateTranscription200Response)
      @conn.request(OpenAPIClient::CreateTranscription200Response,
        method: :POST,
        path: "/audio/transcriptions",
        form: Hash(String, Crest::ParamsValue){ "file" => file, "model" => model, "language" => language, "prompt" => prompt, "response_format" => response_format, "temperature" => temperature, "timestamp_granularities[]" => timestamp_granularities },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Translates audio into English.
    def translations(file : ::File? = nil, model : OpenAPIClient::CreateTranscriptionRequestModel? = nil, prompt : String? = nil, response_format : OpenAPIClient::AudioResponseFormat? = nil, temperature : Float64? = nil) : Response(OpenAPIClient::CreateTranslation200Response)
      @conn.request(OpenAPIClient::CreateTranslation200Response,
        method: :POST,
        path: "/audio/translations",
        form: Hash(String, Crest::ParamsValue){ "file" => file, "model" => model, "prompt" => prompt, "response_format" => response_format, "temperature" => temperature },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
