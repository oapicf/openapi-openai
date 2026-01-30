-module(openapi_project_user_create_request).

-include("openapi.hrl").

-export([openapi_project_user_create_request/0]).

-export([openapi_project_user_create_request/1]).

-export_type([openapi_project_user_create_request/0]).

-type openapi_project_user_create_request() ::
  [ {'user_id', binary() }
  | {'role', binary() }
  ].


openapi_project_user_create_request() ->
    openapi_project_user_create_request([]).

openapi_project_user_create_request(Fields) ->
  Default = [ {'user_id', binary() }
            , {'role', elements([<<"owner">>, <<"member">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

