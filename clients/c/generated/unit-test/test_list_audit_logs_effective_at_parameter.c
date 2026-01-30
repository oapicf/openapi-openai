#ifndef list_audit_logs_effective_at_parameter_TEST
#define list_audit_logs_effective_at_parameter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define list_audit_logs_effective_at_parameter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/list_audit_logs_effective_at_parameter.h"
list_audit_logs_effective_at_parameter_t* instantiate_list_audit_logs_effective_at_parameter(int include_optional);



list_audit_logs_effective_at_parameter_t* instantiate_list_audit_logs_effective_at_parameter(int include_optional) {
  list_audit_logs_effective_at_parameter_t* list_audit_logs_effective_at_parameter = NULL;
  if (include_optional) {
    list_audit_logs_effective_at_parameter = list_audit_logs_effective_at_parameter_create(
      56,
      56,
      56,
      56
    );
  } else {
    list_audit_logs_effective_at_parameter = list_audit_logs_effective_at_parameter_create(
      56,
      56,
      56,
      56
    );
  }

  return list_audit_logs_effective_at_parameter;
}


#ifdef list_audit_logs_effective_at_parameter_MAIN

void test_list_audit_logs_effective_at_parameter(int include_optional) {
    list_audit_logs_effective_at_parameter_t* list_audit_logs_effective_at_parameter_1 = instantiate_list_audit_logs_effective_at_parameter(include_optional);

	cJSON* jsonlist_audit_logs_effective_at_parameter_1 = list_audit_logs_effective_at_parameter_convertToJSON(list_audit_logs_effective_at_parameter_1);
	printf("list_audit_logs_effective_at_parameter :\n%s\n", cJSON_Print(jsonlist_audit_logs_effective_at_parameter_1));
	list_audit_logs_effective_at_parameter_t* list_audit_logs_effective_at_parameter_2 = list_audit_logs_effective_at_parameter_parseFromJSON(jsonlist_audit_logs_effective_at_parameter_1);
	cJSON* jsonlist_audit_logs_effective_at_parameter_2 = list_audit_logs_effective_at_parameter_convertToJSON(list_audit_logs_effective_at_parameter_2);
	printf("repeating list_audit_logs_effective_at_parameter:\n%s\n", cJSON_Print(jsonlist_audit_logs_effective_at_parameter_2));
}

int main() {
  test_list_audit_logs_effective_at_parameter(1);
  test_list_audit_logs_effective_at_parameter(0);

  printf("Hello world \n");
  return 0;
}

#endif // list_audit_logs_effective_at_parameter_MAIN
#endif // list_audit_logs_effective_at_parameter_TEST
