-module(openapi_project_update_request).

-include("openapi.hrl").

-export([openapi_project_update_request/0]).

-export([openapi_project_update_request/1]).

-export_type([openapi_project_update_request/0]).

-type openapi_project_update_request() ::
  [ {'name', binary() }
  ].


openapi_project_update_request() ->
    openapi_project_update_request([]).

openapi_project_update_request(Fields) ->
  Default = [ {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

