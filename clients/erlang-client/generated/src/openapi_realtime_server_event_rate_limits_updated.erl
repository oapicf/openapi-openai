-module(openapi_realtime_server_event_rate_limits_updated).

-export([encode/1]).

-export_type([openapi_realtime_server_event_rate_limits_updated/0]).

-type openapi_realtime_server_event_rate_limits_updated() ::
    #{ 'event_id' := binary(),
       'type' := binary(),
       'rate_limits' := list()
     }.

encode(#{ 'event_id' := EventId,
          'type' := Type,
          'rate_limits' := RateLimits
        }) ->
    #{ 'event_id' => EventId,
       'type' => Type,
       'rate_limits' => RateLimits
     }.
