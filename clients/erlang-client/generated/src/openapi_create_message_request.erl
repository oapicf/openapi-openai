-module(openapi_create_message_request).

-export([encode/1]).

-export_type([openapi_create_message_request/0]).

-type openapi_create_message_request() ::
    #{ 'role' := binary(),
       'content' := binary(),
       'file_ids' => list(),
       'metadata' => maps:map()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'file_ids' := FileIds,
          'metadata' := Metadata
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'file_ids' => FileIds,
       'metadata' => Metadata
     }.
