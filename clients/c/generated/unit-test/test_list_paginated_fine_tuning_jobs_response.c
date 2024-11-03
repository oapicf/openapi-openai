#ifndef list_paginated_fine_tuning_jobs_response_TEST
#define list_paginated_fine_tuning_jobs_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_paginated_fine_tuning_jobs_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_paginated_fine_tuning_jobs_response.h"
list_paginated_fine_tuning_jobs_response_t* instantiate_list_paginated_fine_tuning_jobs_response(int include_optional);



list_paginated_fine_tuning_jobs_response_t* instantiate_list_paginated_fine_tuning_jobs_response(int include_optional) {
  list_paginated_fine_tuning_jobs_response_t* list_paginated_fine_tuning_jobs_response = NULL;
  if (include_optional) {
    list_paginated_fine_tuning_jobs_response = list_paginated_fine_tuning_jobs_response_create(
      list_createList(),
      1,
      openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_list
    );
  } else {
    list_paginated_fine_tuning_jobs_response = list_paginated_fine_tuning_jobs_response_create(
      list_createList(),
      1,
      openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_list
    );
  }

  return list_paginated_fine_tuning_jobs_response;
}


#ifdef list_paginated_fine_tuning_jobs_response_MAIN

void test_list_paginated_fine_tuning_jobs_response(int include_optional) {
    list_paginated_fine_tuning_jobs_response_t* list_paginated_fine_tuning_jobs_response_1 = instantiate_list_paginated_fine_tuning_jobs_response(include_optional);

	cJSON* jsonlist_paginated_fine_tuning_jobs_response_1 = list_paginated_fine_tuning_jobs_response_convertToJSON(list_paginated_fine_tuning_jobs_response_1);
	printf("list_paginated_fine_tuning_jobs_response :\n%s\n", cJSON_Print(jsonlist_paginated_fine_tuning_jobs_response_1));
	list_paginated_fine_tuning_jobs_response_t* list_paginated_fine_tuning_jobs_response_2 = list_paginated_fine_tuning_jobs_response_parseFromJSON(jsonlist_paginated_fine_tuning_jobs_response_1);
	cJSON* jsonlist_paginated_fine_tuning_jobs_response_2 = list_paginated_fine_tuning_jobs_response_convertToJSON(list_paginated_fine_tuning_jobs_response_2);
	printf("repeating list_paginated_fine_tuning_jobs_response:\n%s\n", cJSON_Print(jsonlist_paginated_fine_tuning_jobs_response_2));
}

int main() {
  test_list_paginated_fine_tuning_jobs_response(1);
  test_list_paginated_fine_tuning_jobs_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_paginated_fine_tuning_jobs_response_MAIN
#endif // list_paginated_fine_tuning_jobs_response_TEST
