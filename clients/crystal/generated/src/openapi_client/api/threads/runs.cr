require "json"

module OpenAPIClient
  module Api
  class Threads::Runs
    def initialize(@conn : Connection); end

    # Cancels a run that is &#x60;in_progress&#x60;.
    def cancel(thread_id : String, run_id : String) : Response(OpenAPIClient::RunObject)
      @conn.request(OpenAPIClient::RunObject,
        method: :POST,
        path: "/threads/{thread_id}/runs/{run_id}/cancel".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{run_id}", OpenAPIClient.enc(run_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Create a thread and run it in one request.
    def create(create_thread_and_run_request : OpenAPIClient::CreateThreadAndRunRequest) : Response(OpenAPIClient::RunObject)
      @conn.request(OpenAPIClient::RunObject,
        method: :POST,
        path: "/threads/runs",
        body: create_thread_and_run_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Create a run.
    def create_post(thread_id : String, create_run_request : OpenAPIClient::CreateRunRequest, *, _include : Array(String)? = nil) : Response(OpenAPIClient::RunObject)
      @conn.request(OpenAPIClient::RunObject,
        method: :POST,
        path: "/threads/{thread_id}/runs".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        body: create_run_request,
        query: { "include[]" => _include },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies a run.
    def create_post_1(thread_id : String, run_id : String, modify_run_request : OpenAPIClient::ModifyRunRequest) : Response(OpenAPIClient::RunObject)
      @conn.request(OpenAPIClient::RunObject,
        method: :POST,
        path: "/threads/{thread_id}/runs/{run_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{run_id}", OpenAPIClient.enc(run_id)),
        body: modify_run_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a run.
    def get(thread_id : String, run_id : String) : Response(OpenAPIClient::RunObject)
      @conn.request(OpenAPIClient::RunObject,
        method: :GET,
        path: "/threads/{thread_id}/runs/{run_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{run_id}", OpenAPIClient.enc(run_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of runs belonging to a thread.
    def list(thread_id : String, *, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil) : Response(OpenAPIClient::ListRunsResponse)
      @conn.request(OpenAPIClient::ListRunsResponse,
        method: :GET,
        path: "/threads/{thread_id}/runs".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of run steps belonging to a run.
    def steps(thread_id : String, run_id : String, *, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil, _include : Array(String)? = nil) : Response(OpenAPIClient::ListRunStepsResponse)
      @conn.request(OpenAPIClient::ListRunStepsResponse,
        method: :GET,
        path: "/threads/{thread_id}/runs/{run_id}/steps".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{run_id}", OpenAPIClient.enc(run_id)),
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before, "include[]" => _include },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a run step.
    def steps_get(thread_id : String, run_id : String, step_id : String, *, _include : Array(String)? = nil) : Response(OpenAPIClient::RunStepObject)
      @conn.request(OpenAPIClient::RunStepObject,
        method: :GET,
        path: "/threads/{thread_id}/runs/{run_id}/steps/{step_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{run_id}", OpenAPIClient.enc(run_id)).sub("{step_id}", OpenAPIClient.enc(step_id)),
        query: { "include[]" => _include },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
    def submit_tool_outputs(thread_id : String, run_id : String, submit_tool_outputs_run_request : OpenAPIClient::SubmitToolOutputsRunRequest) : Response(OpenAPIClient::RunObject)
      @conn.request(OpenAPIClient::RunObject,
        method: :POST,
        path: "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{run_id}", OpenAPIClient.enc(run_id)),
        body: submit_tool_outputs_run_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
