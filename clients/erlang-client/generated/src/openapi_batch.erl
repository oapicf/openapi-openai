-module(openapi_batch).

-export([encode/1]).

-export_type([openapi_batch/0]).

-type openapi_batch() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'endpoint' := binary(),
       'errors' => openapi_batch_errors:openapi_batch_errors(),
       'input_file_id' := binary(),
       'completion_window' := binary(),
       'status' := binary(),
       'output_file_id' => binary(),
       'error_file_id' => binary(),
       'created_at' := integer(),
       'in_progress_at' => integer(),
       'expires_at' => integer(),
       'finalizing_at' => integer(),
       'completed_at' => integer(),
       'failed_at' => integer(),
       'expired_at' => integer(),
       'cancelling_at' => integer(),
       'cancelled_at' => integer(),
       'request_counts' => openapi_batch_request_counts:openapi_batch_request_counts(),
       'metadata' => maps:map()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'endpoint' := Endpoint,
          'errors' := Errors,
          'input_file_id' := InputFileId,
          'completion_window' := CompletionWindow,
          'status' := Status,
          'output_file_id' := OutputFileId,
          'error_file_id' := ErrorFileId,
          'created_at' := CreatedAt,
          'in_progress_at' := InProgressAt,
          'expires_at' := ExpiresAt,
          'finalizing_at' := FinalizingAt,
          'completed_at' := CompletedAt,
          'failed_at' := FailedAt,
          'expired_at' := ExpiredAt,
          'cancelling_at' := CancellingAt,
          'cancelled_at' := CancelledAt,
          'request_counts' := RequestCounts,
          'metadata' := Metadata
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'endpoint' => Endpoint,
       'errors' => Errors,
       'input_file_id' => InputFileId,
       'completion_window' => CompletionWindow,
       'status' => Status,
       'output_file_id' => OutputFileId,
       'error_file_id' => ErrorFileId,
       'created_at' => CreatedAt,
       'in_progress_at' => InProgressAt,
       'expires_at' => ExpiresAt,
       'finalizing_at' => FinalizingAt,
       'completed_at' => CompletedAt,
       'failed_at' => FailedAt,
       'expired_at' => ExpiredAt,
       'cancelling_at' => CancellingAt,
       'cancelled_at' => CancelledAt,
       'request_counts' => RequestCounts,
       'metadata' => Metadata
     }.
