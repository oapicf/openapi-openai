-module(openapi_create_chat_completion_stream_response).

-include("openapi.hrl").

-export([openapi_create_chat_completion_stream_response/0]).

-export([openapi_create_chat_completion_stream_response/1]).

-export_type([openapi_create_chat_completion_stream_response/0]).

-type openapi_create_chat_completion_stream_response() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created', integer() }
  | {'model', binary() }
  | {'choices', list(openapi_create_chat_completion_stream_response_choices_inner:openapi_create_chat_completion_stream_response_choices_inner()) }
  ].


openapi_create_chat_completion_stream_response() ->
    openapi_create_chat_completion_stream_response([]).

openapi_create_chat_completion_stream_response(Fields) ->
  Default = [ {'id', binary() }
            , {'object', binary() }
            , {'created', integer() }
            , {'model', binary() }
            , {'choices', list(openapi_create_chat_completion_stream_response_choices_inner:openapi_create_chat_completion_stream_response_choices_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

