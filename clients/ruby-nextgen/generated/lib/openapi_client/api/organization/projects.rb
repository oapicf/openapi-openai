# frozen_string_literal: true

module OpenapiClient
  module Api
    class Organization::Projects
      def initialize(connection)
        @connection = connection
      end

      def api_keys(project_id:, limit: nil, after: nil)
        raise ArgumentError, 'project_id is required' if project_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/api_keys'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::ProjectApiKeyListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after }
        )
      end

      def api_keys_delete(project_id:, key_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'key_id is required' if key_id.nil?

        @connection.call(
          :DELETE,
          '/organization/projects/{project_id}/api_keys/{key_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{key_id}', ERB::Util.url_encode(key_id.to_s)),
          type: OpenapiClient::Models::ProjectApiKeyDeleteResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def api_keys_get(project_id:, key_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'key_id is required' if key_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/api_keys/{key_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{key_id}', ERB::Util.url_encode(key_id.to_s)),
          type: OpenapiClient::Models::ProjectApiKey,
          auth: ['ApiKeyAuth']
        )
      end

      def archive(project_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?

        @connection.call(
          :POST,
          '/organization/projects/{project_id}/archive'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::Project,
          auth: ['ApiKeyAuth']
        )
      end

      def create(project_create_request:)
        raise ArgumentError, 'project_create_request is required' if project_create_request.nil?

        @connection.call(
          :POST,
          '/organization/projects',
          type: OpenapiClient::Models::Project,
          auth: ['ApiKeyAuth'],
          body: project_create_request
        )
      end

      def create_post(project_id:, project_update_request:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'project_update_request is required' if project_update_request.nil?

        @connection.call(
          :POST,
          '/organization/projects/{project_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::Project,
          auth: ['ApiKeyAuth'],
          body: project_update_request
        )
      end

      def get(project_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::Project,
          auth: ['ApiKeyAuth']
        )
      end

      def list(limit: nil, after: nil, include_archived: nil)
        @connection.call(
          :GET,
          '/organization/projects',
          type: OpenapiClient::Models::ProjectListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after, 'include_archived' => include_archived }
        )
      end

      def rate_limits(project_id:, limit: nil, after: nil, before: nil)
        raise ArgumentError, 'project_id is required' if project_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/rate_limits'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::ProjectRateLimitListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after, 'before' => before }
        )
      end

      def rate_limits_post(project_id:, rate_limit_id:, project_rate_limit_update_request:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'rate_limit_id is required' if rate_limit_id.nil?
        raise ArgumentError, 'project_rate_limit_update_request is required' if project_rate_limit_update_request.nil?

        @connection.call(
          :POST,
          '/organization/projects/{project_id}/rate_limits/{rate_limit_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{rate_limit_id}', ERB::Util.url_encode(rate_limit_id.to_s)),
          type: OpenapiClient::Models::ProjectRateLimit,
          auth: ['ApiKeyAuth'],
          body: project_rate_limit_update_request
        )
      end

      def service_accounts(project_id:, limit: nil, after: nil)
        raise ArgumentError, 'project_id is required' if project_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/service_accounts'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::ProjectServiceAccountListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after }
        )
      end

      def service_accounts_delete(project_id:, service_account_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'service_account_id is required' if service_account_id.nil?

        @connection.call(
          :DELETE,
          '/organization/projects/{project_id}/service_accounts/{service_account_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{service_account_id}', ERB::Util.url_encode(service_account_id.to_s)),
          type: OpenapiClient::Models::ProjectServiceAccountDeleteResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def service_accounts_get(project_id:, service_account_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'service_account_id is required' if service_account_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/service_accounts/{service_account_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{service_account_id}', ERB::Util.url_encode(service_account_id.to_s)),
          type: OpenapiClient::Models::ProjectServiceAccount,
          auth: ['ApiKeyAuth']
        )
      end

      def service_accounts_post(project_id:, project_service_account_create_request:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'project_service_account_create_request is required' if project_service_account_create_request.nil?

        @connection.call(
          :POST,
          '/organization/projects/{project_id}/service_accounts'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::ProjectServiceAccountCreateResponse,
          auth: ['ApiKeyAuth'],
          body: project_service_account_create_request
        )
      end

      def users(project_id:, limit: nil, after: nil)
        raise ArgumentError, 'project_id is required' if project_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/users'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::ProjectUserListResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'after' => after }
        )
      end

      def users_delete(project_id:, user_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'user_id is required' if user_id.nil?

        @connection.call(
          :DELETE,
          '/organization/projects/{project_id}/users/{user_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{user_id}', ERB::Util.url_encode(user_id.to_s)),
          type: OpenapiClient::Models::ProjectUserDeleteResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def users_get(project_id:, user_id:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'user_id is required' if user_id.nil?

        @connection.call(
          :GET,
          '/organization/projects/{project_id}/users/{user_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{user_id}', ERB::Util.url_encode(user_id.to_s)),
          type: OpenapiClient::Models::ProjectUser,
          auth: ['ApiKeyAuth']
        )
      end

      def users_post(project_id:, project_user_create_request:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'project_user_create_request is required' if project_user_create_request.nil?

        @connection.call(
          :POST,
          '/organization/projects/{project_id}/users'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s)),
          type: OpenapiClient::Models::ProjectUser,
          auth: ['ApiKeyAuth'],
          body: project_user_create_request
        )
      end

      def users_post_1(project_id:, user_id:, project_user_update_request:)
        raise ArgumentError, 'project_id is required' if project_id.nil?
        raise ArgumentError, 'user_id is required' if user_id.nil?
        raise ArgumentError, 'project_user_update_request is required' if project_user_update_request.nil?

        @connection.call(
          :POST,
          '/organization/projects/{project_id}/users/{user_id}'
            .gsub('{project_id}', ERB::Util.url_encode(project_id.to_s))
            .gsub('{user_id}', ERB::Util.url_encode(user_id.to_s)),
          type: OpenapiClient::Models::ProjectUser,
          auth: ['ApiKeyAuth'],
          body: project_user_update_request
        )
      end
    end
  end
end
