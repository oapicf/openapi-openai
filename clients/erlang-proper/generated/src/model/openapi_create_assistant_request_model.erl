-module(openapi_create_assistant_request_model).

-include("openapi.hrl").

-export([openapi_create_assistant_request_model/0]).

-export([openapi_create_assistant_request_model/1]).

-export_type([openapi_create_assistant_request_model/0]).

-type openapi_create_assistant_request_model() ::
  [ 
  ].


openapi_create_assistant_request_model() ->
    openapi_create_assistant_request_model([]).

openapi_create_assistant_request_model(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

