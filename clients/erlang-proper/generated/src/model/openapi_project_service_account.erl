-module(openapi_project_service_account).

-include("openapi.hrl").

-export([openapi_project_service_account/0]).

-export([openapi_project_service_account/1]).

-export_type([openapi_project_service_account/0]).

-type openapi_project_service_account() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'name', binary() }
  | {'role', binary() }
  | {'created_at', integer() }
  ].


openapi_project_service_account() ->
    openapi_project_service_account([]).

openapi_project_service_account(Fields) ->
  Default = [ {'object', elements([<<"organization.project.service_account">>]) }
            , {'id', binary() }
            , {'name', binary() }
            , {'role', elements([<<"owner">>, <<"member">>]) }
            , {'created_at', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

