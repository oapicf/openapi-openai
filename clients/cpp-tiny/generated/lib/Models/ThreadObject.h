
/*
 * ThreadObject.h
 *
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */

#ifndef TINY_CPP_CLIENT_ThreadObject_H_
#define TINY_CPP_CLIENT_ThreadObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ModifyThreadRequest_tool_resources.h"
#include "Object.h"

namespace Tiny {


/*! \brief Represents a thread that contains [messages](/docs/api-reference/messages).
 *
 *  \ingroup Models
 *
 */

class ThreadObject{
public:

    /*! \brief Constructor.
	 */
    ThreadObject();
    ThreadObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ThreadObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	Object getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(Object  metadata);


    private:
    std::string id{};
    std::string object{};
    int created_at{};
    ModifyThreadRequest_tool_resources tool_resources;
    Object metadata;
};
}

#endif /* TINY_CPP_CLIENT_ThreadObject_H_ */
