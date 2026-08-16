

#include "InviteRequest.h"

using namespace Tiny;

InviteRequest::InviteRequest()
{
	email = std::string();
	role = std::string();
	projects = std::list<InviteRequest_projects_inner>();
}

InviteRequest::InviteRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

InviteRequest::~InviteRequest()
{

}

void
InviteRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *projectsKey = "projects";

    if(object.has_key(projectsKey))
    {
        bourne::json value = object[projectsKey];


        std::list<InviteRequest_projects_inner> projects_list;
        InviteRequest_projects_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            projects_list.push_back(element);
        }
        projects = projects_list;


    }


}

bourne::json
InviteRequest::toJson()
{
    bourne::json object = bourne::json::object();





    object["email"] = getEmail();






    object["role"] = getRole();





    std::list<InviteRequest_projects_inner> projects_list = getProjects();
    bourne::json projects_arr = bourne::json::array();

    for(auto& var : projects_list)
    {
        InviteRequest_projects_inner obj = var;
        projects_arr.append(obj.toJson());
    }
    object["projects"] = projects_arr;




    return object;

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



