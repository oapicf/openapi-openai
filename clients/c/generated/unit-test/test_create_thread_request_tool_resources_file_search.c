#ifndef create_thread_request_tool_resources_file_search_TEST
#define create_thread_request_tool_resources_file_search_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_thread_request_tool_resources_file_search_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_thread_request_tool_resources_file_search.h"
create_thread_request_tool_resources_file_search_t* instantiate_create_thread_request_tool_resources_file_search(int include_optional);



create_thread_request_tool_resources_file_search_t* instantiate_create_thread_request_tool_resources_file_search(int include_optional) {
  create_thread_request_tool_resources_file_search_t* create_thread_request_tool_resources_file_search = NULL;
  if (include_optional) {
    create_thread_request_tool_resources_file_search = create_thread_request_tool_resources_file_search_create(
      list_createList(),
      list_createList()
    );
  } else {
    create_thread_request_tool_resources_file_search = create_thread_request_tool_resources_file_search_create(
      list_createList(),
      list_createList()
    );
  }

  return create_thread_request_tool_resources_file_search;
}


#ifdef create_thread_request_tool_resources_file_search_MAIN

void test_create_thread_request_tool_resources_file_search(int include_optional) {
    create_thread_request_tool_resources_file_search_t* create_thread_request_tool_resources_file_search_1 = instantiate_create_thread_request_tool_resources_file_search(include_optional);

	cJSON* jsoncreate_thread_request_tool_resources_file_search_1 = create_thread_request_tool_resources_file_search_convertToJSON(create_thread_request_tool_resources_file_search_1);
	printf("create_thread_request_tool_resources_file_search :\n%s\n", cJSON_Print(jsoncreate_thread_request_tool_resources_file_search_1));
	create_thread_request_tool_resources_file_search_t* create_thread_request_tool_resources_file_search_2 = create_thread_request_tool_resources_file_search_parseFromJSON(jsoncreate_thread_request_tool_resources_file_search_1);
	cJSON* jsoncreate_thread_request_tool_resources_file_search_2 = create_thread_request_tool_resources_file_search_convertToJSON(create_thread_request_tool_resources_file_search_2);
	printf("repeating create_thread_request_tool_resources_file_search:\n%s\n", cJSON_Print(jsoncreate_thread_request_tool_resources_file_search_2));
}

int main() {
  test_create_thread_request_tool_resources_file_search(1);
  test_create_thread_request_tool_resources_file_search(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_thread_request_tool_resources_file_search_MAIN
#endif // create_thread_request_tool_resources_file_search_TEST
