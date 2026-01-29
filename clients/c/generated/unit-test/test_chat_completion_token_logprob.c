#ifndef chat_completion_token_logprob_TEST
#define chat_completion_token_logprob_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_token_logprob_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_token_logprob.h"
chat_completion_token_logprob_t* instantiate_chat_completion_token_logprob(int include_optional);



chat_completion_token_logprob_t* instantiate_chat_completion_token_logprob(int include_optional) {
  chat_completion_token_logprob_t* chat_completion_token_logprob = NULL;
  if (include_optional) {
    chat_completion_token_logprob = chat_completion_token_logprob_create(
      "0",
      1.337,
      list_createList(),
      list_createList()
    );
  } else {
    chat_completion_token_logprob = chat_completion_token_logprob_create(
      "0",
      1.337,
      list_createList(),
      list_createList()
    );
  }

  return chat_completion_token_logprob;
}


#ifdef chat_completion_token_logprob_MAIN

void test_chat_completion_token_logprob(int include_optional) {
    chat_completion_token_logprob_t* chat_completion_token_logprob_1 = instantiate_chat_completion_token_logprob(include_optional);

	cJSON* jsonchat_completion_token_logprob_1 = chat_completion_token_logprob_convertToJSON(chat_completion_token_logprob_1);
	printf("chat_completion_token_logprob :\n%s\n", cJSON_Print(jsonchat_completion_token_logprob_1));
	chat_completion_token_logprob_t* chat_completion_token_logprob_2 = chat_completion_token_logprob_parseFromJSON(jsonchat_completion_token_logprob_1);
	cJSON* jsonchat_completion_token_logprob_2 = chat_completion_token_logprob_convertToJSON(chat_completion_token_logprob_2);
	printf("repeating chat_completion_token_logprob:\n%s\n", cJSON_Print(jsonchat_completion_token_logprob_2));
}

int main() {
  test_chat_completion_token_logprob(1);
  test_chat_completion_token_logprob(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_token_logprob_MAIN
#endif // chat_completion_token_logprob_TEST
