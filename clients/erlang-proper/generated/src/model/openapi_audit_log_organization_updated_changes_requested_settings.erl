-module(openapi_audit_log_organization_updated_changes_requested_settings).

-include("openapi.hrl").

-export([openapi_audit_log_organization_updated_changes_requested_settings/0]).

-export([openapi_audit_log_organization_updated_changes_requested_settings/1]).

-export_type([openapi_audit_log_organization_updated_changes_requested_settings/0]).

-type openapi_audit_log_organization_updated_changes_requested_settings() ::
  [ {'threads_ui_visibility', binary() }
  | {'usage_dashboard_visibility', binary() }
  ].


openapi_audit_log_organization_updated_changes_requested_settings() ->
    openapi_audit_log_organization_updated_changes_requested_settings([]).

openapi_audit_log_organization_updated_changes_requested_settings(Fields) ->
  Default = [ {'threads_ui_visibility', binary() }
            , {'usage_dashboard_visibility', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

