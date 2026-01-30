#ifndef realtime_session_create_response_turn_detection_TEST
#define realtime_session_create_response_turn_detection_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_session_create_response_turn_detection_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_session_create_response_turn_detection.h"
realtime_session_create_response_turn_detection_t* instantiate_realtime_session_create_response_turn_detection(int include_optional);



realtime_session_create_response_turn_detection_t* instantiate_realtime_session_create_response_turn_detection(int include_optional) {
  realtime_session_create_response_turn_detection_t* realtime_session_create_response_turn_detection = NULL;
  if (include_optional) {
    realtime_session_create_response_turn_detection = realtime_session_create_response_turn_detection_create(
      "0",
      1.337,
      56,
      56
    );
  } else {
    realtime_session_create_response_turn_detection = realtime_session_create_response_turn_detection_create(
      "0",
      1.337,
      56,
      56
    );
  }

  return realtime_session_create_response_turn_detection;
}


#ifdef realtime_session_create_response_turn_detection_MAIN

void test_realtime_session_create_response_turn_detection(int include_optional) {
    realtime_session_create_response_turn_detection_t* realtime_session_create_response_turn_detection_1 = instantiate_realtime_session_create_response_turn_detection(include_optional);

	cJSON* jsonrealtime_session_create_response_turn_detection_1 = realtime_session_create_response_turn_detection_convertToJSON(realtime_session_create_response_turn_detection_1);
	printf("realtime_session_create_response_turn_detection :\n%s\n", cJSON_Print(jsonrealtime_session_create_response_turn_detection_1));
	realtime_session_create_response_turn_detection_t* realtime_session_create_response_turn_detection_2 = realtime_session_create_response_turn_detection_parseFromJSON(jsonrealtime_session_create_response_turn_detection_1);
	cJSON* jsonrealtime_session_create_response_turn_detection_2 = realtime_session_create_response_turn_detection_convertToJSON(realtime_session_create_response_turn_detection_2);
	printf("repeating realtime_session_create_response_turn_detection:\n%s\n", cJSON_Print(jsonrealtime_session_create_response_turn_detection_2));
}

int main() {
  test_realtime_session_create_response_turn_detection(1);
  test_realtime_session_create_response_turn_detection(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_session_create_response_turn_detection_MAIN
#endif // realtime_session_create_response_turn_detection_TEST
