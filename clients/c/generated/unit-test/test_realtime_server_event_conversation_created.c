#ifndef realtime_server_event_conversation_created_TEST
#define realtime_server_event_conversation_created_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_conversation_created_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_conversation_created.h"
realtime_server_event_conversation_created_t* instantiate_realtime_server_event_conversation_created(int include_optional);

#include "test_realtime_server_event_conversation_created_conversation.c"


realtime_server_event_conversation_created_t* instantiate_realtime_server_event_conversation_created(int include_optional) {
  realtime_server_event_conversation_created_t* realtime_server_event_conversation_created = NULL;
  if (include_optional) {
    realtime_server_event_conversation_created = realtime_server_event_conversation_created_create(
      "0",
      openai_api_realtime_server_event_conversation_created_TYPE_conversation.created,
       // false, not to have infinite recursion
      instantiate_realtime_server_event_conversation_created_conversation(0)
    );
  } else {
    realtime_server_event_conversation_created = realtime_server_event_conversation_created_create(
      "0",
      openai_api_realtime_server_event_conversation_created_TYPE_conversation.created,
      NULL
    );
  }

  return realtime_server_event_conversation_created;
}


#ifdef realtime_server_event_conversation_created_MAIN

void test_realtime_server_event_conversation_created(int include_optional) {
    realtime_server_event_conversation_created_t* realtime_server_event_conversation_created_1 = instantiate_realtime_server_event_conversation_created(include_optional);

	cJSON* jsonrealtime_server_event_conversation_created_1 = realtime_server_event_conversation_created_convertToJSON(realtime_server_event_conversation_created_1);
	printf("realtime_server_event_conversation_created :\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_created_1));
	realtime_server_event_conversation_created_t* realtime_server_event_conversation_created_2 = realtime_server_event_conversation_created_parseFromJSON(jsonrealtime_server_event_conversation_created_1);
	cJSON* jsonrealtime_server_event_conversation_created_2 = realtime_server_event_conversation_created_convertToJSON(realtime_server_event_conversation_created_2);
	printf("repeating realtime_server_event_conversation_created:\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_created_2));
}

int main() {
  test_realtime_server_event_conversation_created(1);
  test_realtime_server_event_conversation_created(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_conversation_created_MAIN
#endif // realtime_server_event_conversation_created_TEST
