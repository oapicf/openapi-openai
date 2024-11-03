-module(openapi_create_speech_request).

-include("openapi.hrl").

-export([openapi_create_speech_request/0]).

-export([openapi_create_speech_request/1]).

-export_type([openapi_create_speech_request/0]).

-type openapi_create_speech_request() ::
  [ {'model', openapi_create_speech_request_model:openapi_create_speech_request_model() }
  | {'input', binary() }
  | {'voice', binary() }
  | {'response_format', binary() }
  | {'speed', integer() }
  ].


openapi_create_speech_request() ->
    openapi_create_speech_request([]).

openapi_create_speech_request(Fields) ->
  Default = [ {'model', openapi_create_speech_request_model:openapi_create_speech_request_model() }
            , {'input', binary() }
            , {'voice', elements([<<"alloy">>, <<"echo">>, <<"fable">>, <<"onyx">>, <<"nova">>, <<"shimmer">>]) }
            , {'response_format', elements([<<"mp3">>, <<"opus">>, <<"aac">>, <<"flac">>, <<"wav">>, <<"pcm">>]) }
            , {'speed', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

