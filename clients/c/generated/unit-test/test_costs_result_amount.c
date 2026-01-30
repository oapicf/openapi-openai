#ifndef costs_result_amount_TEST
#define costs_result_amount_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define costs_result_amount_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/costs_result_amount.h"
costs_result_amount_t* instantiate_costs_result_amount(int include_optional);



costs_result_amount_t* instantiate_costs_result_amount(int include_optional) {
  costs_result_amount_t* costs_result_amount = NULL;
  if (include_optional) {
    costs_result_amount = costs_result_amount_create(
      1.337,
      "0"
    );
  } else {
    costs_result_amount = costs_result_amount_create(
      1.337,
      "0"
    );
  }

  return costs_result_amount;
}


#ifdef costs_result_amount_MAIN

void test_costs_result_amount(int include_optional) {
    costs_result_amount_t* costs_result_amount_1 = instantiate_costs_result_amount(include_optional);

	cJSON* jsoncosts_result_amount_1 = costs_result_amount_convertToJSON(costs_result_amount_1);
	printf("costs_result_amount :\n%s\n", cJSON_Print(jsoncosts_result_amount_1));
	costs_result_amount_t* costs_result_amount_2 = costs_result_amount_parseFromJSON(jsoncosts_result_amount_1);
	cJSON* jsoncosts_result_amount_2 = costs_result_amount_convertToJSON(costs_result_amount_2);
	printf("repeating costs_result_amount:\n%s\n", cJSON_Print(jsoncosts_result_amount_2));
}

int main() {
  test_costs_result_amount(1);
  test_costs_result_amount(0);

  printf("Hello world \n");
  return 0;
}

#endif // costs_result_amount_MAIN
#endif // costs_result_amount_TEST
