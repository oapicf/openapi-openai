-module(openapi_message_object).

-export([encode/1]).

-export_type([openapi_message_object/0]).

-type openapi_message_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'thread_id' := binary(),
       'status' := binary(),
       'incomplete_details' := openapi_message_object_incomplete_details:openapi_message_object_incomplete_details(),
       'completed_at' := integer(),
       'incomplete_at' := integer(),
       'role' := binary(),
       'content' := list(),
       'assistant_id' := binary(),
       'run_id' := binary(),
       'attachments' := list(),
       'metadata' := maps:map()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'thread_id' := ThreadId,
          'status' := Status,
          'incomplete_details' := IncompleteDetails,
          'completed_at' := CompletedAt,
          'incomplete_at' := IncompleteAt,
          'role' := Role,
          'content' := Content,
          'assistant_id' := AssistantId,
          'run_id' := RunId,
          'attachments' := Attachments,
          'metadata' := Metadata
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'thread_id' => ThreadId,
       'status' => Status,
       'incomplete_details' => IncompleteDetails,
       'completed_at' => CompletedAt,
       'incomplete_at' => IncompleteAt,
       'role' => Role,
       'content' => Content,
       'assistant_id' => AssistantId,
       'run_id' => RunId,
       'attachments' => Attachments,
       'metadata' => Metadata
     }.
