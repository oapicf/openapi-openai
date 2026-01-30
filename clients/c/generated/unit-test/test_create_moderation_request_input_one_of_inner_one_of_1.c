#ifndef create_moderation_request_input_one_of_inner_one_of_1_TEST
#define create_moderation_request_input_one_of_inner_one_of_1_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_request_input_one_of_inner_one_of_1_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_request_input_one_of_inner_one_of_1.h"
create_moderation_request_input_one_of_inner_one_of_1_t* instantiate_create_moderation_request_input_one_of_inner_one_of_1(int include_optional);



create_moderation_request_input_one_of_inner_one_of_1_t* instantiate_create_moderation_request_input_one_of_inner_one_of_1(int include_optional) {
  create_moderation_request_input_one_of_inner_one_of_1_t* create_moderation_request_input_one_of_inner_one_of_1 = NULL;
  if (include_optional) {
    create_moderation_request_input_one_of_inner_one_of_1 = create_moderation_request_input_one_of_inner_one_of_1_create(
      openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_text,
      "I want to kill them"
    );
  } else {
    create_moderation_request_input_one_of_inner_one_of_1 = create_moderation_request_input_one_of_inner_one_of_1_create(
      openai_api_create_moderation_request_input_one_of_inner_one_of_1_TYPE_text,
      "I want to kill them"
    );
  }

  return create_moderation_request_input_one_of_inner_one_of_1;
}


#ifdef create_moderation_request_input_one_of_inner_one_of_1_MAIN

void test_create_moderation_request_input_one_of_inner_one_of_1(int include_optional) {
    create_moderation_request_input_one_of_inner_one_of_1_t* create_moderation_request_input_one_of_inner_one_of_1_1 = instantiate_create_moderation_request_input_one_of_inner_one_of_1(include_optional);

	cJSON* jsoncreate_moderation_request_input_one_of_inner_one_of_1_1 = create_moderation_request_input_one_of_inner_one_of_1_convertToJSON(create_moderation_request_input_one_of_inner_one_of_1_1);
	printf("create_moderation_request_input_one_of_inner_one_of_1 :\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_one_of_inner_one_of_1_1));
	create_moderation_request_input_one_of_inner_one_of_1_t* create_moderation_request_input_one_of_inner_one_of_1_2 = create_moderation_request_input_one_of_inner_one_of_1_parseFromJSON(jsoncreate_moderation_request_input_one_of_inner_one_of_1_1);
	cJSON* jsoncreate_moderation_request_input_one_of_inner_one_of_1_2 = create_moderation_request_input_one_of_inner_one_of_1_convertToJSON(create_moderation_request_input_one_of_inner_one_of_1_2);
	printf("repeating create_moderation_request_input_one_of_inner_one_of_1:\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_one_of_inner_one_of_1_2));
}

int main() {
  test_create_moderation_request_input_one_of_inner_one_of_1(1);
  test_create_moderation_request_input_one_of_inner_one_of_1(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_request_input_one_of_inner_one_of_1_MAIN
#endif // create_moderation_request_input_one_of_inner_one_of_1_TEST
