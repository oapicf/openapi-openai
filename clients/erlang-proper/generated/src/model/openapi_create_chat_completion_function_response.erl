-module(openapi_create_chat_completion_function_response).

-include("openapi.hrl").

-export([openapi_create_chat_completion_function_response/0]).

-export([openapi_create_chat_completion_function_response/1]).

-export_type([openapi_create_chat_completion_function_response/0]).

-type openapi_create_chat_completion_function_response() ::
  [ {'id', binary() }
  | {'choices', list(openapi_create_chat_completion_function_response_choices_inner:openapi_create_chat_completion_function_response_choices_inner()) }
  | {'created', integer() }
  | {'model', binary() }
  | {'system_fingerprint', binary() }
  | {'object', binary() }
  | {'usage', openapi_completion_usage:openapi_completion_usage() }
  ].


openapi_create_chat_completion_function_response() ->
    openapi_create_chat_completion_function_response([]).

openapi_create_chat_completion_function_response(Fields) ->
  Default = [ {'id', binary() }
            , {'choices', list(openapi_create_chat_completion_function_response_choices_inner:openapi_create_chat_completion_function_response_choices_inner()) }
            , {'created', integer() }
            , {'model', binary() }
            , {'system_fingerprint', binary() }
            , {'object', elements([<<"chat.completion">>]) }
            , {'usage', openapi_completion_usage:openapi_completion_usage() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

