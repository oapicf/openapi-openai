#ifndef realtime_conversation_item_content_inner_TEST
#define realtime_conversation_item_content_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define realtime_conversation_item_content_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/realtime_conversation_item_content_inner.h"
realtime_conversation_item_content_inner_t* instantiate_realtime_conversation_item_content_inner(int include_optional);



realtime_conversation_item_content_inner_t* instantiate_realtime_conversation_item_content_inner(int include_optional) {
  realtime_conversation_item_content_inner_t* realtime_conversation_item_content_inner = NULL;
  if (include_optional) {
    realtime_conversation_item_content_inner = realtime_conversation_item_content_inner_create(
      openai_api_realtime_conversation_item_content_inner_TYPE_input_audio,
      "0",
      "0",
      "0",
      "0"
    );
  } else {
    realtime_conversation_item_content_inner = realtime_conversation_item_content_inner_create(
      openai_api_realtime_conversation_item_content_inner_TYPE_input_audio,
      "0",
      "0",
      "0",
      "0"
    );
  }

  return realtime_conversation_item_content_inner;
}


#ifdef realtime_conversation_item_content_inner_MAIN

void test_realtime_conversation_item_content_inner(int include_optional) {
    realtime_conversation_item_content_inner_t* realtime_conversation_item_content_inner_1 = instantiate_realtime_conversation_item_content_inner(include_optional);

	cJSON* jsonrealtime_conversation_item_content_inner_1 = realtime_conversation_item_content_inner_convertToJSON(realtime_conversation_item_content_inner_1);
	printf("realtime_conversation_item_content_inner :\n%s\n", cJSON_Print(jsonrealtime_conversation_item_content_inner_1));
	realtime_conversation_item_content_inner_t* realtime_conversation_item_content_inner_2 = realtime_conversation_item_content_inner_parseFromJSON(jsonrealtime_conversation_item_content_inner_1);
	cJSON* jsonrealtime_conversation_item_content_inner_2 = realtime_conversation_item_content_inner_convertToJSON(realtime_conversation_item_content_inner_2);
	printf("repeating realtime_conversation_item_content_inner:\n%s\n", cJSON_Print(jsonrealtime_conversation_item_content_inner_2));
}

int main() {
  test_realtime_conversation_item_content_inner(1);
  test_realtime_conversation_item_content_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // realtime_conversation_item_content_inner_MAIN
#endif // realtime_conversation_item_content_inner_TEST
