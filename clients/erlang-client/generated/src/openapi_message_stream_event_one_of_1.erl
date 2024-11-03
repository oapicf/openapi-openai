-module(openapi_message_stream_event_one_of_1).

-export([encode/1]).

-export_type([openapi_message_stream_event_one_of_1/0]).

-type openapi_message_stream_event_one_of_1() ::
    #{ 'event' := binary(),
       'data' := openapi_message_object:openapi_message_object()
     }.

encode(#{ 'event' := Event,
          'data' := Data
        }) ->
    #{ 'event' => Event,
       'data' => Data
     }.
