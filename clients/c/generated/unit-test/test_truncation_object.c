#ifndef truncation_object_TEST
#define truncation_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define truncation_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/truncation_object.h"
truncation_object_t* instantiate_truncation_object(int include_optional);



truncation_object_t* instantiate_truncation_object(int include_optional) {
  truncation_object_t* truncation_object = NULL;
  if (include_optional) {
    truncation_object = truncation_object_create(
      openai_api_truncation_object_TYPE_auto,
      1
    );
  } else {
    truncation_object = truncation_object_create(
      openai_api_truncation_object_TYPE_auto,
      1
    );
  }

  return truncation_object;
}


#ifdef truncation_object_MAIN

void test_truncation_object(int include_optional) {
    truncation_object_t* truncation_object_1 = instantiate_truncation_object(include_optional);

	cJSON* jsontruncation_object_1 = truncation_object_convertToJSON(truncation_object_1);
	printf("truncation_object :\n%s\n", cJSON_Print(jsontruncation_object_1));
	truncation_object_t* truncation_object_2 = truncation_object_parseFromJSON(jsontruncation_object_1);
	cJSON* jsontruncation_object_2 = truncation_object_convertToJSON(truncation_object_2);
	printf("repeating truncation_object:\n%s\n", cJSON_Print(jsontruncation_object_2));
}

int main() {
  test_truncation_object(1);
  test_truncation_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // truncation_object_MAIN
#endif // truncation_object_TEST
