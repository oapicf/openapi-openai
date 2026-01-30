#ifndef realtime_server_event_conversation_item_deleted_TEST
#define realtime_server_event_conversation_item_deleted_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_conversation_item_deleted_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_conversation_item_deleted.h"
realtime_server_event_conversation_item_deleted_t* instantiate_realtime_server_event_conversation_item_deleted(int include_optional);



realtime_server_event_conversation_item_deleted_t* instantiate_realtime_server_event_conversation_item_deleted(int include_optional) {
  realtime_server_event_conversation_item_deleted_t* realtime_server_event_conversation_item_deleted = NULL;
  if (include_optional) {
    realtime_server_event_conversation_item_deleted = realtime_server_event_conversation_item_deleted_create(
      "0",
      openai_api_realtime_server_event_conversation_item_deleted_TYPE_conversation.item.deleted,
      "0"
    );
  } else {
    realtime_server_event_conversation_item_deleted = realtime_server_event_conversation_item_deleted_create(
      "0",
      openai_api_realtime_server_event_conversation_item_deleted_TYPE_conversation.item.deleted,
      "0"
    );
  }

  return realtime_server_event_conversation_item_deleted;
}


#ifdef realtime_server_event_conversation_item_deleted_MAIN

void test_realtime_server_event_conversation_item_deleted(int include_optional) {
    realtime_server_event_conversation_item_deleted_t* realtime_server_event_conversation_item_deleted_1 = instantiate_realtime_server_event_conversation_item_deleted(include_optional);

	cJSON* jsonrealtime_server_event_conversation_item_deleted_1 = realtime_server_event_conversation_item_deleted_convertToJSON(realtime_server_event_conversation_item_deleted_1);
	printf("realtime_server_event_conversation_item_deleted :\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_item_deleted_1));
	realtime_server_event_conversation_item_deleted_t* realtime_server_event_conversation_item_deleted_2 = realtime_server_event_conversation_item_deleted_parseFromJSON(jsonrealtime_server_event_conversation_item_deleted_1);
	cJSON* jsonrealtime_server_event_conversation_item_deleted_2 = realtime_server_event_conversation_item_deleted_convertToJSON(realtime_server_event_conversation_item_deleted_2);
	printf("repeating realtime_server_event_conversation_item_deleted:\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_item_deleted_2));
}

int main() {
  test_realtime_server_event_conversation_item_deleted(1);
  test_realtime_server_event_conversation_item_deleted(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_conversation_item_deleted_MAIN
#endif // realtime_server_event_conversation_item_deleted_TEST
