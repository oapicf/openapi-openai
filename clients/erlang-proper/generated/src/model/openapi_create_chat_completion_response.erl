-module(openapi_create_chat_completion_response).

-include("openapi.hrl").

-export([openapi_create_chat_completion_response/0]).

-export([openapi_create_chat_completion_response/1]).

-export_type([openapi_create_chat_completion_response/0]).

-type openapi_create_chat_completion_response() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created', integer() }
  | {'model', binary() }
  | {'choices', list(openapi_create_chat_completion_response_choices_inner:openapi_create_chat_completion_response_choices_inner()) }
  | {'usage', openapi_create_completion_response_usage:openapi_create_completion_response_usage() }
  ].


openapi_create_chat_completion_response() ->
    openapi_create_chat_completion_response([]).

openapi_create_chat_completion_response(Fields) ->
  Default = [ {'id', binary() }
            , {'object', binary() }
            , {'created', integer() }
            , {'model', binary() }
            , {'choices', list(openapi_create_chat_completion_response_choices_inner:openapi_create_chat_completion_response_choices_inner()) }
            , {'usage', openapi_create_completion_response_usage:openapi_create_completion_response_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

