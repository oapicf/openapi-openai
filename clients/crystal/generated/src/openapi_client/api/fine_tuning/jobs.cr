require "json"

module OpenAPIClient
  module Api
  class FineTuning::Jobs
    def initialize(@conn : Connection); end

    # Immediately cancel a fine-tune job. 
    def cancel(fine_tuning_job_id : String) : Response(OpenAPIClient::FineTuningJob)
      @conn.request(OpenAPIClient::FineTuningJob,
        method: :POST,
        path: "/fine_tuning/jobs/{fine_tuning_job_id}/cancel".sub("{fine_tuning_job_id}", OpenAPIClient.enc(fine_tuning_job_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # List checkpoints for a fine-tuning job. 
    def checkpoints(fine_tuning_job_id : String, *, after : String? = nil, limit : Int32? = nil) : Response(OpenAPIClient::ListFineTuningJobCheckpointsResponse)
      @conn.request(OpenAPIClient::ListFineTuningJobCheckpointsResponse,
        method: :GET,
        path: "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints".sub("{fine_tuning_job_id}", OpenAPIClient.enc(fine_tuning_job_id)),
        query: { "after" => after, "limit" => limit },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    def create(create_fine_tuning_job_request : OpenAPIClient::CreateFineTuningJobRequest) : Response(OpenAPIClient::FineTuningJob)
      @conn.request(OpenAPIClient::FineTuningJob,
        method: :POST,
        path: "/fine_tuning/jobs",
        body: create_fine_tuning_job_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get status updates for a fine-tuning job. 
    def events(fine_tuning_job_id : String, *, after : String? = nil, limit : Int32? = nil) : Response(OpenAPIClient::ListFineTuningJobEventsResponse)
      @conn.request(OpenAPIClient::ListFineTuningJobEventsResponse,
        method: :GET,
        path: "/fine_tuning/jobs/{fine_tuning_job_id}/events".sub("{fine_tuning_job_id}", OpenAPIClient.enc(fine_tuning_job_id)),
        query: { "after" => after, "limit" => limit },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
    def get(fine_tuning_job_id : String) : Response(OpenAPIClient::FineTuningJob)
      @conn.request(OpenAPIClient::FineTuningJob,
        method: :GET,
        path: "/fine_tuning/jobs/{fine_tuning_job_id}".sub("{fine_tuning_job_id}", OpenAPIClient.enc(fine_tuning_job_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # List your organization&#39;s fine-tuning jobs 
    def list(*, after : String? = nil, limit : Int32? = nil) : Response(OpenAPIClient::ListPaginatedFineTuningJobsResponse)
      @conn.request(OpenAPIClient::ListPaginatedFineTuningJobsResponse,
        method: :GET,
        path: "/fine_tuning/jobs",
        query: { "after" => after, "limit" => limit },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
