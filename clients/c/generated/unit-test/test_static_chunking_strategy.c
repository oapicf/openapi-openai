#ifndef static_chunking_strategy_TEST
#define static_chunking_strategy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define static_chunking_strategy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/static_chunking_strategy.h"
static_chunking_strategy_t* instantiate_static_chunking_strategy(int include_optional);

#include "test_static_chunking_strategy_static.c"


static_chunking_strategy_t* instantiate_static_chunking_strategy(int include_optional) {
  static_chunking_strategy_t* static_chunking_strategy = NULL;
  if (include_optional) {
    static_chunking_strategy = static_chunking_strategy_create(
      openai_api_static_chunking_strategy_TYPE_static,
       // false, not to have infinite recursion
      instantiate_static_chunking_strategy_static(0)
    );
  } else {
    static_chunking_strategy = static_chunking_strategy_create(
      openai_api_static_chunking_strategy_TYPE_static,
      NULL
    );
  }

  return static_chunking_strategy;
}


#ifdef static_chunking_strategy_MAIN

void test_static_chunking_strategy(int include_optional) {
    static_chunking_strategy_t* static_chunking_strategy_1 = instantiate_static_chunking_strategy(include_optional);

	cJSON* jsonstatic_chunking_strategy_1 = static_chunking_strategy_convertToJSON(static_chunking_strategy_1);
	printf("static_chunking_strategy :\n%s\n", cJSON_Print(jsonstatic_chunking_strategy_1));
	static_chunking_strategy_t* static_chunking_strategy_2 = static_chunking_strategy_parseFromJSON(jsonstatic_chunking_strategy_1);
	cJSON* jsonstatic_chunking_strategy_2 = static_chunking_strategy_convertToJSON(static_chunking_strategy_2);
	printf("repeating static_chunking_strategy:\n%s\n", cJSON_Print(jsonstatic_chunking_strategy_2));
}

int main() {
  test_static_chunking_strategy(1);
  test_static_chunking_strategy(0);

  printf("Hello world \n");
  return 0;
}

#endif // static_chunking_strategy_MAIN
#endif // static_chunking_strategy_TEST
