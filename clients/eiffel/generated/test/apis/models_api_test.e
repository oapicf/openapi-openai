note
    description: "API tests for MODELS_API"
    date: "$Date$"
    revision: "$Revision$"


class MODELS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_delete_model
            -- Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
            --
            -- 
        local
            l_response: DELETE_MODEL_RESPONSE
            l_model: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_model

            -- l_response := api.delete_model(l_model)
            assert ("not_implemented", False)
        end

    test_list_models
            -- Lists the currently available models, and provides basic information about each one such as the owner and availability.
            --
            -- 
        local
            l_response: LIST_MODELS_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_models
            assert ("not_implemented", False)
        end

    test_retrieve_model
            -- Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
            --
            -- 
        local
            l_response: MODEL
            l_model: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_model

            -- l_response := api.retrieve_model(l_model)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: MODELS_API
            -- Create an object instance of `MODELS_API'.
        once
            create { MODELS_API } Result
        end

end
