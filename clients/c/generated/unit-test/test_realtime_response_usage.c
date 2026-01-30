#ifndef realtime_response_usage_TEST
#define realtime_response_usage_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_usage_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_usage.h"
realtime_response_usage_t* instantiate_realtime_response_usage(int include_optional);

#include "test_realtime_response_usage_input_token_details.c"
#include "test_realtime_response_usage_output_token_details.c"


realtime_response_usage_t* instantiate_realtime_response_usage(int include_optional) {
  realtime_response_usage_t* realtime_response_usage = NULL;
  if (include_optional) {
    realtime_response_usage = realtime_response_usage_create(
      56,
      56,
      56,
       // false, not to have infinite recursion
      instantiate_realtime_response_usage_input_token_details(0),
       // false, not to have infinite recursion
      instantiate_realtime_response_usage_output_token_details(0)
    );
  } else {
    realtime_response_usage = realtime_response_usage_create(
      56,
      56,
      56,
      NULL,
      NULL
    );
  }

  return realtime_response_usage;
}


#ifdef realtime_response_usage_MAIN

void test_realtime_response_usage(int include_optional) {
    realtime_response_usage_t* realtime_response_usage_1 = instantiate_realtime_response_usage(include_optional);

	cJSON* jsonrealtime_response_usage_1 = realtime_response_usage_convertToJSON(realtime_response_usage_1);
	printf("realtime_response_usage :\n%s\n", cJSON_Print(jsonrealtime_response_usage_1));
	realtime_response_usage_t* realtime_response_usage_2 = realtime_response_usage_parseFromJSON(jsonrealtime_response_usage_1);
	cJSON* jsonrealtime_response_usage_2 = realtime_response_usage_convertToJSON(realtime_response_usage_2);
	printf("repeating realtime_response_usage:\n%s\n", cJSON_Print(jsonrealtime_response_usage_2));
}

int main() {
  test_realtime_response_usage(1);
  test_realtime_response_usage(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_usage_MAIN
#endif // realtime_response_usage_TEST
