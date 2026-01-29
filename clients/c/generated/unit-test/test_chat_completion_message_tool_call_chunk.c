#ifndef chat_completion_message_tool_call_chunk_TEST
#define chat_completion_message_tool_call_chunk_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_message_tool_call_chunk_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_message_tool_call_chunk.h"
chat_completion_message_tool_call_chunk_t* instantiate_chat_completion_message_tool_call_chunk(int include_optional);

#include "test_chat_completion_message_tool_call_chunk_function.c"


chat_completion_message_tool_call_chunk_t* instantiate_chat_completion_message_tool_call_chunk(int include_optional) {
  chat_completion_message_tool_call_chunk_t* chat_completion_message_tool_call_chunk = NULL;
  if (include_optional) {
    chat_completion_message_tool_call_chunk = chat_completion_message_tool_call_chunk_create(
      56,
      "0",
      openai_api_chat_completion_message_tool_call_chunk_TYPE_function,
       // false, not to have infinite recursion
      instantiate_chat_completion_message_tool_call_chunk_function(0)
    );
  } else {
    chat_completion_message_tool_call_chunk = chat_completion_message_tool_call_chunk_create(
      56,
      "0",
      openai_api_chat_completion_message_tool_call_chunk_TYPE_function,
      NULL
    );
  }

  return chat_completion_message_tool_call_chunk;
}


#ifdef chat_completion_message_tool_call_chunk_MAIN

void test_chat_completion_message_tool_call_chunk(int include_optional) {
    chat_completion_message_tool_call_chunk_t* chat_completion_message_tool_call_chunk_1 = instantiate_chat_completion_message_tool_call_chunk(include_optional);

	cJSON* jsonchat_completion_message_tool_call_chunk_1 = chat_completion_message_tool_call_chunk_convertToJSON(chat_completion_message_tool_call_chunk_1);
	printf("chat_completion_message_tool_call_chunk :\n%s\n", cJSON_Print(jsonchat_completion_message_tool_call_chunk_1));
	chat_completion_message_tool_call_chunk_t* chat_completion_message_tool_call_chunk_2 = chat_completion_message_tool_call_chunk_parseFromJSON(jsonchat_completion_message_tool_call_chunk_1);
	cJSON* jsonchat_completion_message_tool_call_chunk_2 = chat_completion_message_tool_call_chunk_convertToJSON(chat_completion_message_tool_call_chunk_2);
	printf("repeating chat_completion_message_tool_call_chunk:\n%s\n", cJSON_Print(jsonchat_completion_message_tool_call_chunk_2));
}

int main() {
  test_chat_completion_message_tool_call_chunk(1);
  test_chat_completion_message_tool_call_chunk(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_message_tool_call_chunk_MAIN
#endif // chat_completion_message_tool_call_chunk_TEST
