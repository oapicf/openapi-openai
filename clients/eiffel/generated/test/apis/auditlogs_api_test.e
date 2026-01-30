note
    description: "API tests for AUDITLOGS_API"
    date: "$Date$"
    revision: "$Revision$"


class AUDITLOGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_list_audit_logs
            -- List user actions and configuration changes within this organization.
            --
            -- 
        local
            l_response: LIST_AUDIT_LOGS_RESPONSE
            l_effective_at: LIST_AUDIT_LOGS_EFFECTIVE_AT_PARAMETER
            l_project_ids: LIST [STRING_32]
            l_event_types: LIST [AUDIT_LOG_EVENT_TYPE]
            l_actor_ids: LIST [STRING_32]
            l_actor_emails: LIST [STRING_32]
            l_resource_ids: LIST [STRING_32]
            l_limit: INTEGER_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_audit_logs(l_effective_at, l_project_ids, l_event_types, l_actor_ids, l_actor_emails, l_resource_ids, l_limit, l_after, l_before)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUDITLOGS_API
            -- Create an object instance of `AUDITLOGS_API'.
        once
            create { AUDITLOGS_API } Result
        end

end
