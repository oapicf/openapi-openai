-module(openapi_assistant_file_object).

-export([encode/1]).

-export_type([openapi_assistant_file_object/0]).

-type openapi_assistant_file_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'assistant_id' := binary()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'assistant_id' := AssistantId
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'assistant_id' => AssistantId
     }.
