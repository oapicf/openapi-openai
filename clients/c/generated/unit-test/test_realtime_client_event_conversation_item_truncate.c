#ifndef realtime_client_event_conversation_item_truncate_TEST
#define realtime_client_event_conversation_item_truncate_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_conversation_item_truncate_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_conversation_item_truncate.h"
realtime_client_event_conversation_item_truncate_t* instantiate_realtime_client_event_conversation_item_truncate(int include_optional);



realtime_client_event_conversation_item_truncate_t* instantiate_realtime_client_event_conversation_item_truncate(int include_optional) {
  realtime_client_event_conversation_item_truncate_t* realtime_client_event_conversation_item_truncate = NULL;
  if (include_optional) {
    realtime_client_event_conversation_item_truncate = realtime_client_event_conversation_item_truncate_create(
      "0",
      openai_api_realtime_client_event_conversation_item_truncate_TYPE_conversation.item.truncate,
      "0",
      56,
      56
    );
  } else {
    realtime_client_event_conversation_item_truncate = realtime_client_event_conversation_item_truncate_create(
      "0",
      openai_api_realtime_client_event_conversation_item_truncate_TYPE_conversation.item.truncate,
      "0",
      56,
      56
    );
  }

  return realtime_client_event_conversation_item_truncate;
}


#ifdef realtime_client_event_conversation_item_truncate_MAIN

void test_realtime_client_event_conversation_item_truncate(int include_optional) {
    realtime_client_event_conversation_item_truncate_t* realtime_client_event_conversation_item_truncate_1 = instantiate_realtime_client_event_conversation_item_truncate(include_optional);

	cJSON* jsonrealtime_client_event_conversation_item_truncate_1 = realtime_client_event_conversation_item_truncate_convertToJSON(realtime_client_event_conversation_item_truncate_1);
	printf("realtime_client_event_conversation_item_truncate :\n%s\n", cJSON_Print(jsonrealtime_client_event_conversation_item_truncate_1));
	realtime_client_event_conversation_item_truncate_t* realtime_client_event_conversation_item_truncate_2 = realtime_client_event_conversation_item_truncate_parseFromJSON(jsonrealtime_client_event_conversation_item_truncate_1);
	cJSON* jsonrealtime_client_event_conversation_item_truncate_2 = realtime_client_event_conversation_item_truncate_convertToJSON(realtime_client_event_conversation_item_truncate_2);
	printf("repeating realtime_client_event_conversation_item_truncate:\n%s\n", cJSON_Print(jsonrealtime_client_event_conversation_item_truncate_2));
}

int main() {
  test_realtime_client_event_conversation_item_truncate(1);
  test_realtime_client_event_conversation_item_truncate(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_conversation_item_truncate_MAIN
#endif // realtime_client_event_conversation_item_truncate_TEST
