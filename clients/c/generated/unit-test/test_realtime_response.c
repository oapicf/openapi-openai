#ifndef realtime_response_TEST
#define realtime_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response.h"
realtime_response_t* instantiate_realtime_response(int include_optional);

#include "test_realtime_response_status_details.c"
#include "test_realtime_response_usage.c"


realtime_response_t* instantiate_realtime_response(int include_optional) {
  realtime_response_t* realtime_response = NULL;
  if (include_optional) {
    realtime_response = realtime_response_create(
      "0",
      openai_api_realtime_response_OBJECT_realtime.response,
      openai_api_realtime_response_STATUS_completed,
       // false, not to have infinite recursion
      instantiate_realtime_response_status_details(0),
      list_createList(),
      0,
       // false, not to have infinite recursion
      instantiate_realtime_response_usage(0)
    );
  } else {
    realtime_response = realtime_response_create(
      "0",
      openai_api_realtime_response_OBJECT_realtime.response,
      openai_api_realtime_response_STATUS_completed,
      NULL,
      list_createList(),
      0,
      NULL
    );
  }

  return realtime_response;
}


#ifdef realtime_response_MAIN

void test_realtime_response(int include_optional) {
    realtime_response_t* realtime_response_1 = instantiate_realtime_response(include_optional);

	cJSON* jsonrealtime_response_1 = realtime_response_convertToJSON(realtime_response_1);
	printf("realtime_response :\n%s\n", cJSON_Print(jsonrealtime_response_1));
	realtime_response_t* realtime_response_2 = realtime_response_parseFromJSON(jsonrealtime_response_1);
	cJSON* jsonrealtime_response_2 = realtime_response_convertToJSON(realtime_response_2);
	printf("repeating realtime_response:\n%s\n", cJSON_Print(jsonrealtime_response_2));
}

int main() {
  test_realtime_response(1);
  test_realtime_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_MAIN
#endif // realtime_response_TEST
