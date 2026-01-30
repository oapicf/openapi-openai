-module(openapi_audit_log_project_updated_changes_requested).

-export([encode/1]).

-export_type([openapi_audit_log_project_updated_changes_requested/0]).

-type openapi_audit_log_project_updated_changes_requested() ::
    #{ 'title' => binary()
     }.

encode(#{ 'title' := Title
        }) ->
    #{ 'title' => Title
     }.
