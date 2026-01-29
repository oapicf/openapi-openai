/*
 * CreateAssistantRequest.h
 *
 * 
 */

#ifndef _CreateAssistantRequest_H_
#define _CreateAssistantRequest_H_


#include <string>
#include "AssistantObject_tools_inner.h"
#include "CreateAssistantRequest_model.h"
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

class CreateAssistantRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssistantRequest();
	CreateAssistantRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssistantRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateAssistantRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateAssistantRequest_model  model);
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
	/*! \brief Get A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
	 */
	std::list<AssistantObject_tools_inner> getTools();

	/*! \brief Set A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
	 */
	void setTools(std::list <AssistantObject_tools_inner> tools);
	/*! \brief Get A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
	 */
	void setFileIds(std::list <std::string> file_ids);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	CreateAssistantRequest_model model;
	std::string name;
	std::string description;
	std::string instructions;
	std::list <AssistantObject_tools_inner>tools;
	std::list <std::string>file_ids;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssistantRequest_H_ */
