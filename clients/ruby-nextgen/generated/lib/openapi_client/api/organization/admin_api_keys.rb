# frozen_string_literal: true

module OpenapiClient
  module Api
    class Organization::AdminApiKeys
      def initialize(connection)
        @connection = connection
      end

      def create(admin_api_keys_create_request:)
        raise ArgumentError, 'admin_api_keys_create_request is required' if admin_api_keys_create_request.nil?

        @connection.call(
          :POST,
          '/organization/admin_api_keys',
          type: OpenapiClient::Models::AdminApiKey,
          auth: ['ApiKeyAuth'],
          body: admin_api_keys_create_request
        )
      end

      def delete(key_id:)
        raise ArgumentError, 'key_id is required' if key_id.nil?

        @connection.call(
          :DELETE,
          '/organization/admin_api_keys/{key_id}'
            .gsub('{key_id}', ERB::Util.url_encode(key_id.to_s)),
          type: OpenapiClient::Models::AdminApiKeysDelete200Response,
          auth: ['ApiKeyAuth']
        )
      end

      def get(key_id:)
        raise ArgumentError, 'key_id is required' if key_id.nil?

        @connection.call(
          :GET,
          '/organization/admin_api_keys/{key_id}'
            .gsub('{key_id}', ERB::Util.url_encode(key_id.to_s)),
          type: OpenapiClient::Models::AdminApiKey,
          auth: ['ApiKeyAuth']
        )
      end

      def list(after: nil, order: nil, limit: nil)
        @connection.call(
          :GET,
          '/organization/admin_api_keys',
          type: OpenapiClient::Models::ApiKeyList,
          auth: ['ApiKeyAuth'],
          query: { 'after' => after, 'order' => order, 'limit' => limit }
        )
      end
    end
  end
end
