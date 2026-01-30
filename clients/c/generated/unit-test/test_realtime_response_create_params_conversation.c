#ifndef realtime_response_create_params_conversation_TEST
#define realtime_response_create_params_conversation_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_response_create_params_conversation_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_response_create_params_conversation.h"
realtime_response_create_params_conversation_t* instantiate_realtime_response_create_params_conversation(int include_optional);



realtime_response_create_params_conversation_t* instantiate_realtime_response_create_params_conversation(int include_optional) {
  realtime_response_create_params_conversation_t* realtime_response_create_params_conversation = NULL;
  if (include_optional) {
    realtime_response_create_params_conversation = realtime_response_create_params_conversation_create(
    );
  } else {
    realtime_response_create_params_conversation = realtime_response_create_params_conversation_create(
    );
  }

  return realtime_response_create_params_conversation;
}


#ifdef realtime_response_create_params_conversation_MAIN

void test_realtime_response_create_params_conversation(int include_optional) {
    realtime_response_create_params_conversation_t* realtime_response_create_params_conversation_1 = instantiate_realtime_response_create_params_conversation(include_optional);

	cJSON* jsonrealtime_response_create_params_conversation_1 = realtime_response_create_params_conversation_convertToJSON(realtime_response_create_params_conversation_1);
	printf("realtime_response_create_params_conversation :\n%s\n", cJSON_Print(jsonrealtime_response_create_params_conversation_1));
	realtime_response_create_params_conversation_t* realtime_response_create_params_conversation_2 = realtime_response_create_params_conversation_parseFromJSON(jsonrealtime_response_create_params_conversation_1);
	cJSON* jsonrealtime_response_create_params_conversation_2 = realtime_response_create_params_conversation_convertToJSON(realtime_response_create_params_conversation_2);
	printf("repeating realtime_response_create_params_conversation:\n%s\n", cJSON_Print(jsonrealtime_response_create_params_conversation_2));
}

int main() {
  test_realtime_response_create_params_conversation(1);
  test_realtime_response_create_params_conversation(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_response_create_params_conversation_MAIN
#endif // realtime_response_create_params_conversation_TEST
