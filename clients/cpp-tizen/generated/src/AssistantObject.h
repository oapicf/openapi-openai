/*
 * AssistantObject.h
 *
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */

#ifndef _AssistantObject_H_
#define _AssistantObject_H_


#include <string>
#include "AssistantObject_tools_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an `assistant` that can call the model and use tools.
 *
 *  \ingroup Models
 *
 */

class AssistantObject : public Object {
public:
	/*! \brief Constructor.
	 */
	AssistantObject();
	AssistantObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AssistantObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `assistant`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `assistant`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the assistant was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the assistant was created.
	 */
	void setCreatedAt(int  created_at);
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
	/*! \brief Get ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
	 */
	std::string getModel();

	/*! \brief Set ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
	 */
	void setModel(std::string  model);
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
	std::string id;
	std::string object;
	int created_at;
	std::string name;
	std::string description;
	std::string model;
	std::string instructions;
	std::list <AssistantObject_tools_inner>tools;
	std::list <std::string>file_ids;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AssistantObject_H_ */
