-module(openapi_realtime_server_event_conversation_item_input_audio_transcription_failed).

-include("openapi.hrl").

-export([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed/0]).

-export([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed/1]).

-export_type([openapi_realtime_server_event_conversation_item_input_audio_transcription_failed/0]).

-type openapi_realtime_server_event_conversation_item_input_audio_transcription_failed() ::
  [ {'event_id', binary() }
  | {'type', binary() }
  | {'item_id', binary() }
  | {'content_index', integer() }
  | {'error', openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error:openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error() }
  ].


openapi_realtime_server_event_conversation_item_input_audio_transcription_failed() ->
    openapi_realtime_server_event_conversation_item_input_audio_transcription_failed([]).

openapi_realtime_server_event_conversation_item_input_audio_transcription_failed(Fields) ->
  Default = [ {'event_id', binary() }
            , {'type', elements([<<"conversation.item.input_audio_transcription.failed">>]) }
            , {'item_id', binary() }
            , {'content_index', integer() }
            , {'error', openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error:openapi_realtime_server_event_conversation_item_input_audio_transcription_failed_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

