# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X POST https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/cancel
curl -X POST https://api.openai.com/v1/assistants
curl -X POST https://api.openai.com/v1/threads/{thread_id}/messages
curl -X POST https://api.openai.com/v1/threads/{thread_id}/runs
curl -X POST https://api.openai.com/v1/threads
curl -X POST https://api.openai.com/v1/threads/runs
curl -X DELETE https://api.openai.com/v1/assistants/{assistant_id}
curl -X DELETE https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}
curl -X DELETE https://api.openai.com/v1/threads/{thread_id}
curl -X GET https://api.openai.com/v1/assistants/{assistant_id}
curl -X GET https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}
curl -X GET https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}
curl -X GET https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}
curl -X GET https://api.openai.com/v1/threads/{thread_id}
curl -X GET https://api.openai.com/v1/assistants
curl -X GET https://api.openai.com/v1/threads/{thread_id}/messages
curl -X GET https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/steps
curl -X GET https://api.openai.com/v1/threads/{thread_id}/runs
curl -X POST https://api.openai.com/v1/assistants/{assistant_id}
curl -X POST https://api.openai.com/v1/threads/{thread_id}/messages/{message_id}
curl -X POST https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}
curl -X POST https://api.openai.com/v1/threads/{thread_id}
curl -X POST https://api.openai.com/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs
curl -X POST https://api.openai.com/v1/audio/speech
curl -X POST https://api.openai.com/v1/audio/transcriptions
curl -X POST https://api.openai.com/v1/audio/translations
curl -X GET https://api.openai.com/v1/organization/audit_logs
curl -X POST https://api.openai.com/v1/batches/{batch_id}/cancel
curl -X POST https://api.openai.com/v1/batches
curl -X GET https://api.openai.com/v1/batches
curl -X GET https://api.openai.com/v1/batches/{batch_id}
curl -X POST https://api.openai.com/v1/chat/completions
curl -X POST https://api.openai.com/v1/completions
curl -X POST https://api.openai.com/v1/organization/admin_api_keys
curl -X DELETE https://api.openai.com/v1/organization/admin_api_keys/{key_id}
curl -X GET https://api.openai.com/v1/organization/admin_api_keys/{key_id}
curl -X GET https://api.openai.com/v1/organization/admin_api_keys
curl -X POST https://api.openai.com/v1/embeddings
curl -X POST https://api.openai.com/v1/files
curl -X DELETE https://api.openai.com/v1/files/{file_id}
curl -X GET https://api.openai.com/v1/files/{file_id}/content
curl -X GET https://api.openai.com/v1/files
curl -X GET https://api.openai.com/v1/files/{file_id}
curl -X POST https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
curl -X POST https://api.openai.com/v1/fine_tuning/jobs
curl -X GET https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/events
curl -X GET https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
curl -X GET https://api.openai.com/v1/fine_tuning/jobs
curl -X GET https://api.openai.com/v1/fine_tuning/jobs/{fine_tuning_job_id}
curl -X POST https://api.openai.com/v1/images/generations
curl -X POST https://api.openai.com/v1/images/edits
curl -X POST https://api.openai.com/v1/images/variations
curl -X DELETE https://api.openai.com/v1/organization/invites/{invite_id}
curl -X POST https://api.openai.com/v1/organization/invites
curl -X GET https://api.openai.com/v1/organization/invites
curl -X GET https://api.openai.com/v1/organization/invites/{invite_id}
curl -X DELETE https://api.openai.com/v1/models/{model}
curl -X GET https://api.openai.com/v1/models
curl -X GET https://api.openai.com/v1/models/{model}
curl -X POST https://api.openai.com/v1/moderations
curl -X POST https://api.openai.com/v1/organization/projects/{project_id}/archive
curl -X POST https://api.openai.com/v1/organization/projects
curl -X POST https://api.openai.com/v1/organization/projects/{project_id}/service_accounts
curl -X POST https://api.openai.com/v1/organization/projects/{project_id}/users
curl -X DELETE https://api.openai.com/v1/organization/projects/{project_id}/api_keys/{key_id}
curl -X DELETE https://api.openai.com/v1/organization/projects/{project_id}/service_accounts/{service_account_id}
curl -X DELETE https://api.openai.com/v1/organization/projects/{project_id}/users/{user_id}
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/api_keys
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/rate_limits
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/service_accounts
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/users
curl -X GET https://api.openai.com/v1/organization/projects
curl -X POST https://api.openai.com/v1/organization/projects/{project_id}
curl -X POST https://api.openai.com/v1/organization/projects/{project_id}/users/{user_id}
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/api_keys/{key_id}
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/service_accounts/{service_account_id}
curl -X GET https://api.openai.com/v1/organization/projects/{project_id}/users/{user_id}
curl -X POST https://api.openai.com/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}
curl -X POST https://api.openai.com/v1/realtime/sessions
curl -X POST https://api.openai.com/v1/uploads/{upload_id}/parts
curl -X POST https://api.openai.com/v1/uploads/{upload_id}/cancel
curl -X POST https://api.openai.com/v1/uploads/{upload_id}/complete
curl -X POST https://api.openai.com/v1/uploads
curl -X GET https://api.openai.com/v1/organization/usage/audio_speeches
curl -X GET https://api.openai.com/v1/organization/usage/audio_transcriptions
curl -X GET https://api.openai.com/v1/organization/usage/code_interpreter_sessions
curl -X GET https://api.openai.com/v1/organization/usage/completions
curl -X GET https://api.openai.com/v1/organization/costs
curl -X GET https://api.openai.com/v1/organization/usage/embeddings
curl -X GET https://api.openai.com/v1/organization/usage/images
curl -X GET https://api.openai.com/v1/organization/usage/moderations
curl -X GET https://api.openai.com/v1/organization/usage/vector_stores
curl -X DELETE https://api.openai.com/v1/organization/users/{user_id}
curl -X GET https://api.openai.com/v1/organization/users
curl -X POST https://api.openai.com/v1/organization/users/{user_id}
curl -X GET https://api.openai.com/v1/organization/users/{user_id}
curl -X POST https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel
curl -X POST https://api.openai.com/v1/vector_stores
curl -X POST https://api.openai.com/v1/vector_stores/{vector_store_id}/files
curl -X POST https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches
curl -X DELETE https://api.openai.com/v1/vector_stores/{vector_store_id}
curl -X DELETE https://api.openai.com/v1/vector_stores/{vector_store_id}/files/{file_id}
curl -X GET https://api.openai.com/v1/vector_stores/{vector_store_id}
curl -X GET https://api.openai.com/v1/vector_stores/{vector_store_id}/files/{file_id}
curl -X GET https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}
curl -X GET https://api.openai.com/v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files
curl -X GET https://api.openai.com/v1/vector_stores/{vector_store_id}/files
curl -X GET https://api.openai.com/v1/vector_stores
curl -X POST https://api.openai.com/v1/vector_stores/{vector_store_id}

```

## Try health and metrics

```
curl -s -X GET https://api.openai.com/v1/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://api.openai.com/v1/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://api.openai.com/v1/metrics
{"base":...
. . .
```