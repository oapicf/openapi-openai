#ifndef chat_completion_named_tool_choice_function_TEST
#define chat_completion_named_tool_choice_function_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_named_tool_choice_function_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_named_tool_choice_function.h"
chat_completion_named_tool_choice_function_t* instantiate_chat_completion_named_tool_choice_function(int include_optional);



chat_completion_named_tool_choice_function_t* instantiate_chat_completion_named_tool_choice_function(int include_optional) {
  chat_completion_named_tool_choice_function_t* chat_completion_named_tool_choice_function = NULL;
  if (include_optional) {
    chat_completion_named_tool_choice_function = chat_completion_named_tool_choice_function_create(
      "0"
    );
  } else {
    chat_completion_named_tool_choice_function = chat_completion_named_tool_choice_function_create(
      "0"
    );
  }

  return chat_completion_named_tool_choice_function;
}


#ifdef chat_completion_named_tool_choice_function_MAIN

void test_chat_completion_named_tool_choice_function(int include_optional) {
    chat_completion_named_tool_choice_function_t* chat_completion_named_tool_choice_function_1 = instantiate_chat_completion_named_tool_choice_function(include_optional);

	cJSON* jsonchat_completion_named_tool_choice_function_1 = chat_completion_named_tool_choice_function_convertToJSON(chat_completion_named_tool_choice_function_1);
	printf("chat_completion_named_tool_choice_function :\n%s\n", cJSON_Print(jsonchat_completion_named_tool_choice_function_1));
	chat_completion_named_tool_choice_function_t* chat_completion_named_tool_choice_function_2 = chat_completion_named_tool_choice_function_parseFromJSON(jsonchat_completion_named_tool_choice_function_1);
	cJSON* jsonchat_completion_named_tool_choice_function_2 = chat_completion_named_tool_choice_function_convertToJSON(chat_completion_named_tool_choice_function_2);
	printf("repeating chat_completion_named_tool_choice_function:\n%s\n", cJSON_Print(jsonchat_completion_named_tool_choice_function_2));
}

int main() {
  test_chat_completion_named_tool_choice_function(1);
  test_chat_completion_named_tool_choice_function(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_named_tool_choice_function_MAIN
#endif // chat_completion_named_tool_choice_function_TEST
