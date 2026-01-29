-module(openapi_chat_completion_role).

-include("openapi.hrl").

-export([openapi_chat_completion_role/0]).

-export_type([openapi_chat_completion_role/0]).

-type openapi_chat_completion_role() ::
  binary().

openapi_chat_completion_role() ->
  elements([<<"system">>, <<"user">>, <<"assistant">>, <<"tool">>, <<"function">>]).

