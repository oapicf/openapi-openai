note
    description: "API tests for MODERATIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class MODERATIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_moderation
            -- Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
            --
            -- 
        local
            l_response: CREATE_MODERATION_RESPONSE
            l_create_moderation_request: CREATE_MODERATION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_moderation_request

            -- l_response := api.create_moderation(l_create_moderation_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MODERATIONS_API
            -- Create an object instance of `MODERATIONS_API'.
        once
            create { MODERATIONS_API } Result
        end

end
