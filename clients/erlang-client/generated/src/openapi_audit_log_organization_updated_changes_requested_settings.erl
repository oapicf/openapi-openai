-module(openapi_audit_log_organization_updated_changes_requested_settings).

-export([encode/1]).

-export_type([openapi_audit_log_organization_updated_changes_requested_settings/0]).

-type openapi_audit_log_organization_updated_changes_requested_settings() ::
    #{ 'threads_ui_visibility' => binary(),
       'usage_dashboard_visibility' => binary()
     }.

encode(#{ 'threads_ui_visibility' := ThreadsUiVisibility,
          'usage_dashboard_visibility' := UsageDashboardVisibility
        }) ->
    #{ 'threads_ui_visibility' => ThreadsUiVisibility,
       'usage_dashboard_visibility' => UsageDashboardVisibility
     }.
