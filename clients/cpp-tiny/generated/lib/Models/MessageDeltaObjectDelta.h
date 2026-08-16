
/*
 * MessageDeltaObject_delta.h
 *
 * The delta containing the fields that have changed on the Message.
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaObject_delta_H_
#define TINY_CPP_CLIENT_MessageDeltaObject_delta_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaObject_delta_content_inner.h"
#include <list>

namespace Tiny {


/*! \brief The delta containing the fields that have changed on the Message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaObject_delta{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaObject_delta();
    MessageDeltaObject_delta(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaObject_delta();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The entity that produced the message. One of `user` or `assistant`.
	 */
	std::string getRole();

	/*! \brief Set The entity that produced the message. One of `user` or `assistant`.
	 */
	void setRole(std::string  role);
	/*! \brief Get The content of the message in array of text and/or images.
	 */
	std::list<MessageDeltaObject_delta_content_inner> getContent();

	/*! \brief Set The content of the message in array of text and/or images.
	 */
	void setContent(std::list <MessageDeltaObject_delta_content_inner> content);


    private:
    std::string role{};
    std::list<MessageDeltaObject_delta_content_inner> content;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaObject_delta_H_ */
