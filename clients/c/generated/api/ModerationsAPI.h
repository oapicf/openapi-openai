#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_moderation_request.h"
#include "../model/create_moderation_response.h"


// Classifies if text is potentially harmful.
//
create_moderation_response_t*
ModerationsAPI_createModeration(apiClient_t *apiClient, create_moderation_request_t *create_moderation_request);


