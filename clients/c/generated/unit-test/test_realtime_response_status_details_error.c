#ifndef realtime_response_status_details_error_TEST
#define realtime_response_status_details_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_status_details_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_status_details_error.h"
realtime_response_status_details_error_t* instantiate_realtime_response_status_details_error(int include_optional);



realtime_response_status_details_error_t* instantiate_realtime_response_status_details_error(int include_optional) {
  realtime_response_status_details_error_t* realtime_response_status_details_error = NULL;
  if (include_optional) {
    realtime_response_status_details_error = realtime_response_status_details_error_create(
      "0",
      "0"
    );
  } else {
    realtime_response_status_details_error = realtime_response_status_details_error_create(
      "0",
      "0"
    );
  }

  return realtime_response_status_details_error;
}


#ifdef realtime_response_status_details_error_MAIN

void test_realtime_response_status_details_error(int include_optional) {
    realtime_response_status_details_error_t* realtime_response_status_details_error_1 = instantiate_realtime_response_status_details_error(include_optional);

	cJSON* jsonrealtime_response_status_details_error_1 = realtime_response_status_details_error_convertToJSON(realtime_response_status_details_error_1);
	printf("realtime_response_status_details_error :\n%s\n", cJSON_Print(jsonrealtime_response_status_details_error_1));
	realtime_response_status_details_error_t* realtime_response_status_details_error_2 = realtime_response_status_details_error_parseFromJSON(jsonrealtime_response_status_details_error_1);
	cJSON* jsonrealtime_response_status_details_error_2 = realtime_response_status_details_error_convertToJSON(realtime_response_status_details_error_2);
	printf("repeating realtime_response_status_details_error:\n%s\n", cJSON_Print(jsonrealtime_response_status_details_error_2));
}

int main() {
  test_realtime_response_status_details_error(1);
  test_realtime_response_status_details_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_status_details_error_MAIN
#endif // realtime_response_status_details_error_TEST
