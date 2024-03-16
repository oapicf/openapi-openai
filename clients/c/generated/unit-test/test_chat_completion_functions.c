#ifndef chat_completion_functions_TEST
#define chat_completion_functions_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_functions_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_functions.h"
chat_completion_functions_t* instantiate_chat_completion_functions(int include_optional);



chat_completion_functions_t* instantiate_chat_completion_functions(int include_optional) {
  chat_completion_functions_t* chat_completion_functions = NULL;
  if (include_optional) {
    chat_completion_functions = chat_completion_functions_create(
      "0",
      "0",
      list_createList()
    );
  } else {
    chat_completion_functions = chat_completion_functions_create(
      "0",
      "0",
      list_createList()
    );
  }

  return chat_completion_functions;
}


#ifdef chat_completion_functions_MAIN

void test_chat_completion_functions(int include_optional) {
    chat_completion_functions_t* chat_completion_functions_1 = instantiate_chat_completion_functions(include_optional);

	cJSON* jsonchat_completion_functions_1 = chat_completion_functions_convertToJSON(chat_completion_functions_1);
	printf("chat_completion_functions :\n%s\n", cJSON_Print(jsonchat_completion_functions_1));
	chat_completion_functions_t* chat_completion_functions_2 = chat_completion_functions_parseFromJSON(jsonchat_completion_functions_1);
	cJSON* jsonchat_completion_functions_2 = chat_completion_functions_convertToJSON(chat_completion_functions_2);
	printf("repeating chat_completion_functions:\n%s\n", cJSON_Print(jsonchat_completion_functions_2));
}

int main() {
  test_chat_completion_functions(1);
  test_chat_completion_functions(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_functions_MAIN
#endif // chat_completion_functions_TEST
