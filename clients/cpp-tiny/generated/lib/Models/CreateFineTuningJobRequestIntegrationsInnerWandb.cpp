

#include "CreateFineTuningJobRequest_integrations_inner_wandb.h"

using namespace Tiny;

CreateFineTuningJobRequest_integrations_inner_wandb::CreateFineTuningJobRequest_integrations_inner_wandb()
{
	project = std::string();
	name = std::string();
	entity = std::string();
	tags = std::list<std::string>();
}

CreateFineTuningJobRequest_integrations_inner_wandb::CreateFineTuningJobRequest_integrations_inner_wandb(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateFineTuningJobRequest_integrations_inner_wandb::~CreateFineTuningJobRequest_integrations_inner_wandb()
{

}

void
CreateFineTuningJobRequest_integrations_inner_wandb::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *projectKey = "project";

    if(object.has_key(projectKey))
    {
        bourne::json value = object[projectKey];



        jsonToValue(&project, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *entityKey = "entity";

    if(object.has_key(entityKey))
    {
        bourne::json value = object[entityKey];



        jsonToValue(&entity, value, "std::string");


    }

    const char *tagsKey = "tags";

    if(object.has_key(tagsKey))
    {
        bourne::json value = object[tagsKey];


        std::list<std::string> tags_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            tags_list.push_back(element);
        }
        tags = tags_list;


    }


}

bourne::json
CreateFineTuningJobRequest_integrations_inner_wandb::toJson()
{
    bourne::json object = bourne::json::object();





    object["project"] = getProject();






    object["name"] = getName();






    object["entity"] = getEntity();





    std::list<std::string> tags_list = getTags();
    bourne::json tags_arr = bourne::json::array();

    for(auto& var : tags_list)
    {
        tags_arr.append(var);
    }
    object["tags"] = tags_arr;






    return object;

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



