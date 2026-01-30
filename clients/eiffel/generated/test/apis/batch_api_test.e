note
    description: "API tests for BATCH_API"
    date: "$Date$"
    revision: "$Revision$"


class BATCH_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_cancel_batch
            -- Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
            --
            -- 
        local
            l_response: BATCH
            l_batch_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_batch_id

            -- l_response := api.cancel_batch(l_batch_id)
            assert ("not_implemented", False)
        end

    test_create_batch
            -- Creates and executes a batch from an uploaded file of requests
            --
            -- 
        local
            l_response: BATCH
            l_create_batch_request: CREATE_BATCH_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_batch_request

            -- l_response := api.create_batch(l_create_batch_request)
            assert ("not_implemented", False)
        end

    test_list_batches
            -- List your organization&#39;s batches.
            --
            -- 
        local
            l_response: LIST_BATCHES_RESPONSE
            l_after: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_batches(l_after, l_limit)
            assert ("not_implemented", False)
        end

    test_retrieve_batch
            -- Retrieves a batch.
            --
            -- 
        local
            l_response: BATCH
            l_batch_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_batch_id

            -- l_response := api.retrieve_batch(l_batch_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BATCH_API
            -- Create an object instance of `BATCH_API'.
        once
            create { BATCH_API } Result
        end

end
