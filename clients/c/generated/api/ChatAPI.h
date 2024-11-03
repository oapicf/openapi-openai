#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_chat_completion_request.h"
#include "../model/create_chat_completion_response.h"


// Creates a model response for the given chat conversation.
//
create_chat_completion_response_t*
ChatAPI_createChatCompletion(apiClient_t *apiClient, create_chat_completion_request_t *create_chat_completion_request);


