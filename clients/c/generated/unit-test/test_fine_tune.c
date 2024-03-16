#ifndef fine_tune_TEST
#define fine_tune_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune.h"
fine_tune_t* instantiate_fine_tune(int include_optional);



fine_tune_t* instantiate_fine_tune(int include_optional) {
  fine_tune_t* fine_tune = NULL;
  if (include_optional) {
    fine_tune = fine_tune_create(
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0",
      "0",
      0,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    fine_tune = fine_tune_create(
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0",
      "0",
      0,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return fine_tune;
}


#ifdef fine_tune_MAIN

void test_fine_tune(int include_optional) {
    fine_tune_t* fine_tune_1 = instantiate_fine_tune(include_optional);

	cJSON* jsonfine_tune_1 = fine_tune_convertToJSON(fine_tune_1);
	printf("fine_tune :\n%s\n", cJSON_Print(jsonfine_tune_1));
	fine_tune_t* fine_tune_2 = fine_tune_parseFromJSON(jsonfine_tune_1);
	cJSON* jsonfine_tune_2 = fine_tune_convertToJSON(fine_tune_2);
	printf("repeating fine_tune:\n%s\n", cJSON_Print(jsonfine_tune_2));
}

int main() {
  test_fine_tune(1);
  test_fine_tune(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_MAIN
#endif // fine_tune_TEST
