#ifndef realtime_server_event_response_text_delta_TEST
#define realtime_server_event_response_text_delta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_response_text_delta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_response_text_delta.h"
realtime_server_event_response_text_delta_t* instantiate_realtime_server_event_response_text_delta(int include_optional);



realtime_server_event_response_text_delta_t* instantiate_realtime_server_event_response_text_delta(int include_optional) {
  realtime_server_event_response_text_delta_t* realtime_server_event_response_text_delta = NULL;
  if (include_optional) {
    realtime_server_event_response_text_delta = realtime_server_event_response_text_delta_create(
      "0",
      openai_api_realtime_server_event_response_text_delta_TYPE_response.text.delta,
      "0",
      "0",
      56,
      56,
      "0"
    );
  } else {
    realtime_server_event_response_text_delta = realtime_server_event_response_text_delta_create(
      "0",
      openai_api_realtime_server_event_response_text_delta_TYPE_response.text.delta,
      "0",
      "0",
      56,
      56,
      "0"
    );
  }

  return realtime_server_event_response_text_delta;
}


#ifdef realtime_server_event_response_text_delta_MAIN

void test_realtime_server_event_response_text_delta(int include_optional) {
    realtime_server_event_response_text_delta_t* realtime_server_event_response_text_delta_1 = instantiate_realtime_server_event_response_text_delta(include_optional);

	cJSON* jsonrealtime_server_event_response_text_delta_1 = realtime_server_event_response_text_delta_convertToJSON(realtime_server_event_response_text_delta_1);
	printf("realtime_server_event_response_text_delta :\n%s\n", cJSON_Print(jsonrealtime_server_event_response_text_delta_1));
	realtime_server_event_response_text_delta_t* realtime_server_event_response_text_delta_2 = realtime_server_event_response_text_delta_parseFromJSON(jsonrealtime_server_event_response_text_delta_1);
	cJSON* jsonrealtime_server_event_response_text_delta_2 = realtime_server_event_response_text_delta_convertToJSON(realtime_server_event_response_text_delta_2);
	printf("repeating realtime_server_event_response_text_delta:\n%s\n", cJSON_Print(jsonrealtime_server_event_response_text_delta_2));
}

int main() {
  test_realtime_server_event_response_text_delta(1);
  test_realtime_server_event_response_text_delta(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_response_text_delta_MAIN
#endif // realtime_server_event_response_text_delta_TEST
