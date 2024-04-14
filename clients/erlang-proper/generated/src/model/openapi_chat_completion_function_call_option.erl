-module(openapi_chat_completion_function_call_option).

-include("openapi.hrl").

-export([openapi_chat_completion_function_call_option/0]).

-export([openapi_chat_completion_function_call_option/1]).

-export_type([openapi_chat_completion_function_call_option/0]).

-type openapi_chat_completion_function_call_option() ::
  [ {'name', binary() }
  ].


openapi_chat_completion_function_call_option() ->
    openapi_chat_completion_function_call_option([]).

openapi_chat_completion_function_call_option(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

