#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/delete_file_response.h"
#include "../model/list_files_response.h"
#include "../model/open_ai_file.h"

// Enum PURPOSE for FilesAPI_createFile
typedef enum  { openai_api_createFile_PURPOSE_NULL = 0, openai_api_createFile_PURPOSE_assistants, openai_api_createFile_PURPOSE_batch, openai_api_createFile_PURPOSE_fine_tune, openai_api_createFile_PURPOSE_vision } openai_api_createFile_purpose_e;

// Enum ORDER for FilesAPI_listFiles
typedef enum  { openai_api_listFiles_ORDER_NULL = 0, openai_api_listFiles_ORDER_asc, openai_api_listFiles_ORDER_desc } openai_api_listFiles_order_e;


// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
//
open_ai_file_t*
FilesAPI_createFile(apiClient_t *apiClient, binary_t* file, openai_api_createFile_purpose_e purpose);


// Delete a file.
//
delete_file_response_t*
FilesAPI_deleteFile(apiClient_t *apiClient, char *file_id);


// Returns the contents of the specified file.
//
char*
FilesAPI_downloadFile(apiClient_t *apiClient, char *file_id);


// Returns a list of files.
//
list_files_response_t*
FilesAPI_listFiles(apiClient_t *apiClient, char *purpose, int *limit, openai_api_listFiles_order_e order, char *after);


// Returns information about a specific file.
//
open_ai_file_t*
FilesAPI_retrieveFile(apiClient_t *apiClient, char *file_id);


