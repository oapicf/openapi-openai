#ifndef auto_chunking_strategy_TEST
#define auto_chunking_strategy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define auto_chunking_strategy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/auto_chunking_strategy.h"
auto_chunking_strategy_t* instantiate_auto_chunking_strategy(int include_optional);



auto_chunking_strategy_t* instantiate_auto_chunking_strategy(int include_optional) {
  auto_chunking_strategy_t* auto_chunking_strategy = NULL;
  if (include_optional) {
    auto_chunking_strategy = auto_chunking_strategy_create(
      openai_api_auto_chunking_strategy_TYPE_auto
    );
  } else {
    auto_chunking_strategy = auto_chunking_strategy_create(
      openai_api_auto_chunking_strategy_TYPE_auto
    );
  }

  return auto_chunking_strategy;
}


#ifdef auto_chunking_strategy_MAIN

void test_auto_chunking_strategy(int include_optional) {
    auto_chunking_strategy_t* auto_chunking_strategy_1 = instantiate_auto_chunking_strategy(include_optional);

	cJSON* jsonauto_chunking_strategy_1 = auto_chunking_strategy_convertToJSON(auto_chunking_strategy_1);
	printf("auto_chunking_strategy :\n%s\n", cJSON_Print(jsonauto_chunking_strategy_1));
	auto_chunking_strategy_t* auto_chunking_strategy_2 = auto_chunking_strategy_parseFromJSON(jsonauto_chunking_strategy_1);
	cJSON* jsonauto_chunking_strategy_2 = auto_chunking_strategy_convertToJSON(auto_chunking_strategy_2);
	printf("repeating auto_chunking_strategy:\n%s\n", cJSON_Print(jsonauto_chunking_strategy_2));
}

int main() {
  test_auto_chunking_strategy(1);
  test_auto_chunking_strategy(0);

  printf("Hello world \n");
  return 0;
}

#endif // auto_chunking_strategy_MAIN
#endif // auto_chunking_strategy_TEST
