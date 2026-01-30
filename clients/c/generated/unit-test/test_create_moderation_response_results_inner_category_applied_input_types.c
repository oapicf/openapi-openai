#ifndef create_moderation_response_results_inner_category_applied_input_types_TEST
#define create_moderation_response_results_inner_category_applied_input_types_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_response_results_inner_category_applied_input_types_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_response_results_inner_category_applied_input_types.h"
create_moderation_response_results_inner_category_applied_input_types_t* instantiate_create_moderation_response_results_inner_category_applied_input_types(int include_optional);



create_moderation_response_results_inner_category_applied_input_types_t* instantiate_create_moderation_response_results_inner_category_applied_input_types(int include_optional) {
  create_moderation_response_results_inner_category_applied_input_types_t* create_moderation_response_results_inner_category_applied_input_types = NULL;
  if (include_optional) {
    create_moderation_response_results_inner_category_applied_input_types = create_moderation_response_results_inner_category_applied_input_types_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    create_moderation_response_results_inner_category_applied_input_types = create_moderation_response_results_inner_category_applied_input_types_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return create_moderation_response_results_inner_category_applied_input_types;
}


#ifdef create_moderation_response_results_inner_category_applied_input_types_MAIN

void test_create_moderation_response_results_inner_category_applied_input_types(int include_optional) {
    create_moderation_response_results_inner_category_applied_input_types_t* create_moderation_response_results_inner_category_applied_input_types_1 = instantiate_create_moderation_response_results_inner_category_applied_input_types(include_optional);

	cJSON* jsoncreate_moderation_response_results_inner_category_applied_input_types_1 = create_moderation_response_results_inner_category_applied_input_types_convertToJSON(create_moderation_response_results_inner_category_applied_input_types_1);
	printf("create_moderation_response_results_inner_category_applied_input_types :\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_category_applied_input_types_1));
	create_moderation_response_results_inner_category_applied_input_types_t* create_moderation_response_results_inner_category_applied_input_types_2 = create_moderation_response_results_inner_category_applied_input_types_parseFromJSON(jsoncreate_moderation_response_results_inner_category_applied_input_types_1);
	cJSON* jsoncreate_moderation_response_results_inner_category_applied_input_types_2 = create_moderation_response_results_inner_category_applied_input_types_convertToJSON(create_moderation_response_results_inner_category_applied_input_types_2);
	printf("repeating create_moderation_response_results_inner_category_applied_input_types:\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_category_applied_input_types_2));
}

int main() {
  test_create_moderation_response_results_inner_category_applied_input_types(1);
  test_create_moderation_response_results_inner_category_applied_input_types(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_response_results_inner_category_applied_input_types_MAIN
#endif // create_moderation_response_results_inner_category_applied_input_types_TEST
