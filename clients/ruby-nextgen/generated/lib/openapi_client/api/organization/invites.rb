# frozen_string_literal: true

module OpenapiClient
  module Api
    class Organization::Invites
      def initialize(connection)
        @connection = connection
      end

      def create(invite_request:)
        raise ArgumentError, 'invite_request is required' if invite_request.nil?

        @connection.call(
          :POST,
          '/organization/invites',
          type: OpenapiClient::Models::Invite,
          auth: ['ApiKeyAuth'],
          body: invite_request
        )
      end

      def delete(invite_id:)
        raise ArgumentError, 'invite_id is required' if invite_id.nil?

        @connection.call(
          :DELETE,
          '/organization/invites/{invite_id}'
            .gsub('{invite_id}', ERB::Util.url_encode(invite_id.to_s)),
          type: OpenapiClient::Models::InviteDeleteResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(invite_id:)
        raise ArgumentError, 'invite_id is required' if invite_id.nil?

        @connection.call(
          :GET,
          '/organization/invites/{invite_id}'
            .gsub('{invite_id}', ERB::Util.url_encode(invite_id.to_s)),
          type: OpenapiClient::Models::Invite,
          auth: ['ApiKeyAuth']
        )
      end

      def list(limit: nil, after: nil)
        @connection.call(
          :GET,
          '/organization/invites',
          type: OpenapiClient::Models::InviteListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after }
        )
      end
    end
  end
end
