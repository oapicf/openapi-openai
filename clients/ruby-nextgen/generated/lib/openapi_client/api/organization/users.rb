# frozen_string_literal: true

module OpenapiClient
  module Api
    class Organization::Users
      def initialize(connection)
        @connection = connection
      end

      def create(user_id:, user_role_update_request:)
        raise ArgumentError, 'user_id is required' if user_id.nil?
        raise ArgumentError, 'user_role_update_request is required' if user_role_update_request.nil?

        @connection.call(
          :POST,
          '/organization/users/{user_id}'
            .gsub('{user_id}', ERB::Util.url_encode(user_id.to_s)),
          type: OpenapiClient::Models::User,
          auth: ['ApiKeyAuth'],
          body: user_role_update_request
        )
      end

      def delete(user_id:)
        raise ArgumentError, 'user_id is required' if user_id.nil?

        @connection.call(
          :DELETE,
          '/organization/users/{user_id}'
            .gsub('{user_id}', ERB::Util.url_encode(user_id.to_s)),
          type: OpenapiClient::Models::UserDeleteResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(user_id:)
        raise ArgumentError, 'user_id is required' if user_id.nil?

        @connection.call(
          :GET,
          '/organization/users/{user_id}'
            .gsub('{user_id}', ERB::Util.url_encode(user_id.to_s)),
          type: OpenapiClient::Models::User,
          auth: ['ApiKeyAuth']
        )
      end

      def list(limit: nil, after: nil)
        @connection.call(
          :GET,
          '/organization/users',
          type: OpenapiClient::Models::UserListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after }
        )
      end
    end
  end
end
