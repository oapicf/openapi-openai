# frozen_string_literal: true

module OpenapiClient
  module Api
    class Threads
      def initialize(connection)
        @connection = connection
      end

      def create(create_thread_request: nil)
        @connection.call(
          :POST,
          '/threads',
          type: OpenapiClient::Models::ThreadObject,
          auth: ['ApiKeyAuth'],
          body: create_thread_request
        )
      end

      def create_post(thread_id:, modify_thread_request:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'modify_thread_request is required' if modify_thread_request.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::ThreadObject,
          auth: ['ApiKeyAuth'],
          body: modify_thread_request
        )
      end

      def delete(thread_id:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?

        @connection.call(
          :DELETE,
          '/threads/{thread_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::DeleteThreadResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(thread_id:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::ThreadObject,
          auth: ['ApiKeyAuth']
        )
      end
    end
  end
end
