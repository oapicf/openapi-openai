

#include "CreateMessageRequest_attachments_inner.h"

using namespace Tiny;

CreateMessageRequest_attachments_inner::CreateMessageRequest_attachments_inner()
{
	file_id = std::string();
	tools = std::list<CreateMessageRequest_attachments_inner_tools_inner>();
}

CreateMessageRequest_attachments_inner::CreateMessageRequest_attachments_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateMessageRequest_attachments_inner::~CreateMessageRequest_attachments_inner()
{

}

void
CreateMessageRequest_attachments_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idKey = "file_id";

    if(object.has_key(file_idKey))
    {
        bourne::json value = object[file_idKey];



        jsonToValue(&file_id, value, "std::string");


    }

    const char *toolsKey = "tools";

    if(object.has_key(toolsKey))
    {
        bourne::json value = object[toolsKey];


        std::list<CreateMessageRequest_attachments_inner_tools_inner> tools_list;
        CreateMessageRequest_attachments_inner_tools_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            tools_list.push_back(element);
        }
        tools = tools_list;


    }


}

bourne::json
CreateMessageRequest_attachments_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();





    std::list<CreateMessageRequest_attachments_inner_tools_inner> tools_list = getTools();
    bourne::json tools_arr = bourne::json::array();

    for(auto& var : tools_list)
    {
        CreateMessageRequest_attachments_inner_tools_inner obj = var;
        tools_arr.append(obj.toJson());
    }
    object["tools"] = tools_arr;




    return object;

}

std::string
CreateMessageRequest_attachments_inner::getFileId()
{
	return file_id;
}

void
CreateMessageRequest_attachments_inner::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::list<CreateMessageRequest_attachments_inner_tools_inner>
CreateMessageRequest_attachments_inner::getTools()
{
	return tools;
}

void
CreateMessageRequest_attachments_inner::setTools(std::list <CreateMessageRequest_attachments_inner_tools_inner> tools)
{
	this->tools = tools;
}



