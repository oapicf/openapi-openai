-module(openapi_assistant_stream_event).

-export([encode/1]).

-export_type([openapi_assistant_stream_event/0]).

-type openapi_assistant_stream_event() ::
    #{ 'enabled' => boolean(),
       'event' := binary(),
       'data' := binary()
     }.

encode(#{ 'enabled' := Enabled,
          'event' := Event,
          'data' := Data
        }) ->
    #{ 'enabled' => Enabled,
       'event' => Event,
       'data' => Data
     }.
