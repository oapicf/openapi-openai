# frozen_string_literal: true

module OpenapiClient
  module Api
    class FineTuning::Jobs
      def initialize(connection)
        @connection = connection
      end

      def cancel(fine_tuning_job_id:)
        raise ArgumentError, 'fine_tuning_job_id is required' if fine_tuning_job_id.nil?

        @connection.call(
          :POST,
          '/fine_tuning/jobs/{fine_tuning_job_id}/cancel'
            .gsub('{fine_tuning_job_id}', ERB::Util.url_encode(fine_tuning_job_id.to_s)),
          type: OpenapiClient::Models::FineTuningJob,
          auth: ['ApiKeyAuth']
        )
      end

      def checkpoints(fine_tuning_job_id:, after: nil, limit: nil)
        raise ArgumentError, 'fine_tuning_job_id is required' if fine_tuning_job_id.nil?

        @connection.call(
          :GET,
          '/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints'
            .gsub('{fine_tuning_job_id}', ERB::Util.url_encode(fine_tuning_job_id.to_s)),
          type: OpenapiClient::Models::ListFineTuningJobCheckpointsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'after' => after, 'limit' => limit }
        )
      end

      def create(create_fine_tuning_job_request:)
        raise ArgumentError, 'create_fine_tuning_job_request is required' if create_fine_tuning_job_request.nil?

        @connection.call(
          :POST,
          '/fine_tuning/jobs',
          type: OpenapiClient::Models::FineTuningJob,
          auth: ['ApiKeyAuth'],
          body: create_fine_tuning_job_request
        )
      end

      def events(fine_tuning_job_id:, after: nil, limit: nil)
        raise ArgumentError, 'fine_tuning_job_id is required' if fine_tuning_job_id.nil?

        @connection.call(
          :GET,
          '/fine_tuning/jobs/{fine_tuning_job_id}/events'
            .gsub('{fine_tuning_job_id}', ERB::Util.url_encode(fine_tuning_job_id.to_s)),
          type: OpenapiClient::Models::ListFineTuningJobEventsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'after' => after, 'limit' => limit }
        )
      end

      def get(fine_tuning_job_id:)
        raise ArgumentError, 'fine_tuning_job_id is required' if fine_tuning_job_id.nil?

        @connection.call(
          :GET,
          '/fine_tuning/jobs/{fine_tuning_job_id}'
            .gsub('{fine_tuning_job_id}', ERB::Util.url_encode(fine_tuning_job_id.to_s)),
          type: OpenapiClient::Models::FineTuningJob,
          auth: ['ApiKeyAuth']
        )
      end

      def list(after: nil, limit: nil)
        @connection.call(
          :GET,
          '/fine_tuning/jobs',
          type: OpenapiClient::Models::ListPaginatedFineTuningJobsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'after' => after, 'limit' => limit }
        )
      end
    end
  end
end
