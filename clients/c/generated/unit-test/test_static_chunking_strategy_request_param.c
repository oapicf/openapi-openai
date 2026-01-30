#ifndef static_chunking_strategy_request_param_TEST
#define static_chunking_strategy_request_param_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define static_chunking_strategy_request_param_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/static_chunking_strategy_request_param.h"
static_chunking_strategy_request_param_t* instantiate_static_chunking_strategy_request_param(int include_optional);

#include "test_static_chunking_strategy.c"


static_chunking_strategy_request_param_t* instantiate_static_chunking_strategy_request_param(int include_optional) {
  static_chunking_strategy_request_param_t* static_chunking_strategy_request_param = NULL;
  if (include_optional) {
    static_chunking_strategy_request_param = static_chunking_strategy_request_param_create(
      openai_api_static_chunking_strategy_request_param_TYPE_static,
       // false, not to have infinite recursion
      instantiate_static_chunking_strategy(0)
    );
  } else {
    static_chunking_strategy_request_param = static_chunking_strategy_request_param_create(
      openai_api_static_chunking_strategy_request_param_TYPE_static,
      NULL
    );
  }

  return static_chunking_strategy_request_param;
}


#ifdef static_chunking_strategy_request_param_MAIN

void test_static_chunking_strategy_request_param(int include_optional) {
    static_chunking_strategy_request_param_t* static_chunking_strategy_request_param_1 = instantiate_static_chunking_strategy_request_param(include_optional);

	cJSON* jsonstatic_chunking_strategy_request_param_1 = static_chunking_strategy_request_param_convertToJSON(static_chunking_strategy_request_param_1);
	printf("static_chunking_strategy_request_param :\n%s\n", cJSON_Print(jsonstatic_chunking_strategy_request_param_1));
	static_chunking_strategy_request_param_t* static_chunking_strategy_request_param_2 = static_chunking_strategy_request_param_parseFromJSON(jsonstatic_chunking_strategy_request_param_1);
	cJSON* jsonstatic_chunking_strategy_request_param_2 = static_chunking_strategy_request_param_convertToJSON(static_chunking_strategy_request_param_2);
	printf("repeating static_chunking_strategy_request_param:\n%s\n", cJSON_Print(jsonstatic_chunking_strategy_request_param_2));
}

int main() {
  test_static_chunking_strategy_request_param(1);
  test_static_chunking_strategy_request_param(0);

  printf("Hello world \n");
  return 0;
}

#endif // static_chunking_strategy_request_param_MAIN
#endif // static_chunking_strategy_request_param_TEST
