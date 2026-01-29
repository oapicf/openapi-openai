#ifndef chat_completion_tool_TEST
#define chat_completion_tool_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_tool_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_tool.h"
chat_completion_tool_t* instantiate_chat_completion_tool(int include_optional);

#include "test_function_object.c"


chat_completion_tool_t* instantiate_chat_completion_tool(int include_optional) {
  chat_completion_tool_t* chat_completion_tool = NULL;
  if (include_optional) {
    chat_completion_tool = chat_completion_tool_create(
      openai_api_chat_completion_tool_TYPE_function,
       // false, not to have infinite recursion
      instantiate_function_object(0)
    );
  } else {
    chat_completion_tool = chat_completion_tool_create(
      openai_api_chat_completion_tool_TYPE_function,
      NULL
    );
  }

  return chat_completion_tool;
}


#ifdef chat_completion_tool_MAIN

void test_chat_completion_tool(int include_optional) {
    chat_completion_tool_t* chat_completion_tool_1 = instantiate_chat_completion_tool(include_optional);

	cJSON* jsonchat_completion_tool_1 = chat_completion_tool_convertToJSON(chat_completion_tool_1);
	printf("chat_completion_tool :\n%s\n", cJSON_Print(jsonchat_completion_tool_1));
	chat_completion_tool_t* chat_completion_tool_2 = chat_completion_tool_parseFromJSON(jsonchat_completion_tool_1);
	cJSON* jsonchat_completion_tool_2 = chat_completion_tool_convertToJSON(chat_completion_tool_2);
	printf("repeating chat_completion_tool:\n%s\n", cJSON_Print(jsonchat_completion_tool_2));
}

int main() {
  test_chat_completion_tool(1);
  test_chat_completion_tool(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_tool_MAIN
#endif // chat_completion_tool_TEST
