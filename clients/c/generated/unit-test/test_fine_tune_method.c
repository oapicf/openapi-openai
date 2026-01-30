#ifndef fine_tune_method_TEST
#define fine_tune_method_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define fine_tune_method_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/fine_tune_method.h"
fine_tune_method_t* instantiate_fine_tune_method(int include_optional);



fine_tune_method_t* instantiate_fine_tune_method(int include_optional) {
  fine_tune_method_t* fine_tune_method = NULL;
  if (include_optional) {
    fine_tune_method = fine_tune_method_create(
      openai_api_fine_tune_method_TYPE_supervised,
      0,
      0
    );
  } else {
    fine_tune_method = fine_tune_method_create(
      openai_api_fine_tune_method_TYPE_supervised,
      0,
      0
    );
  }

  return fine_tune_method;
}


#ifdef fine_tune_method_MAIN

void test_fine_tune_method(int include_optional) {
    fine_tune_method_t* fine_tune_method_1 = instantiate_fine_tune_method(include_optional);

	cJSON* jsonfine_tune_method_1 = fine_tune_method_convertToJSON(fine_tune_method_1);
	printf("fine_tune_method :\n%s\n", cJSON_Print(jsonfine_tune_method_1));
	fine_tune_method_t* fine_tune_method_2 = fine_tune_method_parseFromJSON(jsonfine_tune_method_1);
	cJSON* jsonfine_tune_method_2 = fine_tune_method_convertToJSON(fine_tune_method_2);
	printf("repeating fine_tune_method:\n%s\n", cJSON_Print(jsonfine_tune_method_2));
}

int main() {
  test_fine_tune_method(1);
  test_fine_tune_method(0);

  printf("Hello world \n");
  return 0;
}

#endif // fine_tune_method_MAIN
#endif // fine_tune_method_TEST
