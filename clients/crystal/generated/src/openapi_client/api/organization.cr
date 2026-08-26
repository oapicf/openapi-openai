require "json"

module OpenAPIClient
  module Api
  class Organization
    def initialize(@conn : Connection); end

    # List user actions and configuration changes within this organization.
    def audit_logs(*, effective_at : OpenAPIClient::ListAuditLogsEffectiveAtParameter? = nil, project_ids : Array(String)? = nil, event_types : Array(OpenAPIClient::AuditLogEventType)? = nil, actor_ids : Array(String)? = nil, actor_emails : Array(String)? = nil, resource_ids : Array(String)? = nil, limit : Int32? = nil, after : String? = nil, before : String? = nil) : Response(OpenAPIClient::ListAuditLogsResponse)
      @conn.request(OpenAPIClient::ListAuditLogsResponse,
        method: :GET,
        path: "/organization/audit_logs",
        query: { "effective_at" => effective_at, "project_ids[]" => project_ids, "event_types[]" => event_types, "actor_ids[]" => actor_ids, "actor_emails[]" => actor_emails, "resource_ids[]" => resource_ids, "limit" => limit, "after" => after, "before" => before },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get costs details for the organization.
    def costs(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/costs",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get audio speeches usage details for the organization.
    def usage_audio_speeches(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, user_ids : Array(String)? = nil, api_key_ids : Array(String)? = nil, models : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/audio_speeches",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "user_ids" => user_ids, "api_key_ids" => api_key_ids, "models" => models, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get audio transcriptions usage details for the organization.
    def usage_audio_transcriptions(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, user_ids : Array(String)? = nil, api_key_ids : Array(String)? = nil, models : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/audio_transcriptions",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "user_ids" => user_ids, "api_key_ids" => api_key_ids, "models" => models, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get code interpreter sessions usage details for the organization.
    def usage_code_interpreter_sessions(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/code_interpreter_sessions",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get completions usage details for the organization.
    def usage_completions(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, user_ids : Array(String)? = nil, api_key_ids : Array(String)? = nil, models : Array(String)? = nil, batch : Bool? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/completions",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "user_ids" => user_ids, "api_key_ids" => api_key_ids, "models" => models, "batch" => batch, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get embeddings usage details for the organization.
    def usage_embeddings(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, user_ids : Array(String)? = nil, api_key_ids : Array(String)? = nil, models : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/embeddings",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "user_ids" => user_ids, "api_key_ids" => api_key_ids, "models" => models, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get images usage details for the organization.
    def usage_images(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, sources : Array(String)? = nil, sizes : Array(String)? = nil, project_ids : Array(String)? = nil, user_ids : Array(String)? = nil, api_key_ids : Array(String)? = nil, models : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/images",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "sources" => sources, "sizes" => sizes, "project_ids" => project_ids, "user_ids" => user_ids, "api_key_ids" => api_key_ids, "models" => models, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get moderations usage details for the organization.
    def usage_moderations(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, user_ids : Array(String)? = nil, api_key_ids : Array(String)? = nil, models : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/moderations",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "user_ids" => user_ids, "api_key_ids" => api_key_ids, "models" => models, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Get vector stores usage details for the organization.
    def usage_vector_stores(*, start_time : Int32? = nil, end_time : Int32? = nil, bucket_width : String? = nil, project_ids : Array(String)? = nil, group_by : Array(String)? = nil, limit : Int32? = nil, page : String? = nil) : Response(OpenAPIClient::UsageResponse)
      @conn.request(OpenAPIClient::UsageResponse,
        method: :GET,
        path: "/organization/usage/vector_stores",
        query: { "start_time" => start_time, "end_time" => end_time, "bucket_width" => bucket_width, "project_ids" => project_ids, "group_by" => group_by, "limit" => limit, "page" => page },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
