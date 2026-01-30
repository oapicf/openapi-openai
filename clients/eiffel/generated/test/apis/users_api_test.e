note
    description: "API tests for USERS_API"
    date: "$Date$"
    revision: "$Revision$"


class USERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_delete_user
            -- Deletes a user from the organization.
            --
            -- 
        local
            l_response: USER_DELETE_RESPONSE
            l_user_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_id

            -- l_response := api.delete_user(l_user_id)
            assert ("not_implemented", False)
        end

    test_list_users
            -- Lists all of the users in the organization.
            --
            -- 
        local
            l_response: USER_LIST_RESPONSE
            l_limit: INTEGER_32
            l_after: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_users(l_limit, l_after)
            assert ("not_implemented", False)
        end

    test_modify_user
            -- Modifies a user&#39;s role in the organization.
            --
            -- 
        local
            l_response: USER
            l_user_id: STRING_32
            l_user_role_update_request: USER_ROLE_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_user_id
            -- l_user_role_update_request

            -- l_response := api.modify_user(l_user_id, l_user_role_update_request)
            assert ("not_implemented", False)
        end

    test_retrieve_user
            -- Retrieves a user by their identifier.
            --
            -- 
        local
            l_response: USER
            l_user_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_user_id

            -- l_response := api.retrieve_user(l_user_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USERS_API
            -- Create an object instance of `USERS_API'.
        once
            create { USERS_API } Result
        end

end
