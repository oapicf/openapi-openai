-module(openapi_default_project_error_response).

-include("openapi.hrl").

-export([openapi_default_project_error_response/0]).

-export([openapi_default_project_error_response/1]).

-export_type([openapi_default_project_error_response/0]).

-type openapi_default_project_error_response() ::
  [ {'code', integer() }
  | {'message', binary() }
  ].


openapi_default_project_error_response() ->
    openapi_default_project_error_response([]).

openapi_default_project_error_response(Fields) ->
  Default = [ {'code', integer() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

