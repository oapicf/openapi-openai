#ifndef other_chunking_strategy_response_param_TEST
#define other_chunking_strategy_response_param_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define other_chunking_strategy_response_param_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/other_chunking_strategy_response_param.h"
other_chunking_strategy_response_param_t* instantiate_other_chunking_strategy_response_param(int include_optional);



other_chunking_strategy_response_param_t* instantiate_other_chunking_strategy_response_param(int include_optional) {
  other_chunking_strategy_response_param_t* other_chunking_strategy_response_param = NULL;
  if (include_optional) {
    other_chunking_strategy_response_param = other_chunking_strategy_response_param_create(
      openai_api_other_chunking_strategy_response_param_TYPE_other
    );
  } else {
    other_chunking_strategy_response_param = other_chunking_strategy_response_param_create(
      openai_api_other_chunking_strategy_response_param_TYPE_other
    );
  }

  return other_chunking_strategy_response_param;
}


#ifdef other_chunking_strategy_response_param_MAIN

void test_other_chunking_strategy_response_param(int include_optional) {
    other_chunking_strategy_response_param_t* other_chunking_strategy_response_param_1 = instantiate_other_chunking_strategy_response_param(include_optional);

	cJSON* jsonother_chunking_strategy_response_param_1 = other_chunking_strategy_response_param_convertToJSON(other_chunking_strategy_response_param_1);
	printf("other_chunking_strategy_response_param :\n%s\n", cJSON_Print(jsonother_chunking_strategy_response_param_1));
	other_chunking_strategy_response_param_t* other_chunking_strategy_response_param_2 = other_chunking_strategy_response_param_parseFromJSON(jsonother_chunking_strategy_response_param_1);
	cJSON* jsonother_chunking_strategy_response_param_2 = other_chunking_strategy_response_param_convertToJSON(other_chunking_strategy_response_param_2);
	printf("repeating other_chunking_strategy_response_param:\n%s\n", cJSON_Print(jsonother_chunking_strategy_response_param_2));
}

int main() {
  test_other_chunking_strategy_response_param(1);
  test_other_chunking_strategy_response_param(0);

  printf("Hello world \n");
  return 0;
}

#endif // other_chunking_strategy_response_param_MAIN
#endif // other_chunking_strategy_response_param_TEST
