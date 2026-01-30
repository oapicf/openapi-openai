-module(openapi_realtime_server_event_error_error).

-export([encode/1]).

-export_type([openapi_realtime_server_event_error_error/0]).

-type openapi_realtime_server_event_error_error() ::
    #{ 'type' := binary(),
       'code' => binary(),
       'message' := binary(),
       'param' => binary(),
       'event_id' => binary()
     }.

encode(#{ 'type' := Type,
          'code' := Code,
          'message' := Message,
          'param' := Param,
          'event_id' := EventId
        }) ->
    #{ 'type' => Type,
       'code' => Code,
       'message' => Message,
       'param' => Param,
       'event_id' => EventId
     }.
