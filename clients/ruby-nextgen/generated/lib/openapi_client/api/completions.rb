# frozen_string_literal: true

module OpenapiClient
  module Api
    class Completions
      def initialize(connection)
        @connection = connection
      end

      def create(create_completion_request:)
        raise ArgumentError, 'create_completion_request is required' if create_completion_request.nil?

        @connection.call(
          :POST,
          '/completions',
          type: OpenapiClient::Models::CreateCompletionResponse,
          auth: ['ApiKeyAuth'],
          body: create_completion_request
        )
      end
    end
  end
end
