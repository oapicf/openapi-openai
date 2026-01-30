#ifndef create_moderation_response_results_inner_TEST
#define create_moderation_response_results_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_response_results_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_response_results_inner.h"
create_moderation_response_results_inner_t* instantiate_create_moderation_response_results_inner(int include_optional);

#include "test_create_moderation_response_results_inner_categories.c"
#include "test_create_moderation_response_results_inner_category_scores.c"
#include "test_create_moderation_response_results_inner_category_applied_input_types.c"


create_moderation_response_results_inner_t* instantiate_create_moderation_response_results_inner(int include_optional) {
  create_moderation_response_results_inner_t* create_moderation_response_results_inner = NULL;
  if (include_optional) {
    create_moderation_response_results_inner = create_moderation_response_results_inner_create(
      1,
       // false, not to have infinite recursion
      instantiate_create_moderation_response_results_inner_categories(0),
       // false, not to have infinite recursion
      instantiate_create_moderation_response_results_inner_category_scores(0),
       // false, not to have infinite recursion
      instantiate_create_moderation_response_results_inner_category_applied_input_types(0)
    );
  } else {
    create_moderation_response_results_inner = create_moderation_response_results_inner_create(
      1,
      NULL,
      NULL,
      NULL
    );
  }

  return create_moderation_response_results_inner;
}


#ifdef create_moderation_response_results_inner_MAIN

void test_create_moderation_response_results_inner(int include_optional) {
    create_moderation_response_results_inner_t* create_moderation_response_results_inner_1 = instantiate_create_moderation_response_results_inner(include_optional);

	cJSON* jsoncreate_moderation_response_results_inner_1 = create_moderation_response_results_inner_convertToJSON(create_moderation_response_results_inner_1);
	printf("create_moderation_response_results_inner :\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_1));
	create_moderation_response_results_inner_t* create_moderation_response_results_inner_2 = create_moderation_response_results_inner_parseFromJSON(jsoncreate_moderation_response_results_inner_1);
	cJSON* jsoncreate_moderation_response_results_inner_2 = create_moderation_response_results_inner_convertToJSON(create_moderation_response_results_inner_2);
	printf("repeating create_moderation_response_results_inner:\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_2));
}

int main() {
  test_create_moderation_response_results_inner(1);
  test_create_moderation_response_results_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_response_results_inner_MAIN
#endif // create_moderation_response_results_inner_TEST
