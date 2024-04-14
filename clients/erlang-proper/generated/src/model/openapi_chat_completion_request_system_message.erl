-module(openapi_chat_completion_request_system_message).

-include("openapi.hrl").

-export([openapi_chat_completion_request_system_message/0]).

-export([openapi_chat_completion_request_system_message/1]).

-export_type([openapi_chat_completion_request_system_message/0]).

-type openapi_chat_completion_request_system_message() ::
  [ {'content', binary() }
  | {'role', binary() }
  | {'name', binary() }
  ].


openapi_chat_completion_request_system_message() ->
    openapi_chat_completion_request_system_message([]).

openapi_chat_completion_request_system_message(Fields) ->
  Default = [ {'content', binary() }
            , {'role', elements([<<"system">>]) }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

