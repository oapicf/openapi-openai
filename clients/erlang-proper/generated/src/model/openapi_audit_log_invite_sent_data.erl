-module(openapi_audit_log_invite_sent_data).

-include("openapi.hrl").

-export([openapi_audit_log_invite_sent_data/0]).

-export([openapi_audit_log_invite_sent_data/1]).

-export_type([openapi_audit_log_invite_sent_data/0]).

-type openapi_audit_log_invite_sent_data() ::
  [ {'email', binary() }
  | {'role', binary() }
  ].


openapi_audit_log_invite_sent_data() ->
    openapi_audit_log_invite_sent_data([]).

openapi_audit_log_invite_sent_data(Fields) ->
  Default = [ {'email', binary() }
            , {'role', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

