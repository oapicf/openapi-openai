#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/realtime_session_create_request.h"
#include "../model/realtime_session_create_response.h"


// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
//
realtime_session_create_response_t*
RealtimeAPI_createRealtimeSession(apiClient_t *apiClient, realtime_session_create_request_t *realtime_session_create_request);


