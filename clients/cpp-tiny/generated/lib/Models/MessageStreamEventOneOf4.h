
/*
 * MessageStreamEvent_oneOf_4.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 */

#ifndef TINY_CPP_CLIENT_MessageStreamEvent_oneOf_4_H_
#define TINY_CPP_CLIENT_MessageStreamEvent_oneOf_4_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageObject.h"

namespace Tiny {


/*! \brief Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf_4{
public:

    /*! \brief Constructor.
	 */
    MessageStreamEvent_oneOf_4();
    MessageStreamEvent_oneOf_4(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageStreamEvent_oneOf_4();


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

#endif /* TINY_CPP_CLIENT_MessageStreamEvent_oneOf_4_H_ */
