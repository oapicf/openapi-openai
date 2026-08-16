#ifndef TINY_CPP_CLIENT_FilesApi_H_
#define TINY_CPP_CLIENT_FilesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "DeleteFileResponse.h"
#include "ListFilesResponse.h"
#include "OpenAIFile.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class FilesApi : public Service {
public:
    FilesApi() = default;

    virtual ~FilesApi() = default;

    /**
    * Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .
    *
    * 
    * \param file The File object (not file name) to be uploaded.  *Required*
    * \param purpose The intended purpose of the uploaded file.  Use \\\"assistants\\\" for [Assistants](/docs/api-reference/assistants) and [Message](/docs/api-reference/messages) files, \\\"vision\\\" for Assistants image file inputs, \\\"batch\\\" for [Batch API](/docs/guides/batch), and \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tuning).  *Required*
    */
    Response<
                OpenAIFile
        >
    createFile(
            
            std::string file
            , 
            
            std::string purpose
            
    );
    /**
    * Delete a file..
    *
    * 
    * \param fileId The ID of the file to use for this request. *Required*
    */
    Response<
                DeleteFileResponse
        >
    deleteFile(
            
            std::string fileId
            
    );
    /**
    * Returns the contents of the specified file..
    *
    * 
    * \param fileId The ID of the file to use for this request. *Required*
    */
    Response<
                std::string
        >
    downloadFile(
            
            std::string fileId
            
    );
    /**
    * Returns a list of files..
    *
    * 
    * \param purpose Only return files with the given purpose.
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 10,000, and the default is 10,000. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    */
    Response<
                ListFilesResponse
        >
    listFiles(
            
            std::string purpose
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            
    );
    /**
    * Returns information about a specific file..
    *
    * 
    * \param fileId The ID of the file to use for this request. *Required*
    */
    Response<
                OpenAIFile
        >
    retrieveFile(
            
            std::string fileId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_FilesApi_H_ */