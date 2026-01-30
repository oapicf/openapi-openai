/*
 * ThreadObject.h
 *
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */

#ifndef _ThreadObject_H_
#define _ThreadObject_H_


#include <string>
#include "ModifyThreadRequest_tool_resources.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a thread that contains [messages](/docs/api-reference/messages).
 *
 *  \ingroup Models
 *
 */

class ThreadObject : public Object {
public:
	/*! \brief Constructor.
	 */
	ThreadObject();
	ThreadObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ThreadObject();

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
	/*! \brief Get The object type, which is always `thread`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the thread was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the thread was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	ModifyThreadRequest_tool_resources getToolResources();

	/*! \brief Set 
	 */
	void setToolResources(ModifyThreadRequest_tool_resources  tool_resources);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::string id;
	std::string object;
	int created_at;
	ModifyThreadRequest_tool_resources tool_resources;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ThreadObject_H_ */
