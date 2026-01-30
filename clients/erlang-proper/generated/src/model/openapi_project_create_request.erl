-module(openapi_project_create_request).

-include("openapi.hrl").

-export([openapi_project_create_request/0]).

-export([openapi_project_create_request/1]).

-export_type([openapi_project_create_request/0]).

-type openapi_project_create_request() ::
  [ {'name', binary() }
  ].


openapi_project_create_request() ->
    openapi_project_create_request([]).

openapi_project_create_request(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

