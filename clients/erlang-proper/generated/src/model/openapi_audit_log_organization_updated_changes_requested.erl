-module(openapi_audit_log_organization_updated_changes_requested).

-include("openapi.hrl").

-export([openapi_audit_log_organization_updated_changes_requested/0]).

-export([openapi_audit_log_organization_updated_changes_requested/1]).

-export_type([openapi_audit_log_organization_updated_changes_requested/0]).

-type openapi_audit_log_organization_updated_changes_requested() ::
  [ {'title', binary() }
  | {'description', binary() }
  | {'name', binary() }
  | {'settings', openapi_audit_log_organization_updated_changes_requested_settings:openapi_audit_log_organization_updated_changes_requested_settings() }
  ].


openapi_audit_log_organization_updated_changes_requested() ->
    openapi_audit_log_organization_updated_changes_requested([]).

openapi_audit_log_organization_updated_changes_requested(Fields) ->
  Default = [ {'title', binary() }
            , {'description', binary() }
            , {'name', binary() }
            , {'settings', openapi_audit_log_organization_updated_changes_requested_settings:openapi_audit_log_organization_updated_changes_requested_settings() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

