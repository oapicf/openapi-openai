#ifndef project_rate_limit_TEST
#define project_rate_limit_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define project_rate_limit_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/project_rate_limit.h"
project_rate_limit_t* instantiate_project_rate_limit(int include_optional);



project_rate_limit_t* instantiate_project_rate_limit(int include_optional) {
  project_rate_limit_t* project_rate_limit = NULL;
  if (include_optional) {
    project_rate_limit = project_rate_limit_create(
      openai_api_project_rate_limit_OBJECT_project.rate_limit,
      "0",
      "0",
      56,
      56,
      56,
      56,
      56,
      56
    );
  } else {
    project_rate_limit = project_rate_limit_create(
      openai_api_project_rate_limit_OBJECT_project.rate_limit,
      "0",
      "0",
      56,
      56,
      56,
      56,
      56,
      56
    );
  }

  return project_rate_limit;
}


#ifdef project_rate_limit_MAIN

void test_project_rate_limit(int include_optional) {
    project_rate_limit_t* project_rate_limit_1 = instantiate_project_rate_limit(include_optional);

	cJSON* jsonproject_rate_limit_1 = project_rate_limit_convertToJSON(project_rate_limit_1);
	printf("project_rate_limit :\n%s\n", cJSON_Print(jsonproject_rate_limit_1));
	project_rate_limit_t* project_rate_limit_2 = project_rate_limit_parseFromJSON(jsonproject_rate_limit_1);
	cJSON* jsonproject_rate_limit_2 = project_rate_limit_convertToJSON(project_rate_limit_2);
	printf("repeating project_rate_limit:\n%s\n", cJSON_Print(jsonproject_rate_limit_2));
}

int main() {
  test_project_rate_limit(1);
  test_project_rate_limit(0);

  printf("Hello world \n");
  return 0;
}

#endif // project_rate_limit_MAIN
#endif // project_rate_limit_TEST
