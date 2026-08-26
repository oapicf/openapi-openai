# frozen_string_literal: true

module OpenapiClient
  module Api
    class Chat
      def initialize(connection)
        @connection = connection
      end

      def completions(create_chat_completion_request:)
        raise ArgumentError, 'create_chat_completion_request is required' if create_chat_completion_request.nil?

        @connection.call(
          :POST,
          '/chat/completions',
          type: OpenapiClient::Models::CreateChatCompletionResponse,
          auth: ['ApiKeyAuth'],
          body: create_chat_completion_request
        )
      end
    end
  end
end
