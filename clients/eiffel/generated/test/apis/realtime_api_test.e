note
    description: "API tests for REALTIME_API"
    date: "$Date$"
    revision: "$Revision$"


class REALTIME_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_realtime_session
            -- Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
            --
            -- 
        local
            l_response: REALTIME_SESSION_CREATE_RESPONSE
            l_realtime_session_create_request: REALTIME_SESSION_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_realtime_session_create_request

            -- l_response := api.create_realtime_session(l_realtime_session_create_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: REALTIME_API
            -- Create an object instance of `REALTIME_API'.
        once
            create { REALTIME_API } Result
        end

end
