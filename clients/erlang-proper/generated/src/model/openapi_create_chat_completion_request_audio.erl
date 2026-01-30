-module(openapi_create_chat_completion_request_audio).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request_audio/0]).

-export([openapi_create_chat_completion_request_audio/1]).

-export_type([openapi_create_chat_completion_request_audio/0]).

-type openapi_create_chat_completion_request_audio() ::
  [ {'voice', binary() }
  | {'format', binary() }
  ].


openapi_create_chat_completion_request_audio() ->
    openapi_create_chat_completion_request_audio([]).

openapi_create_chat_completion_request_audio(Fields) ->
  Default = [ {'voice', elements([<<"alloy">>, <<"ash">>, <<"ballad">>, <<"coral">>, <<"echo">>, <<"sage">>, <<"shimmer">>, <<"verse">>]) }
            , {'format', elements([<<"wav">>, <<"mp3">>, <<"flac">>, <<"opus">>, <<"pcm16">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

