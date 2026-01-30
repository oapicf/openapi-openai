-module(openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error).

-export([encode/1]).

-export_type([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error/0]).

-type openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error() ::
    #{ 'type' => binary(),
       'code' => binary(),
       'message' => binary(),
       'param' => binary()
     }.

encode(#{ 'type' := Type,
          'code' := Code,
          'message' := Message,
          'param' := Param
        }) ->
    #{ 'type' => Type,
       'code' => Code,
       'message' => Message,
       'param' => Param
     }.
