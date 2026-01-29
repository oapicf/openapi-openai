#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateFineTuningJobRequest_integrations_inner_wandb::CreateFineTuningJobRequest_integrations_inner_wandb()
{
	//__init();
}

CreateFineTuningJobRequest_integrations_inner_wandb::~CreateFineTuningJobRequest_integrations_inner_wandb()
{
	//__cleanup();
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::__init()
{
	//project = std::string();
	//name = std::string();
	//entity = std::string();
	//new std::list()std::list> tags;
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::__cleanup()
{
	//if(project != NULL) {
	//
	//delete project;
	//project = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(entity != NULL) {
	//
	//delete entity;
	//entity = NULL;
	//}
	//if(tags != NULL) {
	//tags.RemoveAll(true);
	//delete tags;
	//tags = NULL;
	//}
	//
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *projectKey = "project";
	node = json_object_get_member(pJsonObject, projectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&project, node, "std::string", "");
		} else {
			
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
	const gchar *entityKey = "entity";
	node = json_object_get_member(pJsonObject, entityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entity, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagsKey = "tags";
	node = json_object_get_member(pJsonObject, tagsKey);
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
			tags = new_list;
		}
		
	}
}

CreateFineTuningJobRequest_integrations_inner_wandb::CreateFineTuningJobRequest_integrations_inner_wandb(char* json)
{
	this->fromJson(json);
}

char*
CreateFineTuningJobRequest_integrations_inner_wandb::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getProject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *projectKey = "project";
	json_object_set_member(pJsonObject, projectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entityKey = "entity";
	json_object_set_member(pJsonObject, entityKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getTags());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getTags());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *tagsKey = "tags";
	json_object_set_member(pJsonObject, tagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateFineTuningJobRequest_integrations_inner_wandb::getProject()
{
	return project;
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::setProject(std::string  project)
{
	this->project = project;
}

std::string
CreateFineTuningJobRequest_integrations_inner_wandb::getName()
{
	return name;
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::setName(std::string  name)
{
	this->name = name;
}

std::string
CreateFineTuningJobRequest_integrations_inner_wandb::getEntity()
{
	return entity;
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::setEntity(std::string  entity)
{
	this->entity = entity;
}

std::list<std::string>
CreateFineTuningJobRequest_integrations_inner_wandb::getTags()
{
	return tags;
}

void
CreateFineTuningJobRequest_integrations_inner_wandb::setTags(std::list <std::string> tags)
{
	this->tags = tags;
}


