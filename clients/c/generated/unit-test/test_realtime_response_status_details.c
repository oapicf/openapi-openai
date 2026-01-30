#ifndef realtime_response_status_details_TEST
#define realtime_response_status_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_status_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_status_details.h"
realtime_response_status_details_t* instantiate_realtime_response_status_details(int include_optional);

#include "test_realtime_response_status_details_error.c"


realtime_response_status_details_t* instantiate_realtime_response_status_details(int include_optional) {
  realtime_response_status_details_t* realtime_response_status_details = NULL;
  if (include_optional) {
    realtime_response_status_details = realtime_response_status_details_create(
      openai_api_realtime_response_status_details_TYPE_completed,
      openai_api_realtime_response_status_details_REASON_turn_detected,
       // false, not to have infinite recursion
      instantiate_realtime_response_status_details_error(0)
    );
  } else {
    realtime_response_status_details = realtime_response_status_details_create(
      openai_api_realtime_response_status_details_TYPE_completed,
      openai_api_realtime_response_status_details_REASON_turn_detected,
      NULL
    );
  }

  return realtime_response_status_details;
}


#ifdef realtime_response_status_details_MAIN

void test_realtime_response_status_details(int include_optional) {
    realtime_response_status_details_t* realtime_response_status_details_1 = instantiate_realtime_response_status_details(include_optional);

	cJSON* jsonrealtime_response_status_details_1 = realtime_response_status_details_convertToJSON(realtime_response_status_details_1);
	printf("realtime_response_status_details :\n%s\n", cJSON_Print(jsonrealtime_response_status_details_1));
	realtime_response_status_details_t* realtime_response_status_details_2 = realtime_response_status_details_parseFromJSON(jsonrealtime_response_status_details_1);
	cJSON* jsonrealtime_response_status_details_2 = realtime_response_status_details_convertToJSON(realtime_response_status_details_2);
	printf("repeating realtime_response_status_details:\n%s\n", cJSON_Print(jsonrealtime_response_status_details_2));
}

int main() {
  test_realtime_response_status_details(1);
  test_realtime_response_status_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_status_details_MAIN
#endif // realtime_response_status_details_TEST
