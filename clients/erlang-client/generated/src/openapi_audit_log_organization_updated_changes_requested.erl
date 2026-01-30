-module(openapi_audit_log_organization_updated_changes_requested).

-export([encode/1]).

-export_type([openapi_audit_log_organization_updated_changes_requested/0]).

-type openapi_audit_log_organization_updated_changes_requested() ::
    #{ 'title' => binary(),
       'description' => binary(),
       'name' => binary(),
       'settings' => openapi_audit_log_organization_updated_changes_requested_settings:openapi_audit_log_organization_updated_changes_requested_settings()
     }.

encode(#{ 'title' := Title,
          'description' := Description,
          'name' := Name,
          'settings' := Settings
        }) ->
    #{ 'title' => Title,
       'description' => Description,
       'name' => Name,
       'settings' => Settings
     }.
