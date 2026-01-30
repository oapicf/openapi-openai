note
    description: "API tests for CHAT_API"
    date: "$Date$"
    revision: "$Revision$"


class CHAT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_chat_completion
            -- Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
            --
            -- 
        local
            l_response: CREATE_CHAT_COMPLETION_RESPONSE
            l_create_chat_completion_request: CREATE_CHAT_COMPLETION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_chat_completion_request

            -- l_response := api.create_chat_completion(l_create_chat_completion_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CHAT_API
            -- Create an object instance of `CHAT_API'.
        once
            create { CHAT_API } Result
        end

end
