#ifndef realtime_server_event_conversation_item_truncated_TEST
#define realtime_server_event_conversation_item_truncated_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_conversation_item_truncated_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_conversation_item_truncated.h"
realtime_server_event_conversation_item_truncated_t* instantiate_realtime_server_event_conversation_item_truncated(int include_optional);



realtime_server_event_conversation_item_truncated_t* instantiate_realtime_server_event_conversation_item_truncated(int include_optional) {
  realtime_server_event_conversation_item_truncated_t* realtime_server_event_conversation_item_truncated = NULL;
  if (include_optional) {
    realtime_server_event_conversation_item_truncated = realtime_server_event_conversation_item_truncated_create(
      "0",
      openai_api_realtime_server_event_conversation_item_truncated_TYPE_conversation.item.truncated,
      "0",
      56,
      56
    );
  } else {
    realtime_server_event_conversation_item_truncated = realtime_server_event_conversation_item_truncated_create(
      "0",
      openai_api_realtime_server_event_conversation_item_truncated_TYPE_conversation.item.truncated,
      "0",
      56,
      56
    );
  }

  return realtime_server_event_conversation_item_truncated;
}


#ifdef realtime_server_event_conversation_item_truncated_MAIN

void test_realtime_server_event_conversation_item_truncated(int include_optional) {
    realtime_server_event_conversation_item_truncated_t* realtime_server_event_conversation_item_truncated_1 = instantiate_realtime_server_event_conversation_item_truncated(include_optional);

	cJSON* jsonrealtime_server_event_conversation_item_truncated_1 = realtime_server_event_conversation_item_truncated_convertToJSON(realtime_server_event_conversation_item_truncated_1);
	printf("realtime_server_event_conversation_item_truncated :\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_item_truncated_1));
	realtime_server_event_conversation_item_truncated_t* realtime_server_event_conversation_item_truncated_2 = realtime_server_event_conversation_item_truncated_parseFromJSON(jsonrealtime_server_event_conversation_item_truncated_1);
	cJSON* jsonrealtime_server_event_conversation_item_truncated_2 = realtime_server_event_conversation_item_truncated_convertToJSON(realtime_server_event_conversation_item_truncated_2);
	printf("repeating realtime_server_event_conversation_item_truncated:\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_item_truncated_2));
}

int main() {
  test_realtime_server_event_conversation_item_truncated(1);
  test_realtime_server_event_conversation_item_truncated(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_conversation_item_truncated_MAIN
#endif // realtime_server_event_conversation_item_truncated_TEST
