-module(openapi_create_batch_request).

-export([encode/1]).

-export_type([openapi_create_batch_request/0]).

-type openapi_create_batch_request() ::
    #{ 'input_file_id' := binary(),
       'endpoint' := binary(),
       'completion_window' := binary(),
       'metadata' => maps:map()
     }.

encode(#{ 'input_file_id' := InputFileId,
          'endpoint' := Endpoint,
          'completion_window' := CompletionWindow,
          'metadata' := Metadata
        }) ->
    #{ 'input_file_id' => InputFileId,
       'endpoint' => Endpoint,
       'completion_window' => CompletionWindow,
       'metadata' => Metadata
     }.
