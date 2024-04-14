#ifndef chat_completion_function_call_option_TEST
#define chat_completion_function_call_option_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_function_call_option_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_function_call_option.h"
chat_completion_function_call_option_t* instantiate_chat_completion_function_call_option(int include_optional);



chat_completion_function_call_option_t* instantiate_chat_completion_function_call_option(int include_optional) {
  chat_completion_function_call_option_t* chat_completion_function_call_option = NULL;
  if (include_optional) {
    chat_completion_function_call_option = chat_completion_function_call_option_create(
      "0"
    );
  } else {
    chat_completion_function_call_option = chat_completion_function_call_option_create(
      "0"
    );
  }

  return chat_completion_function_call_option;
}


#ifdef chat_completion_function_call_option_MAIN

void test_chat_completion_function_call_option(int include_optional) {
    chat_completion_function_call_option_t* chat_completion_function_call_option_1 = instantiate_chat_completion_function_call_option(include_optional);

	cJSON* jsonchat_completion_function_call_option_1 = chat_completion_function_call_option_convertToJSON(chat_completion_function_call_option_1);
	printf("chat_completion_function_call_option :\n%s\n", cJSON_Print(jsonchat_completion_function_call_option_1));
	chat_completion_function_call_option_t* chat_completion_function_call_option_2 = chat_completion_function_call_option_parseFromJSON(jsonchat_completion_function_call_option_1);
	cJSON* jsonchat_completion_function_call_option_2 = chat_completion_function_call_option_convertToJSON(chat_completion_function_call_option_2);
	printf("repeating chat_completion_function_call_option:\n%s\n", cJSON_Print(jsonchat_completion_function_call_option_2));
}

int main() {
  test_chat_completion_function_call_option(1);
  test_chat_completion_function_call_option(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_function_call_option_MAIN
#endif // chat_completion_function_call_option_TEST
