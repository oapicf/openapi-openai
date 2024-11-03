require 'json'


MyApp.add_route('POST', '/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel', {
  "resourcePath" => "/FineTuning",
  "summary" => "Immediately cancel a fine-tune job. ",
  "nickname" => "cancel_fine_tuning_job",
  "responseClass" => "FineTuningJob",
  "endpoint" => "/fine_tuning/jobs/{fine_tuning_job_id}/cancel",
  "notes" => "",
  "parameters" => [
    {
      "name" => "fine_tuning_job_id",
      "description" => "The ID of the fine-tuning job to cancel. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/fine_tuning/jobs', {
  "resourcePath" => "/FineTuning",
  "summary" => "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
  "nickname" => "create_fine_tuning_job",
  "responseClass" => "FineTuningJob",
  "endpoint" => "/fine_tuning/jobs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateFineTuningJobRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine_tuning/jobs/{fine_tuning_job_id}/events', {
  "resourcePath" => "/FineTuning",
  "summary" => "Get status updates for a fine-tuning job. ",
  "nickname" => "list_fine_tuning_events",
  "responseClass" => "ListFineTuningJobEventsResponse",
  "endpoint" => "/fine_tuning/jobs/{fine_tuning_job_id}/events",
  "notes" => "",
  "parameters" => [
    {
      "name" => "after",
      "description" => "Identifier for the last event from the previous pagination request.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Number of events to retrieve.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "fine_tuning_job_id",
      "description" => "The ID of the fine-tuning job to get events for. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints', {
  "resourcePath" => "/FineTuning",
  "summary" => "List checkpoints for a fine-tuning job. ",
  "nickname" => "list_fine_tuning_job_checkpoints",
  "responseClass" => "ListFineTuningJobCheckpointsResponse",
  "endpoint" => "/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints",
  "notes" => "",
  "parameters" => [
    {
      "name" => "after",
      "description" => "Identifier for the last checkpoint ID from the previous pagination request.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Number of checkpoints to retrieve.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "10",
      "paramType" => "query",
    },
    {
      "name" => "fine_tuning_job_id",
      "description" => "The ID of the fine-tuning job to get checkpoints for. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine_tuning/jobs', {
  "resourcePath" => "/FineTuning",
  "summary" => "List your organization's fine-tuning jobs ",
  "nickname" => "list_paginated_fine_tuning_jobs",
  "responseClass" => "ListPaginatedFineTuningJobsResponse",
  "endpoint" => "/fine_tuning/jobs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "after",
      "description" => "Identifier for the last job from the previous pagination request.",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "limit",
      "description" => "Number of fine-tuning jobs to retrieve.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/fine_tuning/jobs/{fine_tuning_job_id}', {
  "resourcePath" => "/FineTuning",
  "summary" => "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ",
  "nickname" => "retrieve_fine_tuning_job",
  "responseClass" => "FineTuningJob",
  "endpoint" => "/fine_tuning/jobs/{fine_tuning_job_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "fine_tuning_job_id",
      "description" => "The ID of the fine-tuning job. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

