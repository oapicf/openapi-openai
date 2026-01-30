#ifndef realtime_server_event_rate_limits_updated_rate_limits_inner_TEST
#define realtime_server_event_rate_limits_updated_rate_limits_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_rate_limits_updated_rate_limits_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_rate_limits_updated_rate_limits_inner.h"
realtime_server_event_rate_limits_updated_rate_limits_inner_t* instantiate_realtime_server_event_rate_limits_updated_rate_limits_inner(int include_optional);



realtime_server_event_rate_limits_updated_rate_limits_inner_t* instantiate_realtime_server_event_rate_limits_updated_rate_limits_inner(int include_optional) {
  realtime_server_event_rate_limits_updated_rate_limits_inner_t* realtime_server_event_rate_limits_updated_rate_limits_inner = NULL;
  if (include_optional) {
    realtime_server_event_rate_limits_updated_rate_limits_inner = realtime_server_event_rate_limits_updated_rate_limits_inner_create(
      openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_requests,
      56,
      56,
      1.337
    );
  } else {
    realtime_server_event_rate_limits_updated_rate_limits_inner = realtime_server_event_rate_limits_updated_rate_limits_inner_create(
      openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_requests,
      56,
      56,
      1.337
    );
  }

  return realtime_server_event_rate_limits_updated_rate_limits_inner;
}


#ifdef realtime_server_event_rate_limits_updated_rate_limits_inner_MAIN

void test_realtime_server_event_rate_limits_updated_rate_limits_inner(int include_optional) {
    realtime_server_event_rate_limits_updated_rate_limits_inner_t* realtime_server_event_rate_limits_updated_rate_limits_inner_1 = instantiate_realtime_server_event_rate_limits_updated_rate_limits_inner(include_optional);

	cJSON* jsonrealtime_server_event_rate_limits_updated_rate_limits_inner_1 = realtime_server_event_rate_limits_updated_rate_limits_inner_convertToJSON(realtime_server_event_rate_limits_updated_rate_limits_inner_1);
	printf("realtime_server_event_rate_limits_updated_rate_limits_inner :\n%s\n", cJSON_Print(jsonrealtime_server_event_rate_limits_updated_rate_limits_inner_1));
	realtime_server_event_rate_limits_updated_rate_limits_inner_t* realtime_server_event_rate_limits_updated_rate_limits_inner_2 = realtime_server_event_rate_limits_updated_rate_limits_inner_parseFromJSON(jsonrealtime_server_event_rate_limits_updated_rate_limits_inner_1);
	cJSON* jsonrealtime_server_event_rate_limits_updated_rate_limits_inner_2 = realtime_server_event_rate_limits_updated_rate_limits_inner_convertToJSON(realtime_server_event_rate_limits_updated_rate_limits_inner_2);
	printf("repeating realtime_server_event_rate_limits_updated_rate_limits_inner:\n%s\n", cJSON_Print(jsonrealtime_server_event_rate_limits_updated_rate_limits_inner_2));
}

int main() {
  test_realtime_server_event_rate_limits_updated_rate_limits_inner(1);
  test_realtime_server_event_rate_limits_updated_rate_limits_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_rate_limits_updated_rate_limits_inner_MAIN
#endif // realtime_server_event_rate_limits_updated_rate_limits_inner_TEST
