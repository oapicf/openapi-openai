#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateFineTuningJobRequest_integrations_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateFineTuningJobRequest_integrations_inner::CreateFineTuningJobRequest_integrations_inner()
{
	//__init();
}

CreateFineTuningJobRequest_integrations_inner::~CreateFineTuningJobRequest_integrations_inner()
{
	//__cleanup();
}

void
CreateFineTuningJobRequest_integrations_inner::__init()
{
	//type = std::string();
	//wandb = new CreateFineTuningJobRequest_integrations_inner_wandb();
}

void
CreateFineTuningJobRequest_integrations_inner::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(wandb != NULL) {
	//
	//delete wandb;
	//wandb = NULL;
	//}
	//
}

void
CreateFineTuningJobRequest_integrations_inner::fromJson(char* jsonStr)
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
	const gchar *wandbKey = "wandb";
	node = json_object_get_member(pJsonObject, wandbKey);
	if (node !=NULL) {
	

		if (isprimitive("CreateFineTuningJobRequest_integrations_inner_wandb")) {
			jsonToValue(&wandb, node, "CreateFineTuningJobRequest_integrations_inner_wandb", "CreateFineTuningJobRequest_integrations_inner_wandb");
		} else {
			
			CreateFineTuningJobRequest_integrations_inner_wandb* obj = static_cast<CreateFineTuningJobRequest_integrations_inner_wandb*> (&wandb);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateFineTuningJobRequest_integrations_inner::CreateFineTuningJobRequest_integrations_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateFineTuningJobRequest_integrations_inner::toJson()
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
	if (isprimitive("CreateFineTuningJobRequest_integrations_inner_wandb")) {
		CreateFineTuningJobRequest_integrations_inner_wandb obj = getWandb();
		node = converttoJson(&obj, "CreateFineTuningJobRequest_integrations_inner_wandb", "");
	}
	else {
		
		CreateFineTuningJobRequest_integrations_inner_wandb obj = static_cast<CreateFineTuningJobRequest_integrations_inner_wandb> (getWandb());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *wandbKey = "wandb";
	json_object_set_member(pJsonObject, wandbKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateFineTuningJobRequest_integrations_inner::getType()
{
	return type;
}

void
CreateFineTuningJobRequest_integrations_inner::setType(std::string  type)
{
	this->type = type;
}

CreateFineTuningJobRequest_integrations_inner_wandb
CreateFineTuningJobRequest_integrations_inner::getWandb()
{
	return wandb;
}

void
CreateFineTuningJobRequest_integrations_inner::setWandb(CreateFineTuningJobRequest_integrations_inner_wandb  wandb)
{
	this->wandb = wandb;
}


