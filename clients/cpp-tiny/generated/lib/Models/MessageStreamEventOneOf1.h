
/*
 * MessageStreamEvent_oneOf_1.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
 */

#ifndef TINY_CPP_CLIENT_MessageStreamEvent_oneOf_1_H_
#define TINY_CPP_CLIENT_MessageStreamEvent_oneOf_1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageObject.h"

namespace Tiny {


/*! \brief Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf_1{
public:

    /*! \brief Constructor.
	 */
    MessageStreamEvent_oneOf_1();
    MessageStreamEvent_oneOf_1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageStreamEvent_oneOf_1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEvent();

	/*! \brief Set 
	 */
	void setEvent(std::string  event);
	/*! \brief Get 
	 */
	MessageObject getData();

	/*! \brief Set 
	 */
	void setData(MessageObject  data);


    private:
    std::string event{};
    MessageObject data;
};
}

#endif /* TINY_CPP_CLIENT_MessageStreamEvent_oneOf_1_H_ */
