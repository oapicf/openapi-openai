

#include "CreateThreadAndRunRequest_tool_resources.h"

using namespace Tiny;

CreateThreadAndRunRequest_tool_resources::CreateThreadAndRunRequest_tool_resources()
{
	code_interpreter = CreateAssistantRequest_tool_resources_code_interpreter();
	file_search = AssistantObject_tool_resources_file_search();
}

CreateThreadAndRunRequest_tool_resources::CreateThreadAndRunRequest_tool_resources(std::string jsonString)
{
	this->fromJson(jsonString);
}

CreateThreadAndRunRequest_tool_resources::~CreateThreadAndRunRequest_tool_resources()
{

}

void
CreateThreadAndRunRequest_tool_resources::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *code_interpreterKey = "code_interpreter";

    if(object.has_key(code_interpreterKey))
    {
        bourne::json value = object[code_interpreterKey];




        CreateAssistantRequest_tool_resources_code_interpreter* obj = &code_interpreter;
		obj->fromJson(value.dump());

    }

    const char *file_searchKey = "file_search";

    if(object.has_key(file_searchKey))
    {
        bourne::json value = object[file_searchKey];




        AssistantObject_tool_resources_file_search* obj = &file_search;
		obj->fromJson(value.dump());

    }


}

bourne::json
CreateThreadAndRunRequest_tool_resources::toJson()
{
    bourne::json object = bourne::json::object();






	object["code_interpreter"] = getCodeInterpreter().toJson();






	object["file_search"] = getFileSearch().toJson();


    return object;

}

CreateAssistantRequest_tool_resources_code_interpreter
CreateThreadAndRunRequest_tool_resources::getCodeInterpreter()
{
	return code_interpreter;
}

void
CreateThreadAndRunRequest_tool_resources::setCodeInterpreter(CreateAssistantRequest_tool_resources_code_interpreter  code_interpreter)
{
	this->code_interpreter = code_interpreter;
}

AssistantObject_tool_resources_file_search
CreateThreadAndRunRequest_tool_resources::getFileSearch()
{
	return file_search;
}

void
CreateThreadAndRunRequest_tool_resources::setFileSearch(AssistantObject_tool_resources_file_search  file_search)
{
	this->file_search = file_search;
}



