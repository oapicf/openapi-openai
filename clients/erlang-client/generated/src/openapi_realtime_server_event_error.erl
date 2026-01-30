-module(openapi_realtime_server_event_error).

-export([encode/1]).

-export_type([openapi_realtime_server_event_error/0]).

-type openapi_realtime_server_event_error() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'error' := openapi_realtime_server_event_error_error:openapi_realtime_server_event_error_error()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'error' := Error
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'error' => Error
     }.
