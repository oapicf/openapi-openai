-module(openapi_audit_log_project_archived).

-export([encode/1]).

-export_type([openapi_audit_log_project_archived/0]).

-type openapi_audit_log_project_archived() ::
    #{ 'id' => binary()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
