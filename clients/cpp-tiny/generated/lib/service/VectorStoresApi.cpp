#include "VectorStoresApi.h"

using namespace Tiny;



        Response<
            VectorStoreFileBatchObject
        >
        VectorStoresApi::
        cancelVectorStoreFileBatch(
            
            std::string vectorStoreId
            , 
            
            std::string batchId
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel"; //vectorStoreId batchId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));
                std::string s_batchId("{");
                s_batchId.append("batch_id");
                s_batchId.append("}");

                int pos = url.find(s_batchId);

                url.erase(pos, s_batchId.length());
                url.insert(pos, stringify(batchId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | 
            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreFileBatchObject obj(output_string);


            Response<VectorStoreFileBatchObject> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreObject
        >
        VectorStoresApi::
        createVectorStore(
            
            CreateVectorStoreRequest createVectorStoreRequest
            
        )
        {
            std::string url = basepath + "/vector_stores"; //


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createVectorStoreRequest



            payload = createVectorStoreRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreObject obj(output_string);


            Response<VectorStoreObject> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreFileObject
        >
        VectorStoresApi::
        createVectorStoreFile(
            
            std::string vectorStoreId
            , 
            
            CreateVectorStoreFileRequest createVectorStoreFileRequest
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/files"; //vectorStoreId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createVectorStoreFileRequest



            payload = createVectorStoreFileRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreFileObject obj(output_string);


            Response<VectorStoreFileObject> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreFileBatchObject
        >
        VectorStoresApi::
        createVectorStoreFileBatch(
            
            std::string vectorStoreId
            , 
            
            CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/file_batches"; //vectorStoreId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | createVectorStoreFileBatchRequest



            payload = createVectorStoreFileBatchRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreFileBatchObject obj(output_string);


            Response<VectorStoreFileBatchObject> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteVectorStoreResponse
        >
        VectorStoresApi::
        deleteVectorStore(
            
            std::string vectorStoreId
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}"; //vectorStoreId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteVectorStoreResponse obj(output_string);


            Response<DeleteVectorStoreResponse> response(obj, httpCode);
            return response;
        }

        Response<
            DeleteVectorStoreFileResponse
        >
        VectorStoresApi::
        deleteVectorStoreFile(
            
            std::string vectorStoreId
            , 
            
            std::string fileId
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/files/{file_id}"; //vectorStoreId fileId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));
                std::string s_fileId("{");
                s_fileId.append("file_id");
                s_fileId.append("}");

                int pos = url.find(s_fileId);

                url.erase(pos, s_fileId.length());
                url.insert(pos, stringify(fileId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            DeleteVectorStoreFileResponse obj(output_string);


            Response<DeleteVectorStoreFileResponse> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreObject
        >
        VectorStoresApi::
        getVectorStore(
            
            std::string vectorStoreId
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}"; //vectorStoreId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreObject obj(output_string);


            Response<VectorStoreObject> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreFileObject
        >
        VectorStoresApi::
        getVectorStoreFile(
            
            std::string vectorStoreId
            , 
            
            std::string fileId
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/files/{file_id}"; //vectorStoreId fileId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));
                std::string s_fileId("{");
                s_fileId.append("file_id");
                s_fileId.append("}");

                int pos = url.find(s_fileId);

                url.erase(pos, s_fileId.length());
                url.insert(pos, stringify(fileId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreFileObject obj(output_string);


            Response<VectorStoreFileObject> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreFileBatchObject
        >
        VectorStoresApi::
        getVectorStoreFileBatch(
            
            std::string vectorStoreId
            , 
            
            std::string batchId
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}"; //vectorStoreId batchId 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));
                std::string s_batchId("{");
                s_batchId.append("batch_id");
                s_batchId.append("}");

                int pos = url.find(s_batchId);

                url.erase(pos, s_batchId.length());
                url.insert(pos, stringify(batchId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreFileBatchObject obj(output_string);


            Response<VectorStoreFileBatchObject> response(obj, httpCode);
            return response;
        }

        Response<
            ListVectorStoreFilesResponse
        >
        VectorStoresApi::
        listFilesInVectorStoreBatch(
            
            std::string vectorStoreId
            , 
            
            std::string batchId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            
            std::string filter
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files"; //vectorStoreId batchId 


            // Headers  | 

            // Query    | limit order after before filter 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);
            addQueryParam("filter",filter);

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));
                std::string s_batchId("{");
                s_batchId.append("batch_id");
                s_batchId.append("}");

                int pos = url.find(s_batchId);

                url.erase(pos, s_batchId.length());
                url.insert(pos, stringify(batchId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListVectorStoreFilesResponse obj(output_string);


            Response<ListVectorStoreFilesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListVectorStoreFilesResponse
        >
        VectorStoresApi::
        listVectorStoreFiles(
            
            std::string vectorStoreId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            
            std::string filter
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}/files"; //vectorStoreId 


            // Headers  | 

            // Query    | limit order after before filter 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);
            addQueryParam("filter",filter);

            // Form     | 



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListVectorStoreFilesResponse obj(output_string);


            Response<ListVectorStoreFilesResponse> response(obj, httpCode);
            return response;
        }

        Response<
            ListVectorStoresResponse
        >
        VectorStoresApi::
        listVectorStores(
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            
        )
        {
            std::string url = basepath + "/vector_stores"; //


            // Headers  | 

            // Query    | limit order after before 
            addQueryParam("limit",limit);
            addQueryParam("order",order);
            addQueryParam("after",after);
            addQueryParam("before",before);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            ListVectorStoresResponse obj(output_string);


            Response<ListVectorStoresResponse> response(obj, httpCode);
            return response;
        }

        Response<
            VectorStoreObject
        >
        VectorStoresApi::
        modifyVectorStore(
            
            std::string vectorStoreId
            , 
            
            UpdateVectorStoreRequest updateVectorStoreRequest
            
        )
        {
            std::string url = basepath + "/vector_stores/{vector_store_id}"; //vectorStoreId 


            // Headers  | 

            // Query    | 

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_vectorStoreId("{");
                s_vectorStoreId.append("vector_store_id");
                s_vectorStoreId.append("}");

                int pos = url.find(s_vectorStoreId);

                url.erase(pos, s_vectorStoreId.length());
                url.insert(pos, stringify(vectorStoreId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | updateVectorStoreRequest



            payload = updateVectorStoreRequest.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            VectorStoreObject obj(output_string);


            Response<VectorStoreObject> response(obj, httpCode);
            return response;
        }



