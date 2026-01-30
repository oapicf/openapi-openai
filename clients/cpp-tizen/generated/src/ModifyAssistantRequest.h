/*
 * ModifyAssistantRequest.h
 *
 * 
 */

#ifndef _ModifyAssistantRequest_H_
#define _ModifyAssistantRequest_H_


#include <string>
#include "AssistantObject_tools_inner.h"
#include "AssistantsApiResponseFormatOption.h"
#include "ModifyAssistantRequest_tool_resources.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ModifyAssistantRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ModifyAssistantRequest();
	ModifyAssistantRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModifyAssistantRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getModel();

	/*! \brief Set 
	 */
	void setModel(std::string  model);
	/*! \brief Get The name of the assistant. The maximum length is 256 characters. 
	 */
	std::string getName();

	/*! \brief Set The name of the assistant. The maximum length is 256 characters. 
	 */
	void setName(std::string  name);
	/*! \brief Get The description of the assistant. The maximum length is 512 characters. 
	 */
	std::string getDescription();

	/*! \brief Set The description of the assistant. The maximum length is 512 characters. 
	 */
	void setDescription(std::string  description);
	/*! \brief Get The system instructions that the assistant uses. The maximum length is 256,000 characters. 
	 */
	std::string getInstructions();

	/*! \brief Set The system instructions that the assistant uses. The maximum length is 256,000 characters. 
	 */
	void setInstructions(std::string  instructions);
	/*! \brief Get A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
	 */
	std::list<AssistantObject_tools_inner> getTools();

	/*! \brief Set A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
	 */
	void setTools(std::list <AssistantObject_tools_inner> tools);
	/*! \brief Get 
	 */
	ModifyAssistantRequest_tool_resources getToolResources();

	/*! \brief Set 
	 */
	void setToolResources(ModifyAssistantRequest_tool_resources  tool_resources);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);
	/*! \brief Get What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
	 */
	long long getTemperature();

	/*! \brief Set What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
	 */
	void setTemperature(long long  temperature);
	/*! \brief Get An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
	 */
	long long getTopP();

	/*! \brief Set An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
	 */
	void setTopP(long long  top_p);
	/*! \brief Get 
	 */
	AssistantsApiResponseFormatOption getResponseFormat();

	/*! \brief Set 
	 */
	void setResponseFormat(AssistantsApiResponseFormatOption  response_format);

private:
	std::string model;
	std::string name;
	std::string description;
	std::string instructions;
	std::list <AssistantObject_tools_inner>tools;
	ModifyAssistantRequest_tool_resources tool_resources;
	std::string metadata;
	long long temperature;
	long long top_p;
	AssistantsApiResponseFormatOption response_format;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModifyAssistantRequest_H_ */
