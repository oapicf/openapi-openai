
/*
 * MessageStreamEvent.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageStreamEvent_H_
#define TINY_CPP_CLIENT_MessageStreamEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageObject.h"
#include "MessageStreamEvent_oneOf.h"
#include "MessageStreamEvent_oneOf_1.h"
#include "MessageStreamEvent_oneOf_2.h"
#include "MessageStreamEvent_oneOf_3.h"
#include "MessageStreamEvent_oneOf_4.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageStreamEvent{
public:

    /*! \brief Constructor.
	 */
    MessageStreamEvent();
    MessageStreamEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageStreamEvent();


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

#endif /* TINY_CPP_CLIENT_MessageStreamEvent_H_ */
