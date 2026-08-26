# frozen_string_literal: true

module OpenapiClient
  module Api
    class Threads::Messages
      def initialize(connection)
        @connection = connection
      end

      def create(thread_id:, create_message_request:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'create_message_request is required' if create_message_request.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}/messages'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::MessageObject,
          auth: ['ApiKeyAuth'],
          body: create_message_request
        )
      end

      def create_post(thread_id:, message_id:, modify_message_request:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'message_id is required' if message_id.nil?
        raise ArgumentError, 'modify_message_request is required' if modify_message_request.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}/messages/{message_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{message_id}', ERB::Util.url_encode(message_id.to_s)),
          type: OpenapiClient::Models::MessageObject,
          auth: ['ApiKeyAuth'],
          body: modify_message_request
        )
      end

      def delete(thread_id:, message_id:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'message_id is required' if message_id.nil?

        @connection.call(
          :DELETE,
          '/threads/{thread_id}/messages/{message_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{message_id}', ERB::Util.url_encode(message_id.to_s)),
          type: OpenapiClient::Models::DeleteMessageResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(thread_id:, message_id:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'message_id is required' if message_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}/messages/{message_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{message_id}', ERB::Util.url_encode(message_id.to_s)),
          type: OpenapiClient::Models::MessageObject,
          auth: ['ApiKeyAuth']
        )
      end

      def list(thread_id:, limit: nil, order: nil, after: nil, before: nil, run_id: nil)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}/messages'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::ListMessagesResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before, 'run_id' => run_id }
        )
      end
    end
  end
end
