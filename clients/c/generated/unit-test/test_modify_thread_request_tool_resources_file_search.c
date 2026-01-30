#ifndef modify_thread_request_tool_resources_file_search_TEST
#define modify_thread_request_tool_resources_file_search_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define modify_thread_request_tool_resources_file_search_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/modify_thread_request_tool_resources_file_search.h"
modify_thread_request_tool_resources_file_search_t* instantiate_modify_thread_request_tool_resources_file_search(int include_optional);



modify_thread_request_tool_resources_file_search_t* instantiate_modify_thread_request_tool_resources_file_search(int include_optional) {
  modify_thread_request_tool_resources_file_search_t* modify_thread_request_tool_resources_file_search = NULL;
  if (include_optional) {
    modify_thread_request_tool_resources_file_search = modify_thread_request_tool_resources_file_search_create(
      list_createList()
    );
  } else {
    modify_thread_request_tool_resources_file_search = modify_thread_request_tool_resources_file_search_create(
      list_createList()
    );
  }

  return modify_thread_request_tool_resources_file_search;
}


#ifdef modify_thread_request_tool_resources_file_search_MAIN

void test_modify_thread_request_tool_resources_file_search(int include_optional) {
    modify_thread_request_tool_resources_file_search_t* modify_thread_request_tool_resources_file_search_1 = instantiate_modify_thread_request_tool_resources_file_search(include_optional);

	cJSON* jsonmodify_thread_request_tool_resources_file_search_1 = modify_thread_request_tool_resources_file_search_convertToJSON(modify_thread_request_tool_resources_file_search_1);
	printf("modify_thread_request_tool_resources_file_search :\n%s\n", cJSON_Print(jsonmodify_thread_request_tool_resources_file_search_1));
	modify_thread_request_tool_resources_file_search_t* modify_thread_request_tool_resources_file_search_2 = modify_thread_request_tool_resources_file_search_parseFromJSON(jsonmodify_thread_request_tool_resources_file_search_1);
	cJSON* jsonmodify_thread_request_tool_resources_file_search_2 = modify_thread_request_tool_resources_file_search_convertToJSON(modify_thread_request_tool_resources_file_search_2);
	printf("repeating modify_thread_request_tool_resources_file_search:\n%s\n", cJSON_Print(jsonmodify_thread_request_tool_resources_file_search_2));
}

int main() {
  test_modify_thread_request_tool_resources_file_search(1);
  test_modify_thread_request_tool_resources_file_search(0);

  printf("Hello world \n");
  return 0;
}

#endif // modify_thread_request_tool_resources_file_search_MAIN
#endif // modify_thread_request_tool_resources_file_search_TEST
