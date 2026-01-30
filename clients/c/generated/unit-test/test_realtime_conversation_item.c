#ifndef realtime_conversation_item_TEST
#define realtime_conversation_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_conversation_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_conversation_item.h"
realtime_conversation_item_t* instantiate_realtime_conversation_item(int include_optional);



realtime_conversation_item_t* instantiate_realtime_conversation_item(int include_optional) {
  realtime_conversation_item_t* realtime_conversation_item = NULL;
  if (include_optional) {
    realtime_conversation_item = realtime_conversation_item_create(
      "0",
      openai_api_realtime_conversation_item_TYPE_message,
      openai_api_realtime_conversation_item_OBJECT_realtime.item,
      openai_api_realtime_conversation_item_STATUS_completed,
      openai_api_realtime_conversation_item_ROLE_user,
      list_createList(),
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    realtime_conversation_item = realtime_conversation_item_create(
      "0",
      openai_api_realtime_conversation_item_TYPE_message,
      openai_api_realtime_conversation_item_OBJECT_realtime.item,
      openai_api_realtime_conversation_item_STATUS_completed,
      openai_api_realtime_conversation_item_ROLE_user,
      list_createList(),
      "0",
      "0",
      "0",
      "0"
    );
  }

  return realtime_conversation_item;
}


#ifdef realtime_conversation_item_MAIN

void test_realtime_conversation_item(int include_optional) {
    realtime_conversation_item_t* realtime_conversation_item_1 = instantiate_realtime_conversation_item(include_optional);

	cJSON* jsonrealtime_conversation_item_1 = realtime_conversation_item_convertToJSON(realtime_conversation_item_1);
	printf("realtime_conversation_item :\n%s\n", cJSON_Print(jsonrealtime_conversation_item_1));
	realtime_conversation_item_t* realtime_conversation_item_2 = realtime_conversation_item_parseFromJSON(jsonrealtime_conversation_item_1);
	cJSON* jsonrealtime_conversation_item_2 = realtime_conversation_item_convertToJSON(realtime_conversation_item_2);
	printf("repeating realtime_conversation_item:\n%s\n", cJSON_Print(jsonrealtime_conversation_item_2));
}

int main() {
  test_realtime_conversation_item(1);
  test_realtime_conversation_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_conversation_item_MAIN
#endif // realtime_conversation_item_TEST
