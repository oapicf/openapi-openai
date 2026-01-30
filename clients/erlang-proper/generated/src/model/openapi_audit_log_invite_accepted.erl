-module(openapi_audit_log_invite_accepted).

-include("openapi.hrl").

-export([openapi_audit_log_invite_accepted/0]).

-export([openapi_audit_log_invite_accepted/1]).

-export_type([openapi_audit_log_invite_accepted/0]).

-type openapi_audit_log_invite_accepted() ::
  [ {'id', binary() }
  ].


openapi_audit_log_invite_accepted() ->
    openapi_audit_log_invite_accepted([]).

openapi_audit_log_invite_accepted(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

