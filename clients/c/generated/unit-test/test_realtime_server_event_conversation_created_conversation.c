#ifndef realtime_server_event_conversation_created_conversation_TEST
#define realtime_server_event_conversation_created_conversation_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_server_event_conversation_created_conversation_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_server_event_conversation_created_conversation.h"
realtime_server_event_conversation_created_conversation_t* instantiate_realtime_server_event_conversation_created_conversation(int include_optional);



realtime_server_event_conversation_created_conversation_t* instantiate_realtime_server_event_conversation_created_conversation(int include_optional) {
  realtime_server_event_conversation_created_conversation_t* realtime_server_event_conversation_created_conversation = NULL;
  if (include_optional) {
    realtime_server_event_conversation_created_conversation = realtime_server_event_conversation_created_conversation_create(
      "0",
      "0"
    );
  } else {
    realtime_server_event_conversation_created_conversation = realtime_server_event_conversation_created_conversation_create(
      "0",
      "0"
    );
  }

  return realtime_server_event_conversation_created_conversation;
}


#ifdef realtime_server_event_conversation_created_conversation_MAIN

void test_realtime_server_event_conversation_created_conversation(int include_optional) {
    realtime_server_event_conversation_created_conversation_t* realtime_server_event_conversation_created_conversation_1 = instantiate_realtime_server_event_conversation_created_conversation(include_optional);

	cJSON* jsonrealtime_server_event_conversation_created_conversation_1 = realtime_server_event_conversation_created_conversation_convertToJSON(realtime_server_event_conversation_created_conversation_1);
	printf("realtime_server_event_conversation_created_conversation :\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_created_conversation_1));
	realtime_server_event_conversation_created_conversation_t* realtime_server_event_conversation_created_conversation_2 = realtime_server_event_conversation_created_conversation_parseFromJSON(jsonrealtime_server_event_conversation_created_conversation_1);
	cJSON* jsonrealtime_server_event_conversation_created_conversation_2 = realtime_server_event_conversation_created_conversation_convertToJSON(realtime_server_event_conversation_created_conversation_2);
	printf("repeating realtime_server_event_conversation_created_conversation:\n%s\n", cJSON_Print(jsonrealtime_server_event_conversation_created_conversation_2));
}

int main() {
  test_realtime_server_event_conversation_created_conversation(1);
  test_realtime_server_event_conversation_created_conversation(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_server_event_conversation_created_conversation_MAIN
#endif // realtime_server_event_conversation_created_conversation_TEST
