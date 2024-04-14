#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssistantRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssistantRequest::CreateAssistantRequest()
{
	//__init();
}

CreateAssistantRequest::~CreateAssistantRequest()
{
	//__cleanup();
}

void
CreateAssistantRequest::__init()
{
	//model = new CreateAssistantRequest_model();
	//name = std::string();
	//description = std::string();
	//instructions = std::string();
	//new std::list()std::list> tools;
	//new std::list()std::list> file_ids;
	//metadata = null;
}

void
CreateAssistantRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(instructions != NULL) {
	//
	//delete instructions;
	//instructions = NULL;
	//}
	//if(tools != NULL) {
	//tools.RemoveAll(true);
	//delete tools;
	//tools = NULL;
	//}
	//if(file_ids != NULL) {
	//file_ids.RemoveAll(true);
	//delete file_ids;
	//file_ids = NULL;
	//}
	//if(metadata != NULL) {
	//
	//delete metadata;
	//metadata = NULL;
	//}
	//
}

void
CreateAssistantRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateAssistantRequest_model")) {
			jsonToValue(&model, node, "CreateAssistantRequest_model", "CreateAssistantRequest_model");
		} else {
			
			CreateAssistantRequest_model* obj = static_cast<CreateAssistantRequest_model*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *instructionsKey = "instructions";
	node = json_object_get_member(pJsonObject, instructionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&instructions, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *toolsKey = "tools";
	node = json_object_get_member(pJsonObject, toolsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AssistantObject_tools_inner> new_list;
			AssistantObject_tools_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AssistantObject_tools_inner")) {
					jsonToValue(&inst, temp_json, "AssistantObject_tools_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			tools = new_list;
		}
		
	}
	const gchar *file_idsKey = "file_ids";
	node = json_object_get_member(pJsonObject, file_idsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			file_ids = new_list;
		}
		
	}
	const gchar *metadataKey = "metadata";
	node = json_object_get_member(pJsonObject, metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateAssistantRequest::CreateAssistantRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateAssistantRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateAssistantRequest_model")) {
		CreateAssistantRequest_model obj = getModel();
		node = converttoJson(&obj, "CreateAssistantRequest_model", "");
	}
	else {
		
		CreateAssistantRequest_model obj = static_cast<CreateAssistantRequest_model> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getInstructions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *instructionsKey = "instructions";
	json_object_set_member(pJsonObject, instructionsKey, node);
	if (isprimitive("AssistantObject_tools_inner")) {
		list<AssistantObject_tools_inner> new_list = static_cast<list <AssistantObject_tools_inner> > (getTools());
		node = converttoJson(&new_list, "AssistantObject_tools_inner", "array");
	} else {
		node = json_node_alloc();
		list<AssistantObject_tools_inner> new_list = static_cast<list <AssistantObject_tools_inner> > (getTools());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AssistantObject_tools_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AssistantObject_tools_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *toolsKey = "tools";
	json_object_set_member(pJsonObject, toolsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getFileIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getFileIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *file_idsKey = "file_ids";
	json_object_set_member(pJsonObject, file_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metadataKey = "metadata";
	json_object_set_member(pJsonObject, metadataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CreateAssistantRequest_model
CreateAssistantRequest::getModel()
{
	return model;
}

void
CreateAssistantRequest::setModel(CreateAssistantRequest_model  model)
{
	this->model = model;
}

std::string
CreateAssistantRequest::getName()
{
	return name;
}

void
CreateAssistantRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
CreateAssistantRequest::getDescription()
{
	return description;
}

void
CreateAssistantRequest::setDescription(std::string  description)
{
	this->description = description;
}

std::string
CreateAssistantRequest::getInstructions()
{
	return instructions;
}

void
CreateAssistantRequest::setInstructions(std::string  instructions)
{
	this->instructions = instructions;
}

std::list<AssistantObject_tools_inner>
CreateAssistantRequest::getTools()
{
	return tools;
}

void
CreateAssistantRequest::setTools(std::list <AssistantObject_tools_inner> tools)
{
	this->tools = tools;
}

std::list<std::string>
CreateAssistantRequest::getFileIds()
{
	return file_ids;
}

void
CreateAssistantRequest::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}

std::string
CreateAssistantRequest::getMetadata()
{
	return metadata;
}

void
CreateAssistantRequest::setMetadata(std::string  metadata)
{
	this->metadata = metadata;
}


