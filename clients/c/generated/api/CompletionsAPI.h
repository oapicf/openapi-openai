#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_completion_request.h"
#include "../model/create_completion_response.h"


// Creates a completion for the provided prompt and parameters.
//
create_completion_response_t*
CompletionsAPI_createCompletion(apiClient_t *apiClient, create_completion_request_t *create_completion_request);


