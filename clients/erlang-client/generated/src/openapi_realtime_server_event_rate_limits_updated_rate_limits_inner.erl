-module(openapi_realtime_server_event_rate_limits_updated_rate_limits_inner).

-export([encode/1]).

-export_type([openapi_realtime_server_event_rate_limits_updated_rate_limits_inner/0]).

-type openapi_realtime_server_event_rate_limits_updated_rate_limits_inner() ::
    #{ 'name' => binary(),
       'limit' => integer(),
       'remaining' => integer(),
       'reset_seconds' => integer()
     }.

encode(#{ 'name' := Name,
          'limit' := Limit,
          'remaining' := Remaining,
          'reset_seconds' := ResetSeconds
        }) ->
    #{ 'name' => Name,
       'limit' => Limit,
       'remaining' => Remaining,
       'reset_seconds' => ResetSeconds
     }.
