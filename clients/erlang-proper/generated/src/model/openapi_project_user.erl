-module(openapi_project_user).

-include("openapi.hrl").

-export([openapi_project_user/0]).

-export([openapi_project_user/1]).

-export_type([openapi_project_user/0]).

-type openapi_project_user() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'email', binary() }
  | {'role', binary() }
  | {'added_at', integer() }
  ].


openapi_project_user() ->
    openapi_project_user([]).

openapi_project_user(Fields) ->
  Default = [ {'object', elements([<<"organization.project.user">>]) }
            , {'id', binary() }
            , {'name', binary() }
            , {'email', binary() }
            , {'role', elements([<<"owner">>, <<"member">>]) }
            , {'added_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

