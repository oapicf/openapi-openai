-module(openapi_message_delta_object_delta).

-export([encode/1]).

-export_type([openapi_message_delta_object_delta/0]).

-type openapi_message_delta_object_delta() ::
    #{ 'role' => binary(),
       'content' => list(),
       'file_ids' => list()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'file_ids' := FileIds
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'file_ids' => FileIds
     }.
