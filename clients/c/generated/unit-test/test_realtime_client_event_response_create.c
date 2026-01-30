#ifndef realtime_client_event_response_create_TEST
#define realtime_client_event_response_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_response_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_response_create.h"
realtime_client_event_response_create_t* instantiate_realtime_client_event_response_create(int include_optional);

#include "test_realtime_response_create_params.c"


realtime_client_event_response_create_t* instantiate_realtime_client_event_response_create(int include_optional) {
  realtime_client_event_response_create_t* realtime_client_event_response_create = NULL;
  if (include_optional) {
    realtime_client_event_response_create = realtime_client_event_response_create_create(
      "0",
      openai_api_realtime_client_event_response_create_TYPE_response.create,
       // false, not to have infinite recursion
      instantiate_realtime_response_create_params(0)
    );
  } else {
    realtime_client_event_response_create = realtime_client_event_response_create_create(
      "0",
      openai_api_realtime_client_event_response_create_TYPE_response.create,
      NULL
    );
  }

  return realtime_client_event_response_create;
}


#ifdef realtime_client_event_response_create_MAIN

void test_realtime_client_event_response_create(int include_optional) {
    realtime_client_event_response_create_t* realtime_client_event_response_create_1 = instantiate_realtime_client_event_response_create(include_optional);

	cJSON* jsonrealtime_client_event_response_create_1 = realtime_client_event_response_create_convertToJSON(realtime_client_event_response_create_1);
	printf("realtime_client_event_response_create :\n%s\n", cJSON_Print(jsonrealtime_client_event_response_create_1));
	realtime_client_event_response_create_t* realtime_client_event_response_create_2 = realtime_client_event_response_create_parseFromJSON(jsonrealtime_client_event_response_create_1);
	cJSON* jsonrealtime_client_event_response_create_2 = realtime_client_event_response_create_convertToJSON(realtime_client_event_response_create_2);
	printf("repeating realtime_client_event_response_create:\n%s\n", cJSON_Print(jsonrealtime_client_event_response_create_2));
}

int main() {
  test_realtime_client_event_response_create(1);
  test_realtime_client_event_response_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_response_create_MAIN
#endif // realtime_client_event_response_create_TEST
