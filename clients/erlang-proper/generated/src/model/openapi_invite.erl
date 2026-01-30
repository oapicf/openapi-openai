-module(openapi_invite).

-include("openapi.hrl").

-export([openapi_invite/0]).

-export([openapi_invite/1]).

-export_type([openapi_invite/0]).

-type openapi_invite() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'email', binary() }
  | {'role', binary() }
  | {'status', binary() }
  | {'invited_at', integer() }
  | {'expires_at', integer() }
  | {'accepted_at', integer() }
  | {'projects', list(openapi_invite_projects_inner:openapi_invite_projects_inner()) }
  ].


openapi_invite() ->
    openapi_invite([]).

openapi_invite(Fields) ->
  Default = [ {'object', elements([<<"organization.invite">>]) }
            , {'id', binary() }
            , {'email', binary() }
            , {'role', elements([<<"owner">>, <<"reader">>]) }
            , {'status', elements([<<"accepted">>, <<"expired">>, <<"pending">>]) }
            , {'invited_at', integer() }
            , {'expires_at', integer() }
            , {'accepted_at', integer() }
            , {'projects', list(openapi_invite_projects_inner:openapi_invite_projects_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

