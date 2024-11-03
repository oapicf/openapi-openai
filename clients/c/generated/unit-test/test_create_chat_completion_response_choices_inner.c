#ifndef create_chat_completion_response_choices_inner_TEST
#define create_chat_completion_response_choices_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_chat_completion_response_choices_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_chat_completion_response_choices_inner.h"
create_chat_completion_response_choices_inner_t* instantiate_create_chat_completion_response_choices_inner(int include_optional);

#include "test_chat_completion_response_message.c"
#include "test_create_chat_completion_response_choices_inner_logprobs.c"


create_chat_completion_response_choices_inner_t* instantiate_create_chat_completion_response_choices_inner(int include_optional) {
  create_chat_completion_response_choices_inner_t* create_chat_completion_response_choices_inner = NULL;
  if (include_optional) {
    create_chat_completion_response_choices_inner = create_chat_completion_response_choices_inner_create(
      openai_api_create_chat_completion_response_choices_inner_FINISHREASON_stop,
      56,
       // false, not to have infinite recursion
      instantiate_chat_completion_response_message(0),
       // false, not to have infinite recursion
      instantiate_create_chat_completion_response_choices_inner_logprobs(0)
    );
  } else {
    create_chat_completion_response_choices_inner = create_chat_completion_response_choices_inner_create(
      openai_api_create_chat_completion_response_choices_inner_FINISHREASON_stop,
      56,
      NULL,
      NULL
    );
  }

  return create_chat_completion_response_choices_inner;
}


#ifdef create_chat_completion_response_choices_inner_MAIN

void test_create_chat_completion_response_choices_inner(int include_optional) {
    create_chat_completion_response_choices_inner_t* create_chat_completion_response_choices_inner_1 = instantiate_create_chat_completion_response_choices_inner(include_optional);

	cJSON* jsoncreate_chat_completion_response_choices_inner_1 = create_chat_completion_response_choices_inner_convertToJSON(create_chat_completion_response_choices_inner_1);
	printf("create_chat_completion_response_choices_inner :\n%s\n", cJSON_Print(jsoncreate_chat_completion_response_choices_inner_1));
	create_chat_completion_response_choices_inner_t* create_chat_completion_response_choices_inner_2 = create_chat_completion_response_choices_inner_parseFromJSON(jsoncreate_chat_completion_response_choices_inner_1);
	cJSON* jsoncreate_chat_completion_response_choices_inner_2 = create_chat_completion_response_choices_inner_convertToJSON(create_chat_completion_response_choices_inner_2);
	printf("repeating create_chat_completion_response_choices_inner:\n%s\n", cJSON_Print(jsoncreate_chat_completion_response_choices_inner_2));
}

int main() {
  test_create_chat_completion_response_choices_inner(1);
  test_create_chat_completion_response_choices_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_chat_completion_response_choices_inner_MAIN
#endif // create_chat_completion_response_choices_inner_TEST
