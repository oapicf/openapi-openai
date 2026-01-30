#ifndef realtime_server_event_response_output_item_added_TEST
#define realtime_server_event_response_output_item_added_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_response_output_item_added_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_response_output_item_added.h"
realtime_server_event_response_output_item_added_t* instantiate_realtime_server_event_response_output_item_added(int include_optional);

#include "test_realtime_conversation_item.c"


realtime_server_event_response_output_item_added_t* instantiate_realtime_server_event_response_output_item_added(int include_optional) {
  realtime_server_event_response_output_item_added_t* realtime_server_event_response_output_item_added = NULL;
  if (include_optional) {
    realtime_server_event_response_output_item_added = realtime_server_event_response_output_item_added_create(
      "0",
      openai_api_realtime_server_event_response_output_item_added_TYPE_response.output_item.added,
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_realtime_conversation_item(0)
    );
  } else {
    realtime_server_event_response_output_item_added = realtime_server_event_response_output_item_added_create(
      "0",
      openai_api_realtime_server_event_response_output_item_added_TYPE_response.output_item.added,
      "0",
      56,
      NULL
    );
  }

  return realtime_server_event_response_output_item_added;
}


#ifdef realtime_server_event_response_output_item_added_MAIN

void test_realtime_server_event_response_output_item_added(int include_optional) {
    realtime_server_event_response_output_item_added_t* realtime_server_event_response_output_item_added_1 = instantiate_realtime_server_event_response_output_item_added(include_optional);

	cJSON* jsonrealtime_server_event_response_output_item_added_1 = realtime_server_event_response_output_item_added_convertToJSON(realtime_server_event_response_output_item_added_1);
	printf("realtime_server_event_response_output_item_added :\n%s\n", cJSON_Print(jsonrealtime_server_event_response_output_item_added_1));
	realtime_server_event_response_output_item_added_t* realtime_server_event_response_output_item_added_2 = realtime_server_event_response_output_item_added_parseFromJSON(jsonrealtime_server_event_response_output_item_added_1);
	cJSON* jsonrealtime_server_event_response_output_item_added_2 = realtime_server_event_response_output_item_added_convertToJSON(realtime_server_event_response_output_item_added_2);
	printf("repeating realtime_server_event_response_output_item_added:\n%s\n", cJSON_Print(jsonrealtime_server_event_response_output_item_added_2));
}

int main() {
  test_realtime_server_event_response_output_item_added(1);
  test_realtime_server_event_response_output_item_added(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_response_output_item_added_MAIN
#endif // realtime_server_event_response_output_item_added_TEST
