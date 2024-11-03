#ifndef chat_completion_role_TEST
#define chat_completion_role_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_role_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_role.h"
chat_completion_role_t* instantiate_chat_completion_role(int include_optional);



chat_completion_role_t* instantiate_chat_completion_role(int include_optional) {
  chat_completion_role_t* chat_completion_role = NULL;
  if (include_optional) {
    chat_completion_role = chat_completion_role_create(
    );
  } else {
    chat_completion_role = chat_completion_role_create(
    );
  }

  return chat_completion_role;
}


#ifdef chat_completion_role_MAIN

void test_chat_completion_role(int include_optional) {
    chat_completion_role_t* chat_completion_role_1 = instantiate_chat_completion_role(include_optional);

	cJSON* jsonchat_completion_role_1 = chat_completion_role_convertToJSON(chat_completion_role_1);
	printf("chat_completion_role :\n%s\n", cJSON_Print(jsonchat_completion_role_1));
	chat_completion_role_t* chat_completion_role_2 = chat_completion_role_parseFromJSON(jsonchat_completion_role_1);
	cJSON* jsonchat_completion_role_2 = chat_completion_role_convertToJSON(chat_completion_role_2);
	printf("repeating chat_completion_role:\n%s\n", cJSON_Print(jsonchat_completion_role_2));
}

int main() {
  test_chat_completion_role(1);
  test_chat_completion_role(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_role_MAIN
#endif // chat_completion_role_TEST
