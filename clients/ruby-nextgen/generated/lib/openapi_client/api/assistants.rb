# frozen_string_literal: true

module OpenapiClient
  module Api
    class Assistants
      def initialize(connection)
        @connection = connection
      end

      def create(create_assistant_request:)
        raise ArgumentError, 'create_assistant_request is required' if create_assistant_request.nil?

        @connection.call(
          :POST,
          '/assistants',
          type: OpenapiClient::Models::AssistantObject,
          auth: ['ApiKeyAuth'],
          body: create_assistant_request
        )
      end

      def create_post(assistant_id:, modify_assistant_request:)
        raise ArgumentError, 'assistant_id is required' if assistant_id.nil?
        raise ArgumentError, 'modify_assistant_request is required' if modify_assistant_request.nil?

        @connection.call(
          :POST,
          '/assistants/{assistant_id}'
            .gsub('{assistant_id}', ERB::Util.url_encode(assistant_id.to_s)),
          type: OpenapiClient::Models::AssistantObject,
          auth: ['ApiKeyAuth'],
          body: modify_assistant_request
        )
      end

      def delete(assistant_id:)
        raise ArgumentError, 'assistant_id is required' if assistant_id.nil?

        @connection.call(
          :DELETE,
          '/assistants/{assistant_id}'
            .gsub('{assistant_id}', ERB::Util.url_encode(assistant_id.to_s)),
          type: OpenapiClient::Models::DeleteAssistantResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(assistant_id:)
        raise ArgumentError, 'assistant_id is required' if assistant_id.nil?

        @connection.call(
          :GET,
          '/assistants/{assistant_id}'
            .gsub('{assistant_id}', ERB::Util.url_encode(assistant_id.to_s)),
          type: OpenapiClient::Models::AssistantObject,
          auth: ['ApiKeyAuth']
        )
      end

      def list(limit: nil, order: nil, after: nil, before: nil)
        @connection.call(
          :GET,
          '/assistants',
          type: OpenapiClient::Models::ListAssistantsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before }
        )
      end
    end
  end
end
