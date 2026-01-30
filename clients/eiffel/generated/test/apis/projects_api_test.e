note
    description: "API tests for PROJECTS_API"
    date: "$Date$"
    revision: "$Revision$"


class PROJECTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_archive_project
            -- Archives a project in the organization. Archived projects cannot be used or updated.
            --
            -- 
        local
            l_response: PROJECT
            l_project_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id

            -- l_response := api.archive_project(l_project_id)
            assert ("not_implemented", False)
        end

    test_create_project
            -- Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
            --
            -- 
        local
            l_response: PROJECT
            l_project_create_request: PROJECT_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_project_create_request

            -- l_response := api.create_project(l_project_create_request)
            assert ("not_implemented", False)
        end

    test_create_project_service_account
            -- Creates a new service account in the project. This also returns an unredacted API key for the service account.
            --
            -- 
        local
            l_response: PROJECT_SERVICE_ACCOUNT_CREATE_RESPONSE
            l_project_id: STRING_32
            l_project_service_account_create_request: PROJECT_SERVICE_ACCOUNT_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_project_service_account_create_request

            -- l_response := api.create_project_service_account(l_project_id, l_project_service_account_create_request)
            assert ("not_implemented", False)
        end

    test_create_project_user
            -- Adds a user to the project. Users must already be members of the organization to be added to a project.
            --
            -- 
        local
            l_response: PROJECT_USER
            l_project_id: STRING_32
            l_project_user_create_request: PROJECT_USER_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_project_user_create_request

            -- l_response := api.create_project_user(l_project_id, l_project_user_create_request)
            assert ("not_implemented", False)
        end

    test_delete_project_api_key
            -- Deletes an API key from the project.
            --
            -- 
        local
            l_response: PROJECT_API_KEY_DELETE_RESPONSE
            l_project_id: STRING_32
            l_key_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_key_id

            -- l_response := api.delete_project_api_key(l_project_id, l_key_id)
            assert ("not_implemented", False)
        end

    test_delete_project_service_account
            -- Deletes a service account from the project.
            --
            -- 
        local
            l_response: PROJECT_SERVICE_ACCOUNT_DELETE_RESPONSE
            l_project_id: STRING_32
            l_service_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_service_account_id

            -- l_response := api.delete_project_service_account(l_project_id, l_service_account_id)
            assert ("not_implemented", False)
        end

    test_delete_project_user
            -- Deletes a user from the project.
            --
            -- 
        local
            l_response: PROJECT_USER_DELETE_RESPONSE
            l_project_id: STRING_32
            l_user_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_user_id

            -- l_response := api.delete_project_user(l_project_id, l_user_id)
            assert ("not_implemented", False)
        end

    test_list_project_api_keys
            -- Returns a list of API keys in the project.
            --
            -- 
        local
            l_response: PROJECT_API_KEY_LIST_RESPONSE
            l_project_id: STRING_32
            l_limit: INTEGER_32
            l_after: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id

            -- l_response := api.list_project_api_keys(l_project_id, l_limit, l_after)
            assert ("not_implemented", False)
        end

    test_list_project_rate_limits
            -- Returns the rate limits per model for a project.
            --
            -- 
        local
            l_response: PROJECT_RATE_LIMIT_LIST_RESPONSE
            l_project_id: STRING_32
            l_limit: INTEGER_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id

            -- l_response := api.list_project_rate_limits(l_project_id, l_limit, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_list_project_service_accounts
            -- Returns a list of service accounts in the project.
            --
            -- 
        local
            l_response: PROJECT_SERVICE_ACCOUNT_LIST_RESPONSE
            l_project_id: STRING_32
            l_limit: INTEGER_32
            l_after: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id

            -- l_response := api.list_project_service_accounts(l_project_id, l_limit, l_after)
            assert ("not_implemented", False)
        end

    test_list_project_users
            -- Returns a list of users in the project.
            --
            -- 
        local
            l_response: PROJECT_USER_LIST_RESPONSE
            l_project_id: STRING_32
            l_limit: INTEGER_32
            l_after: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id

            -- l_response := api.list_project_users(l_project_id, l_limit, l_after)
            assert ("not_implemented", False)
        end

    test_list_projects
            -- Returns a list of projects.
            --
            -- 
        local
            l_response: PROJECT_LIST_RESPONSE
            l_limit: INTEGER_32
            l_after: STRING_32
            l_include_archived: BOOLEAN
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_projects(l_limit, l_after, l_include_archived)
            assert ("not_implemented", False)
        end

    test_modify_project
            -- Modifies a project in the organization.
            --
            -- 
        local
            l_response: PROJECT
            l_project_id: STRING_32
            l_project_update_request: PROJECT_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_project_update_request

            -- l_response := api.modify_project(l_project_id, l_project_update_request)
            assert ("not_implemented", False)
        end

    test_modify_project_user
            -- Modifies a user&#39;s role in the project.
            --
            -- 
        local
            l_response: PROJECT_USER
            l_project_id: STRING_32
            l_user_id: STRING_32
            l_project_user_update_request: PROJECT_USER_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_user_id
            -- l_project_user_update_request

            -- l_response := api.modify_project_user(l_project_id, l_user_id, l_project_user_update_request)
            assert ("not_implemented", False)
        end

    test_retrieve_project
            -- Retrieves a project.
            --
            -- 
        local
            l_response: PROJECT
            l_project_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id

            -- l_response := api.retrieve_project(l_project_id)
            assert ("not_implemented", False)
        end

    test_retrieve_project_api_key
            -- Retrieves an API key in the project.
            --
            -- 
        local
            l_response: PROJECT_API_KEY
            l_project_id: STRING_32
            l_key_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_key_id

            -- l_response := api.retrieve_project_api_key(l_project_id, l_key_id)
            assert ("not_implemented", False)
        end

    test_retrieve_project_service_account
            -- Retrieves a service account in the project.
            --
            -- 
        local
            l_response: PROJECT_SERVICE_ACCOUNT
            l_project_id: STRING_32
            l_service_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_service_account_id

            -- l_response := api.retrieve_project_service_account(l_project_id, l_service_account_id)
            assert ("not_implemented", False)
        end

    test_retrieve_project_user
            -- Retrieves a user in the project.
            --
            -- 
        local
            l_response: PROJECT_USER
            l_project_id: STRING_32
            l_user_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_user_id

            -- l_response := api.retrieve_project_user(l_project_id, l_user_id)
            assert ("not_implemented", False)
        end

    test_update_project_rate_limits
            -- Updates a project rate limit.
            --
            -- 
        local
            l_response: PROJECT_RATE_LIMIT
            l_project_id: STRING_32
            l_rate_limit_id: STRING_32
            l_project_rate_limit_update_request: PROJECT_RATE_LIMIT_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_project_id
            -- l_rate_limit_id
            -- l_project_rate_limit_update_request

            -- l_response := api.update_project_rate_limits(l_project_id, l_rate_limit_id, l_project_rate_limit_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PROJECTS_API
            -- Create an object instance of `PROJECTS_API'.
        once
            create { PROJECTS_API } Result
        end

end
