
/*
 * MessageDeltaObject.h
 *
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaObject_H_
#define TINY_CPP_CLIENT_MessageDeltaObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaObject_delta.h"

namespace Tiny {


/*! \brief Represents a message delta i.e. any changed fields on a message during streaming. 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaObject{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaObject();
    MessageDeltaObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier of the message, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier of the message, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `thread.message.delta`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.message.delta`.
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	MessageDeltaObject_delta getDelta();

	/*! \brief Set 
	 */
	void setDelta(MessageDeltaObject_delta  delta);


    private:
    std::string id{};
    std::string object{};
    MessageDeltaObject_delta delta;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaObject_H_ */
