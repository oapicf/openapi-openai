
/*
 * CreateThreadRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateThreadRequest_H_
#define TINY_CPP_CLIENT_CreateThreadRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateMessageRequest.h"
#include "CreateThreadRequest_tool_resources.h"
#include "Object.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateThreadRequest{
public:

    /*! \brief Constructor.
	 */
    CreateThreadRequest();
    CreateThreadRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateThreadRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    std::list<CreateMessageRequest> messages;
    CreateThreadRequest_tool_resources tool_resources;
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_CreateThreadRequest_H_ */
