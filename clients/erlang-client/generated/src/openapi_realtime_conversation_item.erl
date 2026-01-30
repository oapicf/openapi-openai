-module(openapi_realtime_conversation_item).

-export([encode/1]).

-export_type([openapi_realtime_conversation_item/0]).

-type openapi_realtime_conversation_item() ::
    #{ 'id' => binary(),
       'type' => binary(),
       'object' => binary(),
       'status' => binary(),
       'role' => binary(),
       'content' => list(),
       'call_id' => binary(),
       'name' => binary(),
       'arguments' => binary(),
       'output' => binary()
     }.

encode(#{ 'id' := Id,
          'type' := Type,
          'object' := Object,
          'status' := Status,
          'role' := Role,
          'content' := Content,
          'call_id' := CallId,
          'name' := Name,
          'arguments' := Arguments,
          'output' := Output
        }) ->
    #{ 'id' => Id,
       'type' => Type,
       'object' => Object,
       'status' => Status,
       'role' => Role,
       'content' => Content,
       'call_id' => CallId,
       'name' => Name,
       'arguments' => Arguments,
       'output' => Output
     }.
