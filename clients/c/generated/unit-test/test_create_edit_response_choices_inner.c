#ifndef create_edit_response_choices_inner_TEST
#define create_edit_response_choices_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_edit_response_choices_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_edit_response_choices_inner.h"
create_edit_response_choices_inner_t* instantiate_create_edit_response_choices_inner(int include_optional);

#include "test_create_completion_response_choices_inner_logprobs.c"


create_edit_response_choices_inner_t* instantiate_create_edit_response_choices_inner(int include_optional) {
  create_edit_response_choices_inner_t* create_edit_response_choices_inner = NULL;
  if (include_optional) {
    create_edit_response_choices_inner = create_edit_response_choices_inner_create(
      "0",
      56,
       // false, not to have infinite recursion
      instantiate_create_completion_response_choices_inner_logprobs(0),
      openai_api_create_edit_response_choices_inner_FINISHREASON_stop
    );
  } else {
    create_edit_response_choices_inner = create_edit_response_choices_inner_create(
      "0",
      56,
      NULL,
      openai_api_create_edit_response_choices_inner_FINISHREASON_stop
    );
  }

  return create_edit_response_choices_inner;
}


#ifdef create_edit_response_choices_inner_MAIN

void test_create_edit_response_choices_inner(int include_optional) {
    create_edit_response_choices_inner_t* create_edit_response_choices_inner_1 = instantiate_create_edit_response_choices_inner(include_optional);

	cJSON* jsoncreate_edit_response_choices_inner_1 = create_edit_response_choices_inner_convertToJSON(create_edit_response_choices_inner_1);
	printf("create_edit_response_choices_inner :\n%s\n", cJSON_Print(jsoncreate_edit_response_choices_inner_1));
	create_edit_response_choices_inner_t* create_edit_response_choices_inner_2 = create_edit_response_choices_inner_parseFromJSON(jsoncreate_edit_response_choices_inner_1);
	cJSON* jsoncreate_edit_response_choices_inner_2 = create_edit_response_choices_inner_convertToJSON(create_edit_response_choices_inner_2);
	printf("repeating create_edit_response_choices_inner:\n%s\n", cJSON_Print(jsoncreate_edit_response_choices_inner_2));
}

int main() {
  test_create_edit_response_choices_inner(1);
  test_create_edit_response_choices_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_edit_response_choices_inner_MAIN
#endif // create_edit_response_choices_inner_TEST
