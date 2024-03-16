#ifndef open_ai_file_TEST
#define open_ai_file_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define open_ai_file_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/open_ai_file.h"
open_ai_file_t* instantiate_open_ai_file(int include_optional);



open_ai_file_t* instantiate_open_ai_file(int include_optional) {
  open_ai_file_t* open_ai_file = NULL;
  if (include_optional) {
    open_ai_file = open_ai_file_create(
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0",
      0
    );
  } else {
    open_ai_file = open_ai_file_create(
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0",
      0
    );
  }

  return open_ai_file;
}


#ifdef open_ai_file_MAIN

void test_open_ai_file(int include_optional) {
    open_ai_file_t* open_ai_file_1 = instantiate_open_ai_file(include_optional);

	cJSON* jsonopen_ai_file_1 = open_ai_file_convertToJSON(open_ai_file_1);
	printf("open_ai_file :\n%s\n", cJSON_Print(jsonopen_ai_file_1));
	open_ai_file_t* open_ai_file_2 = open_ai_file_parseFromJSON(jsonopen_ai_file_1);
	cJSON* jsonopen_ai_file_2 = open_ai_file_convertToJSON(open_ai_file_2);
	printf("repeating open_ai_file:\n%s\n", cJSON_Print(jsonopen_ai_file_2));
}

int main() {
  test_open_ai_file(1);
  test_open_ai_file(0);

  printf("Hello world \n");
  return 0;
}

#endif // open_ai_file_MAIN
#endif // open_ai_file_TEST
