#ifndef realtime_server_event_error_TEST
#define realtime_server_event_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_error.h"
realtime_server_event_error_t* instantiate_realtime_server_event_error(int include_optional);

#include "test_realtime_server_event_error_error.c"


realtime_server_event_error_t* instantiate_realtime_server_event_error(int include_optional) {
  realtime_server_event_error_t* realtime_server_event_error = NULL;
  if (include_optional) {
    realtime_server_event_error = realtime_server_event_error_create(
      "0",
      openai_api_realtime_server_event_error_TYPE_error,
       // false, not to have infinite recursion
      instantiate_realtime_server_event_error_error(0)
    );
  } else {
    realtime_server_event_error = realtime_server_event_error_create(
      "0",
      openai_api_realtime_server_event_error_TYPE_error,
      NULL
    );
  }

  return realtime_server_event_error;
}


#ifdef realtime_server_event_error_MAIN

void test_realtime_server_event_error(int include_optional) {
    realtime_server_event_error_t* realtime_server_event_error_1 = instantiate_realtime_server_event_error(include_optional);

	cJSON* jsonrealtime_server_event_error_1 = realtime_server_event_error_convertToJSON(realtime_server_event_error_1);
	printf("realtime_server_event_error :\n%s\n", cJSON_Print(jsonrealtime_server_event_error_1));
	realtime_server_event_error_t* realtime_server_event_error_2 = realtime_server_event_error_parseFromJSON(jsonrealtime_server_event_error_1);
	cJSON* jsonrealtime_server_event_error_2 = realtime_server_event_error_convertToJSON(realtime_server_event_error_2);
	printf("repeating realtime_server_event_error:\n%s\n", cJSON_Print(jsonrealtime_server_event_error_2));
}

int main() {
  test_realtime_server_event_error(1);
  test_realtime_server_event_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_error_MAIN
#endif // realtime_server_event_error_TEST
