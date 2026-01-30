#ifndef chunking_strategy_request_param_TEST
#define chunking_strategy_request_param_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define chunking_strategy_request_param_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/chunking_strategy_request_param.h"
chunking_strategy_request_param_t* instantiate_chunking_strategy_request_param(int include_optional);

#include "test_static_chunking_strategy.c"


chunking_strategy_request_param_t* instantiate_chunking_strategy_request_param(int include_optional) {
  chunking_strategy_request_param_t* chunking_strategy_request_param = NULL;
  if (include_optional) {
    chunking_strategy_request_param = chunking_strategy_request_param_create(
      openai_api_chunking_strategy_request_param_TYPE_auto,
       // false, not to have infinite recursion
      instantiate_static_chunking_strategy(0)
    );
  } else {
    chunking_strategy_request_param = chunking_strategy_request_param_create(
      openai_api_chunking_strategy_request_param_TYPE_auto,
      NULL
    );
  }

  return chunking_strategy_request_param;
}


#ifdef chunking_strategy_request_param_MAIN

void test_chunking_strategy_request_param(int include_optional) {
    chunking_strategy_request_param_t* chunking_strategy_request_param_1 = instantiate_chunking_strategy_request_param(include_optional);

	cJSON* jsonchunking_strategy_request_param_1 = chunking_strategy_request_param_convertToJSON(chunking_strategy_request_param_1);
	printf("chunking_strategy_request_param :\n%s\n", cJSON_Print(jsonchunking_strategy_request_param_1));
	chunking_strategy_request_param_t* chunking_strategy_request_param_2 = chunking_strategy_request_param_parseFromJSON(jsonchunking_strategy_request_param_1);
	cJSON* jsonchunking_strategy_request_param_2 = chunking_strategy_request_param_convertToJSON(chunking_strategy_request_param_2);
	printf("repeating chunking_strategy_request_param:\n%s\n", cJSON_Print(jsonchunking_strategy_request_param_2));
}

int main() {
  test_chunking_strategy_request_param(1);
  test_chunking_strategy_request_param(0);

  printf("Hello world \n");
  return 0;
}

#endif // chunking_strategy_request_param_MAIN
#endif // chunking_strategy_request_param_TEST
