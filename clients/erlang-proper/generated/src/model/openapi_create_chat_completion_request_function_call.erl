-module(openapi_create_chat_completion_request_function_call).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request_function_call/0]).

-export([openapi_create_chat_completion_request_function_call/1]).

-export_type([openapi_create_chat_completion_request_function_call/0]).

-type openapi_create_chat_completion_request_function_call() ::
  [ {'name', binary() }
  ].


openapi_create_chat_completion_request_function_call() ->
    openapi_create_chat_completion_request_function_call([]).

openapi_create_chat_completion_request_function_call(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

