#ifndef realtime_client_event_response_cancel_TEST
#define realtime_client_event_response_cancel_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_response_cancel_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_response_cancel.h"
realtime_client_event_response_cancel_t* instantiate_realtime_client_event_response_cancel(int include_optional);



realtime_client_event_response_cancel_t* instantiate_realtime_client_event_response_cancel(int include_optional) {
  realtime_client_event_response_cancel_t* realtime_client_event_response_cancel = NULL;
  if (include_optional) {
    realtime_client_event_response_cancel = realtime_client_event_response_cancel_create(
      "0",
      openai_api_realtime_client_event_response_cancel_TYPE_response.cancel,
      "0"
    );
  } else {
    realtime_client_event_response_cancel = realtime_client_event_response_cancel_create(
      "0",
      openai_api_realtime_client_event_response_cancel_TYPE_response.cancel,
      "0"
    );
  }

  return realtime_client_event_response_cancel;
}


#ifdef realtime_client_event_response_cancel_MAIN

void test_realtime_client_event_response_cancel(int include_optional) {
    realtime_client_event_response_cancel_t* realtime_client_event_response_cancel_1 = instantiate_realtime_client_event_response_cancel(include_optional);

	cJSON* jsonrealtime_client_event_response_cancel_1 = realtime_client_event_response_cancel_convertToJSON(realtime_client_event_response_cancel_1);
	printf("realtime_client_event_response_cancel :\n%s\n", cJSON_Print(jsonrealtime_client_event_response_cancel_1));
	realtime_client_event_response_cancel_t* realtime_client_event_response_cancel_2 = realtime_client_event_response_cancel_parseFromJSON(jsonrealtime_client_event_response_cancel_1);
	cJSON* jsonrealtime_client_event_response_cancel_2 = realtime_client_event_response_cancel_convertToJSON(realtime_client_event_response_cancel_2);
	printf("repeating realtime_client_event_response_cancel:\n%s\n", cJSON_Print(jsonrealtime_client_event_response_cancel_2));
}

int main() {
  test_realtime_client_event_response_cancel(1);
  test_realtime_client_event_response_cancel(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_response_cancel_MAIN
#endif // realtime_client_event_response_cancel_TEST
