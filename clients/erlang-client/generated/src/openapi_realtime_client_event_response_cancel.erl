-module(openapi_realtime_client_event_response_cancel).

-export([encode/1]).

-export_type([openapi_realtime_client_event_response_cancel/0]).

-type openapi_realtime_client_event_response_cancel() ::
    #{ 'event_id' => binary(),
       'type' := binary(),
       'response_id' => binary()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'response_id' := ResponseId
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'response_id' => ResponseId
     }.
