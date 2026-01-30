#ifndef create_chat_completion_response_choices_inner_logprobs_TEST
#define create_chat_completion_response_choices_inner_logprobs_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_response_choices_inner_logprobs_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_response_choices_inner_logprobs.h"
create_chat_completion_response_choices_inner_logprobs_t* instantiate_create_chat_completion_response_choices_inner_logprobs(int include_optional);



create_chat_completion_response_choices_inner_logprobs_t* instantiate_create_chat_completion_response_choices_inner_logprobs(int include_optional) {
  create_chat_completion_response_choices_inner_logprobs_t* create_chat_completion_response_choices_inner_logprobs = NULL;
  if (include_optional) {
    create_chat_completion_response_choices_inner_logprobs = create_chat_completion_response_choices_inner_logprobs_create(
      list_createList(),
      list_createList()
    );
  } else {
    create_chat_completion_response_choices_inner_logprobs = create_chat_completion_response_choices_inner_logprobs_create(
      list_createList(),
      list_createList()
    );
  }

  return create_chat_completion_response_choices_inner_logprobs;
}


#ifdef create_chat_completion_response_choices_inner_logprobs_MAIN

void test_create_chat_completion_response_choices_inner_logprobs(int include_optional) {
    create_chat_completion_response_choices_inner_logprobs_t* create_chat_completion_response_choices_inner_logprobs_1 = instantiate_create_chat_completion_response_choices_inner_logprobs(include_optional);

	cJSON* jsoncreate_chat_completion_response_choices_inner_logprobs_1 = create_chat_completion_response_choices_inner_logprobs_convertToJSON(create_chat_completion_response_choices_inner_logprobs_1);
	printf("create_chat_completion_response_choices_inner_logprobs :\n%s\n", cJSON_Print(jsoncreate_chat_completion_response_choices_inner_logprobs_1));
	create_chat_completion_response_choices_inner_logprobs_t* create_chat_completion_response_choices_inner_logprobs_2 = create_chat_completion_response_choices_inner_logprobs_parseFromJSON(jsoncreate_chat_completion_response_choices_inner_logprobs_1);
	cJSON* jsoncreate_chat_completion_response_choices_inner_logprobs_2 = create_chat_completion_response_choices_inner_logprobs_convertToJSON(create_chat_completion_response_choices_inner_logprobs_2);
	printf("repeating create_chat_completion_response_choices_inner_logprobs:\n%s\n", cJSON_Print(jsoncreate_chat_completion_response_choices_inner_logprobs_2));
}

int main() {
  test_create_chat_completion_response_choices_inner_logprobs(1);
  test_create_chat_completion_response_choices_inner_logprobs(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_response_choices_inner_logprobs_MAIN
#endif // create_chat_completion_response_choices_inner_logprobs_TEST
