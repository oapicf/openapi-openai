-module(openapi_realtime_server_event_response_content_part_added_part).

-export([encode/1]).

-export_type([openapi_realtime_server_event_response_content_part_added_part/0]).

-type openapi_realtime_server_event_response_content_part_added_part() ::
    #{ 'type' => binary(),
       'text' => binary(),
       'audio' => binary(),
       'transcript' => binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text,
          'audio' := Audio,
          'transcript' := Transcript
        }) ->
    #{ 'type' => Type,
       'text' => Text,
       'audio' => Audio,
       'transcript' => Transcript
     }.
