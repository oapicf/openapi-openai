-module(openapi_realtime_session_turn_detection).

-export([encode/1]).

-export_type([openapi_realtime_session_turn_detection/0]).

-type openapi_realtime_session_turn_detection() ::
    #{ 'type' => binary(),
       'threshold' => integer(),
       'prefix_padding_ms' => integer(),
       'silence_duration_ms' => integer()
     }.

encode(#{ 'type' := Type,
          'threshold' := Threshold,
          'prefix_padding_ms' := PrefixPaddingMs,
          'silence_duration_ms' := SilenceDurationMs
        }) ->
    #{ 'type' => Type,
       'threshold' => Threshold,
       'prefix_padding_ms' => PrefixPaddingMs,
       'silence_duration_ms' => SilenceDurationMs
     }.
