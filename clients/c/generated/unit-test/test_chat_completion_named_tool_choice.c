#ifndef chat_completion_named_tool_choice_TEST
#define chat_completion_named_tool_choice_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_named_tool_choice_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_named_tool_choice.h"
chat_completion_named_tool_choice_t* instantiate_chat_completion_named_tool_choice(int include_optional);

#include "test_chat_completion_named_tool_choice_function.c"


chat_completion_named_tool_choice_t* instantiate_chat_completion_named_tool_choice(int include_optional) {
  chat_completion_named_tool_choice_t* chat_completion_named_tool_choice = NULL;
  if (include_optional) {
    chat_completion_named_tool_choice = chat_completion_named_tool_choice_create(
      openai_api_chat_completion_named_tool_choice_TYPE_function,
       // false, not to have infinite recursion
      instantiate_chat_completion_named_tool_choice_function(0)
    );
  } else {
    chat_completion_named_tool_choice = chat_completion_named_tool_choice_create(
      openai_api_chat_completion_named_tool_choice_TYPE_function,
      NULL
    );
  }

  return chat_completion_named_tool_choice;
}


#ifdef chat_completion_named_tool_choice_MAIN

void test_chat_completion_named_tool_choice(int include_optional) {
    chat_completion_named_tool_choice_t* chat_completion_named_tool_choice_1 = instantiate_chat_completion_named_tool_choice(include_optional);

	cJSON* jsonchat_completion_named_tool_choice_1 = chat_completion_named_tool_choice_convertToJSON(chat_completion_named_tool_choice_1);
	printf("chat_completion_named_tool_choice :\n%s\n", cJSON_Print(jsonchat_completion_named_tool_choice_1));
	chat_completion_named_tool_choice_t* chat_completion_named_tool_choice_2 = chat_completion_named_tool_choice_parseFromJSON(jsonchat_completion_named_tool_choice_1);
	cJSON* jsonchat_completion_named_tool_choice_2 = chat_completion_named_tool_choice_convertToJSON(chat_completion_named_tool_choice_2);
	printf("repeating chat_completion_named_tool_choice:\n%s\n", cJSON_Print(jsonchat_completion_named_tool_choice_2));
}

int main() {
  test_chat_completion_named_tool_choice(1);
  test_chat_completion_named_tool_choice(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_named_tool_choice_MAIN
#endif // chat_completion_named_tool_choice_TEST
