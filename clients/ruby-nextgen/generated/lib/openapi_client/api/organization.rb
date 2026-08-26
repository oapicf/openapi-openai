# frozen_string_literal: true

module OpenapiClient
  module Api
    class Organization
      def initialize(connection)
        @connection = connection
      end

      def audit_logs(effective_at: nil, project_ids: nil, event_types: nil, actor_ids: nil, actor_emails: nil, resource_ids: nil, limit: nil, after: nil, before: nil)
        @connection.call(
          :GET,
          '/organization/audit_logs',
          type: OpenapiClient::Models::ListAuditLogsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'effective_at' => effective_at, 'project_ids[]' => project_ids, 'event_types[]' => event_types, 'actor_ids[]' => actor_ids, 'actor_emails[]' => actor_emails, 'resource_ids[]' => resource_ids, 'limit' => limit, 'after' => after, 'before' => before }
        )
      end

      def costs(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/costs',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_audio_speeches(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, user_ids: nil, api_key_ids: nil, models: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/audio_speeches',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'user_ids' => user_ids, 'api_key_ids' => api_key_ids, 'models' => models, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_audio_transcriptions(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, user_ids: nil, api_key_ids: nil, models: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/audio_transcriptions',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'user_ids' => user_ids, 'api_key_ids' => api_key_ids, 'models' => models, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_code_interpreter_sessions(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/code_interpreter_sessions',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_completions(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, user_ids: nil, api_key_ids: nil, models: nil, batch: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/completions',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'user_ids' => user_ids, 'api_key_ids' => api_key_ids, 'models' => models, 'batch' => batch, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_embeddings(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, user_ids: nil, api_key_ids: nil, models: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/embeddings',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'user_ids' => user_ids, 'api_key_ids' => api_key_ids, 'models' => models, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_images(start_time:, end_time: nil, bucket_width: nil, sources: nil, sizes: nil, project_ids: nil, user_ids: nil, api_key_ids: nil, models: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/images',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'sources' => sources, 'sizes' => sizes, 'project_ids' => project_ids, 'user_ids' => user_ids, 'api_key_ids' => api_key_ids, 'models' => models, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_moderations(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, user_ids: nil, api_key_ids: nil, models: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/moderations',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'user_ids' => user_ids, 'api_key_ids' => api_key_ids, 'models' => models, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end

      def usage_vector_stores(start_time:, end_time: nil, bucket_width: nil, project_ids: nil, group_by: nil, limit: nil, page: nil)
        raise ArgumentError, 'start_time is required' if start_time.nil?

        @connection.call(
          :GET,
          '/organization/usage/vector_stores',
          type: OpenapiClient::Models::UsageResponse,
          auth: ['ApiKeyAuth'],
          query: { 'start_time' => start_time, 'end_time' => end_time, 'bucket_width' => bucket_width, 'project_ids' => project_ids, 'group_by' => group_by, 'limit' => limit, 'page' => page }
        )
      end
    end
  end
end
