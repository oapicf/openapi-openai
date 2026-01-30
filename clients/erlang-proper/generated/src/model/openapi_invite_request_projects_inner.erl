-module(openapi_invite_request_projects_inner).

-include("openapi.hrl").

-export([openapi_invite_request_projects_inner/0]).

-export([openapi_invite_request_projects_inner/1]).

-export_type([openapi_invite_request_projects_inner/0]).

-type openapi_invite_request_projects_inner() ::
  [ {'id', binary() }
  | {'role', binary() }
  ].


openapi_invite_request_projects_inner() ->
    openapi_invite_request_projects_inner([]).

openapi_invite_request_projects_inner(Fields) ->
  Default = [ {'id', binary() }
            , {'role', elements([<<"member">>, <<"owner">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

