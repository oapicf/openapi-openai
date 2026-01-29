#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunStepDeltaObject_delta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunStepDeltaObject_delta::RunStepDeltaObject_delta()
{
	//__init();
}

RunStepDeltaObject_delta::~RunStepDeltaObject_delta()
{
	//__cleanup();
}

void
RunStepDeltaObject_delta::__init()
{
	//step_details = new RunStepDeltaObject_delta_step_details();
}

void
RunStepDeltaObject_delta::__cleanup()
{
	//if(step_details != NULL) {
	//
	//delete step_details;
	//step_details = NULL;
	//}
	//
}

void
RunStepDeltaObject_delta::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *step_detailsKey = "step_details";
	node = json_object_get_member(pJsonObject, step_detailsKey);
	if (node !=NULL) {
	

		if (isprimitive("RunStepDeltaObject_delta_step_details")) {
			jsonToValue(&step_details, node, "RunStepDeltaObject_delta_step_details", "RunStepDeltaObject_delta_step_details");
		} else {
			
			RunStepDeltaObject_delta_step_details* obj = static_cast<RunStepDeltaObject_delta_step_details*> (&step_details);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunStepDeltaObject_delta::RunStepDeltaObject_delta(char* json)
{
	this->fromJson(json);
}

char*
RunStepDeltaObject_delta::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("RunStepDeltaObject_delta_step_details")) {
		RunStepDeltaObject_delta_step_details obj = getStepDetails();
		node = converttoJson(&obj, "RunStepDeltaObject_delta_step_details", "");
	}
	else {
		
		RunStepDeltaObject_delta_step_details obj = static_cast<RunStepDeltaObject_delta_step_details> (getStepDetails());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *step_detailsKey = "step_details";
	json_object_set_member(pJsonObject, step_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

RunStepDeltaObject_delta_step_details
RunStepDeltaObject_delta::getStepDetails()
{
	return step_details;
}

void
RunStepDeltaObject_delta::setStepDetails(RunStepDeltaObject_delta_step_details  step_details)
{
	this->step_details = step_details;
}


