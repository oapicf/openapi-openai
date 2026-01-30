#ifndef realtime_response_usage_input_token_details_TEST
#define realtime_response_usage_input_token_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_usage_input_token_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_usage_input_token_details.h"
realtime_response_usage_input_token_details_t* instantiate_realtime_response_usage_input_token_details(int include_optional);



realtime_response_usage_input_token_details_t* instantiate_realtime_response_usage_input_token_details(int include_optional) {
  realtime_response_usage_input_token_details_t* realtime_response_usage_input_token_details = NULL;
  if (include_optional) {
    realtime_response_usage_input_token_details = realtime_response_usage_input_token_details_create(
      56,
      56,
      56
    );
  } else {
    realtime_response_usage_input_token_details = realtime_response_usage_input_token_details_create(
      56,
      56,
      56
    );
  }

  return realtime_response_usage_input_token_details;
}


#ifdef realtime_response_usage_input_token_details_MAIN

void test_realtime_response_usage_input_token_details(int include_optional) {
    realtime_response_usage_input_token_details_t* realtime_response_usage_input_token_details_1 = instantiate_realtime_response_usage_input_token_details(include_optional);

	cJSON* jsonrealtime_response_usage_input_token_details_1 = realtime_response_usage_input_token_details_convertToJSON(realtime_response_usage_input_token_details_1);
	printf("realtime_response_usage_input_token_details :\n%s\n", cJSON_Print(jsonrealtime_response_usage_input_token_details_1));
	realtime_response_usage_input_token_details_t* realtime_response_usage_input_token_details_2 = realtime_response_usage_input_token_details_parseFromJSON(jsonrealtime_response_usage_input_token_details_1);
	cJSON* jsonrealtime_response_usage_input_token_details_2 = realtime_response_usage_input_token_details_convertToJSON(realtime_response_usage_input_token_details_2);
	printf("repeating realtime_response_usage_input_token_details:\n%s\n", cJSON_Print(jsonrealtime_response_usage_input_token_details_2));
}

int main() {
  test_realtime_response_usage_input_token_details(1);
  test_realtime_response_usage_input_token_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_usage_input_token_details_MAIN
#endif // realtime_response_usage_input_token_details_TEST
