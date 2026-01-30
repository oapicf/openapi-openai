#ifndef create_moderation_response_results_inner_categories_TEST
#define create_moderation_response_results_inner_categories_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_response_results_inner_categories_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_response_results_inner_categories.h"
create_moderation_response_results_inner_categories_t* instantiate_create_moderation_response_results_inner_categories(int include_optional);



create_moderation_response_results_inner_categories_t* instantiate_create_moderation_response_results_inner_categories(int include_optional) {
  create_moderation_response_results_inner_categories_t* create_moderation_response_results_inner_categories = NULL;
  if (include_optional) {
    create_moderation_response_results_inner_categories = create_moderation_response_results_inner_categories_create(
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1
    );
  } else {
    create_moderation_response_results_inner_categories = create_moderation_response_results_inner_categories_create(
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1
    );
  }

  return create_moderation_response_results_inner_categories;
}


#ifdef create_moderation_response_results_inner_categories_MAIN

void test_create_moderation_response_results_inner_categories(int include_optional) {
    create_moderation_response_results_inner_categories_t* create_moderation_response_results_inner_categories_1 = instantiate_create_moderation_response_results_inner_categories(include_optional);

	cJSON* jsoncreate_moderation_response_results_inner_categories_1 = create_moderation_response_results_inner_categories_convertToJSON(create_moderation_response_results_inner_categories_1);
	printf("create_moderation_response_results_inner_categories :\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_categories_1));
	create_moderation_response_results_inner_categories_t* create_moderation_response_results_inner_categories_2 = create_moderation_response_results_inner_categories_parseFromJSON(jsoncreate_moderation_response_results_inner_categories_1);
	cJSON* jsoncreate_moderation_response_results_inner_categories_2 = create_moderation_response_results_inner_categories_convertToJSON(create_moderation_response_results_inner_categories_2);
	printf("repeating create_moderation_response_results_inner_categories:\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_categories_2));
}

int main() {
  test_create_moderation_response_results_inner_categories(1);
  test_create_moderation_response_results_inner_categories(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_response_results_inner_categories_MAIN
#endif // create_moderation_response_results_inner_categories_TEST
