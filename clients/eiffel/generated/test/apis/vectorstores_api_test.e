note
    description: "API tests for VECTORSTORES_API"
    date: "$Date$"
    revision: "$Revision$"


class VECTORSTORES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_cancel_vector_store_file_batch
            -- Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
            --
            -- 
        local
            l_response: VECTOR_STORE_FILE_BATCH_OBJECT
            l_vector_store_id: STRING_32
            l_batch_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_batch_id

            -- l_response := api.cancel_vector_store_file_batch(l_vector_store_id, l_batch_id)
            assert ("not_implemented", False)
        end

    test_create_vector_store
            -- Create a vector store.
            --
            -- 
        local
            l_response: VECTOR_STORE_OBJECT
            l_create_vector_store_request: CREATE_VECTOR_STORE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_vector_store_request

            -- l_response := api.create_vector_store(l_create_vector_store_request)
            assert ("not_implemented", False)
        end

    test_create_vector_store_file
            -- Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
            --
            -- 
        local
            l_response: VECTOR_STORE_FILE_OBJECT
            l_vector_store_id: STRING_32
            l_create_vector_store_file_request: CREATE_VECTOR_STORE_FILE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_create_vector_store_file_request

            -- l_response := api.create_vector_store_file(l_vector_store_id, l_create_vector_store_file_request)
            assert ("not_implemented", False)
        end

    test_create_vector_store_file_batch
            -- Create a vector store file batch.
            --
            -- 
        local
            l_response: VECTOR_STORE_FILE_BATCH_OBJECT
            l_vector_store_id: STRING_32
            l_create_vector_store_file_batch_request: CREATE_VECTOR_STORE_FILE_BATCH_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_create_vector_store_file_batch_request

            -- l_response := api.create_vector_store_file_batch(l_vector_store_id, l_create_vector_store_file_batch_request)
            assert ("not_implemented", False)
        end

    test_delete_vector_store
            -- Delete a vector store.
            --
            -- 
        local
            l_response: DELETE_VECTOR_STORE_RESPONSE
            l_vector_store_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id

            -- l_response := api.delete_vector_store(l_vector_store_id)
            assert ("not_implemented", False)
        end

    test_delete_vector_store_file
            -- Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
            --
            -- 
        local
            l_response: DELETE_VECTOR_STORE_FILE_RESPONSE
            l_vector_store_id: STRING_32
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_file_id

            -- l_response := api.delete_vector_store_file(l_vector_store_id, l_file_id)
            assert ("not_implemented", False)
        end

    test_list_files_in_vector_store_batch
            -- Returns a list of vector store files in a batch.
            --
            -- 
        local
            l_response: LIST_VECTOR_STORE_FILES_RESPONSE
            l_vector_store_id: STRING_32
            l_batch_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
            l_filter: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_batch_id

            -- l_response := api.list_files_in_vector_store_batch(l_vector_store_id, l_batch_id, l_limit, l_order, l_after, l_before, l_filter)
            assert ("not_implemented", False)
        end

    test_list_vector_store_files
            -- Returns a list of vector store files.
            --
            -- 
        local
            l_response: LIST_VECTOR_STORE_FILES_RESPONSE
            l_vector_store_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
            l_filter: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id

            -- l_response := api.list_vector_store_files(l_vector_store_id, l_limit, l_order, l_after, l_before, l_filter)
            assert ("not_implemented", False)
        end

    test_list_vector_stores
            -- Returns a list of vector stores.
            --
            -- 
        local
            l_response: LIST_VECTOR_STORES_RESPONSE
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_vector_stores(l_limit, l_order, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_modify_vector_store
            -- Modifies a vector store.
            --
            -- 
        local
            l_response: VECTOR_STORE_OBJECT
            l_vector_store_id: STRING_32
            l_update_vector_store_request: UPDATE_VECTOR_STORE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_update_vector_store_request

            -- l_response := api.modify_vector_store(l_vector_store_id, l_update_vector_store_request)
            assert ("not_implemented", False)
        end

    test_vector_store
            -- Retrieves a vector store.
            --
            -- 
        local
            l_response: VECTOR_STORE_OBJECT
            l_vector_store_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id

            -- l_response := api.vector_store(l_vector_store_id)
            assert ("not_implemented", False)
        end

    test_vector_store_file
            -- Retrieves a vector store file.
            --
            -- 
        local
            l_response: VECTOR_STORE_FILE_OBJECT
            l_vector_store_id: STRING_32
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_file_id

            -- l_response := api.vector_store_file(l_vector_store_id, l_file_id)
            assert ("not_implemented", False)
        end

    test_vector_store_file_batch
            -- Retrieves a vector store file batch.
            --
            -- 
        local
            l_response: VECTOR_STORE_FILE_BATCH_OBJECT
            l_vector_store_id: STRING_32
            l_batch_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_vector_store_id
            -- l_batch_id

            -- l_response := api.vector_store_file_batch(l_vector_store_id, l_batch_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: VECTORSTORES_API
            -- Create an object instance of `VECTORSTORES_API'.
        once
            create { VECTORSTORES_API } Result
        end

end
