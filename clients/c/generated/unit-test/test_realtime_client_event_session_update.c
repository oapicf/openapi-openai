#ifndef realtime_client_event_session_update_TEST
#define realtime_client_event_session_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_session_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_session_update.h"
realtime_client_event_session_update_t* instantiate_realtime_client_event_session_update(int include_optional);

#include "test_realtime_session_create_request.c"


realtime_client_event_session_update_t* instantiate_realtime_client_event_session_update(int include_optional) {
  realtime_client_event_session_update_t* realtime_client_event_session_update = NULL;
  if (include_optional) {
    realtime_client_event_session_update = realtime_client_event_session_update_create(
      "0",
      openai_api_realtime_client_event_session_update_TYPE_session.update,
       // false, not to have infinite recursion
      instantiate_realtime_session_create_request(0)
    );
  } else {
    realtime_client_event_session_update = realtime_client_event_session_update_create(
      "0",
      openai_api_realtime_client_event_session_update_TYPE_session.update,
      NULL
    );
  }

  return realtime_client_event_session_update;
}


#ifdef realtime_client_event_session_update_MAIN

void test_realtime_client_event_session_update(int include_optional) {
    realtime_client_event_session_update_t* realtime_client_event_session_update_1 = instantiate_realtime_client_event_session_update(include_optional);

	cJSON* jsonrealtime_client_event_session_update_1 = realtime_client_event_session_update_convertToJSON(realtime_client_event_session_update_1);
	printf("realtime_client_event_session_update :\n%s\n", cJSON_Print(jsonrealtime_client_event_session_update_1));
	realtime_client_event_session_update_t* realtime_client_event_session_update_2 = realtime_client_event_session_update_parseFromJSON(jsonrealtime_client_event_session_update_1);
	cJSON* jsonrealtime_client_event_session_update_2 = realtime_client_event_session_update_convertToJSON(realtime_client_event_session_update_2);
	printf("repeating realtime_client_event_session_update:\n%s\n", cJSON_Print(jsonrealtime_client_event_session_update_2));
}

int main() {
  test_realtime_client_event_session_update(1);
  test_realtime_client_event_session_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_session_update_MAIN
#endif // realtime_client_event_session_update_TEST
