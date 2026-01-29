#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FineTuningIntegration.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FineTuningIntegration::FineTuningIntegration()
{
	//__init();
}

FineTuningIntegration::~FineTuningIntegration()
{
	//__cleanup();
}

void
FineTuningIntegration::__init()
{
	//type = std::string();
	//wandb = new CreateFineTuningJobRequest_integrations_inner_wandb();
}

void
FineTuningIntegration::__cleanup()
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
FineTuningIntegration::fromJson(char* jsonStr)
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

FineTuningIntegration::FineTuningIntegration(char* json)
{
	this->fromJson(json);
}

char*
FineTuningIntegration::toJson()
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
FineTuningIntegration::getType()
{
	return type;
}

void
FineTuningIntegration::setType(std::string  type)
{
	this->type = type;
}

CreateFineTuningJobRequest_integrations_inner_wandb
FineTuningIntegration::getWandb()
{
	return wandb;
}

void
FineTuningIntegration::setWandb(CreateFineTuningJobRequest_integrations_inner_wandb  wandb)
{
	this->wandb = wandb;
}


