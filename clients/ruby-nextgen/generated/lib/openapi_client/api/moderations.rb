# frozen_string_literal: true

module OpenapiClient
  module Api
    class Moderations
      def initialize(connection)
        @connection = connection
      end

      def create(create_moderation_request:)
        raise ArgumentError, 'create_moderation_request is required' if create_moderation_request.nil?

        @connection.call(
          :POST,
          '/moderations',
          type: OpenapiClient::Models::CreateModerationResponse,
          auth: ['ApiKeyAuth'],
          body: create_moderation_request
        )
      end
    end
  end
end
