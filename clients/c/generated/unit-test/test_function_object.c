#ifndef function_object_TEST
#define function_object_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define function_object_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/function_object.h"
function_object_t* instantiate_function_object(int include_optional);



function_object_t* instantiate_function_object(int include_optional) {
  function_object_t* function_object = NULL;
  if (include_optional) {
    function_object = function_object_create(
      "0",
      "0",
      list_createList()
    );
  } else {
    function_object = function_object_create(
      "0",
      "0",
      list_createList()
    );
  }

  return function_object;
}


#ifdef function_object_MAIN

void test_function_object(int include_optional) {
    function_object_t* function_object_1 = instantiate_function_object(include_optional);

	cJSON* jsonfunction_object_1 = function_object_convertToJSON(function_object_1);
	printf("function_object :\n%s\n", cJSON_Print(jsonfunction_object_1));
	function_object_t* function_object_2 = function_object_parseFromJSON(jsonfunction_object_1);
	cJSON* jsonfunction_object_2 = function_object_convertToJSON(function_object_2);
	printf("repeating function_object:\n%s\n", cJSON_Print(jsonfunction_object_2));
}

int main() {
  test_function_object(1);
  test_function_object(0);

  printf("Hello world \n");
  return 0;
}

#endif // function_object_MAIN
#endif // function_object_TEST
