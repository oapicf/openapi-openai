-module(openapi_thread_stream_event).

-export([encode/1]).

-export_type([openapi_thread_stream_event/0]).

-type openapi_thread_stream_event() ::
    #{ 'enabled' => boolean(),
       'event' := binary(),
       'data' := openapi_thread_object:openapi_thread_object()
     }.

encode(#{ 'enabled' := Enabled,
          'event' := Event,
          'data' := Data
        }) ->
    #{ 'enabled' => Enabled,
       'event' => Event,
       'data' => Data
     }.
