#ifndef list_audit_logs_response_TEST
#define list_audit_logs_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_audit_logs_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_audit_logs_response.h"
list_audit_logs_response_t* instantiate_list_audit_logs_response(int include_optional);



list_audit_logs_response_t* instantiate_list_audit_logs_response(int include_optional) {
  list_audit_logs_response_t* list_audit_logs_response = NULL;
  if (include_optional) {
    list_audit_logs_response = list_audit_logs_response_create(
      openai_api_list_audit_logs_response_OBJECT_list,
      list_createList(),
      "audit_log-defb456h8dks",
      "audit_log-hnbkd8s93s",
      1
    );
  } else {
    list_audit_logs_response = list_audit_logs_response_create(
      openai_api_list_audit_logs_response_OBJECT_list,
      list_createList(),
      "audit_log-defb456h8dks",
      "audit_log-hnbkd8s93s",
      1
    );
  }

  return list_audit_logs_response;
}


#ifdef list_audit_logs_response_MAIN

void test_list_audit_logs_response(int include_optional) {
    list_audit_logs_response_t* list_audit_logs_response_1 = instantiate_list_audit_logs_response(include_optional);

	cJSON* jsonlist_audit_logs_response_1 = list_audit_logs_response_convertToJSON(list_audit_logs_response_1);
	printf("list_audit_logs_response :\n%s\n", cJSON_Print(jsonlist_audit_logs_response_1));
	list_audit_logs_response_t* list_audit_logs_response_2 = list_audit_logs_response_parseFromJSON(jsonlist_audit_logs_response_1);
	cJSON* jsonlist_audit_logs_response_2 = list_audit_logs_response_convertToJSON(list_audit_logs_response_2);
	printf("repeating list_audit_logs_response:\n%s\n", cJSON_Print(jsonlist_audit_logs_response_2));
}

int main() {
  test_list_audit_logs_response(1);
  test_list_audit_logs_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_audit_logs_response_MAIN
#endif // list_audit_logs_response_TEST
