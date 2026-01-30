note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_admin_api_keys_create
            -- Create an organization admin API key
            --
            -- Create a new admin-level API key for the organization.
        local
            l_response: ADMIN_API_KEY
            l_admin_api_keys_create_request: ADMIN_API_KEYS_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_admin_api_keys_create_request

            -- l_response := api.admin_api_keys_create(l_admin_api_keys_create_request)
            assert ("not_implemented", False)
        end

    test_admin_api_keys_delete
            -- Delete an organization admin API key
            --
            -- Delete the specified admin API key.
        local
            l_response: ADMIN_API_KEYS_DELETE_200_RESPONSE
            l_key_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_key_id

            -- l_response := api.admin_api_keys_delete(l_key_id)
            assert ("not_implemented", False)
        end

    test_admin_api_keys_get
            -- Retrieve a single organization API key
            --
            -- Get details for a specific organization API key by its ID.
        local
            l_response: ADMIN_API_KEY
            l_key_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_key_id

            -- l_response := api.admin_api_keys_get(l_key_id)
            assert ("not_implemented", False)
        end

    test_admin_api_keys_list
            -- List organization API keys
            --
            -- Retrieve a paginated list of organization admin API keys.
        local
            l_response: API_KEY_LIST
            l_after: STRING_32
            l_order: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.admin_api_keys_list(l_after, l_order, l_limit)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
