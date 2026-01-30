#ifndef realtime_server_event_response_created_TEST
#define realtime_server_event_response_created_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_response_created_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_response_created.h"
realtime_server_event_response_created_t* instantiate_realtime_server_event_response_created(int include_optional);

#include "test_realtime_response.c"


realtime_server_event_response_created_t* instantiate_realtime_server_event_response_created(int include_optional) {
  realtime_server_event_response_created_t* realtime_server_event_response_created = NULL;
  if (include_optional) {
    realtime_server_event_response_created = realtime_server_event_response_created_create(
      "0",
      openai_api_realtime_server_event_response_created_TYPE_response.created,
       // false, not to have infinite recursion
      instantiate_realtime_response(0)
    );
  } else {
    realtime_server_event_response_created = realtime_server_event_response_created_create(
      "0",
      openai_api_realtime_server_event_response_created_TYPE_response.created,
      NULL
    );
  }

  return realtime_server_event_response_created;
}


#ifdef realtime_server_event_response_created_MAIN

void test_realtime_server_event_response_created(int include_optional) {
    realtime_server_event_response_created_t* realtime_server_event_response_created_1 = instantiate_realtime_server_event_response_created(include_optional);

	cJSON* jsonrealtime_server_event_response_created_1 = realtime_server_event_response_created_convertToJSON(realtime_server_event_response_created_1);
	printf("realtime_server_event_response_created :\n%s\n", cJSON_Print(jsonrealtime_server_event_response_created_1));
	realtime_server_event_response_created_t* realtime_server_event_response_created_2 = realtime_server_event_response_created_parseFromJSON(jsonrealtime_server_event_response_created_1);
	cJSON* jsonrealtime_server_event_response_created_2 = realtime_server_event_response_created_convertToJSON(realtime_server_event_response_created_2);
	printf("repeating realtime_server_event_response_created:\n%s\n", cJSON_Print(jsonrealtime_server_event_response_created_2));
}

int main() {
  test_realtime_server_event_response_created(1);
  test_realtime_server_event_response_created(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_response_created_MAIN
#endif // realtime_server_event_response_created_TEST
