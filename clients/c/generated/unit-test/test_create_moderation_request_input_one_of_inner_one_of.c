#ifndef create_moderation_request_input_one_of_inner_one_of_TEST
#define create_moderation_request_input_one_of_inner_one_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_request_input_one_of_inner_one_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_request_input_one_of_inner_one_of.h"
create_moderation_request_input_one_of_inner_one_of_t* instantiate_create_moderation_request_input_one_of_inner_one_of(int include_optional);

#include "test_create_moderation_request_input_one_of_inner_one_of_image_url.c"


create_moderation_request_input_one_of_inner_one_of_t* instantiate_create_moderation_request_input_one_of_inner_one_of(int include_optional) {
  create_moderation_request_input_one_of_inner_one_of_t* create_moderation_request_input_one_of_inner_one_of = NULL;
  if (include_optional) {
    create_moderation_request_input_one_of_inner_one_of = create_moderation_request_input_one_of_inner_one_of_create(
      openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_image_url,
       // false, not to have infinite recursion
      instantiate_create_moderation_request_input_one_of_inner_one_of_image_url(0)
    );
  } else {
    create_moderation_request_input_one_of_inner_one_of = create_moderation_request_input_one_of_inner_one_of_create(
      openai_api_create_moderation_request_input_one_of_inner_one_of_TYPE_image_url,
      NULL
    );
  }

  return create_moderation_request_input_one_of_inner_one_of;
}


#ifdef create_moderation_request_input_one_of_inner_one_of_MAIN

void test_create_moderation_request_input_one_of_inner_one_of(int include_optional) {
    create_moderation_request_input_one_of_inner_one_of_t* create_moderation_request_input_one_of_inner_one_of_1 = instantiate_create_moderation_request_input_one_of_inner_one_of(include_optional);

	cJSON* jsoncreate_moderation_request_input_one_of_inner_one_of_1 = create_moderation_request_input_one_of_inner_one_of_convertToJSON(create_moderation_request_input_one_of_inner_one_of_1);
	printf("create_moderation_request_input_one_of_inner_one_of :\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_one_of_inner_one_of_1));
	create_moderation_request_input_one_of_inner_one_of_t* create_moderation_request_input_one_of_inner_one_of_2 = create_moderation_request_input_one_of_inner_one_of_parseFromJSON(jsoncreate_moderation_request_input_one_of_inner_one_of_1);
	cJSON* jsoncreate_moderation_request_input_one_of_inner_one_of_2 = create_moderation_request_input_one_of_inner_one_of_convertToJSON(create_moderation_request_input_one_of_inner_one_of_2);
	printf("repeating create_moderation_request_input_one_of_inner_one_of:\n%s\n", cJSON_Print(jsoncreate_moderation_request_input_one_of_inner_one_of_2));
}

int main() {
  test_create_moderation_request_input_one_of_inner_one_of(1);
  test_create_moderation_request_input_one_of_inner_one_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_request_input_one_of_inner_one_of_MAIN
#endif // create_moderation_request_input_one_of_inner_one_of_TEST
