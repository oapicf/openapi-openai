-module(openapi_message_stream_event).

-export([encode/1]).

-export_type([openapi_message_stream_event/0]).

-type openapi_message_stream_event() ::
    #{ 'event' := binary(),
       'data' := openapi_message_object:openapi_message_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
