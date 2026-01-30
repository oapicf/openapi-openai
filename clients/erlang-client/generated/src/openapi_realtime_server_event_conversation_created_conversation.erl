-module(openapi_realtime_server_event_conversation_created_conversation).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_created_conversation/0]).

-type openapi_realtime_server_event_conversation_created_conversation() ::
    #{ 'id' => binary(),
       'object' => binary()
     }.

encode(#{ 'id' := Id,
          'object' := Object
        }) ->
    #{ 'id' => Id,
       'object' => Object
     }.
