-module(openapi_create_chat_completion_stream_response).

-include("openapi.hrl").

-export([openapi_create_chat_completion_stream_response/0]).

-export([openapi_create_chat_completion_stream_response/1]).

-export_type([openapi_create_chat_completion_stream_response/0]).

-type openapi_create_chat_completion_stream_response() ::
  [ {'id', binary() }
  | {'choices', list(openapi_create_chat_completion_stream_response_choices_inner:openapi_create_chat_completion_stream_response_choices_inner()) }
  | {'created', integer() }
  | {'model', binary() }
  | {'service_tier', binary() }
  | {'system_fingerprint', binary() }
  | {'object', binary() }
  | {'usage', openapi_create_chat_completion_stream_response_usage:openapi_create_chat_completion_stream_response_usage() }
  ].


openapi_create_chat_completion_stream_response() ->
    openapi_create_chat_completion_stream_response([]).

openapi_create_chat_completion_stream_response(Fields) ->
  Default = [ {'id', binary() }
            , {'choices', list(openapi_create_chat_completion_stream_response_choices_inner:openapi_create_chat_completion_stream_response_choices_inner()) }
            , {'created', integer() }
            , {'model', binary() }
            , {'service_tier', elements([<<"scale">>, <<"default">>]) }
            , {'system_fingerprint', binary() }
            , {'object', elements([<<"chat.completion.chunk">>]) }
            , {'usage', openapi_create_chat_completion_stream_response_usage:openapi_create_chat_completion_stream_response_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

