-module(openapi_message_file_object).

-export([encode/1]).

-export_type([openapi_message_file_object/0]).

-type openapi_message_file_object() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'created_at' := integer(),
       'message_id' := binary()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'created_at' := CreatedAt,
          'message_id' := MessageId
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'created_at' => CreatedAt,
       'message_id' => MessageId
     }.
