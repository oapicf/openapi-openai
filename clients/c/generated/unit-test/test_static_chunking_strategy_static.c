#ifndef static_chunking_strategy_static_TEST
#define static_chunking_strategy_static_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define static_chunking_strategy_static_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/static_chunking_strategy_static.h"
static_chunking_strategy_static_t* instantiate_static_chunking_strategy_static(int include_optional);



static_chunking_strategy_static_t* instantiate_static_chunking_strategy_static(int include_optional) {
  static_chunking_strategy_static_t* static_chunking_strategy_static = NULL;
  if (include_optional) {
    static_chunking_strategy_static = static_chunking_strategy_static_create(
      100,
      56
    );
  } else {
    static_chunking_strategy_static = static_chunking_strategy_static_create(
      100,
      56
    );
  }

  return static_chunking_strategy_static;
}


#ifdef static_chunking_strategy_static_MAIN

void test_static_chunking_strategy_static(int include_optional) {
    static_chunking_strategy_static_t* static_chunking_strategy_static_1 = instantiate_static_chunking_strategy_static(include_optional);

	cJSON* jsonstatic_chunking_strategy_static_1 = static_chunking_strategy_static_convertToJSON(static_chunking_strategy_static_1);
	printf("static_chunking_strategy_static :\n%s\n", cJSON_Print(jsonstatic_chunking_strategy_static_1));
	static_chunking_strategy_static_t* static_chunking_strategy_static_2 = static_chunking_strategy_static_parseFromJSON(jsonstatic_chunking_strategy_static_1);
	cJSON* jsonstatic_chunking_strategy_static_2 = static_chunking_strategy_static_convertToJSON(static_chunking_strategy_static_2);
	printf("repeating static_chunking_strategy_static:\n%s\n", cJSON_Print(jsonstatic_chunking_strategy_static_2));
}

int main() {
  test_static_chunking_strategy_static(1);
  test_static_chunking_strategy_static(0);

  printf("Hello world \n");
  return 0;
}

#endif // static_chunking_strategy_static_MAIN
#endif // static_chunking_strategy_static_TEST
