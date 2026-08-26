# frozen_string_literal: true

module OpenapiClient
  module Api
    class Audio
      def initialize(connection)
        @connection = connection
      end

      def speech(create_speech_request:)
        raise ArgumentError, 'create_speech_request is required' if create_speech_request.nil?

        @connection.call(
          :POST,
          '/audio/speech',
          type: nil,
          auth: ['ApiKeyAuth'],
          body: create_speech_request
        )
      end

      def transcriptions(file:, model:, language: nil, prompt: nil, response_format: nil, temperature: nil, timestamp_granularities: nil)
        raise ArgumentError, 'file is required' if file.nil?
        raise ArgumentError, 'model is required' if model.nil?

        @connection.call(
          :POST,
          '/audio/transcriptions',
          type: OpenapiClient::Models::CreateTranscription200Response,
          auth: ['ApiKeyAuth'],
          form: { 'file' => file, 'model' => model, 'language' => language, 'prompt' => prompt, 'response_format' => response_format, 'temperature' => temperature, 'timestamp_granularities[]' => timestamp_granularities }
        )
      end

      def translations(file:, model:, prompt: nil, response_format: nil, temperature: nil)
        raise ArgumentError, 'file is required' if file.nil?
        raise ArgumentError, 'model is required' if model.nil?

        @connection.call(
          :POST,
          '/audio/translations',
          type: OpenapiClient::Models::CreateTranslation200Response,
          auth: ['ApiKeyAuth'],
          form: { 'file' => file, 'model' => model, 'prompt' => prompt, 'response_format' => response_format, 'temperature' => temperature }
        )
      end
    end
  end
end
