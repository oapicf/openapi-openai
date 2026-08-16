

#include "Invite.h"

using namespace Tiny;

Invite::Invite()
{
	object = std::string();
	id = std::string();
	email = std::string();
	role = std::string();
	status = std::string();
	invited_at = int(0);
	expires_at = int(0);
	accepted_at = int(0);
	projects = std::list<Invite_projects_inner>();
}

Invite::Invite(std::string jsonString)
{
	this->fromJson(jsonString);
}

Invite::~Invite()
{

}

void
Invite::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *emailKey = "email";

    if(object.has_key(emailKey))
    {
        bourne::json value = object[emailKey];



        jsonToValue(&email, value, "std::string");


    }

    const char *roleKey = "role";

    if(object.has_key(roleKey))
    {
        bourne::json value = object[roleKey];



        jsonToValue(&role, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *invited_atKey = "invited_at";

    if(object.has_key(invited_atKey))
    {
        bourne::json value = object[invited_atKey];



        jsonToValue(&invited_at, value, "int");


    }

    const char *expires_atKey = "expires_at";

    if(object.has_key(expires_atKey))
    {
        bourne::json value = object[expires_atKey];



        jsonToValue(&expires_at, value, "int");


    }

    const char *accepted_atKey = "accepted_at";

    if(object.has_key(accepted_atKey))
    {
        bourne::json value = object[accepted_atKey];



        jsonToValue(&accepted_at, value, "int");


    }

    const char *projectsKey = "projects";

    if(object.has_key(projectsKey))
    {
        bourne::json value = object[projectsKey];


        std::list<Invite_projects_inner> projects_list;
        Invite_projects_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            projects_list.push_back(element);
        }
        projects = projects_list;


    }


}

bourne::json
Invite::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();






    object["id"] = getId();






    object["email"] = getEmail();






    object["role"] = getRole();






    object["status"] = getStatus();






    object["invited_at"] = getInvitedAt();






    object["expires_at"] = getExpiresAt();






    object["accepted_at"] = getAcceptedAt();





    std::list<Invite_projects_inner> projects_list = getProjects();
    bourne::json projects_arr = bourne::json::array();

    for(auto& var : projects_list)
    {
        Invite_projects_inner obj = var;
        projects_arr.append(obj.toJson());
    }
    object["projects"] = projects_arr;




    return object;

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



