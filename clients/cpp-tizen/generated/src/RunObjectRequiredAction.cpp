#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "RunObject_required_action.h"

using namespace std;
using namespace Tizen::ArtikCloud;

RunObject_required_action::RunObject_required_action()
{
	//__init();
}

RunObject_required_action::~RunObject_required_action()
{
	//__cleanup();
}

void
RunObject_required_action::__init()
{
	//type = std::string();
	//submit_tool_outputs = new RunObject_required_action_submit_tool_outputs();
}

void
RunObject_required_action::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(submit_tool_outputs != NULL) {
	//
	//delete submit_tool_outputs;
	//submit_tool_outputs = NULL;
	//}
	//
}

void
RunObject_required_action::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *submit_tool_outputsKey = "submit_tool_outputs";
	node = json_object_get_member(pJsonObject, submit_tool_outputsKey);
	if (node !=NULL) {
	

		if (isprimitive("RunObject_required_action_submit_tool_outputs")) {
			jsonToValue(&submit_tool_outputs, node, "RunObject_required_action_submit_tool_outputs", "RunObject_required_action_submit_tool_outputs");
		} else {
			
			RunObject_required_action_submit_tool_outputs* obj = static_cast<RunObject_required_action_submit_tool_outputs*> (&submit_tool_outputs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

RunObject_required_action::RunObject_required_action(char* json)
{
	this->fromJson(json);
}

char*
RunObject_required_action::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("RunObject_required_action_submit_tool_outputs")) {
		RunObject_required_action_submit_tool_outputs obj = getSubmitToolOutputs();
		node = converttoJson(&obj, "RunObject_required_action_submit_tool_outputs", "");
	}
	else {
		
		RunObject_required_action_submit_tool_outputs obj = static_cast<RunObject_required_action_submit_tool_outputs> (getSubmitToolOutputs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *submit_tool_outputsKey = "submit_tool_outputs";
	json_object_set_member(pJsonObject, submit_tool_outputsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
RunObject_required_action::getType()
{
	return type;
}

void
RunObject_required_action::setType(std::string  type)
{
	this->type = type;
}

RunObject_required_action_submit_tool_outputs
RunObject_required_action::getSubmitToolOutputs()
{
	return submit_tool_outputs;
}

void
RunObject_required_action::setSubmitToolOutputs(RunObject_required_action_submit_tool_outputs  submit_tool_outputs)
{
	this->submit_tool_outputs = submit_tool_outputs;
}


