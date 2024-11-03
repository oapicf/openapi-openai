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
typedef enum  { openai_api_createFile_PURPOSE_NULL = 0, openai_api_createFile_PURPOSE_fine_tune, openai_api_createFile_PURPOSE_assistants } openai_api_createFile_purpose_e;


// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
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


// Returns a list of files that belong to the user's organization.
//
list_files_response_t*
FilesAPI_listFiles(apiClient_t *apiClient, char *purpose);


// Returns information about a specific file.
//
open_ai_file_t*
FilesAPI_retrieveFile(apiClient_t *apiClient, char *file_id);


