-module(openapi_create_chat_completion_request_stop).

-include("openapi.hrl").

-export([openapi_create_chat_completion_request_stop/0]).

-export([openapi_create_chat_completion_request_stop/1]).

-export_type([openapi_create_chat_completion_request_stop/0]).

-type openapi_create_chat_completion_request_stop() ::
  [ 
  ].


openapi_create_chat_completion_request_stop() ->
    openapi_create_chat_completion_request_stop([]).

openapi_create_chat_completion_request_stop(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

