-module(openapi_create_completion_request_prompt).

-include("openapi.hrl").

-export([openapi_create_completion_request_prompt/0]).

-export([openapi_create_completion_request_prompt/1]).

-export_type([openapi_create_completion_request_prompt/0]).

-type openapi_create_completion_request_prompt() ::
  [ 
  ].


openapi_create_completion_request_prompt() ->
    openapi_create_completion_request_prompt([]).

openapi_create_completion_request_prompt(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

