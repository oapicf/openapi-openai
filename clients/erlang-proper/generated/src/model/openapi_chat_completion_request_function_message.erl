-module(openapi_chat_completion_request_function_message).

-include("openapi.hrl").

-export([openapi_chat_completion_request_function_message/0]).

-export([openapi_chat_completion_request_function_message/1]).

-export_type([openapi_chat_completion_request_function_message/0]).

-type openapi_chat_completion_request_function_message() ::
  [ {'role', binary() }
  | {'content', binary() }
  | {'name', binary() }
  ].


openapi_chat_completion_request_function_message() ->
    openapi_chat_completion_request_function_message([]).

openapi_chat_completion_request_function_message(Fields) ->
  Default = [ {'role', elements([<<"function">>]) }
            , {'content', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

