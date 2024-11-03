note
    description: "API tests for COMPLETIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class COMPLETIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_completion
            -- Creates a completion for the provided prompt and parameters.
            --
            -- 
        local
            l_response: CREATE_COMPLETION_RESPONSE
            l_create_completion_request: CREATE_COMPLETION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_completion_request

            -- l_response := api.create_completion(l_create_completion_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: COMPLETIONS_API
            -- Create an object instance of `COMPLETIONS_API'.
        once
            create { COMPLETIONS_API } Result
        end

end
