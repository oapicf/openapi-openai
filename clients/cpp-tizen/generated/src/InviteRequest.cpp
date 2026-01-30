#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InviteRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InviteRequest::InviteRequest()
{
	//__init();
}

InviteRequest::~InviteRequest()
{
	//__cleanup();
}

void
InviteRequest::__init()
{
	//email = std::string();
	//role = std::string();
	//new std::list()std::list> projects;
}

void
InviteRequest::__cleanup()
{
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
	//if(projects != NULL) {
	//projects.RemoveAll(true);
	//delete projects;
	//projects = NULL;
	//}
	//
}

void
InviteRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *projectsKey = "projects";
	node = json_object_get_member(pJsonObject, projectsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<InviteRequest_projects_inner> new_list;
			InviteRequest_projects_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("InviteRequest_projects_inner")) {
					jsonToValue(&inst, temp_json, "InviteRequest_projects_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			projects = new_list;
		}
		
	}
}

InviteRequest::InviteRequest(char* json)
{
	this->fromJson(json);
}

char*
InviteRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("InviteRequest_projects_inner")) {
		list<InviteRequest_projects_inner> new_list = static_cast<list <InviteRequest_projects_inner> > (getProjects());
		node = converttoJson(&new_list, "InviteRequest_projects_inner", "array");
	} else {
		node = json_node_alloc();
		list<InviteRequest_projects_inner> new_list = static_cast<list <InviteRequest_projects_inner> > (getProjects());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<InviteRequest_projects_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			InviteRequest_projects_inner obj = *it;
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
InviteRequest::getEmail()
{
	return email;
}

void
InviteRequest::setEmail(std::string  email)
{
	this->email = email;
}

std::string
InviteRequest::getRole()
{
	return role;
}

void
InviteRequest::setRole(std::string  role)
{
	this->role = role;
}

std::list<InviteRequest_projects_inner>
InviteRequest::getProjects()
{
	return projects;
}

void
InviteRequest::setProjects(std::list <InviteRequest_projects_inner> projects)
{
	this->projects = projects;
}


