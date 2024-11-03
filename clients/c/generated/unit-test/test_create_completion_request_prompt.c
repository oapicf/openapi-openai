#ifndef create_completion_request_prompt_TEST
#define create_completion_request_prompt_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_completion_request_prompt_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_completion_request_prompt.h"
create_completion_request_prompt_t* instantiate_create_completion_request_prompt(int include_optional);



create_completion_request_prompt_t* instantiate_create_completion_request_prompt(int include_optional) {
  create_completion_request_prompt_t* create_completion_request_prompt = NULL;
  if (include_optional) {
    create_completion_request_prompt = create_completion_request_prompt_create(
    );
  } else {
    create_completion_request_prompt = create_completion_request_prompt_create(
    );
  }

  return create_completion_request_prompt;
}


#ifdef create_completion_request_prompt_MAIN

void test_create_completion_request_prompt(int include_optional) {
    create_completion_request_prompt_t* create_completion_request_prompt_1 = instantiate_create_completion_request_prompt(include_optional);

	cJSON* jsoncreate_completion_request_prompt_1 = create_completion_request_prompt_convertToJSON(create_completion_request_prompt_1);
	printf("create_completion_request_prompt :\n%s\n", cJSON_Print(jsoncreate_completion_request_prompt_1));
	create_completion_request_prompt_t* create_completion_request_prompt_2 = create_completion_request_prompt_parseFromJSON(jsoncreate_completion_request_prompt_1);
	cJSON* jsoncreate_completion_request_prompt_2 = create_completion_request_prompt_convertToJSON(create_completion_request_prompt_2);
	printf("repeating create_completion_request_prompt:\n%s\n", cJSON_Print(jsoncreate_completion_request_prompt_2));
}

int main() {
  test_create_completion_request_prompt(1);
  test_create_completion_request_prompt(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_completion_request_prompt_MAIN
#endif // create_completion_request_prompt_TEST
