-module(openapi_chat_completion_request_message_content_part_audio_input_audio).

-include("openapi.hrl").

-export([openapi_chat_completion_request_message_content_part_audio_input_audio/0]).

-export([openapi_chat_completion_request_message_content_part_audio_input_audio/1]).

-export_type([openapi_chat_completion_request_message_content_part_audio_input_audio/0]).

-type openapi_chat_completion_request_message_content_part_audio_input_audio() ::
  [ {'data', binary() }
  | {'format', binary() }
  ].


openapi_chat_completion_request_message_content_part_audio_input_audio() ->
    openapi_chat_completion_request_message_content_part_audio_input_audio([]).

openapi_chat_completion_request_message_content_part_audio_input_audio(Fields) ->
  Default = [ {'data', binary() }
            , {'format', elements([<<"wav">>, <<"mp3">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

