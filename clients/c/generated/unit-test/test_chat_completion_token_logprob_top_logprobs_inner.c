#ifndef chat_completion_token_logprob_top_logprobs_inner_TEST
#define chat_completion_token_logprob_top_logprobs_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chat_completion_token_logprob_top_logprobs_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chat_completion_token_logprob_top_logprobs_inner.h"
chat_completion_token_logprob_top_logprobs_inner_t* instantiate_chat_completion_token_logprob_top_logprobs_inner(int include_optional);



chat_completion_token_logprob_top_logprobs_inner_t* instantiate_chat_completion_token_logprob_top_logprobs_inner(int include_optional) {
  chat_completion_token_logprob_top_logprobs_inner_t* chat_completion_token_logprob_top_logprobs_inner = NULL;
  if (include_optional) {
    chat_completion_token_logprob_top_logprobs_inner = chat_completion_token_logprob_top_logprobs_inner_create(
      "0",
      1.337,
      list_createList()
    );
  } else {
    chat_completion_token_logprob_top_logprobs_inner = chat_completion_token_logprob_top_logprobs_inner_create(
      "0",
      1.337,
      list_createList()
    );
  }

  return chat_completion_token_logprob_top_logprobs_inner;
}


#ifdef chat_completion_token_logprob_top_logprobs_inner_MAIN

void test_chat_completion_token_logprob_top_logprobs_inner(int include_optional) {
    chat_completion_token_logprob_top_logprobs_inner_t* chat_completion_token_logprob_top_logprobs_inner_1 = instantiate_chat_completion_token_logprob_top_logprobs_inner(include_optional);

	cJSON* jsonchat_completion_token_logprob_top_logprobs_inner_1 = chat_completion_token_logprob_top_logprobs_inner_convertToJSON(chat_completion_token_logprob_top_logprobs_inner_1);
	printf("chat_completion_token_logprob_top_logprobs_inner :\n%s\n", cJSON_Print(jsonchat_completion_token_logprob_top_logprobs_inner_1));
	chat_completion_token_logprob_top_logprobs_inner_t* chat_completion_token_logprob_top_logprobs_inner_2 = chat_completion_token_logprob_top_logprobs_inner_parseFromJSON(jsonchat_completion_token_logprob_top_logprobs_inner_1);
	cJSON* jsonchat_completion_token_logprob_top_logprobs_inner_2 = chat_completion_token_logprob_top_logprobs_inner_convertToJSON(chat_completion_token_logprob_top_logprobs_inner_2);
	printf("repeating chat_completion_token_logprob_top_logprobs_inner:\n%s\n", cJSON_Print(jsonchat_completion_token_logprob_top_logprobs_inner_2));
}

int main() {
  test_chat_completion_token_logprob_top_logprobs_inner(1);
  test_chat_completion_token_logprob_top_logprobs_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // chat_completion_token_logprob_top_logprobs_inner_MAIN
#endif // chat_completion_token_logprob_top_logprobs_inner_TEST
