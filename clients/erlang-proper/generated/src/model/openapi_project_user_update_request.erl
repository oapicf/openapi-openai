-module(openapi_project_user_update_request).

-include("openapi.hrl").

-export([openapi_project_user_update_request/0]).

-export([openapi_project_user_update_request/1]).

-export_type([openapi_project_user_update_request/0]).

-type openapi_project_user_update_request() ::
  [ {'role', binary() }
  ].


openapi_project_user_update_request() ->
    openapi_project_user_update_request([]).

openapi_project_user_update_request(Fields) ->
  Default = [ {'role', elements([<<"owner">>, <<"member">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

