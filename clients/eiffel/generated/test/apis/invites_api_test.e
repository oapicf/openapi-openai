note
    description: "API tests for INVITES_API"
    date: "$Date$"
    revision: "$Revision$"


class INVITES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_delete_invite
            -- Delete an invite. If the invite has already been accepted, it cannot be deleted.
            --
            -- 
        local
            l_response: INVITE_DELETE_RESPONSE
            l_invite_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_invite_id

            -- l_response := api.delete_invite(l_invite_id)
            assert ("not_implemented", False)
        end

    test_invite_user
            -- Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
            --
            -- 
        local
            l_response: INVITE
            l_invite_request: INVITE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_invite_request

            -- l_response := api.invite_user(l_invite_request)
            assert ("not_implemented", False)
        end

    test_list_invites
            -- Returns a list of invites in the organization.
            --
            -- 
        local
            l_response: INVITE_LIST_RESPONSE
            l_limit: INTEGER_32
            l_after: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_invites(l_limit, l_after)
            assert ("not_implemented", False)
        end

    test_retrieve_invite
            -- Retrieves an invite.
            --
            -- 
        local
            l_response: INVITE
            l_invite_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_invite_id

            -- l_response := api.retrieve_invite(l_invite_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: INVITES_API
            -- Create an object instance of `INVITES_API'.
        once
            create { INVITES_API } Result
        end

end
