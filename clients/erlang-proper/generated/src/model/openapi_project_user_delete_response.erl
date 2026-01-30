-module(openapi_project_user_delete_response).

-include("openapi.hrl").

-export([openapi_project_user_delete_response/0]).

-export([openapi_project_user_delete_response/1]).

-export_type([openapi_project_user_delete_response/0]).

-type openapi_project_user_delete_response() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'deleted', boolean() }
  ].


openapi_project_user_delete_response() ->
    openapi_project_user_delete_response([]).

openapi_project_user_delete_response(Fields) ->
  Default = [ {'object', elements([<<"organization.project.user.deleted">>]) }
            , {'id', binary() }
            , {'deleted', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

