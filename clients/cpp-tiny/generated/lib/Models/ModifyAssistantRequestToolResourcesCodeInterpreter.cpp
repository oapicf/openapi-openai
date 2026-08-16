

#include "ModifyAssistantRequest_tool_resources_code_interpreter.h"

using namespace Tiny;

ModifyAssistantRequest_tool_resources_code_interpreter::ModifyAssistantRequest_tool_resources_code_interpreter()
{
	file_ids = std::list<std::string>();
}

ModifyAssistantRequest_tool_resources_code_interpreter::ModifyAssistantRequest_tool_resources_code_interpreter(std::string jsonString)
{
	this->fromJson(jsonString);
}

ModifyAssistantRequest_tool_resources_code_interpreter::~ModifyAssistantRequest_tool_resources_code_interpreter()
{

}

void
ModifyAssistantRequest_tool_resources_code_interpreter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idsKey = "file_ids";

    if(object.has_key(file_idsKey))
    {
        bourne::json value = object[file_idsKey];


        std::list<std::string> file_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            file_ids_list.push_back(element);
        }
        file_ids = file_ids_list;


    }


}

bourne::json
ModifyAssistantRequest_tool_resources_code_interpreter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> file_ids_list = getFileIds();
    bourne::json file_ids_arr = bourne::json::array();

    for(auto& var : file_ids_list)
    {
        file_ids_arr.append(var);
    }
    object["file_ids"] = file_ids_arr;






    return object;

}

std::list<std::string>
ModifyAssistantRequest_tool_resources_code_interpreter::getFileIds()
{
	return file_ids;
}

void
ModifyAssistantRequest_tool_resources_code_interpreter::setFileIds(std::list <std::string> file_ids)
{
	this->file_ids = file_ids;
}



