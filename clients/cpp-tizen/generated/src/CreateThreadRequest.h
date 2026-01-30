/*
 * CreateThreadRequest.h
 *
 * 
 */

#ifndef _CreateThreadRequest_H_
#define _CreateThreadRequest_H_


#include <string>
#include "CreateMessageRequest.h"
#include "CreateThreadRequest_tool_resources.h"
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

class CreateThreadRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateThreadRequest();
	CreateThreadRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateThreadRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of [messages](/docs/api-reference/messages) to start the thread with.
	 */
	std::list<CreateMessageRequest> getMessages();

	/*! \brief Set A list of [messages](/docs/api-reference/messages) to start the thread with.
	 */
	void setMessages(std::list <CreateMessageRequest> messages);
	/*! \brief Get 
	 */
	CreateThreadRequest_tool_resources getToolResources();

	/*! \brief Set 
	 */
	void setToolResources(CreateThreadRequest_tool_resources  tool_resources);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::list <CreateMessageRequest>messages;
	CreateThreadRequest_tool_resources tool_resources;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateThreadRequest_H_ */
