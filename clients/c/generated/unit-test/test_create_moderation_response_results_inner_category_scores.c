#ifndef create_moderation_response_results_inner_category_scores_TEST
#define create_moderation_response_results_inner_category_scores_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_moderation_response_results_inner_category_scores_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_moderation_response_results_inner_category_scores.h"
create_moderation_response_results_inner_category_scores_t* instantiate_create_moderation_response_results_inner_category_scores(int include_optional);



create_moderation_response_results_inner_category_scores_t* instantiate_create_moderation_response_results_inner_category_scores(int include_optional) {
  create_moderation_response_results_inner_category_scores_t* create_moderation_response_results_inner_category_scores = NULL;
  if (include_optional) {
    create_moderation_response_results_inner_category_scores = create_moderation_response_results_inner_category_scores_create(
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337
    );
  } else {
    create_moderation_response_results_inner_category_scores = create_moderation_response_results_inner_category_scores_create(
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337,
      1.337
    );
  }

  return create_moderation_response_results_inner_category_scores;
}


#ifdef create_moderation_response_results_inner_category_scores_MAIN

void test_create_moderation_response_results_inner_category_scores(int include_optional) {
    create_moderation_response_results_inner_category_scores_t* create_moderation_response_results_inner_category_scores_1 = instantiate_create_moderation_response_results_inner_category_scores(include_optional);

	cJSON* jsoncreate_moderation_response_results_inner_category_scores_1 = create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner_category_scores_1);
	printf("create_moderation_response_results_inner_category_scores :\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_category_scores_1));
	create_moderation_response_results_inner_category_scores_t* create_moderation_response_results_inner_category_scores_2 = create_moderation_response_results_inner_category_scores_parseFromJSON(jsoncreate_moderation_response_results_inner_category_scores_1);
	cJSON* jsoncreate_moderation_response_results_inner_category_scores_2 = create_moderation_response_results_inner_category_scores_convertToJSON(create_moderation_response_results_inner_category_scores_2);
	printf("repeating create_moderation_response_results_inner_category_scores:\n%s\n", cJSON_Print(jsoncreate_moderation_response_results_inner_category_scores_2));
}

int main() {
  test_create_moderation_response_results_inner_category_scores(1);
  test_create_moderation_response_results_inner_category_scores(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_moderation_response_results_inner_category_scores_MAIN
#endif // create_moderation_response_results_inner_category_scores_TEST
