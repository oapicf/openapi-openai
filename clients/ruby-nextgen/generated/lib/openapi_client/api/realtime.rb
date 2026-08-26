# frozen_string_literal: true

module OpenapiClient
  module Api
    class Realtime
      def initialize(connection)
        @connection = connection
      end

      def sessions(realtime_session_create_request:)
        raise ArgumentError, 'realtime_session_create_request is required' if realtime_session_create_request.nil?

        @connection.call(
          :POST,
          '/realtime/sessions',
          type: OpenapiClient::Models::RealtimeSessionCreateResponse,
          auth: ['ApiKeyAuth'],
          body: realtime_session_create_request
        )
      end
    end
  end
end
