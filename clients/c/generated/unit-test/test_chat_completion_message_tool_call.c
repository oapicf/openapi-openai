#ifndef chat_completion_message_tool_call_TEST
#define chat_completion_message_tool_call_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_message_tool_call_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_message_tool_call.h"
chat_completion_message_tool_call_t* instantiate_chat_completion_message_tool_call(int include_optional);

#include "test_chat_completion_message_tool_call_function.c"


chat_completion_message_tool_call_t* instantiate_chat_completion_message_tool_call(int include_optional) {
  chat_completion_message_tool_call_t* chat_completion_message_tool_call = NULL;
  if (include_optional) {
    chat_completion_message_tool_call = chat_completion_message_tool_call_create(
      "0",
      openai_api_chat_completion_message_tool_call_TYPE_function,
       // false, not to have infinite recursion
      instantiate_chat_completion_message_tool_call_function(0)
    );
  } else {
    chat_completion_message_tool_call = chat_completion_message_tool_call_create(
      "0",
      openai_api_chat_completion_message_tool_call_TYPE_function,
      NULL
    );
  }

  return chat_completion_message_tool_call;
}


#ifdef chat_completion_message_tool_call_MAIN

void test_chat_completion_message_tool_call(int include_optional) {
    chat_completion_message_tool_call_t* chat_completion_message_tool_call_1 = instantiate_chat_completion_message_tool_call(include_optional);

	cJSON* jsonchat_completion_message_tool_call_1 = chat_completion_message_tool_call_convertToJSON(chat_completion_message_tool_call_1);
	printf("chat_completion_message_tool_call :\n%s\n", cJSON_Print(jsonchat_completion_message_tool_call_1));
	chat_completion_message_tool_call_t* chat_completion_message_tool_call_2 = chat_completion_message_tool_call_parseFromJSON(jsonchat_completion_message_tool_call_1);
	cJSON* jsonchat_completion_message_tool_call_2 = chat_completion_message_tool_call_convertToJSON(chat_completion_message_tool_call_2);
	printf("repeating chat_completion_message_tool_call:\n%s\n", cJSON_Print(jsonchat_completion_message_tool_call_2));
}

int main() {
  test_chat_completion_message_tool_call(1);
  test_chat_completion_message_tool_call(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_message_tool_call_MAIN
#endif // chat_completion_message_tool_call_TEST
