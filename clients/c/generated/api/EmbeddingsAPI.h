#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_embedding_request.h"
#include "../model/create_embedding_response.h"


// Creates an embedding vector representing the input text.
//
create_embedding_response_t*
EmbeddingsAPI_createEmbedding(apiClient_t *apiClient, create_embedding_request_t *create_embedding_request);


