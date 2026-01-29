note
    description: "API tests for EMBEDDINGS_API"
    date: "$Date$"
    revision: "$Revision$"


class EMBEDDINGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_create_embedding
            -- Creates an embedding vector representing the input text.
            --
            -- 
        local
            l_response: CREATE_EMBEDDING_RESPONSE
            l_create_embedding_request: CREATE_EMBEDDING_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_embedding_request

            -- l_response := api.create_embedding(l_create_embedding_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: EMBEDDINGS_API
            -- Create an object instance of `EMBEDDINGS_API'.
        once
            create { EMBEDDINGS_API } Result
        end

end
