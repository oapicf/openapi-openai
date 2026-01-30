#ifndef project_api_key_list_response_TEST
#define project_api_key_list_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_api_key_list_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_api_key_list_response.h"
project_api_key_list_response_t* instantiate_project_api_key_list_response(int include_optional);



project_api_key_list_response_t* instantiate_project_api_key_list_response(int include_optional) {
  project_api_key_list_response_t* project_api_key_list_response = NULL;
  if (include_optional) {
    project_api_key_list_response = project_api_key_list_response_create(
      openai_api_project_api_key_list_response_OBJECT_list,
      list_createList(),
      "0",
      "0",
      1
    );
  } else {
    project_api_key_list_response = project_api_key_list_response_create(
      openai_api_project_api_key_list_response_OBJECT_list,
      list_createList(),
      "0",
      "0",
      1
    );
  }

  return project_api_key_list_response;
}


#ifdef project_api_key_list_response_MAIN

void test_project_api_key_list_response(int include_optional) {
    project_api_key_list_response_t* project_api_key_list_response_1 = instantiate_project_api_key_list_response(include_optional);

	cJSON* jsonproject_api_key_list_response_1 = project_api_key_list_response_convertToJSON(project_api_key_list_response_1);
	printf("project_api_key_list_response :\n%s\n", cJSON_Print(jsonproject_api_key_list_response_1));
	project_api_key_list_response_t* project_api_key_list_response_2 = project_api_key_list_response_parseFromJSON(jsonproject_api_key_list_response_1);
	cJSON* jsonproject_api_key_list_response_2 = project_api_key_list_response_convertToJSON(project_api_key_list_response_2);
	printf("repeating project_api_key_list_response:\n%s\n", cJSON_Print(jsonproject_api_key_list_response_2));
}

int main() {
  test_project_api_key_list_response(1);
  test_project_api_key_list_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_api_key_list_response_MAIN
#endif // project_api_key_list_response_TEST
