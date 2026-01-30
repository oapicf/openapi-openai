#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Invite.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Invite::Invite()
{
	//__init();
}

Invite::~Invite()
{
	//__cleanup();
}

void
Invite::__init()
{
	//object = std::string();
	//id = std::string();
	//email = std::string();
	//role = std::string();
	//status = std::string();
	//invited_at = int(0);
	//expires_at = int(0);
	//accepted_at = int(0);
	//new std::list()std::list> projects;
}

void
Invite::__cleanup()
{
	//if(object != NULL) {
	//
	//delete object;
	//object = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(role != NULL) {
	//
	//delete role;
	//role = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(invited_at != NULL) {
	//
	//delete invited_at;
	//invited_at = NULL;
	//}
	//if(expires_at != NULL) {
	//
	//delete expires_at;
	//expires_at = NULL;
	//}
	//if(accepted_at != NULL) {
	//
	//delete accepted_at;
	//accepted_at = NULL;
	//}
	//if(projects != NULL) {
	//projects.RemoveAll(true);
	//delete projects;
	//projects = NULL;
	//}
	//
}

void
Invite::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objectKey = "object";
	node = json_object_get_member(pJsonObject, objectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&object, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *roleKey = "role";
	node = json_object_get_member(pJsonObject, roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&role, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *invited_atKey = "invited_at";
	node = json_object_get_member(pJsonObject, invited_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&invited_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *expires_atKey = "expires_at";
	node = json_object_get_member(pJsonObject, expires_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&expires_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *accepted_atKey = "accepted_at";
	node = json_object_get_member(pJsonObject, accepted_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&accepted_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *projectsKey = "projects";
	node = json_object_get_member(pJsonObject, projectsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Invite_projects_inner> new_list;
			Invite_projects_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Invite_projects_inner")) {
					jsonToValue(&inst, temp_json, "Invite_projects_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			projects = new_list;
		}
		
	}
}

Invite::Invite(char* json)
{
	this->fromJson(json);
}

char*
Invite::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getObject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *objectKey = "object";
	json_object_set_member(pJsonObject, objectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *roleKey = "role";
	json_object_set_member(pJsonObject, roleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("int")) {
		int obj = getInvitedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *invited_atKey = "invited_at";
	json_object_set_member(pJsonObject, invited_atKey, node);
	if (isprimitive("int")) {
		int obj = getExpiresAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *expires_atKey = "expires_at";
	json_object_set_member(pJsonObject, expires_atKey, node);
	if (isprimitive("int")) {
		int obj = getAcceptedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *accepted_atKey = "accepted_at";
	json_object_set_member(pJsonObject, accepted_atKey, node);
	if (isprimitive("Invite_projects_inner")) {
		list<Invite_projects_inner> new_list = static_cast<list <Invite_projects_inner> > (getProjects());
		node = converttoJson(&new_list, "Invite_projects_inner", "array");
	} else {
		node = json_node_alloc();
		list<Invite_projects_inner> new_list = static_cast<list <Invite_projects_inner> > (getProjects());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Invite_projects_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Invite_projects_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *projectsKey = "projects";
	json_object_set_member(pJsonObject, projectsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Invite::getObject()
{
	return object;
}

void
Invite::setObject(std::string  object)
{
	this->object = object;
}

std::string
Invite::getId()
{
	return id;
}

void
Invite::setId(std::string  id)
{
	this->id = id;
}

std::string
Invite::getEmail()
{
	return email;
}

void
Invite::setEmail(std::string  email)
{
	this->email = email;
}

std::string
Invite::getRole()
{
	return role;
}

void
Invite::setRole(std::string  role)
{
	this->role = role;
}

std::string
Invite::getStatus()
{
	return status;
}

void
Invite::setStatus(std::string  status)
{
	this->status = status;
}

int
Invite::getInvitedAt()
{
	return invited_at;
}

void
Invite::setInvitedAt(int  invited_at)
{
	this->invited_at = invited_at;
}

int
Invite::getExpiresAt()
{
	return expires_at;
}

void
Invite::setExpiresAt(int  expires_at)
{
	this->expires_at = expires_at;
}

int
Invite::getAcceptedAt()
{
	return accepted_at;
}

void
Invite::setAcceptedAt(int  accepted_at)
{
	this->accepted_at = accepted_at;
}

std::list<Invite_projects_inner>
Invite::getProjects()
{
	return projects;
}

void
Invite::setProjects(std::list <Invite_projects_inner> projects)
{
	this->projects = projects;
}


