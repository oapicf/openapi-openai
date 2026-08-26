# frozen_string_literal: true

module OpenapiClient
  module Api
    class Threads::Runs
      def initialize(connection)
        @connection = connection
      end

      def cancel(thread_id:, run_id:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'run_id is required' if run_id.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}/runs/{run_id}/cancel'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{run_id}', ERB::Util.url_encode(run_id.to_s)),
          type: OpenapiClient::Models::RunObject,
          auth: ['ApiKeyAuth']
        )
      end

      def create(create_thread_and_run_request:)
        raise ArgumentError, 'create_thread_and_run_request is required' if create_thread_and_run_request.nil?

        @connection.call(
          :POST,
          '/threads/runs',
          type: OpenapiClient::Models::RunObject,
          auth: ['ApiKeyAuth'],
          body: create_thread_and_run_request
        )
      end

      def create_post(thread_id:, create_run_request:, include: nil)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'create_run_request is required' if create_run_request.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}/runs'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::RunObject,
          auth: ['ApiKeyAuth'],
          query: { 'include[]' => include },
          body: create_run_request
        )
      end

      def create_post_1(thread_id:, run_id:, modify_run_request:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'run_id is required' if run_id.nil?
        raise ArgumentError, 'modify_run_request is required' if modify_run_request.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}/runs/{run_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{run_id}', ERB::Util.url_encode(run_id.to_s)),
          type: OpenapiClient::Models::RunObject,
          auth: ['ApiKeyAuth'],
          body: modify_run_request
        )
      end

      def get(thread_id:, run_id:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'run_id is required' if run_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}/runs/{run_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{run_id}', ERB::Util.url_encode(run_id.to_s)),
          type: OpenapiClient::Models::RunObject,
          auth: ['ApiKeyAuth']
        )
      end

      def list(thread_id:, limit: nil, order: nil, after: nil, before: nil)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}/runs'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s)),
          type: OpenapiClient::Models::ListRunsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before }
        )
      end

      def steps(thread_id:, run_id:, limit: nil, order: nil, after: nil, before: nil, include: nil)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'run_id is required' if run_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}/runs/{run_id}/steps'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{run_id}', ERB::Util.url_encode(run_id.to_s)),
          type: OpenapiClient::Models::ListRunStepsResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before, 'include[]' => include }
        )
      end

      def steps_get(thread_id:, run_id:, step_id:, include: nil)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'run_id is required' if run_id.nil?
        raise ArgumentError, 'step_id is required' if step_id.nil?

        @connection.call(
          :GET,
          '/threads/{thread_id}/runs/{run_id}/steps/{step_id}'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{run_id}', ERB::Util.url_encode(run_id.to_s))
            .gsub('{step_id}', ERB::Util.url_encode(step_id.to_s)),
          type: OpenapiClient::Models::RunStepObject,
          auth: ['ApiKeyAuth'],
          query: { 'include[]' => include }
        )
      end

      def submit_tool_outputs(thread_id:, run_id:, submit_tool_outputs_run_request:)
        raise ArgumentError, 'thread_id is required' if thread_id.nil?
        raise ArgumentError, 'run_id is required' if run_id.nil?
        raise ArgumentError, 'submit_tool_outputs_run_request is required' if submit_tool_outputs_run_request.nil?

        @connection.call(
          :POST,
          '/threads/{thread_id}/runs/{run_id}/submit_tool_outputs'
            .gsub('{thread_id}', ERB::Util.url_encode(thread_id.to_s))
            .gsub('{run_id}', ERB::Util.url_encode(run_id.to_s)),
          type: OpenapiClient::Models::RunObject,
          auth: ['ApiKeyAuth'],
          body: submit_tool_outputs_run_request
        )
      end
    end
  end
end
