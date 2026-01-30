-module(openapi_audit_log_invite_sent).

-include("openapi.hrl").

-export([openapi_audit_log_invite_sent/0]).

-export([openapi_audit_log_invite_sent/1]).

-export_type([openapi_audit_log_invite_sent/0]).

-type openapi_audit_log_invite_sent() ::
  [ {'id', binary() }
  | {'data', openapi_audit_log_invite_sent_data:openapi_audit_log_invite_sent_data() }
  ].


openapi_audit_log_invite_sent() ->
    openapi_audit_log_invite_sent([]).

openapi_audit_log_invite_sent(Fields) ->
  Default = [ {'id', binary() }
            , {'data', openapi_audit_log_invite_sent_data:openapi_audit_log_invite_sent_data() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

