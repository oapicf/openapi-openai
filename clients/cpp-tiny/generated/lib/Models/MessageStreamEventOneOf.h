
/*
 * MessageStreamEvent_oneOf.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 */

#ifndef TINY_CPP_CLIENT_MessageStreamEvent_oneOf_H_
#define TINY_CPP_CLIENT_MessageStreamEvent_oneOf_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageObject.h"

namespace Tiny {


/*! \brief Occurs when a [message](/docs/api-reference/messages/object) is created.
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent_oneOf{
public:

    /*! \brief Constructor.
	 */
    MessageStreamEvent_oneOf();
    MessageStreamEvent_oneOf(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageStreamEvent_oneOf();


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

#endif /* TINY_CPP_CLIENT_MessageStreamEvent_oneOf_H_ */
