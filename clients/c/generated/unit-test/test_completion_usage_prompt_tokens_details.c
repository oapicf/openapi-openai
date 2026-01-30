#ifndef completion_usage_prompt_tokens_details_TEST
#define completion_usage_prompt_tokens_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define completion_usage_prompt_tokens_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/completion_usage_prompt_tokens_details.h"
completion_usage_prompt_tokens_details_t* instantiate_completion_usage_prompt_tokens_details(int include_optional);



completion_usage_prompt_tokens_details_t* instantiate_completion_usage_prompt_tokens_details(int include_optional) {
  completion_usage_prompt_tokens_details_t* completion_usage_prompt_tokens_details = NULL;
  if (include_optional) {
    completion_usage_prompt_tokens_details = completion_usage_prompt_tokens_details_create(
      56,
      56
    );
  } else {
    completion_usage_prompt_tokens_details = completion_usage_prompt_tokens_details_create(
      56,
      56
    );
  }

  return completion_usage_prompt_tokens_details;
}


#ifdef completion_usage_prompt_tokens_details_MAIN

void test_completion_usage_prompt_tokens_details(int include_optional) {
    completion_usage_prompt_tokens_details_t* completion_usage_prompt_tokens_details_1 = instantiate_completion_usage_prompt_tokens_details(include_optional);

	cJSON* jsoncompletion_usage_prompt_tokens_details_1 = completion_usage_prompt_tokens_details_convertToJSON(completion_usage_prompt_tokens_details_1);
	printf("completion_usage_prompt_tokens_details :\n%s\n", cJSON_Print(jsoncompletion_usage_prompt_tokens_details_1));
	completion_usage_prompt_tokens_details_t* completion_usage_prompt_tokens_details_2 = completion_usage_prompt_tokens_details_parseFromJSON(jsoncompletion_usage_prompt_tokens_details_1);
	cJSON* jsoncompletion_usage_prompt_tokens_details_2 = completion_usage_prompt_tokens_details_convertToJSON(completion_usage_prompt_tokens_details_2);
	printf("repeating completion_usage_prompt_tokens_details:\n%s\n", cJSON_Print(jsoncompletion_usage_prompt_tokens_details_2));
}

int main() {
  test_completion_usage_prompt_tokens_details(1);
  test_completion_usage_prompt_tokens_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // completion_usage_prompt_tokens_details_MAIN
#endif // completion_usage_prompt_tokens_details_TEST
