#
# OpenAI API
# 
# The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
# The version of the OpenAPI document: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_create_fine_tuning_job_request
import ../models/model_fine_tuning_job
import ../models/model_list_fine_tuning_job_checkpoints_response
import ../models/model_list_fine_tuning_job_events_response
import ../models/model_list_paginated_fine_tuning_jobs_response

const basepath = "https://api.openai.com/v1"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc cancelFineTuningJob*(httpClient: HttpClient, fineTuningJobId: string): (Option[FineTuningJob], Response) =
  ## Immediately cancel a fine-tune job. 

  let response = httpClient.post(basepath & fmt"/fine_tuning/jobs/{fine_tuning_job_id}/cancel")
  constructResult[FineTuningJob](response)


proc createFineTuningJob*(httpClient: HttpClient, createFineTuningJobRequest: CreateFineTuningJobRequest): (Option[FineTuningJob], Response) =
  ## Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & "/fine_tuning/jobs", $(%createFineTuningJobRequest))
  constructResult[FineTuningJob](response)


proc listFineTuningEvents*(httpClient: HttpClient, fineTuningJobId: string, after: string, limit: int): (Option[ListFineTuningJobEventsResponse], Response) =
  ## Get status updates for a fine-tuning job. 
  let query_for_api_call = encodeQuery([
    ("after", $after), # Identifier for the last event from the previous pagination request.
    ("limit", $limit), # Number of events to retrieve.
  ])

  let response = httpClient.get(basepath & fmt"/fine_tuning/jobs/{fine_tuning_job_id}/events" & "?" & query_for_api_call)
  constructResult[ListFineTuningJobEventsResponse](response)


proc listFineTuningJobCheckpoints*(httpClient: HttpClient, fineTuningJobId: string, after: string, limit: int): (Option[ListFineTuningJobCheckpointsResponse], Response) =
  ## List checkpoints for a fine-tuning job. 
  let query_for_api_call = encodeQuery([
    ("after", $after), # Identifier for the last checkpoint ID from the previous pagination request.
    ("limit", $limit), # Number of checkpoints to retrieve.
  ])

  let response = httpClient.get(basepath & fmt"/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints" & "?" & query_for_api_call)
  constructResult[ListFineTuningJobCheckpointsResponse](response)


proc listPaginatedFineTuningJobs*(httpClient: HttpClient, after: string, limit: int): (Option[ListPaginatedFineTuningJobsResponse], Response) =
  ## List your organization's fine-tuning jobs 
  let query_for_api_call = encodeQuery([
    ("after", $after), # Identifier for the last job from the previous pagination request.
    ("limit", $limit), # Number of fine-tuning jobs to retrieve.
  ])

  let response = httpClient.get(basepath & "/fine_tuning/jobs" & "?" & query_for_api_call)
  constructResult[ListPaginatedFineTuningJobsResponse](response)


proc retrieveFineTuningJob*(httpClient: HttpClient, fineTuningJobId: string): (Option[FineTuningJob], Response) =
  ## Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 

  let response = httpClient.get(basepath & fmt"/fine_tuning/jobs/{fine_tuning_job_id}")
  constructResult[FineTuningJob](response)

