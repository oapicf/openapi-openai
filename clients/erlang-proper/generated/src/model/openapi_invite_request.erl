-module(openapi_invite_request).

-include("openapi.hrl").

-export([openapi_invite_request/0]).

-export([openapi_invite_request/1]).

-export_type([openapi_invite_request/0]).

-type openapi_invite_request() ::
  [ {'email', binary() }
  | {'role', binary() }
  | {'projects', list(openapi_invite_request_projects_inner:openapi_invite_request_projects_inner()) }
  ].


openapi_invite_request() ->
    openapi_invite_request([]).

openapi_invite_request(Fields) ->
  Default = [ {'email', binary() }
            , {'role', elements([<<"reader">>, <<"owner">>]) }
            , {'projects', list(openapi_invite_request_projects_inner:openapi_invite_request_projects_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

