-module(openapi_run_step_object).

-export([encode/1]).

-export_type([openapi_run_step_object/0]).

-type openapi_run_step_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'assistant_id' := binary(),
       'thread_id' := binary(),
       'run_id' := binary(),
       'type' := binary(),
       'status' := binary(),
       'step_details' := openapi_run_step_object_step_details:openapi_run_step_object_step_details(),
       'last_error' := openapi_run_step_object_last_error:openapi_run_step_object_last_error(),
       'expired_at' := integer(),
       'cancelled_at' := integer(),
       'failed_at' := integer(),
       'completed_at' := integer(),
       'metadata' := maps:map(),
       'usage' := openapi_run_step_completion_usage:openapi_run_step_completion_usage()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'assistant_id' := AssistantId,
          'thread_id' := ThreadId,
          'run_id' := RunId,
          'type' := Type,
          'status' := Status,
          'step_details' := StepDetails,
          'last_error' := LastError,
          'expired_at' := ExpiredAt,
          'cancelled_at' := CancelledAt,
          'failed_at' := FailedAt,
          'completed_at' := CompletedAt,
          'metadata' := Metadata,
          'usage' := Usage
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'assistant_id' => AssistantId,
       'thread_id' => ThreadId,
       'run_id' => RunId,
       'type' => Type,
       'status' => Status,
       'step_details' => StepDetails,
       'last_error' => LastError,
       'expired_at' => ExpiredAt,
       'cancelled_at' => CancelledAt,
       'failed_at' => FailedAt,
       'completed_at' => CompletedAt,
       'metadata' => Metadata,
       'usage' => Usage
     }.
