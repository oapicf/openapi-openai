#ifndef realtime_server_event_rate_limits_updated_TEST
#define realtime_server_event_rate_limits_updated_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_rate_limits_updated_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_rate_limits_updated.h"
realtime_server_event_rate_limits_updated_t* instantiate_realtime_server_event_rate_limits_updated(int include_optional);



realtime_server_event_rate_limits_updated_t* instantiate_realtime_server_event_rate_limits_updated(int include_optional) {
  realtime_server_event_rate_limits_updated_t* realtime_server_event_rate_limits_updated = NULL;
  if (include_optional) {
    realtime_server_event_rate_limits_updated = realtime_server_event_rate_limits_updated_create(
      "0",
      openai_api_realtime_server_event_rate_limits_updated_TYPE_rate_limits.updated,
      list_createList()
    );
  } else {
    realtime_server_event_rate_limits_updated = realtime_server_event_rate_limits_updated_create(
      "0",
      openai_api_realtime_server_event_rate_limits_updated_TYPE_rate_limits.updated,
      list_createList()
    );
  }

  return realtime_server_event_rate_limits_updated;
}


#ifdef realtime_server_event_rate_limits_updated_MAIN

void test_realtime_server_event_rate_limits_updated(int include_optional) {
    realtime_server_event_rate_limits_updated_t* realtime_server_event_rate_limits_updated_1 = instantiate_realtime_server_event_rate_limits_updated(include_optional);

	cJSON* jsonrealtime_server_event_rate_limits_updated_1 = realtime_server_event_rate_limits_updated_convertToJSON(realtime_server_event_rate_limits_updated_1);
	printf("realtime_server_event_rate_limits_updated :\n%s\n", cJSON_Print(jsonrealtime_server_event_rate_limits_updated_1));
	realtime_server_event_rate_limits_updated_t* realtime_server_event_rate_limits_updated_2 = realtime_server_event_rate_limits_updated_parseFromJSON(jsonrealtime_server_event_rate_limits_updated_1);
	cJSON* jsonrealtime_server_event_rate_limits_updated_2 = realtime_server_event_rate_limits_updated_convertToJSON(realtime_server_event_rate_limits_updated_2);
	printf("repeating realtime_server_event_rate_limits_updated:\n%s\n", cJSON_Print(jsonrealtime_server_event_rate_limits_updated_2));
}

int main() {
  test_realtime_server_event_rate_limits_updated(1);
  test_realtime_server_event_rate_limits_updated(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_rate_limits_updated_MAIN
#endif // realtime_server_event_rate_limits_updated_TEST
