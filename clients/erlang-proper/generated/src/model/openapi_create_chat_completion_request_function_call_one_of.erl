-module(openapi_create_chat_completion_request_function_call_one_of).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request_function_call_one_of/0]).

-export([openapi_create_chat_completion_request_function_call_one_of/1]).

-export_type([openapi_create_chat_completion_request_function_call_one_of/0]).

-type openapi_create_chat_completion_request_function_call_one_of() ::
  [ {'name', binary() }
  ].


openapi_create_chat_completion_request_function_call_one_of() ->
    openapi_create_chat_completion_request_function_call_one_of([]).

openapi_create_chat_completion_request_function_call_one_of(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

