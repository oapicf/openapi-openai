#ifndef realtime_client_event_conversation_item_delete_TEST
#define realtime_client_event_conversation_item_delete_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_client_event_conversation_item_delete_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_client_event_conversation_item_delete.h"
realtime_client_event_conversation_item_delete_t* instantiate_realtime_client_event_conversation_item_delete(int include_optional);



realtime_client_event_conversation_item_delete_t* instantiate_realtime_client_event_conversation_item_delete(int include_optional) {
  realtime_client_event_conversation_item_delete_t* realtime_client_event_conversation_item_delete = NULL;
  if (include_optional) {
    realtime_client_event_conversation_item_delete = realtime_client_event_conversation_item_delete_create(
      "0",
      openai_api_realtime_client_event_conversation_item_delete_TYPE_conversation.item.delete,
      "0"
    );
  } else {
    realtime_client_event_conversation_item_delete = realtime_client_event_conversation_item_delete_create(
      "0",
      openai_api_realtime_client_event_conversation_item_delete_TYPE_conversation.item.delete,
      "0"
    );
  }

  return realtime_client_event_conversation_item_delete;
}


#ifdef realtime_client_event_conversation_item_delete_MAIN

void test_realtime_client_event_conversation_item_delete(int include_optional) {
    realtime_client_event_conversation_item_delete_t* realtime_client_event_conversation_item_delete_1 = instantiate_realtime_client_event_conversation_item_delete(include_optional);

	cJSON* jsonrealtime_client_event_conversation_item_delete_1 = realtime_client_event_conversation_item_delete_convertToJSON(realtime_client_event_conversation_item_delete_1);
	printf("realtime_client_event_conversation_item_delete :\n%s\n", cJSON_Print(jsonrealtime_client_event_conversation_item_delete_1));
	realtime_client_event_conversation_item_delete_t* realtime_client_event_conversation_item_delete_2 = realtime_client_event_conversation_item_delete_parseFromJSON(jsonrealtime_client_event_conversation_item_delete_1);
	cJSON* jsonrealtime_client_event_conversation_item_delete_2 = realtime_client_event_conversation_item_delete_convertToJSON(realtime_client_event_conversation_item_delete_2);
	printf("repeating realtime_client_event_conversation_item_delete:\n%s\n", cJSON_Print(jsonrealtime_client_event_conversation_item_delete_2));
}

int main() {
  test_realtime_client_event_conversation_item_delete(1);
  test_realtime_client_event_conversation_item_delete(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_client_event_conversation_item_delete_MAIN
#endif // realtime_client_event_conversation_item_delete_TEST
